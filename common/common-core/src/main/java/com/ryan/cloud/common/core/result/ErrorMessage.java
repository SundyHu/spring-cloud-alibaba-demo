package com.ryan.cloud.common.core.result;

/**
 * ErrorMessage
 *
 * @author hkc
 * @version 1.0.0
 * @date 2021-01-26 13:47
 */
public interface ErrorMessage {

    /**
     * 获取响应码
     *
     * @return
     */
    int getCode();

    /**
     * 获取响应信息
     *
     * @return
     */
    String getMessage();
}

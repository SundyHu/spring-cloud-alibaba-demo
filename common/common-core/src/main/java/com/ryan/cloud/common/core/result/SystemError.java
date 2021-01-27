package com.ryan.cloud.common.core.result;

/**
 * SystemError
 *
 * @author hkc
 * @version 1.0.0
 * @date 2021-01-26 13:48
 */
public enum SystemError implements ErrorMessage {

    /**
     * SUCCESS：操作成功,
     * FAILURE：操作失败,
     * SERVICE_FALLBACK：服务熔断,
     * SYSTEM_BUSY：系统繁忙。
     */
    SUCCESS(1, "操作成功"), FAILURE(0, "操作失败"), SERVICE_FALLBACK(-110000, "服务熔断"), SYSTEM_BUSY(-100001, "系统繁忙");

    private int code;

    private String message;

    SystemError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

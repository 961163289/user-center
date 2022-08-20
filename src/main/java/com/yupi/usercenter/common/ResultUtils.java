package com.yupi.usercenter.common;

/**
 * 返回工具类
 *
 * @author zipeng
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

}

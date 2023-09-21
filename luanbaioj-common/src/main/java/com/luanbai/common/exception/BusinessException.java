package com.luanbai.common.exception;


import com.luanbai.common.response.ResultCodeEnum;
import lombok.Getter;

/**
 * 自定义异常类
 *
 * @author Luanbai
 * @since 2023/07/29
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final ResultCodeEnum resultCodeEnum;

    public BusinessException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.resultCodeEnum = resultCodeEnum;
    }

    public BusinessException(ResultCodeEnum resultCodeEnum, String message) {
        super(message);
        this.resultCodeEnum = resultCodeEnum;
    }

}

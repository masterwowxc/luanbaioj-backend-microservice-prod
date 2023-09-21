package com.luanbai.model.dto.question;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 创建请求
 *
 * @author Luanbai
 * @since 2023/08/08
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionAddRequest extends QuestionBaseRequest implements Serializable {

    private static final long serialVersionUID = 1L;
}

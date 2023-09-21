package com.luanbai.model.dto.question;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @author Luanbai
 * @since 2023/08/08
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionUpdateRequest extends QuestionBaseRequest  implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}

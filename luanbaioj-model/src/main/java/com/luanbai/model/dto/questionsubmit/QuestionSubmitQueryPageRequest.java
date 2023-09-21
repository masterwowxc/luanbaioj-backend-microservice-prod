package com.luanbai.model.dto.questionsubmit;

import com.luanbai.common.request.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryPageRequest extends PageRequest {
    private String title;
    private String language;
}

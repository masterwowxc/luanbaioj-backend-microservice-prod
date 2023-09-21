package com.luanbai.judge.strategy;

import com.luanbai.model.dto.questionsubmit.JudgeInfo;
import com.luanbai.model.entity.Question;
import com.luanbai.model.enums.QuestionSubmitLanguageEnum;
import lombok.Data;

import java.util.List;

/**
 * 判题上下文
 *
 * @author Luanbai
 * @since 2023/08/16
 */
@Data
public class JudgeContext {
    private JudgeInfo judgeInfo;
    private List<String> outputList;

    private List<String> outputListResult;

    private Question question;

    private QuestionSubmitLanguageEnum languageType;
}

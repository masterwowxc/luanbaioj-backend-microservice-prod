package com.luanbai.judge.strategy;

import com.luanbai.judge.strategy.impl.DefaultJudgeStrategy;
import com.luanbai.judge.strategy.impl.JavaJudgeStrategy;
import com.luanbai.model.dto.questionsubmit.JudgeInfo;
import com.luanbai.model.enums.QuestionSubmitLanguageEnum;
import org.springframework.stereotype.Service;

/**
 * 判题管理
 *
 * @author Luanbai
 * @since 2023/08/16
 */
@Service
public class JudgeManager {

    public JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmitLanguageEnum languageType = judgeContext.getLanguageType();
        JudgeStrategy judgeStrategy;
        if (QuestionSubmitLanguageEnum.JAVA.equals(languageType)) {
            judgeStrategy = new JavaJudgeStrategy();
        }else {
            judgeStrategy = new DefaultJudgeStrategy ();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}

package com.luanbai.judge.strategy;


import com.luanbai.model.dto.questionsubmit.JudgeInfo;

/**
 * 判题策略
 *
 * @author Luanbai
 * @since 2023/08/16
 */
public interface JudgeStrategy {
    /**
     * 执行判题
     *
     * @param judgeContext 判题上下文
     * @return {@link JudgeInfo}
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}

package com.luanbai.judge.receiver;

import com.luanbai.common.constants.MqConstant;
import com.luanbai.judge.service.JudgeService;
import com.luanbai.model.entity.QuestionSubmit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 判题请求消费者
 *
 * @author Luanbai
 * @since 2023/09/05
 */
@Component
@Slf4j
public class JudgeRequestReceiver {
    @Resource
    private JudgeService judgeService;

    @RabbitListener(
            bindings = @QueueBinding(
                    value = @Queue(value = MqConstant.QUEUE_JUDGE, durable = "true"),
                    exchange = @Exchange(MqConstant.EXCHANGE_JUDGE_DIRECT),
                    key = {MqConstant.ROUTING_JUDGE}
            )
    )
    public void doJudge(QuestionSubmit questionSubmit) {
        if (questionSubmit != null) {
            log.info("questionSubmit: {}", questionSubmit);
            judgeService.doJudge(questionSubmit);

        }
    }
}

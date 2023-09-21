package com.luanbai.client.feign;


import com.luanbai.model.entity.Question;
import com.luanbai.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 题目服务
 *
 * @author Luanbai
 * @since 2023/09/03
 */
@FeignClient(name = "luanbaioj-question-service", path = "/api/question/inner")
public interface QuestionFeignClient {

    @GetMapping("/get/id")
    Question getOne(@RequestParam("questionId") Long questionId);

    @PostMapping("/update/id")
    void updateQuestion(@RequestBody Question question);

    @PostMapping("/question-submit/update")
    void updateById(@RequestBody QuestionSubmit questionSubmitUpdate);

    @GetMapping("/question-submit/get/id")
    QuestionSubmit selectById(@RequestParam("id") Long id);
}

package com.luanbai.question.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.luanbai.model.entity.QuestionSubmit;
import com.luanbai.model.vo.QuestionSubmitViewVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Luanbai
 * @description 针对表【question_submit(题目提交)】的数据库操作Mapper
 * @createDate 2023-08-08 21:24:55
 * @Entity com.luanbai.luanbaioj.model.entity.QuestionSubmit
 */
public interface QuestionSubmitMapper extends BaseMapper<QuestionSubmit> {

    /**
     * 查询数量
     *
     * @param title    标题
     * @param language 语言
     * @return long
     */
    long countQuestionSubmit(@Param("title") String title, @Param("language") String language);

    List<QuestionSubmitViewVO> selectQuestionSubmit(@Param("title") String title, @Param("language") String language, @Param("pageIndex") long pageIndex, @Param("size") long size);
}





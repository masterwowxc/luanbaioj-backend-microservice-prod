package com.luanbai.judge.codesandbox;


import com.luanbai.model.dto.codesandbox.ExecuteCodeRequest;
import com.luanbai.model.dto.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱
 *
 * @author Luanbai
 * @since 2023/08/15
 */
public interface CodeSandbox {
    /**
     * 执行代码
     *
     * @param executeCodeRequest 执行代码请求
     * @return {@link ExecuteCodeResponse}
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

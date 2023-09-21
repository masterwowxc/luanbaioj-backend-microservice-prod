package com.luanbai.judge.codesandbox.proxy;

import com.luanbai.judge.codesandbox.CodeSandbox;
import com.luanbai.model.dto.codesandbox.ExecuteCodeRequest;
import com.luanbai.model.dto.codesandbox.ExecuteCodeResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 代码沙箱代理
 *
 * @author Luanbai
 * @since 2023/08/15
 */
@Slf4j
@AllArgsConstructor
public class CodeSandboxProxy implements CodeSandbox {

    private CodeSandbox codeSandbox;

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("代理开始...{}", executeCodeRequest);
        ExecuteCodeResponse executeCodeResponse = codeSandbox.executeCode(executeCodeRequest);
        log.info("代理结束...{}", executeCodeResponse);
        return executeCodeResponse;
    }
}

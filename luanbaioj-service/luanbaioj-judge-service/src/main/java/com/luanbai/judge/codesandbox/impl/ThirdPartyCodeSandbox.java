package com.luanbai.judge.codesandbox.impl;

import com.luanbai.judge.codesandbox.CodeSandbox;
import com.luanbai.model.dto.codesandbox.ExecuteCodeRequest;
import com.luanbai.model.dto.codesandbox.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        log.info("第三方代码沙箱");
        return null;
    }
}

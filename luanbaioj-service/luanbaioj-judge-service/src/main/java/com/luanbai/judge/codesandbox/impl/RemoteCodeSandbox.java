package com.luanbai.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.luanbai.judge.codesandbox.CodeSandbox;
import com.luanbai.model.dto.codesandbox.ExecuteCodeRequest;
import com.luanbai.model.dto.codesandbox.ExecuteCodeResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * 远程代码沙箱
 *
 * @author Luanbai
 * @since 2023/08/15
 */
@Slf4j
public class RemoteCodeSandbox implements CodeSandbox {

    private static final String URL = "http://111.230.248.192:3040/codesandbox/execute";


    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        String responseStr = HttpUtil.post(URL, JSONUtil.toJsonStr(executeCodeRequest));
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}

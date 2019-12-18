package com.xkcoding.task.xxl.job.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @ClassName TestTask
 * @Author minghang.liu
 * @Date 2019/12/14 11:10
 * @Version v1.0
 */
@Component
public class TestTask {

    @XxlJob("testJob1")
    public ReturnT<String> testJob1(String params){
        ReturnT<String> success = ReturnT.SUCCESS;
        success.setContent(params);
        return success;
    }
}

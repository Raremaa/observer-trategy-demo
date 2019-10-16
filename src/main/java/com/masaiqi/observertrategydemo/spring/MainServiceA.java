package com.masaiqi.observertrategydemo.spring;

import com.masaiqi.observertrategydemo.constant.PushPlatform;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 主业务
 *
 * @author sq.ma
 * @date 2019/10/14 上午11:27
 */
@Component
public class MainServiceA {

    /**
     * ApplicationContext be supported too
     * ApplicationEventPublisher recommended
     * because ApplicationEventPublisher is smaller range then ApplicationContext
     */
    @Resource
    ApplicationEventPublisher applicationEventPublisher;

    public void doMainService() {
        System.err.println("主业务执行中");
        applicationEventPublisher.publishEvent(new PushEvent(this, () -> PushPlatform.ALL_PLATFORM));
        System.err.println("主业务执行和完毕");
    }
}

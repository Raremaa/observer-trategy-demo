package com.masaiqi.observertrategydemo;

import com.masaiqi.observertrategydemo.constant.PushPlatform;
import com.masaiqi.observertrategydemo.spring.MainServiceA;
import com.masaiqi.observertrategydemo.spring.PushEvent;
import com.masaiqi.observertrategydemo.spring.PushPredicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserverTrategyDemoApplicationTests {

    @Resource
    MainServiceA mainServiceA;

    @Test
    public void contextLoads() {
        /**
         * Spring提供的方式
         */
        mainServiceA.doMainService();
    }

}

package com.masaiqi.observertrategydemo.observer;

import com.masaiqi.observertrategydemo.constant.PushPlatform;
import com.masaiqi.observertrategydemo.spring.PushEvent;
import org.springframework.context.ApplicationEventPublisher;

import javax.annotation.Resource;
import java.util.Observable;

/**
 * 主业务
 *
 * @author sq.ma
 * @date 2019/10/14 上午11:27
 */
public class MainServiceB extends Observable {

    /**
     * ApplicationContext be supported too
     * ApplicationEventPublisher recommended
     * because ApplicationEventPublisher is smaller range then ApplicationContext
     */
    @Resource
    ApplicationEventPublisher applicationEventPublisher;

    public void doMainService() {
        System.err.println("主业务执行中");
        this.setChanged();
        this.notifyObservers();
        System.err.println("主业务执行和完毕");
    }
}

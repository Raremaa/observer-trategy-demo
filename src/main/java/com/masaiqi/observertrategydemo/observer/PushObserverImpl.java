package com.masaiqi.observertrategydemo.observer;

import com.masaiqi.observertrategydemo.constant.PushPlatform;

import java.util.Observable;

/**
 * @author sq.ma
 * @date 2019/10/14 上午11:20
 */
public class PushObserverImpl implements PushObserver {
    @Override
    public void update(Observable o, Object arg) {
        System.err.println("全平台推送");
    }
}

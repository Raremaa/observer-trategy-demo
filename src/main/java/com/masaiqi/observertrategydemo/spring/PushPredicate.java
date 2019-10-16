package com.masaiqi.observertrategydemo.spring;

import com.masaiqi.observertrategydemo.constant.PushPlatform;

/**
 * 推送谓词(推送条件)
 *
 * @author sq.ma
 * @date 2019/10/12 下午6:09
 */
@FunctionalInterface
public interface PushPredicate {

    /**
     * @return 推送平台
     */
    PushPlatform doPush();
}

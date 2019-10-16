package com.masaiqi.observertrategydemo.spring;

import com.masaiqi.observertrategydemo.constant.PushPlatform;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * 推送Event
 *
 * @author sq.ma
 * @date 2019/10/12 下午5:39
 */
@Getter
public class PushEvent extends ApplicationEvent {

    private PushPlatform platform;

    public PushEvent(Object source, PushPredicate predicate) {
        super(source);
        this.platform = predicate.doPush();
    }

}

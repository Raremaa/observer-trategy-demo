package com.masaiqi.observertrategydemo.spring;

import com.masaiqi.observertrategydemo.constant.PushPlatform;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 推送Listener
 *
 * @author sq.ma
 * @date 2019/10/12 下午6:14
 */
@Component
public class PushListener implements ApplicationListener<PushEvent> {

    @Override
    public void onApplicationEvent(PushEvent pushEvent) {
        PushPlatform platform = pushEvent.getPlatform();
        if (PushPlatform.ALL_PLATFORM.equals(platform)) {
            System.err.println("进行全平台推送");
        }
    }

}

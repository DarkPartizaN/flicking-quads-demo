package com.aftergames.demo;

import com.fenyx.api.ScreenConfig;
import com.fenyx.scene.Scene;

/**
 *
 * @author KiQDominaN
 */
public class FlickScene extends Scene {

    public FlickScene() {
        setBounds(0, 0, ScreenConfig.screen_width, ScreenConfig.screen_height);

        FlickSceneObject fso = new FlickSceneObject();
        fso.init();
        fso.setPosition(ScreenConfig.screen_width / 2 - fso.getWidth() / 2, ScreenConfig.screen_height / 2 - fso.getHeight() / 2);
        fso.rotateSpeed = 0.1f;

        getDefaultLayer().addObject(fso);

        fso = new FlickSceneObject();
        fso.init();
        fso.setPosition(ScreenConfig.screen_width / 2 - fso.getWidth() / 2, ScreenConfig.screen_height / 2 - fso.getHeight() / 2);
        fso.rotateSpeed = -0.1f;

        getDefaultLayer().addObject(fso);

        fso = new FlickSceneObject();
        fso.init();
        fso.setBounds(128, 128);
        fso.setPivot(64, 64);
        fso.setPosition(ScreenConfig.screen_width / 2 - fso.getWidth() / 2, ScreenConfig.screen_height / 2 - fso.getHeight() / 2);
        fso.rotateSpeed = 0.25f;

        getDefaultLayer().addObject(fso);

        fso = new FlickSceneObject();
        fso.init();
        fso.setBounds(96, 96);
        fso.setPivot(48, 48);
        fso.setPosition(ScreenConfig.screen_width / 2 - fso.getWidth() / 2, ScreenConfig.screen_height / 2 - fso.getHeight() / 2);
        fso.rotateSpeed = -0.35f;

        getDefaultLayer().addObject(fso);

        fso = new FlickSceneObject();
        fso.init();
        fso.setBounds(64, 64);
        fso.setPivot(32, 32);
        fso.setPosition(ScreenConfig.screen_width / 2 - fso.getWidth() / 2, ScreenConfig.screen_height / 2 - fso.getHeight() / 2);
        fso.rotateSpeed = 0.45f;

        getDefaultLayer().addObject(fso);
    }
}

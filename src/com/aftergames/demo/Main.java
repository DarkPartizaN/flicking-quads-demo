package com.aftergames.demo;

import com.fenyx.api.LaunchParams;

/**
 *
 * @author KiQDominaN
 */
public class Main {

    public static App app;

    public static void main(String[] args) {
        LaunchParams params = new LaunchParams();
        params.addParam("AppName", "Flickering Quads");
        params.addParam("Width", 800);
        params.addParam("Height", 480);
        params.addParam("Fullscreen", false);

        app = new App();
        app.startApp(params);
    }

}
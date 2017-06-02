package com.aftergames.demo;

import com.fenyx.api.EngineAPI;
import com.fenyx.api.FenyxApp;
import com.fenyx.api.LaunchParams;
import com.fenyx.input.Input;

import java.awt.Toolkit;

/**
 *
 * @author KiQDominaN
 */
public class App extends FenyxApp {

    public void startApp(LaunchParams params) {
        String appName = params.getString("AppName");
        int width = params.getInt("Width");
        int height = params.getInt("Height");
        boolean fullscreen = params.getBool("Fullscreen");

        Input.show_system_cursor = true;

        createWindow(appName, Toolkit.getDefaultToolkit().getScreenSize().width / 2 - width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - height / 2, width, height, fullscreen);

        MyState state = new MyState();
        state.init();

        EngineAPI.setState(state);
        EngineAPI.getState().setActive(true);

        displayWindow();
    }

    public void destroyApp() {
        EngineAPI.getState().setActive(false);
        EngineAPI.setState(null);
    }

}
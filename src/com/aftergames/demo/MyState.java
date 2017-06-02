package com.aftergames.demo;

import com.fenyx.api.EngineAPI;
import com.fenyx.api.EngineState;

/**
 *
 * @author KiQDominaN
 */
public class MyState extends EngineState {

    public void init() {
        FlickScene scene = new FlickScene();
        EngineAPI.setCurrentScene(scene);

        Render render = new Render();
        EngineAPI.setRenderer(render);
    }

    public void activate() {
    }

    public void process() {
        EngineAPI.getCurrentScene().update();
    }

    public void deactivate() {
    }

    public void stop() {
        EngineAPI.setCurrentScene(null);
        EngineAPI.setRenderer(null);
    }

}
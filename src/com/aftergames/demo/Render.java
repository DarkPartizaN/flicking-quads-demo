package com.aftergames.demo;

import com.fenyx.api.EngineAPI;
import com.fenyx.render.RenderAPI;
import com.fenyx.render.Renderer;
import com.fenyx.scene.SceneObject;

/**
 *
 * @author KiQDominaN
 */
public class Render extends Renderer {

    public void init() {
    }

    public void prerender() {
    }

    public void render() {
        for (SceneObject s : EngineAPI.getCurrentScene().getDefaultLayer().getObjects().get_all()) {
            RenderAPI.renderObject(s.getRenderObject());
        }
    }

    public void postrender() {
    }

}

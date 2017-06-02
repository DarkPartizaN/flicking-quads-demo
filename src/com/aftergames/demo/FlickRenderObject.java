package com.aftergames.demo;

import com.fenyx.api.EngineTimer;
import com.fenyx.render.Color;
import com.fenyx.render.Material;
import com.fenyx.render.RenderAPI;
import com.fenyx.render.RenderObject;

/**
 *
 * @author KiQDominaN
 */
public class FlickRenderObject extends RenderObject {

    private long last_time = EngineTimer.time;

    public void init() {
        Material mat = new Material();
        mat.colorOnly = true;
        mat.color = Color.getRandom();
        mat.color.a = 0.95f;

        setMaterial(mat);
    }

    public void update() {
    }

    public void prerender() {
        if (EngineTimer.time - last_time > 50) {
            material.color = Color.getRandom();
            material.color.a = 0.95f;
            last_time = EngineTimer.time;
        }
    }

    public void render() {
        RenderAPI.fillRect(0, 0, (int)parent.getWidth(), (int) parent.getHeight(), material.color);
    }

    public void postrender() {
    }

}

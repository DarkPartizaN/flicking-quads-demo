package com.aftergames.demo;

import com.fenyx.api.EngineAPI;
import com.fenyx.scene.SceneObject;

/**
 *
 * @author KiQDominaN
 */
public class FlickSceneObject extends SceneObject {

    private float tmp_angle = 0f;
    public float rotateSpeed = 0.1f;

    public void init() {
        type = DYNAMIC;

        setBounds(256f, 256f);
        setPivot(128f, 128f);

        check_bounds = false;
        setVisible(true);

        FlickRenderObject ro = new FlickRenderObject();
        ro.init();

        setRenderObject(ro);
    }

    public void update() {
        tmp_angle += rotateSpeed * 5 * EngineAPI.getFrametime();

        if (tmp_angle < 0) tmp_angle = 360;
        if (tmp_angle > 360) tmp_angle = 0;

        setAngle(tmp_angle);
    }

    public void destroy() {
    }

}
package net.mrjosh.android.spinkit;

import net.mrjosh.android.spinkit.sprite.Sprite;
import net.mrjosh.android.spinkit.style.ChasingDots;
import net.mrjosh.android.spinkit.style.Circle;
import net.mrjosh.android.spinkit.style.CubeGrid;
import net.mrjosh.android.spinkit.style.DoubleBounce;
import net.mrjosh.android.spinkit.style.FadingCircle;
import net.mrjosh.android.spinkit.style.FoldingCube;
import net.mrjosh.android.spinkit.style.MultiplePulse;
import net.mrjosh.android.spinkit.style.MultiplePulseRing;
import net.mrjosh.android.spinkit.style.Pulse;
import net.mrjosh.android.spinkit.style.PulseRing;
import net.mrjosh.android.spinkit.style.RotatingCircle;
import net.mrjosh.android.spinkit.style.RotatingPlane;
import net.mrjosh.android.spinkit.style.ThreeBounce;
import net.mrjosh.android.spinkit.style.WanderingCubes;
import net.mrjosh.android.spinkit.style.Wave;

/**
 * Created by ybq.
 */
public class SpriteFactory {

    public static Sprite create(Style style) {
        Sprite sprite = null;
        switch (style) {
            case ROTATING_PLANE:
                sprite = new RotatingPlane();
                break;
            case DOUBLE_BOUNCE:
                sprite = new DoubleBounce();
                break;
            case WAVE:
                sprite = new Wave();
                break;
            case WANDERING_CUBES:
                sprite = new WanderingCubes();
                break;
            case PULSE:
                sprite = new Pulse();
                break;
            case CHASING_DOTS:
                sprite = new ChasingDots();
                break;
            case THREE_BOUNCE:
                sprite = new ThreeBounce();
                break;
            case CIRCLE:
                sprite = new Circle();
                break;
            case CUBE_GRID:
                sprite = new CubeGrid();
                break;
            case FADING_CIRCLE:
                sprite = new FadingCircle();
                break;
            case FOLDING_CUBE:
                sprite = new FoldingCube();
                break;
            case ROTATING_CIRCLE:
                sprite = new RotatingCircle();
                break;
            case MULTIPLE_PULSE:
                sprite = new MultiplePulse();
                break;
            case PULSE_RING:
                sprite = new PulseRing();
                break;
            case MULTIPLE_PULSE_RING:
                sprite = new MultiplePulseRing();
                break;
            default:
                break;
        }
        return sprite;
    }
}

package com.darren.dash;

import com.darren.framework.Image;
import com.darren.framework.Music;
import com.darren.framework.Sound;

public class Assets {

    public static Image menu, menu2, splash, background, character, character2, character3, heliboy, heliboy2, heliboy3, heliboy4, heliboy5;
    public static Image tiledirt, tilegrassTop, tilegrassBot, tilegrassLeft, tilegrassRight, characterJump, characterDown;
    public static Image button;
    public static Sound click;
    public static Music theme;

    public static void load(DashGame dashGame) {
        theme = dashGame.getAudio().createMusic("menutheme2.mp3");
        theme.setLooping(true);
        theme.setVolume(0.85f);
        theme.play();
    }

    public static void resumeSound(DashGame dashGame) {
        click = dashGame.getAudio().createSound("Sounds/click.wav");
        click.play(0.8f);
    }



}

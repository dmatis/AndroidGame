package com.darren.dash;

import com.darren.framework.Game;
import com.darren.framework.Graphics;
import com.darren.framework.Graphics.ImageFormat;
import com.darren.framework.Screen;


public class SplashLoadingScreen extends Screen {
    public SplashLoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu2 = g.newImage("menu2.png", ImageFormat.RGB565);


        game.setScreen(new LoadingScreen(game));

    }

    @Override
    public void paint(float deltaTime) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }




}

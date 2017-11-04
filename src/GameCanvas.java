import bases.GameObject;
import bases.Vector2D;
import brain.background.*;
import brain.FallingObjects.Spawner;
import brain.playershape.PlayerLeftShape;
import brain.playershape.PlayerRightShape;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by duyanh on 10/31/17.
 */
public class GameCanvas extends JPanel {

    BufferedImage backBuffer;
    Graphics backGraphics;

    Spawner leftSpawner = new Spawner(new Vector2D(105,-20));

    Spawner rightSpawner = new Spawner(new Vector2D(300,-20));

    Score score = new Score();

    public GameCanvas(){
        backBuffer = new BufferedImage(384,600, BufferedImage.TYPE_INT_ARGB);

        backGraphics = backBuffer.getGraphics();

        GameObject.add(new BackGround());

//        GameObject.add(new Score());

        GameObject.add(new LightEffect1());

        GameObject.add(new LightEffect2());

        GameObject.add(new LightEffect3());

        GameObject.add(new LightEffect4());

        GameObject.add(new LightEffect5());

        GameObject.add(new LightEffect_Am2());

        GameObject.add(new LightEffect_Am3());

        GameObject.add(new PlayerRightShape());

        GameObject.add(new PlayerLeftShape());

        GameObject.add(leftSpawner);

        GameObject.add(rightSpawner);


    }




    public void run() {

        GameObject.runAll();

    }

    public void render() {

        GameObject.renderAll(backGraphics);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.drawImage(backBuffer,0,0,null);

    }
}

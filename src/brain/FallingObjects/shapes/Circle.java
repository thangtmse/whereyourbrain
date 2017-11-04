package brain.FallingObjects.shapes;

import bases.GameObject;
import bases.ImageRenderer;
import brain.FallingObjects.FallingObjects;
import brain.background.Score;
import brain.playershape.PlayerLeftShape;
import brain.playershape.PlayerRightShape;


public class Circle extends FallingObjects {

    public final int type = 0;

    public Circle(){
        super();

        this.renderer = new ImageRenderer("assets/shape/circle.png");
    }

    @Override
    public void run() {
        super.run();
        collide();
    }

    public void collide(){
        if(this.position.x < 200){
            if(this.hitBox.collideWith(PlayerLeftShape.boxCollider) && this.type == PlayerLeftShape.currentType){
                Score.addScore(1);
                GameObject.remove(this);//remove object from gameobject vector
            }
        }
        if(this.position.x > 200){
            if(this.hitBox.collideWith(PlayerRightShape.boxCollider) && this.type == PlayerRightShape.currentType ){
                Score.addScore(1);
                GameObject.remove(this);
            }
        }

    }
}

package brain.background;

import bases.GameObject;
import com.sun.javafx.text.TextLine;

import javax.swing.*;
import javax.swing.plaf.TextUI;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Score extends GameObject {

    TextField textField = new TextField();

    public static int score;
    public Score(){
        score = 0;
        textField.setText("Hello");
    }
    public static void addScore(int num){
        score+=num;
    }
}

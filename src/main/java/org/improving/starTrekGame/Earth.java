package org.improving.starTrekGame;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class Earth {
    public static void main(String[] args) {


        Game game =  new Game();
        game.intro();
    }
}

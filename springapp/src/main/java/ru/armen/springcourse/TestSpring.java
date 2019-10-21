package ru.armen.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.awt.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("rockMusic", RockMusic.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//
//        Music classicWeMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicMusic);
//        classicalMusicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();

    }
}


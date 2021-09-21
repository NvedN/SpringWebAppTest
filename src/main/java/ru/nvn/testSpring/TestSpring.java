package ru.nvn.testSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{

		public static void main(String[] args)
		{
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

				Music music = context.getBean("musicBean",Music.class);

				musicPlayer musicPlayer = new musicPlayer(music);
				musicPlayer.playMusic();
				context.close();
		}

}

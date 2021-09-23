package ru.nvn.testSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{

		public static void main(String[] args)
		{
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
						"applicationContext.xml"
				);

//				classicalMusic test = new classicalMusic();
//				 Music music = context.getBean("someRockMusic", Music.class);
//				 musicPlayer musicPlayer = new musicPlayer(music);
//				 musicPlayer.playMusic();
//				musicPlayer firstMusicPlayer = context.getBean("musicPlayer", musicPlayer.class);
//				musicPlayer secondMusicPlayer = context.getBean("musicPlayer", musicPlayer.class);
//				//				musicPlayer.playMusic();
//				boolean comparison = firstMusicPlayer == secondMusicPlayer;
//				System.out.println("------comparison =  " + comparison);
//				System.out.println("------firstMusicPlayer =  " + firstMusicPlayer);
//				System.out.println("------secondMusicPlayer =  " + secondMusicPlayer);
//
//
//				firstMusicPlayer.setVolume(30);
//				System.out.println("------firstMusicPlayer =  " + firstMusicPlayer.getVolume());
//				System.out.println("------secondMusicPlayer =  " + secondMusicPlayer.getVolume());

				//				System.out.println(musicPlayer.getName());
				//				System.out.println(musicPlayer.getVolume());

//				musicPlayer musicPlayer = context.getBean("musicPlayer", musicPlayer.class);
//				musicPlayer.playMusic();
				Computer computer = context.getBean("computer",Computer.class);
				System.out.println(computer);
				context.close();
		}
}

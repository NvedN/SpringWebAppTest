package ru.nvn.testSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{

		public static void main(String[] args)
		{
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

				musicPlayer musicPlayer = context.getBean("musicPlayer", musicPlayer.class);

				System.out.println(musicPlayer.getName());
				System.out.println(musicPlayer.getVolume());


				classicalMusic classicalMusic1 = context.getBean("classicalMusic",classicalMusic.class);
				classicalMusic classicalMugsic2 = context.getBean("classicalMusic",classicalMusic.class);
				System.out.println(classicalMusic1 == classicalMusic2);

				context.close();
		}
}

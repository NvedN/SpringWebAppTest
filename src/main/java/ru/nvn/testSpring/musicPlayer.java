package ru.nvn.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class musicPlayer
{
		@Value("${musicPlayer.name}")
		private String name;
		@Value("${musicPlayer.volume}")
		private int volume;

		public int getVolume()
		{
				return volume;
		}

		public String getName()
		{
				return name;
		}

		private Music music1;

		private Music music2;

//		@Autowired
		public musicPlayer(@Qualifier("someRockMusic") Music music1,
				               @Qualifier("someClassicalMusic") Music music2)
		{

				this.music1 = music1;
				this.music2 = music2;
		}

		public String playMusic()
		{
				return "Playing: " + music1.getSong() + "," + music2.getSong();
				//				System.out.println();
				//				System.out.println("Playing: " + rockMusic.getSong());
		}
}

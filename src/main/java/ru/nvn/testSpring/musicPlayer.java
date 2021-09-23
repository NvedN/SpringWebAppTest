package ru.nvn.testSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class musicPlayer
{
		private classicalMusic classicalMusic;
		private rockMusic rockMusic;

		@Autowired
		public musicPlayer(classicalMusic classicalMusic,rockMusic rockMusic){
				this.classicalMusic = classicalMusic;
				this.rockMusic = rockMusic;

		}

		public String playMusic()
		{
				return "Playing: " + classicalMusic.getSong();
//				System.out.println();
//				System.out.println("Playing: " + rockMusic.getSong());

		}
}

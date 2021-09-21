package ru.nvn.testSpring;

public class musicPlayer
{
		private Music music;


		///IoC
		public musicPlayer(Music music){
				this.music = music;
		}

		public void playMusic(){
				System.out.println("--------plaing: = " + music.getSong());
		}
}

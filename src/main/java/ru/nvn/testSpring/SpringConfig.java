package ru.nvn.testSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ru.nvn.testSpring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig
{
		@Bean
		public classicalMusic classicalMusic(){
				return  new classicalMusic();
		}
		@Bean
		public  rockMusic rockMusic(){
				return  new rockMusic();
		}

		@Bean
		public musicPlayer musicPlayer(){
				return  new musicPlayer(rockMusic(),classicalMusic());
		}

		@Bean
		public Computer computer(){
				return new Computer(musicPlayer());
		}

}

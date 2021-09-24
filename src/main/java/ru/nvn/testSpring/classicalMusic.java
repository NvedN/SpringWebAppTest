package ru.nvn.testSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.ConstructorProperties;

//@Component("someClassicalMusic")
public class classicalMusic implements Music
{
		@PostConstruct
		public void doMyInit(){
				System.out.println("------inititalization");
		}

		@PreDestroy
		public  void doMyDestroy(){
				System.out.println("--------------Doing destruction");
		}

		@Override
		public String getSong()
		{
				return "mozart classical";
		}
}

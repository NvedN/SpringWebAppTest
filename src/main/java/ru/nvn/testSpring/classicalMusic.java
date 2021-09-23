package ru.nvn.testSpring;

import org.springframework.stereotype.Component;

@Component("someClassicalMusic")
public class classicalMusic implements Music
{

		@Override
		public String getSong()
		{
				return "mozart classical";
		}
}

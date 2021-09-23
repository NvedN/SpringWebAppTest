package ru.nvn.testSpring;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class rockMusic implements Music
{

		@Override
		public String getSong()
		{
				return "D.O.I.T";
		}
}

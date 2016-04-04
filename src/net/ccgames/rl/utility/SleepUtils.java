package net.ccgames.rl.utility;

import java.util.concurrent.TimeUnit;

public class SleepUtils
{
	public static void MINUTES(long toSleep)
	{
		try
		{
			TimeUnit.MINUTES.sleep(toSleep);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	
	public static void SECONDS(long toSleep)
	{
		try
		{
			TimeUnit.SECONDS.sleep(toSleep);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	
	public static void MILLISECONDS(long toSleep)
	{
		try
		{
			TimeUnit.MILLISECONDS.sleep(toSleep);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
	
	public static void HOURS(long toSleep)
	{
		try
		{
			TimeUnit.HOURS.sleep(toSleep);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}

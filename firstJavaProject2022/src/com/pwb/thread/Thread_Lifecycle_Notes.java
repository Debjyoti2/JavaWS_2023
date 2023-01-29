package com.pwb.thread;

public class Thread_Lifecycle_Notes{
	
	//thread lifecycle
	
	//1. New  --while creation of new thread  Thread th = new Thread(new Class());
	
	
	//2. Runnable  -- th.start(); method called,  now thread is ready to get executed anytime when cpu chooses
	
	//3. Running -- whne cpu is running any specific thread
	
	//4. Not Runnable -- let say kono thread kono file download kor6,, but server delay r jonno wait kor6.. thokhon Thread schedular oke 
	    //not runnable start e diye dbe. abr jokhn response asbe thokhn abe runnable state e diye dbe.. jokhn cpu faka hbe then abr executed hbe
	
	//5. Terminated -- kono thread er code kokhn complete execute hoye jay
	
	
	
	
}
package com.singleton_class;

public class AppSingleton {

	
	private AppSingleton() {
	}
	
	private static AppSingleton appsingleton=null;
	
	public static AppSingleton getInstances() {
		if(appsingleton==null) {
			appsingleton = new AppSingleton();
		}
		return appsingleton;
	}
	
}

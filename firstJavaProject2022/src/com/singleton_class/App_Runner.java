package com.singleton_class;

public class App_Runner {

	public static void main(String[] args) {

    AppSingleton ap1 = AppSingleton.getInstances();
    AppSingleton ap2 = AppSingleton.getInstances();
    AppSingleton ap3 = AppSingleton.getInstances();
    AppSingleton ap4 = AppSingleton.getInstances();
    
    //it will always return 1 object only..it will not allow to create more than 1 object.
    //Singleton classes are those classes where only 1 object can be created of that class.
		

	}

}

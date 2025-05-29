package com.pwb.thread;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalVariable {
	
	public static void main(String[] args) {

		// every thread er run method r vitor declare kortre hy..
		// eta r scope only 1 ta thread r vitor.
		// ekta thread onno thread r thradlocal variable ke access korte pare na.
        //  https://www.youtube.com/watch?v=YrznvHIBjOM&t=60s
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		for(int i=0;i<100;i++){
			String id = String.valueOf(i);
			threadPool.submit(()->{
				String birthDate = new UserService().birthDate(id);
				System.out.println("BirthDay {} " + birthDate);
			});
		}
		
		
	}


}
class UserService{
		public String birthDate(String id){
			LocalDate birthDate;
			if(id.startsWith("0") || id.startsWith("1") || id.startsWith("2")){
				birthDate = LocalDate.now();
			}
			else if(id.startsWith("3") || id.startsWith("4") || id.startsWith("5")){
				birthDate = LocalDate.now();
			}
			else if(id.startsWith("6") || id.startsWith("7") || id.startsWith("8")){
				birthDate = LocalDate.now();
			}
			else{
				birthDate = LocalDate.now();
			}
			final SimpleDateFormat df = ThreadSafeDateFormatter.df.get();
			return df.format(birthDate);
		}
	}


class ThreadSafeDateFormatter{

	public static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(()-> new SimpleDateFormat("yyyy-mm-dd"));


}

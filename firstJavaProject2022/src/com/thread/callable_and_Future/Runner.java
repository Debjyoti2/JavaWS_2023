package com.thread.callable_and_Future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

	  ExecutorService executorService = Executors.newFixedThreadPool(20);
	  List<Future<Integer>> futureresults =  new ArrayList<>();
      for(int i=0;i<100;i++) {
    	  Future<Integer> results = executorService.submit(new CallableTaskRandomNumber());
    	  futureresults.add(results);
      }
		
      ///run all other code , let run the executor service to get the result in async way .
      
      for(int j=0;j<futureresults.size();j++) {
    	  Integer actualresults = futureresults.get(j).get();
    	  System.out.println(actualresults);
      }

	}

}

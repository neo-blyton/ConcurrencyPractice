package com.concurrency.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlayingWithExecutorsAndRunnables {

	public static void main(String[] args) {
		/*Runnable task = () -> System.out.println("I am in thread " + Thread.currentThread().getName());
		for(int i=0; i<10;i++){
			new Thread(task).start();
		}*/
		
		Runnable task = () -> System.out.println("I am in thread " + Thread.currentThread().getName());
		ExecutorService service = Executors.newSingleThreadExecutor();
		for(int i=0; i<10;i++){
			service.execute(task);
		}
		
		service.shutdown();
	}

}

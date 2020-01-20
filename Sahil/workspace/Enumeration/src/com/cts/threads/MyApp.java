package com.cts.threads;

public class MyApp
{

		public static void main(String[] args) {
			MThread thread = new MThread();
			
			
			thread.start();

			for(int i = 1;i<=100;i++) {
				System.out.println("Main :" + i);
			}
			
			try {
				thread.join();
			} catch (InterruptedException e) {
				
			}
			System.out.println("Main Terminated");
		}

	}


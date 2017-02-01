package javaProgramming.Module_Multithreading;

public class Deadlock_Occurance {

	public static void main(String[] args) {
		final String r1="1";
		final String r2="2";
		Thread t1=new Thread(){
			public void run(){
				
				synchronized  (r1){
					System.out.println("Thread 1: locked resource 1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (r2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				
				synchronized  (r2){
					System.out.println("Thread 2: locked resource 2");
					
					synchronized (r1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};
		t1.start();
		t2.start();

		System.out.println("h");
	}

}

package javaProgramming.Module_Multithreading;

public class Producer_Consumer_driver {

	public static void main(String[] args) throws InterruptedException {

		final ProducerConsumer pc=new ProducerConsumer();
Thread t1=new Thread(new Runnable(){

	@Override
	public void run() {

try {
	pc.produce();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
	
	
});
Thread t2=new Thread(new Runnable(){

	@Override
	public void run() {

try {
	pc.consume();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
	
	
});

t1.start();
t2.start();
t1.join();
t2.join();

	}

}



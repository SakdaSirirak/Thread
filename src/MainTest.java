
public class MainTest  {
	private int value = 0;

	public  void main(String[] args) {
//		ThreadTest test1 = new ThreadTest();
//		ThreadTest test2 = new ThreadTest();
//		Thread t1 = new Thread(test1, "t1");
//		Thread t2 = new Thread(test2, "t2");
//		t1.start();
//		t2.start();
		
		ThreadTest t = new ThreadTest();
		ThreadTerstTwo tt = new ThreadTerstTwo();
		Thread t1 = new Thread(t,"t1");
		Thread t2 = new Thread(tt,"t2");
		t1.start();
		t2.start();
		
	}

	public  void printInfo() {
		synchronized(ThreadTest.class){
			for (int i = 0; i < 10; i++) {
				value = value + 1;
				System.out.println("value => " + value + " : thread => " + Thread.currentThread().getName());
			}
		}
			

	}



}

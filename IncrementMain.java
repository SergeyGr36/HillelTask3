package increment;

public class IncrementMain {

	public static void main(String[] args) {
		ImplThread imp = new ImplThread();
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			Thread thr = new Thread(imp, "Thread" + i);
			try {
				thr.join();
				thr.start();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

package increment;

import java.util.concurrent.atomic.AtomicInteger;

public class ImplThread implements Runnable {
	private IncrementSynchronize is = new IncrementSynchronize();

	@Override
	public void run() {
		is.getValue();
		is.getValue(Thread.currentThread());
		is.getValue(new AtomicInteger(0));

	}

}

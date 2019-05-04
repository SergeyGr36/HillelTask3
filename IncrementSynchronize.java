package increment;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Sorry for my English... 
 * I wait to a criticism. And hope for yours helps about what must learn, i have to
 * until start java EE. Because i have not learn multithreading at my previous
 * course. They said that, multithreading in java - unnecessary.
 */
public class IncrementSynchronize {
	private int value = 0;

	public synchronized int getValue() {
		System.out.println("default meth	- " + value + " - " + Thread.currentThread().getName());
		return value++;
	}

	public int getValue(Thread th) {
		synchronized (this) {
			System.out.println("Thread meth	- " + value + " - " + Thread.currentThread().getName());
			return value;
		}
	}

	public int getValue(AtomicInteger ai) {
		System.out
				.println("AtomicInt	- " + (value += ai.getAndIncrement()) + " - " + Thread.currentThread().getName());
		return value += ai.getAndIncrement();
	}
}

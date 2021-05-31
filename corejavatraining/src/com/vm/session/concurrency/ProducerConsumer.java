
package com.vm.session.concurrency;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {
		public static void main(String[] args) {
			BlockingDeque<Integer> bq=new LinkedBlockingDeque<Integer>();
			
			Producer producer=new Producer(bq);
			Consumer consumer=new Consumer(bq);
			
			Thread producerThread=new Thread(producer);
			Thread consumerThread=new Thread(consumer);
			producerThread.start();
			consumerThread.start();
			
		}
		}




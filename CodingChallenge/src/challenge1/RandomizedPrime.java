package challenge1;

import java.util.concurrent.ConcurrentLinkedQueue;

public class RandomizedPrime {
	    public static void main(String args[]){
	 	ConcurrentLinkedQueue<Integer> inputqueue = new ConcurrentLinkedQueue<Integer>();
	 	ConcurrentLinkedQueue<OutputFormat> outputqueue = new ConcurrentLinkedQueue<OutputFormat>();
	 	System.out.println("Sample run for Prime Checker:");
	 	Thread randomizer= new Thread(new Randomizer(inputqueue,outputqueue));
	 	Thread prime= new Thread(new PrimeNumber(inputqueue,outputqueue));
	 	randomizer.start();
	 	prime.start();
	 	}
} 
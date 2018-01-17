package challenge1;

import java.util.concurrent.*;

public class PrimeNumber implements Runnable{
	
	ConcurrentLinkedQueue<Integer> iqueue;
	ConcurrentLinkedQueue<OutputFormat> oqueue;
	PrimeNumber(ConcurrentLinkedQueue<Integer> in,ConcurrentLinkedQueue<OutputFormat> out){
		this.iqueue=in;
		this .oqueue=out;
	}
	public void run(){
		int number;
		System.out.println("Prime checker is started");
		for(int i=0;i<10;i++){
			while(!iqueue.isEmpty()){
				number=iqueue.poll();
				OutputFormat o = new OutputFormat(number, isPrimeNumber(number));
				oqueue.add(o);
			}
				try{
					 Thread.sleep(800);
				 }
				catch(Exception e){e.printStackTrace();}
			
		}
		
		
	}
	
	//logic to check if number is prime or not
	public static boolean isPrimeNumber(int num){
		if(num==1){
			 
			return false;
		}
		
	    if ( num > 2 && num%2 == 0 ) {
	       
	        return false;
	    }
	    int top = (int)Math.sqrt(num);
	    for(int i = 3; i < top; i+=2){
	        if(num % i == 0){
	            return false;
	        }
	    }
	   
	    return true; 
	}

}
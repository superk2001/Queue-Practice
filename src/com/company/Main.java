package com.company;
import com.company.Queue;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
    	Queue testQueue1 = new Queue();
    	testQueue1.enqueue(1);
    	testQueue1.enqueue(2);
    	testQueue1.enqueue(3);
    	for(int i=0; i<3; i++){
    		System.out.println(testQueue1.dequeue());
    	}
    	
    	Queue testQueue2 = new Queue();
    	testQueue2.enqueue(1);
    	testQueue2.enqueue(2);
    	testQueue2.enqueue(3);
    	testQueue2.dequeue();
    	testQueue2.enqueue(5);
    	testQueue2.dequeue();
    	testQueue2.dequeue();
    	
    	System.out.println(testQueue2.toArrayList());
    }
}

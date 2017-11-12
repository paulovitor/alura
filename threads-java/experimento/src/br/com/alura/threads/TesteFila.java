package br.com.alura.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TesteFila {

	public static void main(String[] args) throws InterruptedException {
//		Queue<String> fila = new LinkedList<>();
		
		BlockingQueue<String> fila = new ArrayBlockingQueue<>(3); // thread-safe
//		fila.offer("c1");
//        fila.offer("c2");
//        fila.offer("c3");
		fila.put("c1");
        fila.put("c2");
        fila.put("c3");
        fila.put("c4"); //trava o MAIN

//        System.out.println(fila.poll());
        System.out.println(fila.take());
        System.out.println(fila.take());
        System.out.println(fila.take());
        System.out.println(fila.take()); //null

        System.out.println(fila.size()); //irá imprimir 0, pois o pool retira os elementos da fila
	}
}

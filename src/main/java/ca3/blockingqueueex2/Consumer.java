/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca3.blockingqueueex2;

import java.util.concurrent.BlockingQueue;

/**
 *
 * @author felesiah
 */
public class Consumer implements Runnable{
protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

@Override
    public void run() {
        try {
            System.out.println(queue.take());//take the thread wich were blocked by put()
            System.out.println(queue.take());//so whenever their is an available space in the queue
            System.out.println(queue.take());//it take the ones which were blocked first.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

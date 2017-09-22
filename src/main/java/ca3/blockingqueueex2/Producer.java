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
public class Producer implements Runnable{
 protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

 @Override
    public void run() {
        try {
            queue.put("1");//if the attemp oeration isn't possible immediately the put()
            Thread.sleep(1000);//block untiltheir is an open space in queue.
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
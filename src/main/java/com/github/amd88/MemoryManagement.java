package com.github.amd88;

import javax.swing.tree.TreeCellEditor;

/**
 * Created by vibodha on 12/14/16.
 */
public abstract class MemoryManagement implements Runnable {
    public static int m = 0;
    private Thread t;
    private static Thread current;

    public MemoryManagement(){
        current = Thread.currentThread();
    }

    public boolean isMemoryFull(){
        return (Runtime.getRuntime().freeMemory()/Runtime.getRuntime().totalMemory() < 0.05);
    }

    public void run() {
        boolean msg = false;
        while (true){
            if(isMemoryFull()){
                if(!msg){
                    System.out.println("full");
                    msg = true;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        System.out.println("Starting..... ");
        if (t == null) {
            t = new Thread (this);
            t.start ();
        }
    }
    public abstract int syncSave();
}

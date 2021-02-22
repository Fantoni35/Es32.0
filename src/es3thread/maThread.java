/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es3thread;

/**
 *
 * @author PC
 */
public class maThread implements Runnable {
    public void run(){
        System.out.println("la campana fa:"+ Thread.currentThread());
    }
    
    
}

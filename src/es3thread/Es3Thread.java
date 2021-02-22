/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es3thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Es3Thread {

   
    public static void main(String[] args) {
       Runnable r1= new maThread();
       Thread y1= new Thread(r1,"din");
       Thread y2= new Thread(r1,"don");
       Thread y3= new Thread(r1,"dan");
       Thread y4= new Thread(r1,"dun");
       Thread y5= new Thread(r1,"dun");
       Thread y6= new Thread(r1,"dun");
       
       y1.start();
       y4.start();
        try {
            y1.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Es3Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
       y2.start();
       y5.start();
        try {
            y2.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Es3Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
       y3.start();
       y6.start();
        try {
            y3.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Es3Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}

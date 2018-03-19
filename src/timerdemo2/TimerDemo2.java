/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timerdemo2;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Moad
 */
public class TimerDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask()
        {
            private int i = 0;
            public void run(){
                if (i <= 20 ) {
                    System.out.println("" + i++ +":00 Seconds Left");
                }
            }
        };
        
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
    
}

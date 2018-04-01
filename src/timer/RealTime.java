/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.util.Timer;


/**
 *
 * @author Chili
 */
public class RealTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer time = new Timer();
        time.schedule(new Task(), 5000,60000);
        System.out.println("現在時間：");

        try {
            Thread.sleep(8000);
        }
        catch(InterruptedException e) {
        }
    }
    
}


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ars
 */
public class Main {
    public static void main(String[] args) {
        
        Bus bus=new Bus("BMW",2020);
        Date date=new Date();
        
//        bus.moveFromAToBAtStraightLine(100, 500);
//        bus.checkTicket(100,80);
        
        System.out.println(bus.moveFromAToBAtStraightLine(100, 500));
        System.out.println(bus.checkTicket(1500,80));
        
        
        
    }
    
    
}

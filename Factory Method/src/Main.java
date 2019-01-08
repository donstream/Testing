
import java.util.Date;


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

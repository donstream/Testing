import java.util.Date;


public class Bus implements Transport, Controller {

    String name;
    int productionYear;

    public Bus(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }
    
    
    @Override
    public int moveFromAToBAtStraightLine(int a, int b) {
        int result=0;
        
        if(a>b){
            result=a-b;
        }
        result=b-a;
        return result;
    }

    @Override
    public String checkTicket(int payment, int fare) {
        String result;
        int costDifference;
        if(payment >fare){
            costDifference=payment-fare;
            System.out.println("Cost Difference = "+costDifference);
            result="Получите сдачу. Проезд оплачен";
            return result;
        }
        if(payment==fare){
            result="Проезд оплачен";
            return result;
        }
        result="Недостаточно средств на проезд";
            return result;
    }

  
    

   
}

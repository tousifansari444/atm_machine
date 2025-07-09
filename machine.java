
import java.util.Scanner;


public class machine {
   
    public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   double ballance = 5000;
        System.out.println("wellcome to the atm machine");
          for(int ii = 0; ii>-1;ii++){
        System.out.println("choose the following operations\n 1 withdraw\n 2 deposit\n 3 check ballance");
        
        int input = sc.nextInt();
        switch (input) {
        case 1: System.out.println("enter your amount");
        int amount = sc.nextInt();
        System.out.println("enter ur pin");
        int pins = sc.nextInt();
        if(pins == 4753){
        System.out.println("successfully withdrawn "+amount+" remaining ballance");
        System.out.println(ballance - amount+"rs");
    }
        else{
        System.out.println("wrong pin");
    }
        break;
        case 2:System.out.println("enter how much amount u want to deposit");
        int deposit = sc.nextInt();
        System.out.println("now enter your pin");
        int pn = sc.nextInt();
        if (pn == 4753) {
            System.out.println("succesfully deposited");
            System.out.println("remaining ballance "+(deposit+ballance+"rs"));  
    }
        else{
           System.out.println("you enter wrong pin"); 
        }
        break;
        case 3:System.out.println("enter your pin");
        int pun=sc.nextInt();
        if (pun == 4753) {
            System.out.println("your current ballance is "+ballance+"rs");
        }
        else{
            System.out.println("wrong pin");
        }
        break;
        default:System.out.println("wrong input");
        break;

        
    }
    
      System.out.println("type 'restart' to restart the machine or 'exit' to exit");
      sc.nextLine();
      String restart= sc.nextLine();
      if(restart.equals("restart")){
      System.out.println("restarting.......");
     
    }

    else{
        System.out.println("exiting.....");
        break;


    

}
           }      
    }
    
}

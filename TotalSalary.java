import java.util.Scanner;

public class TotalSalary {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        char G = s.next().charAt(0);
        
        double hra = basic*0.5;
        double da = basic*0.2;
        int allow;
        if(G == 'A'){
            allow = 1700;
        }
        else if(G == 'B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        double pf = basic*0.11;

        int totalSalary = (int)Math.round(basic + hra + da + allow - pf);
        System.out.println(totalSalary);
        s.close();
    }
    
}

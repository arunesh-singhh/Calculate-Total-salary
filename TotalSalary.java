import java.util.Scanner;
import java.lang.Math;

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
// Total Salary
// Problem Description: You have to calculate the rounded off total salary of a person by using
// the formula: totalSalary = basic + hra + da + allow – pf, where hra = 20% of basic, da = 50% of
// basic, allow = 1700, if grade = ‘A’, allow = 1500, if grade = ‘B’, allow = 1300, if grade = ‘C' or
// any other character, pf = 11% of basic. “basic” and the “grade” will be taken as input from the
// user.
// How to Approach?
// 1. Take basic and grade as input from the user.
// 2. Calculate hra, da, pf by using basic.
// 3. Check for the grade and then take the allowance corresponding to it.
// 4. Calculate total salary by using basic, hra, da, pf and allowance calculated above.
// 5. Round off the total salary using library function and then print it.
// Pseudo Code for this problem:
// input=basic
// input=grade
// hra = 0.2 * basic
// da = 0.5 * basic
// if(grade == 'A') :
//  allowance = 1700
// else if(grade == 'B') :
//  allowance = 1500
//  else :
//  allowance = 1300
// pf = 0.11 * basic
// totalSalary = basic + hra + da + allowance - pf
// ans = round(totalSalary)
// print(ans)
// ❏ Let us dry run the code:
// basic=10000
// grade= ‘A’
// ● hra=0.2*10000=2000
// ● da=0.5*10000=5000
// ● Now, we have grade=’A’, so allowance=1700
// ● pf=0.11*10000=1100
// ● Total salary=10000+2000+5000+1700-1100=17600
// ● Rounding off will keep it 17600 which is our output print it.
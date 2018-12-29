
package solution;

import java.util.Scanner;

public class GradingSolution {

    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        
        System.out.println("Enter size of class");
        
        int n = si.nextInt();
        int [] Mark = new int[n];
        String comment;
        
        for(int i = 0; i<Mark.length; i++){
            System.out.println("Enter Mark["+(i+1)+"]");
           
            int grade = si.nextInt();
            
            if(grade<=38){
                Mark[i] = grade;
                comment = "Fail";
            }else{               
                
                if((grade+1)%5==0){
                    Mark[i] = grade+1;
                    comment = "Pass";
                }else if((grade+2)%5==0){
                    Mark[i] = grade+2;
                    comment = "Pass";
                }
                else{
                    Mark[i] = grade;
                    comment = "Pass";
                }
            }
            System.out.println("Mark["+(i+1)+"] = "+Mark[i]+ " comment : "+comment);
        }
    }
    
}

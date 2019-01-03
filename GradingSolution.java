
package solution;

import java.util.Scanner;

public class GradingSolution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter class size");
        int n = input.nextInt();
        
        int [] grades = new int[n];

        for(int grade=0; grade < n; grade++){
            System.out.println("Enter grades["+(grade+1)+"]");
             grades[grade] = input.nextInt();             
        }
        
        System.out.println("Rounded-off results");
        
        for(int i=0;i<n;i++){
            if(grades[i]<= 38){
                System.out.println("grades["+(i+1)+"]"+grades[i]);
            }
            else if(grades[i]%5>=3){                
                grades[i]=grades[i]+(5-grades[i]%5);
                System.out.println("grades["+(i+1)+"]"+grades[i]);
            }
            else{
                System.out.println("grades["+(i+1)+"]"+grades[i]);
            }                     
        }
        
    }
    
}

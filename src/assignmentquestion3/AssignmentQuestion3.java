/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentquestion3;

import java.util.Scanner;

/**
 *
 * @author Kizito Asudo
 */
public class AssignmentQuestion3 {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int ans;


        do {
            //DO-WHILE loop runs the code before the condition is checked
            System.out.println("Enter 1, 2 or 3 | Or enter 0 to stop the loop");
            ans=input.nextInt();
            if (ans==1) {
                System.out.println("You have selected Number 1");
                
            }else if (ans==2){
                System.out.println("You have selected Number 2");

            }else if (ans==3){
                System.out.println("You have selected Number 3");

            }else if(ans==0){
                System.out.println("You have chosen to stop the loop");

            }
            else{
                System.out.println("INVALID");
            }
            
        
        } while (ans!=0);

        While w=new While();
        While.meth();
    }
}

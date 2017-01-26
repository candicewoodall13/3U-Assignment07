
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Candice
 */
public class a7q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input = new Scanner(System.in);
        //ask user question
        System.out.println("How many students in the class?");
        //let user answer
        int sinclass = input.nextInt();
        //initialize average
        double classaverage = 0;
        //sum of marks
        int summarks= 0;
        //initialize array for marks
        int[] marks;
        marks = new int [sinclass];
        //ask user question
        System.out.println("Enter the marks: ");
        for(int i=0; i<sinclass; i++){
            //let user input in array
            marks[i]= input.nextInt();
        }
        //loop to calculate average of marks
        //loop amount of times sinclass
        for(int i=0; i<sinclass; i++){
            summarks= summarks + marks[i];   
        }
        classaverage = summarks/sinclass;
        System.out.println("The class average is: " + classaverage + "%");
        
        
        
        
        
    }
    
}

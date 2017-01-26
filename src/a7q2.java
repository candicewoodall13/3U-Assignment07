
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
public class a7q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create input for the user
        Scanner input = new Scanner(System.in);
        //ask user question
        System.out.println("How many people?");
        //let user answer
        int people = input.nextInt();
        //initialize average
        double averageheight = 0;
        //sum of marks
        int sumheights= 0;
        //initialize array for marks
        int[] heights;
        heights = new int [people];
        //ask user question
        System.out.println("Enter the heights ");
        for(int i=0; i<people; i++){
            //let user input in array
            heights[i]= input.nextInt();
        }
        //loop to calculate average of marks
        //loop amount of times sinclass
        for(int i=0; i<people; i++){
            sumheights= sumheights + heights[i];   
        }
        averageheight = sumheights/people;
        for(int i=0; i<people; i++){
            
            if(heights[i]> averageheight){
                System.out.println("Above average height: " + heights[i]);
            }
        }
        
        
    }
    
}

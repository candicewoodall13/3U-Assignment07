
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
public class a7q5 {

    /**
     * @param args the command line arguments
     */
    public static void Swap(int row1, int row2, int myarray[]){
        //create temporary array for swapping
        int temp;
        //swap all rows
        temp= myarray[row1];
        myarray[row1]= myarray[row2];
        myarray[row2]= temp;
                
        
        return;
    }
    
    
    public static void Sort(int myarray[]){
        
        boolean sorted =true;
        
        do //keep sorting the array until no more swaps are needed
        {
            sorted=true;
            for(int i=0; i<=myarray.length-2; i++){
                
            
                if(myarray[i]>myarray[i+1]){
                    Swap(i, i+1, myarray);
                    sorted=false;
                }
            }
            
          
        }while(sorted==false);
        
        return;
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        //create input for user
        Scanner input = new Scanner(System.in);
         //ask user question
        System.out.println("How many marks?");
        //let user answer
        int nummarks = input.nextInt();
        //tell user to enter marks
        System.out.println("Enter marks: ");
       //variable for median
        double median=0;
        //create array to hold two ints        
        int[] marks;
        marks = new int [nummarks];
        //create for loop for input of ints
        for(int i=0; i<=nummarks-1; i++){
            //let user input in array
            marks[i]= input.nextInt();
        }
        
        //call sort method
        Sort(marks);
        System.out.println("Marks in order: ");
        //print loop
        for(int i=0; i<=nummarks-1; i++){
            System.out.println(marks[i]);
        }
        //check if nummarks is even
        if(nummarks%2==0){
            median= (marks[nummarks/2]+marks[(nummarks/2)-1])/2;
            
        }else{
            median= marks[(nummarks-1)/2];
        } 
        //print median
        System.out.printf("The median is: "+ median);
        
        
        
        
        
    }
    
}

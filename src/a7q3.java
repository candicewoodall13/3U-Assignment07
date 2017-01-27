
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
public class a7q3 {

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
        //ask user for input of ints
        System.out.println("Enter two integers: ");
        //create array to hold two ints        
        int[] numbers;
        numbers = new int [2];
        //create for loop for input of ints
        for(int i=0; i<=1; i++){
            //let user input in array
            numbers[i]= input.nextInt();
        }
        
        //call sort method
        Sort(numbers);
        
            System.out.println("The integers in ascending order are: " + numbers[0]+ " " + numbers[1]);
        
    }
    
}

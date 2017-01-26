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
    
    public void Swap(int row1, int row2, int myarray[]){
        //create temporary array for swapping
        int temp;
        //swap all rows
        temp= myarray[row1];
        myarray[row1]= myarray[row2];
        myarray[row2]= temp;
                
        
        return;
    }
    
    
    public void Sort(int myarray[]){
        
        boolean sorted =true;
        
        do //keep sorting the array until no more swaps are needed
        {
            sorted=true;
            for(int i=0; i<=myarray.length-1; i++){
                
            
                if(myarray[i]>myarray[i+1]){
                    Swap(i, i+1, myarray);
                    sorted=false;
                }
            }
            
          
        }while(sorted==false);
        
        return;
    }
    
    
    
    
    public static void main(String[] args) {
       
    }
    
}

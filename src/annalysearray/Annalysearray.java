/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annalysearray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Muhammad Tabish
 */
public class Annalysearray {
    public static void Annalysearray(int [] numbers){
        int negativeNums = 0;
        int positiveNums = 0;
        int zeros = 0;
        for(int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] > 0) {
                positiveNums++;
            } else if (numbers[i] < 0) {
                negativeNums++;
            } else {
                zeros++;
            }
        }
        
        System.out.println(" RESULT ");
      
        if(negativeNums == 0){
            System.out.println("NO negatives\n");
        }
        else{
            System.out.println("there are " + negativeNums + " negative numbers\n");
        }
        if(positiveNums == 0){
            System.out.println("NO positives");
        }
        else{
            System.out.println("there are " + positiveNums + " positive numbers\n");
        }
        if(zeros == 0){
            System.out.println("NO zeros");
        }
        else{
            System.out.println("there are " + zeros+ " zeros\n");
        }
           
    }
        
   
  public static void main(String [] args){
        
     int[] myNum = {10, -20, 30, 0,  40};
    
     
        
        for (int element: myNum) {
            System.out.println(element);
            
            if(element <= -1 )
            {
                System.out.println(element + "this is negative");
         }
            else if (element >= 1)
            {
               System.out.println(element+ "this is postive number");
            }
            
            else if (element == 0)
                    {
                       System.out.println(element+ "this is zero");
                       
                    }
            else
            {
                System.out.println("thats all");
            }
             
        }
    int negative = 0 ;
             int positive = 0 ;
             int n = 0;
             int p = 0;
            for(int i=0;i<myNum.length;i++){
             if(myNum[i]<0){
                
               negative = myNum[i];
                   n++;
             }else{
                 positive  = myNum[i];
                 
                  p++;
               System.out.println("Negative array : " + (negative));
               System.out.println("Positive array : " + (positive));
    
    }
    
             
        
        
        
    
    }
    
Arrays.sort(myNum);
         System. out. println("Minimum = " + myNum[0]);
         System. out. println("Maximum = " + myNum[myNum. length-1]);
    
   
int [] innums ={10, -20, 30, 0,  40} ;
        Annalysearray(innums);
        
    }
    
}




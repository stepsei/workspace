package net.javavideotutorials.example;

import java.util.Arrays;

public class DataStructures {
  public static void main(String[] args){
    char[] charArray = new char[9];
    
    charArray[0] = 'H';
    charArray[1] = 'E';
    charArray[2] = 'L';
    charArray[3] = 'L';
    charArray[4] = 'O';
    charArray[5] = 'A';
    charArray[6] = 'B';
    
    // We can do allow with the array class like sorting
   // Arrays.sort(charArray);
    
    //for loop to fetch each index with charArray.length meaning length of array
    for(int i=0;i<charArray.length;i++){
      System.out.println(charArray[i]); // demonstrating println
      }
    for(int j=0;j<7;j++){
    System.out.print(charArray[j]);   // demonstrating print
    }
    
    System.out.print("\n");          //Just to create a new line before next print
    
    //Alternatively for each loop iteration
    for(char c : charArray){
      System.out.print(c);
    }
    
   
  }

}
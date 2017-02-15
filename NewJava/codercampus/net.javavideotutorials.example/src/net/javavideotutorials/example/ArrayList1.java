package net.javavideotutorials.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
  public static void main(String[] args){
    // create an arraylist
    List<String> myarraylist = new ArrayList<String>();
    
    // add elements to the arraylist
    myarraylist.add("G");
    myarraylist.add("O");
    myarraylist.add("O");
    myarraylist.add("D");
    
    
    // to remove
    myarraylist.remove(3);
    
    // iterate each for loop to print elements
    for(String s : myarraylist){
      System.out.print(s);
    }
    
  }
}

// We cannot use a primitive data type in ArrayList. so for example char to replace string will 
// give an error instead for char we need to use character.
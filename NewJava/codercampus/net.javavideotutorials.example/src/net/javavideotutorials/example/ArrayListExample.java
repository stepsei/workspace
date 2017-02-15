package net.javavideotutorials.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

  public static void main(String[] args) 
  {
    //List accepts duplicates, it shrinks and grows without problem
    // we program to an interface  at the left (List) and then at the right (concrete implementation -Arraylist)
    // This is good programming practice. In this case List is part of collection (List, Map & Set)
    
   
    List<String> myArrayList = new ArrayList<String>();
    
    System.out.println("Is my list empty? " + myArrayList.isEmpty());
    System.out.println("Let's put some stuff in! ");
    
    myArrayList.add("H");       // index 0
    myArrayList.add("E");       // index 1
    myArrayList.add("L");       // index 2
    myArrayList.add("L");       // index 3
    myArrayList.add("O");       // index 4
    
    System.out.println("Is my list empty After adding some stuff? " + myArrayList.isEmpty());
    
    myArrayList.add("!");   // index 5
    myArrayList.add("?");   // index 6
    
    System.out.println("What's in my ArrayList? " + myArrayList.toString());
    System.out.println("Now let's modify the array.....let's remove an element");
    
    // myArrayList.remove(5);
    
    System.out.println("What's in my ArrayList? " + myArrayList.toString());
    
    System.out.println("I am removing Element " + myArrayList.remove(5) + ", from the ArrayList.");
    
    
    System.out.println("Now I want to remove an element from the ArrayList based on an Object match.");
    System.out.println("Now I will try to remove the element 'l' from the ArrayList, was this successful?" 
    + myArrayList.remove("L"));
    
    System.out.println("What's in my ArrayList? " + myArrayList.toString());
    
  }

}

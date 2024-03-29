package net.javavideotutorials.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

  public static void main(String[] args) {
    //Map uses key, value pair
    
    Map<String, List<String>> countryMap = new  HashMap<String, List<String>>();
    
    List<String> regionList1 = new ArrayList<String>();
    regionList1.add("NY");
    regionList1.add("CA");
    
    countryMap.put("USA", regionList1);
    
    List<String> regionList2 = new ArrayList<String>();
    regionList2.add("ON");
    regionList2.add("AB");
    
    countryMap.put("Canada", regionList2);
    
    // Iterate through the values only
    
    Collection<List<String>> values = countryMap.values();
    
    for(List<String> value : values)
    {
      for (String region : value)
      {
        System.out.println(region);
      }
    }
    
    System.out.println("************Printing both Keys & Values: *******************");
    // Iterate between key and values at the same time
    // our entry is a combination of the key and value
    for(Map.Entry<String, List<String>> entry : countryMap.entrySet())
    {
      System.out.println(entry.getKey()+ " -> " + entry.getValue());
    }
    
    // n the for loop, we can either use key or values to output our data/
    //for(String key:countryMap.keySet())
    //{
     // System.out.println(key);
    //}

    // Do the remove part on your own;
    //countryMap.remove();
    //countryMap.containsKey();
    //countryMap.containsValue();
    
    
  }

}

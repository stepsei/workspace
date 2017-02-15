package net.javavideotutorials.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hashMaps {
  public static void main(String[] args){
    
    /* making use of hashmaps with a map data structure containing a List
    * Maps uses the key:value pair idea so the key could be a type of Strings while
    * the value could be made up of list of strings
    */
    
    Map<String, List<String>> makeModel = new HashMap<String, List<String>>();
    
    List<String> hondaList = new ArrayList<String>();
    hondaList.add("CRV");
    hondaList.add("CIVIC");
    hondaList.add("ACCORD");
    
    List<String> toyotaList = new ArrayList<String>();
    toyotaList.add("RAV4");
    toyotaList.add("CAMRY");
    toyotaList.add("COROLLA");
    
    List<String> kiaList = new ArrayList<String>();
    kiaList.add("SORENTO");
    kiaList.add("MOHAVE");
    kiaList.add("PRIDE");
    
    makeModel.put("HONDA", hondaList);
    makeModel.put("TOYOTA", toyotaList);
    makeModel.put("KIA", kiaList);
    
    System.out.println(makeModel.get("HONDA"));
    System.out.println(makeModel.get("TOYOTA"));
    System.out.println(makeModel.get("KIA"));
    System.out.println(makeModel.get("AUDI")); // AUDI is not a key in our MAP
      
  }

}

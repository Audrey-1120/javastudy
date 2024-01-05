package chap010;

import java.util.*;

public class HashMapExample {

  public static void main(String[] args) {
    
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    map.put("가민수", 85);
    map.put("나민수", 90);
    map.put("다민수", 80);
    map.put("나민수", 95);
    System.out.println("총 Entry 수: " + map.size());
    
    System.out.println("\t나민수 : " + map.get("나민수"));
    System.out.println();
    
    Set<String> keySet = map.keySet();
    Iterator<String> keyIterator = keySet.iterator();
    while(keyIterator.hasNext()) {
      String key = keyIterator.next();
      Integer value = map.get(key);
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();
    
    map.remove("가민수");
    System.out.println("총 Entry 수: " + map.size());
    
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
    
    while(entryIterator.hasNext()) {
      Map.Entry<String, Integer> entry = entryIterator.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("\t" + key + " : " + value);
    
    }
    System.out.println();
    
    map.clear();
    System.out.println("총 Entry 수: " + map.size());
    
    
  }

}

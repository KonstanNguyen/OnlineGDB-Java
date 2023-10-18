import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class N21DCCN156{
  public static void main(String[] args){
    ArrayList<String> L = new ArrayList<>();

    L.add("Green");
    L.add("Red");
    L.add("Blue");
    L.add("Violet");
    System.out.println("1)");
    L.forEach(System.out::println);
    
    System.out.println("2)");
    L.set(1, "Yellow");
    L.forEach(System.out::println);
    
    System.out.println("3)");
    List<String> list1 = L.subList(0,3);
    list1.forEach(System.out::println);
    
    System.out.println("4)");
    L.forEach((x)-> {
      System.out.println(x.equalsIgnoreCase("Green"));
    });
    
    System.out.println("5)");
    System.out.println(L.equals(list1));
    
    System.out.println("6)");
    L.sort((x1, x2) -> {
      return x1.compareTo(x2);
    });
    L.forEach(System.out::println);
    
    System.out.println("7)");
    Collections.swap(L,0, 1);
    L.forEach(System.out::println);
    
    System.out.println("8)");
    ArrayList<String> list2 = new ArrayList<String>(); 

    list2.add("Grey"); 
    list2.add("Orange");
    
    L.addAll(list2);
    L.forEach(System.out::println);    

  }
}

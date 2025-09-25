
//Collection - Arraylist
import java.util.*;

class Main {
    
    public static List<Integer> arraylist(){
          List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        return list;
    }
    
    public static void main(String[] args) {
      
        System.out.println(arraylist());
        
    }
}

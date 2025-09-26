//WAP for finding duplicates in the string.
import java.util.*;

class Main {
    
    public static void firstDuplicates(String word){
        char [] chars= word.toCharArray();
        for(int i=0; i<chars.length; i++){
            boolean isDuplicate = false;
            for(int j= i+1; j<chars.length;j++){
                if(chars[i] == chars[j]){
                isDuplicate= true;
                break;
                }
            }
            if (isDuplicate == true){
                System.out.println("Duplicate is: "+ chars[i]);
            }
        }
        
    }
    public static void main(String[] args) {
      
        firstDuplicates("Gafoor");
        
    }
}

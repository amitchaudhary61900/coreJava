/*String word: Amit@Java$@gmail.com
Output: mocliamgavatima*/

class Main {
    public static void main(String[] args) {
        System.out.println("Final reversed string: "+ cleanedString("Amit@Java$@gmail.com"));
    }
    
    public static String cleanedString(String words){
        
        char[] ch= words.toCharArray();
        String cleaned = "";
        
        for(int i =0; i< ch.length; i++){
            
            if((ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9')){
                
                cleaned += Character.toLowerCase(ch[i]);
            }
            
        }
        char[] arr= cleaned.toCharArray();
        StringBuilder sb= new StringBuilder();
        
        for(int i= arr.length-1; i>=0;i--){
            
            sb.append(arr[i]);
            
        }
                    return sb.toString();

    
    }
}



class Main {
    public static void main(String[] args) {
        String str= "Amit is good amit well done amit";
       str= str.toLowerCase();
        String [] words= str.split(" ");
       
        
        for(int i=0; i< words.length; i++){
            int count= 1;
            if(words[i].equals("")){
                continue;
            }
            for(int j=i+1; j<words.length; j++){
                
                if(words[i].equals(words[j])){
                    count++;
                    words[j]= "";
                }
            }
            System.out.println(words[i]+" = "+ count);
        }
    }
}

package fullstackjavatraning;

import javax.sound.sampled.SourceDataLine;

public class hashing {
    public static void main(String[] args) {
        String str = "ram kumar";
        HashMap<Character, Integer>map=new HashMap<>();
        for(int i=0;i< str.length();i++){
            char singleChar=str.charAt(i);
            if(map.put(singlechar)=null){

            }
        }else{
            int count = map.get(singleChar);
            map.put(singleChar,count+1);
        }
    }
     
    
}

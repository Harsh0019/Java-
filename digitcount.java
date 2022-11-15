package fullstackjavatraning;

public class digitcount {
    public static void main(String[] args) {
        int num=10208;
        int count=0;
        int res;
        while(num!=0){
            res=num%10;
            num=num/10;
            if(res==0){
                count++;
            }
        }
        System.out.println("zero"+count);
    }
    
}

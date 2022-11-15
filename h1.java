package fullstackjavatraning;

public class h1 {
    public static void main(String[] args) {
        int num=153;
        int temp =num;
        int arm =0;
        while(num!=0){
            //logic armstrong
            int rem = num %10;
            arm+= Math.pow(rem,3);
            num= num / 10;

        }
        if (arm==temp){
            System.out.println("number is armstrong....");
        }else{
            System.out.println("number is not armstrong.....");
        }
    }
    
    
}

package fullstackjavatraning;

public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int cpy=n;
        int count=0;
        int res;
        double c=n;
        while(n!=0){
            n=n/10;
            count++;
        }
        while(cpy!=0){
            res=cpy%10;
            double pow=Math.pow(res,count);
            cpy=cpy/10;
            sum=sum+pow;
        } 
        if(sum==c){
            System.out.println("Given no.is Armstrog");
        }else{
            System.out.println("Given no. is not Armstrong");
        }   
    } 
}

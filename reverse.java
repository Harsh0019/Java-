package fullstackjavatraning;

public class reverse {
public static void main(String[] args) {
int num=1234;
int res;
int temp=0;
while(num!=0){
res=num%10;
num=num/10;
temp=temp*10+res;
    
}
System.out.println(temp); 
}

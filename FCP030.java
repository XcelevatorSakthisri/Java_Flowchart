import java.util.*;
public class FCP030
{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int i=1;
int s=0;
int N=input.nextInt();
while(i<N/2){
s=i*i;
if(s==N){
System.out.println("Yes");
break;
}
i++;
}
if(s!=N) {
System.out.println("No");
}
}
}
import java.util.*;
public class FCP025{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int N=input.nextInt();
for(int i=1;i<=N;i++){
int M=input.nextInt();
int s=0;
for(int j=1;j<=M;j++){
if(j%2!=0){
s=s+j;
}
}
System.out.println(s);
}
}
}
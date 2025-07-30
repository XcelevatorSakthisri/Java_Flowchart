import java.util.*;
public class FCP026{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int M=input.nextInt();
int N=input.nextInt();
int S=0;
for(M=2;M<=N;M++){
S=S+M;
}
System.out.println(S);
}
}

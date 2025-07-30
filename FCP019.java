public class FCP019{
public static void main(String[] args){
int B=200;
double A=0;
if (B<=50){
A=50*0.50;
A=A+(A*0.20);
}
else if(B<=150){
A=(50*0.50)+((B-50)*0.75);
A=A+(A*0.20);
}
else if(B<=250){
A=(50*0.50)+(100*0.75)+((B-150)*1.20);
A=A+(A*0.20);
}
else{
A=(50*0.50)+(100*0.75)+(100*1.20)+((B-250)*1.50);
A=A+(A*0.20);
}
System.out.println(A);
}
}

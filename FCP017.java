public class FCP017{
public static void main(String[] args){
int N1=8;
int N2=4;
int N3=5;
int MX=0;
int SX=0;
if (N1>N2){
MX=N1;
SX=N2;
}
else{
MX=N2;
SX=N1;
}
if (N3>SX){
SX=N3;
}
else{
SX=SX;
}
System.out.println(SX);
}
}
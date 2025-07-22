public class FCP018{
public static void main(String[] args){
int BS=800;
double HRA=0;
double DA=0;
double GS=0;
if(BS<=10000){
HRA =BS*0.20;
DA=BS*0.25;
GS=BS+HRA+DA;
}
else if(BS<=20000){
HRA =BS*0.25;
DA=BS*0.90;
GS=BS+HRA+DA;
}
else{
HRA =BS*0.30;
DA=BS*0.95;
GS=BS+HRA+DA;
}
System.out.println((int)GS);
}
}



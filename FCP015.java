public class FCP015{
public static void main(String[] args){
int N1=9;
int N2=1000;
int N3=200;
int N4=4000;
int MX1=0;
int MX2=0;
int MX=0;
if (N1>N2)
{
MX1=N1;
}
else
{
MX1=N2;
}
if (N3>N4)
{
MX2=N3;
}
else
{
MX2=N4;
}
if (MX1>MX2)
{
MX=MX1;
}
else
{
MX=MX2;
}
System.out.println(MX);
}
}

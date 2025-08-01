import java.util.*;
public class FCP021{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n1=input.nextInt();
int n2=input.nextInt();
int n3=input.nextInt();
int n4=input.nextInt();
int n5=input.nextInt();
int n6=input.nextInt();
int n7=input.nextInt();
int n8=input.nextInt();
int m1=0,m2=0,t=0;
if(n1>n2)
{
m1=n1;
m2=n2;
}
else{
m1=n2;
m2=n1;
}
if(m2<n3)
{
m2=n3;
if (m1<m2){
t=m1;
m1=m2;
m2=t;
}
}
if (m2 < n4)
{
m2=n4;
if (m1<m2)
{
t=m1;
m1=m2;
m2=t;
}
}
if(m2<n5){
m2=n5;
if (m1<m2){
t = m1;
m1 = m2;
m2 = t;
}
}
if (m2<n6){
m2=n6;
if(m1<m2){
t = m1;
m1 = m2;
m2 = t;
}
}
if (m2<n7){
m2=n7;
if(m1<m2){
t = m1;
m1 = m2;
m2 = t;
}
}
if(m2<n8){
m2=n8;
if(m1<m2){
t = m1;
m1 = m2;
m2 = t;
}
}
System.out.println(m2);
}
}
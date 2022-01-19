package week1.day1;

public class Fibonacci {

public static void main(String[] args) { 
 int a1=0,a2=1,a3,i,count=10;    
 System.out.print(a1+" "+a2);//printing 0 and 1    
    
 for(i=2;i<count;++i)
 
 //loop starts from 2 because 0 and 1 are already printed    
 {    
  a3=a1+a2;    
  System.out.println(" "+a3);    
  a1=a2;    
  a2=a3;    
 }    
  
}} 
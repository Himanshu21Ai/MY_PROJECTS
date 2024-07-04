packagecom.mycalculator

import Java.util.*;

public class calculator{
 public static void main( string [] args ){
     scanner sc = new scanner ( system.in);
     int a = sc.nextint();
     int b = sc.nextint();
     char operations = +,-,*,/
     switch(operations){

     case + : system.out.print(a+b);
     break;
     case - : system.out.print(a-b);
     break;
     case * : system.out.print(a*b);
     break;
     default / : system.out.print(a/b);
     break; 
     }
 }    
}
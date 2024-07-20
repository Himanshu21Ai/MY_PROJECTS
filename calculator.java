import java.util.*;

 class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
            System.out.print("TYPE THE VALUE OF 'a'=");
            int a = sc.nextInt();
            System.out.print("TYPE THE VALUE OF 'b'=");
            int b = sc.nextInt();
            int operations = sc.nextInt();
       
            switch(operations){
       
            case 1 : System.out.print(a+b);
            break;
            case 2 : System.out.print(a-b);
            break;
            case 3 : System.out.print(a*b);
            break;
            case 4 : if(b==0){
                      System.out.print("INVALID NUMBER");
                     }else{
                      System.out.print(a/b);   
            break; 
                }
       
        }    
       }
 }
 
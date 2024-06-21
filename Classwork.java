import java.util.Scanner;
public class Classwork{
       public static void main(String[]args){
            double area;
            double perimeter;
            double radius;
            double pie= 3.14159;
            

           Scanner sc= new Scanner(System.in);
           System.out.println("enter your radius");
           radius= sc.nextDouble();
         
           area= radius*radius*pie;
           perimeter= 2*radius*pie;


           System.out.println("YOUR AREA IS " + area);
           System.out.println("YOUR PERIMETER IS" + perimeter);



              }
   
               }
     
           
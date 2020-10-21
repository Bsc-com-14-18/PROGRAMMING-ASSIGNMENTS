import java.util.Scanner;
    public class Student{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

            // getting student name
        System.out.println("Enter Name Please");
            String name = input.next();

            // getting student Grades
          System.out.println("Enter the grades for the course: " );
          int [] number = new int[3];
            for(int b=0; b<number.length; b++){
                System.out.println("Grade for Course" +(b+1));
                number[b] = input.nextInt();
            }
            
        
        }
        public static int average(int [] number){
            int sum = 0;
            for(int b=0; b<number.length; b++){
                sum += number[b];
            }
            return sum/number.length;
        }

} 
    
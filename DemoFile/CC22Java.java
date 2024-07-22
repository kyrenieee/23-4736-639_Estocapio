import java.util.Scanner;
import java.util.ArrayList;

public class CC22Java
{    
    public static void main(String[] args) {
        System.out.println("Enter your Name: ");
        Scanner StudentName = new Scanner(System.in);
        String Name = StudentName.nextLine();

        System.out.println("Enter your Age: ");
        Scanner StudentAge = new Scanner(System.in);
        int Age = StudentAge.nextInt();

        System.out.println("Enter your Course: ");
        Scanner StudentCourse = new Scanner(System.in);
        String Course = StudentCourse.nextLine();

        System.out.println("Enter your Student ID: ");
        Scanner StudentID = new Scanner(System.in);
        String ID = StudentID.nextLine();


        System.out.println("Full Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Course: " + Course);
        System.out.println("Student ID " + ID);
    }
    
}
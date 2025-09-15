package src.main.java.com.mycompany.csc229_211review_lab02hw;


import java.util.Scanner;
/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {

    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter gpa");
        double gpa = input.nextDouble();


        //object reference variable std1(can hold object/values) of / referencing the Student class
        // new Student class calls on Student class constructor to allocate/assign values
        // in order of (name, age, gpa) for the Student class
        Student std1= new Student("James",(short)20,gpa);


        // ToDo 8: Set the gpa of the student using the scanner and user
        //           input and then print the output.


        //
        System.out.println(std1);

        // ToDo 9: add comments and explain your code

        // ToDo 10: submit using a pull request.
    }


}

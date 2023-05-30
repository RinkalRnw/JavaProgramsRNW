import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.println("Enter anything:");
        // if(args.length > 0){
        //     for(String i:args){
        //         System.out.println("You entered "+i);
        //     }

        // }
        if(args.length > 0){
            System.out.println("Name is "+args[0]);
            System.out.println("age is "+args[1]);
            System.out.println("salary is "+args[2]);
        } else {
            System.out.println("Hello");
        }
        // args[0],args[1]
        // Scanner s1 = new Scanner(System.in);
        // System.out.println("Enter username");
        // String userName = s1.nextLine();  // Read user input
        
        // System.out.println("Enter your age:");
        // int age = s1.nextInt();
        // System.out.println("Username is: " + userName);  // Output user input
        // System.out.println("Your age is: " + age);  // Output user input

    }
    
}

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Good Evening "+name);
        System.out.print(name+" Please enter your age : ");
        int age = sc.nextInt();
        if (age<18) {
            System.out.println("You are too young..!!");
        }
        else if (age >= 18 && age<22) {
            System.out.println("You are mid young..!!");
        }
        else{
            System.out.println("you are old enough..!!");
        }
        sc.close();
    }

}

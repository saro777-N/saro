import java.util.Scanner;

class Scnaar {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        System.out.println("hi "+ name + " Enter your age ");
        int age = sc.nextInt();
        
        System.out.println("Hi "+ name );
        System.out.println(" U r age is "+ age);
        sc.close();
	}

}

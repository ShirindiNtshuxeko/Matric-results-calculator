import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to matric results");
        System.out.println("Please enter the number of your subjects: ");

        Scanner scanner = new Scanner(System.in);
        int subjects = scanner.nextInt();

        //Save marks to the array
        int [] marks = new int[subjects];

        for (int i = 0; i < subjects; i++){
            System.out.print("Enter marks " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Check conditions for pass or fail
        int subjectsAbove50 = 0;
        int subjectsAbove80 = 0;
        int subjectBelow29 = 0;

        for (int mark : marks) {
            if (mark <= 29) {
                subjectBelow29++;
            }

            if (mark >= 50) {
                subjectsAbove50++;
            }

            if (mark >= 80) {
                subjectsAbove80++;
            }
        }

        // Determine the result based on the given conditions
        if (subjectBelow29 >= 2){
            System.out.print("Fail");
        }
        else if (subjectsAbove50 == 2) {
            System.out.print("Pass with Higher Certificate");
        } else if (subjectsAbove50 == 3) {
            System.out.print("Pass with Diploma");
        } else if (subjectsAbove50 > 3) {
            System.out.print("Pass with Bachelor");
        }
        // Check for distinction and print the total number of distinctions
        if (subjectsAbove80 > 0) {
            System.out.print(" With " + subjectsAbove80 + " distinctions");
        }

    }
}
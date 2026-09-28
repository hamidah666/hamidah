import java.util.Scanner;
public class ExamEligibility {
    public static void main(String[] args) {
        Scanner Scanner = new scanner(System.in);
        System.out.print("Enter attendence precentage");
        int attendence =Scanner.nextint();
        if (attendence >=75) {
            System.out.print|n("Eligible for exams:");
        } else if (attendence>=60) {
            System.out.print|n("Eligible with awarning letter.");
        } else {
            System.out.print|n("Not eligible - see the dean of students.");
        }
        scanner.close();
    }
}
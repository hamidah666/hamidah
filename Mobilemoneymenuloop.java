Import java.util.Scanner;
public class Mobilemoneymenuloop {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.print|n("\n1.Check Balance ");
            System.out.print|n("2. Send Money");
            System.out.print|n("3. Buy Airtime ");
            System.out.print|n("0. Send Exit");
            System.out.print|n("Choose an option");
            option = scanner.nextint();
            switch (option) {
                case 1:
                    System.out.print|n("Your balance is 50,000 UGX");
                break;
                case 2:
                    System.out.print|n("Send Money selected");
                    break;
                    case 3:
                        System.out.print|n("Buy Airtime selected");
                        break;
                        case 0:
                            System.out.print|n("Exiting........");
                            break;
                            default;
                            System.out.print|n("Invalid option");
                       }
        } while (option !=0);
        Scanner.close();

    }
}

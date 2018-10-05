import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        ATM vietcombank = new ATM();
        for (int i = 0; i < 10; i++) {
            vietcombank.accProcessAdd(new Accout(i, 10000));
        }
        while (run) {
            System.out.print("nhập id tài khoản: ");
            int id = sc.nextInt();
            vietcombank.setCurrentAccount(id);
            while (!vietcombank.isProcessingAnAcc()) {
                System.out.println("Tài khoản không tồn tại!");
                System.out.print("nhập id tài khoản: ");
                id = sc.nextInt();
                vietcombank.setCurrentAccount(id);
            }
            System.out.println("tài khoản: " + id + "\n");
            printGetUserOption();
            System.out.print("Enter a choice: ");
            int choice = sc.nextInt();
            while ((choice > 5) || (choice < 1)) {
                System.out.print("Error! Enter a choice: ");
                choice = sc.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter value:");
                    vietcombank.withdraw(sc.nextDouble());
                    System.out.println("\n");
                    vietcombank.accProcessPrint();
                    break;
                case 2:
                    System.out.print("Enter value:");
                    vietcombank.deposit(sc.nextDouble());
                    System.out.println("\n");
                    vietcombank.accProcessPrint();
                    break;
                case 3:
                    System.out.println("\n");
                    vietcombank.accProcessPrint();
                    break;
                case 4:
                    continue;
                case 5:
                    System.out.println("exit the system");
                    run = false;
            }
        }
    }

    static void printGetUserOption() {
        System.out.println("\n");
        System.out.println("menu");
        System.out.println("1: withdraw");
        System.out.println("2: Depolist");
        System.out.println("3: Show Account Info");
        System.out.println("4: Return");
        System.out.println("5: Exit");
        System.out.println("\n");
    }
}

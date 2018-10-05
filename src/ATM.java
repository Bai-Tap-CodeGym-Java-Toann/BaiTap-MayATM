import java.util.ArrayList;

public class ATM {
    private ArrayList<Accout> accList = new ArrayList<Accout>();
    private int current = -1;


    public boolean isProcessingAnAcc() {
        if (current > -1) {
            return true;
        }
        return false;
    }

    public void setCurrentAccount(int id) {
        for (int i = 0; i < accList.size(); i++) {
            if (accList.get(i).getId() == id) {
                this.current = i;
            }
        }
    }

    public int getCurrentAccount() {
        return current;
    }

    public void accProcessAdd(Accout acc) {
        accList.add(acc);
        System.out.println("account Id: " + acc.getId() + " signed to system");
    }

    public void accProcessRemove() {
        if (current > -1) {
            accList.remove(this.current);
        }
    }

    public void accProcessPrint() {
        if (current > -1) {
            System.out.println("\n");
            System.out.println("Account Id: " + accList.get(current).getId());
            System.out.println("->Balance: " + accList.get(current).getBalance());
            System.out.println("->Monthly Interest: " + accList.get(current).getMonthlyInterest());
        }
    }

    public void withdraw(double money) {
        if (money <= accList.get(current).getBalance()) {
            accList.get(current).withdraw(money);
        } else {
            System.out.println("tài khoản không đủ tiền");
        }
    }

    public void deposit(double money) {
        accList.get(current).deposit(money);
    }


}

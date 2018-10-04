import java.util.Calendar;
import java.util.Date;

public class Accout {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 7.0 / 100.0;
    private Date dateCreate = new Date();

    public Accout() {
    }

    public Accout(int id, double balance) {
        this.balance = balance;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(int day, int month, int year) {
        Calendar myCal = Calendar.getInstance();
        myCal.set(Calendar.YEAR, year);
        myCal.set(Calendar.MONTH, month);
        myCal.set(Calendar.DAY_OF_MONTH, day);
        this.dateCreate = myCal.getTime();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        this.balance -= money;
    }
}

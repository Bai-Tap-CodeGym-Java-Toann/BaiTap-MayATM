public class tester {
    public static void main(String[] args) {
        Accout acc = new Accout(1122,20000);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("số tiền trong tài khoản:"+acc.getBalance());
        System.out.println("số lãi hàng tháng: "+acc.getMonthlyInterest());
        System.out.println("created: "+acc.getDateCreate());
    }
}

import java.util.Scanner;
class Bankacc{
    private double balance;
    public Bankacc(double ibal){
        this.balance=ibal;
    }
    public double getbal(){
        return balance;
    }
    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            System.out.println("Deposit of Rs" +amt+ " successful. Current balance: Rs "+balance);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal of Rs "+amount+" successful. Current balance: Rs "+balance);
        }else{
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}
class ATM{
    private Bankacc bankacc;
    public ATM(Bankacc bankacc){
        this.bankacc = bankacc;
    }
    public void displaymenu(){
        System.out.println("ATM menu:");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void performTransaction(int choice, Scanner sc){
        switch (choice) {
            case 1:
                System.out.println("Current balance: Rs "+bankacc.getbal());
                break;
            case 2:
                System.out.println("Enter deposit amount: Rs ");
                double depositAmt=sc.nextDouble();
                bankacc.deposit(depositAmt);
                break;
            case 3:
                System.out.println("Enter withdrawal amount: Rs ");
                double withdrawalAmt=sc.nextDouble();
                bankacc.withdraw(withdrawalAmt);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invlid choice. Please select a valid option.");
        }
    }
}
public class atm_interface {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter initial acoount balance: Rs ");
        double ibal=s.nextDouble();
        Bankacc bankacc=new Bankacc(ibal);
        ATM atm=new ATM(bankacc);
        while(true){
            atm.displaymenu();
            System.out.println("Select an option: ");
            int choice = s.nextInt();
            atm.performTransaction(choice, s);
        }
    }
}

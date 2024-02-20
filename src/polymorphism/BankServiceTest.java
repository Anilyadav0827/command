package polymorphism;

public class BankServiceTest {
    public static void main(String[] args) {
        SBIbankService sbIbankService= new SBIbankService();
       double sbi= sbIbankService.calculateInterest(1000,86);
        System.out.println("SBI Service"+sbi);
        HDFCBankService hdfcBankService= new HDFCBankService();
        double hdfc= hdfcBankService.calculateInterest(1000,90);
        System.out.println("hdfc service"+hdfc);
    }
}

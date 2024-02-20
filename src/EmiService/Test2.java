package EmiService;

public class Test2 {
    public static void main(String[] args) {
        HomeLoan1 hdfc= new HDFC();
        double info=hdfc.emiPlanning(24,100000);
        System.out.println(info);
    }
}

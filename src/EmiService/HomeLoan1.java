package EmiService;

public class HomeLoan1 {
    private double principalAmount;
    private double processingRate;
    private double processingFee;

    private double customerAmount;

    private double interest;

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double processingFeeCal(int principalAmount){

        processingFee=principalAmount*(processingRate/100);

        return  customerAmount=principalAmount-processingFee;

    }

    public void setProcessingRate(double processingRate) {
        this.processingRate = processingRate;
    }
    public double emiPlanning(int months,double principalAmount){
            double interestPerMonth=(principalAmount *(interest/100))/12;
        System.out.println(interestPerMonth);
            double totalintrest=interestPerMonth*months;
        System.out.println(totalintrest);
            double emiPermonth=(principalAmount+totalintrest)/months;

        System.out.println(emiPermonth);
               for(int i=1;i<=months;i++){
                   principalAmount=principalAmount-emiPermonth;
            System.out.println("EMI in "+i+" Month is:"+emiPermonth+" & remaining amount to pay "+principalAmount);
        }
        return principalAmount;
    }
}

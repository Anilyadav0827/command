package EmiService;

public class HDFC extends HomeLoan1{

    @Override
    public double processingFeeCal(int principalAmount) {
        if(principalAmount<=500000){
            super.setProcessingRate(1.5);
        } else if (principalAmount<=1000000) {
            super.setProcessingRate(1.0);
        }else{
            super.setProcessingRate(0.5);
        }
        return super.processingFeeCal(principalAmount);
    }

    @Override
    public double emiPlanning(int years, double principalAmount) {
        super.setInterest(8);
        return super.emiPlanning(years, principalAmount);
    }
}

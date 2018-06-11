package unmsm.ads;

public class FixedRateCalculatorBbva implements RateCalculator {

    private double rate;
    private double plazo;

    public double getAnnualRate() {
    	if (this.plazo > 2 && this.rate < 1) {
        	rate = rate;	
        }
        return rate;
    }

    public double getMonthlyRate() {
        return rate / 12;
    }

    public double getDailyRate() {
        return rate / 365;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
	public void setPlazo(double plazo) {
		this.plazo = plazo;
	}
	
}

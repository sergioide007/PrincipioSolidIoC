package unmsm.ads;

public class InterestCalculatorImpl implements InterestCalculator {

	RateCalculator rateCalculatorBcp;
	RateCalculator rateCalculatorBbva;
	
	public double calculate(double amount, double year, String nameBank) {
	    if ( Constantes.BCP.equals(nameBank) ) {
			return amount * year * rateCalculatorBcp.getAnnualRate();
	    } else {
			return amount * year * rateCalculatorBbva.getAnnualRate();
	    }
	
	}
	
	public void setRateCalculatorBcp(RateCalculator rateCalculatorBcp) {
		this.rateCalculatorBcp = rateCalculatorBcp;
	}

	public void setRateCalculatorBbva(RateCalculator rateCalculatorBbva) {
		this.rateCalculatorBbva = rateCalculatorBbva;
	}


}


package unmsm.ads;

public class FixedRateCalculatorBcp implements RateCalculator {

    private double rate;
    private double plazo;
    private double descuento;
    
	public double getAnnualRate() {
        if (this.plazo > 1 && this.rate < 1) {
        	rate = rate - descuento ;
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
	
    public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


}

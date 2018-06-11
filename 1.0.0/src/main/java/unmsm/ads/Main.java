package unmsm.ads;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new GenericXmlApplicationContext("beans.xml");

        InterestCalculator calculadorInteres = (InterestCalculator) context.getBean("interestCalculator");
        FixedRateCalculatorBbva rateCalculatorBbva = (FixedRateCalculatorBbva) context.getBean("rateCalculatorBbva");
        rateCalculatorBbva.setRate(0.34);
        FixedRateCalculatorBcp rateCalculatorBcp = (FixedRateCalculatorBcp) context.getBean("rateCalculatorBcp");
        rateCalculatorBcp.setRate(0.37);
        Scanner sc = new Scanner(System.in);
        double amount;
        System.out.print("Introduzca el monto: ");
        amount = sc.nextDouble();
        double year;
        System.out.print("Introduzca plazo (número de años): ");
        year = sc.nextDouble();
        rateCalculatorBbva.setPlazo(year);
        rateCalculatorBcp.setPlazo(year);
        System.out.println("BCP (interes a pagar): "+calculadorInteres.calculate(amount, year, Constantes.BCP));
        System.out.println("BBVA (interes a pagar): "+calculadorInteres.calculate(amount, year, Constantes.BBVA));
    }
}

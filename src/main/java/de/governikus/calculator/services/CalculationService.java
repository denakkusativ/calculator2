package de.governikus.calculator.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public String calculate(String zahl1, String zahl2, String operation) {
        double result = 0.0;
        if(operation.equals("+")) {
            result = Double.parseDouble(zahl1) + Double.parseDouble(zahl2);
        }
        if(operation.equals("-")) {
            result = Double.parseDouble(zahl1) - Double.parseDouble(zahl2);
        }
        if(operation.equals("*")) {
            result = Double.parseDouble(zahl1) * Double.parseDouble(zahl2);
        }
        if(operation.equals("/")) {
            result = Double.parseDouble(zahl1) / Double.parseDouble(zahl2);
        }

        return "" + result;

    }

}

package calculator.service.Impl;

import calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String calculate(Double first, Double second, String calculate) {
        String result = "";
        switch (calculate) {
            case "Addition(+)":
                result = String.valueOf((first + second));
                break;
            case "Subtraction(-)":
                result = String.valueOf((first - second));
                break;
            case "Multiplication(x)":
                calculate = "Multiplication";
                result = String.valueOf((first * second));
                break;
            case "Division(/)":
                if (second == 0) {
                    result = "Can't be divide by zero!";
                    break;
                } else {
                    result = String.valueOf((first / second));
                    break;
                }
        }
        return result;
    }
}

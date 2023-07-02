package br.com.erudio.math;

import br.com.erudio.converters.NumberConverter;

import static java.lang.Math.sqrt;

public class MathOperations {

    public static Double sum(String numberOne, String numberTwo) throws Exception {
        return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
    }

    public static Double subtraction(String numberOne, String numberTwo) throws Exception {
        return NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
    }

    public static Double multiplication(String numberOne, String numberTwo) throws Exception {
        return NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
    }

    public static Double division(String numberOne, String numberTwo) throws Exception {
        return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
    }

    public static Double mean(String numberOne, String numberTwo) throws Exception {
        return (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) /2;
    }

    public static Double squareRoot(String number) throws Exception {
        return sqrt(NumberConverter.convertToDouble(number));
    }
}

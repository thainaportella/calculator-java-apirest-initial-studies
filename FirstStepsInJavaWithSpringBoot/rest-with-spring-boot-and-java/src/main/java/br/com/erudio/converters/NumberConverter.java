package br.com.erudio.converters;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws Exception {
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        //parseDouble converte string em double
        return 0d;
    }

    public static boolean isNumeric(String strNumber) throws Exception {
        if(strNumber == null)return false;

        String number = strNumber.replaceAll(",", ".");
        boolean isNumber = number.matches("[-+]?[0-9]*\\.?[0-9]+");

        if (isNumber) { return true; }
        else { throw new UnsupportedMathOperationException("Please set a numeric value."); }

    }

    // Qual a diferença entre query params/query string e path params?
    // query/string params são opcionais, enquanto path params são obrigatórios
    // e se não passar o programa quebra e lança uma exceção.
    // "path params are used to identify a specific resource or resources,
    // while query parameters are used to sort/filter those resources."
}

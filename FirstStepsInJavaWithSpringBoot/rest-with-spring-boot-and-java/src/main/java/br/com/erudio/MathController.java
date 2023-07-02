package br.com.erudio;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Math.sqrt;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    // é um path param então precisa do VALUE
    // para garantir que a requisição tá sendo feita corretamente,
    // é interessante definir o tipo de requisição, no caso aqui, o GET
    // como é obrigatório cada parâmetro, eles entram no requestmapping


    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
    // a annotation RequestParam é para query params,
    // para path params, mudamos para PathVariable
    // por ser variável obrigatória, não tem defaultValue
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) /2;
    }

    @RequestMapping(value = "/sqroot/{number}", method= RequestMethod.GET)
    public Double sqroot(@PathVariable(value = "number") String number) throws Exception {
        return sqrt(convertToDouble(number));
    }

    private Double convertToDouble(String strNumber) throws Exception {
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        //parseDouble converte string em double
        return 0d;
    }

    private boolean isNumeric(String strNumber) throws Exception {
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

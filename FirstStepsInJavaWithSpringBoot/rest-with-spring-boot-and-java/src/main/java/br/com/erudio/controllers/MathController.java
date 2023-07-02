package br.com.erudio.controllers;

import br.com.erudio.math.MathOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public static Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return MathOperations.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return MathOperations.subtraction(numberOne, numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return MathOperations.multiplication(numberOne, numberTwo);
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return MathOperations.division(numberOne, numberTwo);
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        return MathOperations.mean(numberOne, numberTwo);
    }

    @RequestMapping(value = "/squareroot/{number}", method= RequestMethod.GET)
    public Double squareroot(@PathVariable(value = "number") String number) throws Exception {
        return MathOperations.squareRoot(number);
    }

}

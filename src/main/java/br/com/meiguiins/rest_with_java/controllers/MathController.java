package br.com.meiguiins.rest_with_java.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {



    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    @RequestMapping("/sub/{numberOne}/{numberTwo}")
    public Double sub(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");

        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    @RequestMapping("/mult/{numberOne}/{numberTwo}")
    public Double mult(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");

        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    @RequestMapping("/div/{numberOne}/{numberTwo}")
    public Double div(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");

        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    private boolean isNumeric(String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",",".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    private Double convertToDouble(String strNumber) {

        if (strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("Please set a numeric value!");
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }
}

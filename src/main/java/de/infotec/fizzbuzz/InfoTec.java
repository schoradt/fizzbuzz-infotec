package de.infotec.fizzbuzz;

/**
 * Class to generate the infotec claim on various numer inputs.
 * 
 * @author Sven Schoradt (s.schoradt@infotec-edv.de>
 */
public class InfoTec {
    /**
     * Generates the infotec claim or parts of it based on the input value.
     * 
     * If the input is dividable by 3 add info to the claim, if the value is dividable by 5 add tec to the claim.
     * 
     * Else return the number itself.
     *
     * @param number Input number.
     * 
     * @return String of the number or the claim.
     */
    public String generateClaim(Integer number) {
        String result = "";
        
        if (number % 3 == 0) {
            result += "info";
        }
        
        if (number % 5 == 0) {
            result += "tec";
        }
        
        if (result.isBlank()) {
            result += number.toString();
        }
        
        return result;
    }
}

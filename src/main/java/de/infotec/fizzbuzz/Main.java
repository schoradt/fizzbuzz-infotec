package de.infotec.fizzbuzz;

/**
 * Main class.
 * 
 * @author Sven Schoradt (s.schoradt@infotec-edv.de)
 */
public class Main {
    /**
     * Programm main methode.
     * 
     * @param args Command line args (unused).
     */
    public static void main(String[] args) {
        Main main = new Main();
        
        main.run();
    }
    
    /**
     * Run the program.
     * 
     * Iterates over the numbers from 1 to 100 and prints out the claim.
     */
    private void run() {
        InfoTec infotec = new InfoTec();
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(infotec.generateClaim(i));
        }
    }
    
}

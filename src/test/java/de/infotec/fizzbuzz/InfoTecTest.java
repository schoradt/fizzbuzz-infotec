package de.infotec.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test the Infotec class.
 * 
 * @author Sven Schoradt (s.schoradt@infotec-edv.de)
 */
public class InfoTecTest {
    
    /**
     * Test of generateClaim method, of class InfoTec.
     */
    @Test
    public void testGenerateClaim() {
        InfoTec infotec = new InfoTec();
        
        assertEquals("1", infotec.generateClaim(1));
        assertEquals("2", infotec.generateClaim(2));
        assertEquals("info", infotec.generateClaim(3));
        assertEquals("tec", infotec.generateClaim(5));
        assertEquals("infotec", infotec.generateClaim(15));
    }
}

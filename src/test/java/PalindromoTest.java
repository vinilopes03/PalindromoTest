/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.palin.Palindromo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author vinic
 */
public class PalindromoTest {
    
    Palindromo instance = new Palindromo();
    
    public PalindromoTest() {
    }
    
   @Test
   public void testEhPalindromo(){
       assertTrue(instance.ehPalindromo("ama"));
       assertTrue(instance.ehPalindromo("mirim"));
       assertTrue(instance.ehPalindromo("salas"));
       assertTrue(instance.ehPalindromo("saias"));
       assertTrue(instance.ehPalindromo("omissíssimo"));
       assertFalse(instance.ehPalindromo("Palindromo"));
       assertFalse(instance.ehPalindromo("Nao"));
       assertFalse(instance.ehPalindromo("Sim"));
       assertFalse(instance.ehPalindromo("Testar"));
       assertFalse(instance.ehPalindromo("Filhos"));
   }
}

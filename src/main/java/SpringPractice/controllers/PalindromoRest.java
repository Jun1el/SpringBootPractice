package SpringPractice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para ver si una palabra es palindroma
 */
@RestController
public class PalindromoRest {
    /**
     *Endpoint para vereficiar si es palindromo
     * @param palabra que sera verificada
     */
    @GetMapping("/palindrome/{palabra}")
    public String palindromo(@PathVariable String palabra) {
        if (isPalindromo(palabra)) {
            return "La palabra " +palabra+ " Si es Palindromo";
        } else {
            return "La palabra "+palabra+" No es Palindromo";
        }
    }

    /**
     * Metodo para verificar a traves de un bucle que recorre la mitad de sus letras y comparandolas
     * @param palabra
     * @return
     */
    public boolean isPalindromo(String palabra) {
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

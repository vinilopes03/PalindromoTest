/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palin;

import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class Exe {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        Palindromo palin = new Palindromo();

        frase = scan.nextLine();
        System.out.println(palin.ehPalindromo(frase));

    }

}

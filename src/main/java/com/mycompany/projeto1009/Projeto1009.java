/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1009;

import java.util.Scanner;

public class Projeto1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.next();
        double salariofixo, totaldevendas, comissao;
        salariofixo = sc.nextDouble();
        totaldevendas = sc.nextDouble();
        comissao = (totaldevendas * 15) / 100;
        Double TOTAL = comissao + salariofixo;
        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author 1091392413018
 */
public class exercicio01 {
    
    public static void main(String[] args){
        //Cria um scanner para obter entrada a partir da janela de comando
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, multi;
        
        System.out.print("Digite o primeiro numero: ");
        
        n1 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        
        n2 = entrada.nextInt();
        System.out.print("Digite o segundo numero: ");
        
        n3 = entrada.nextInt();
        multi = n1 * n2 * n3;
        
        System.out.println("A multiplicação é: "+ multi);
    }
}


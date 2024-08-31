/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.Comparação;
 
import java.util.Scanner;
 
/**
*
* @author 1091392413036
*/
public class Comparação {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1, number2;
        System.out.print("Digite o primeiro número: ");
        number1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        number2 = input.nextInt();
        if (number1 == number2)
            System.out.printf("%d == %d %n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d %n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d %n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d %n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d %n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d %n", number1, number2);
    }
}
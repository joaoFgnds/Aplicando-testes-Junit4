/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrevisao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jairb
 */
public class MRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);//usar no console
        boolean verifica;//var booleana | true or false | 0 or 1
        int num1;//var do tipo inteiro 11 posições
        short num2;//var = smalint inteiro pequeno 4 posições
        long num3;//var = bigint inteiro grande | contador do youtube 
        double num4;// var = decimal, numeric com casas decimais
        float num5;// var = com casas decimais é menor que o double
        byte b;//num inteiro valor maximo 127
        String texto;//aceita tudo em formato texto
        String textoCurto;
        char sexo;
        int vet[] = {1, 2, 3};  //as posições começam em ZERO 0, {1,2,3} são os valores      
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(1);
        valores.add(2);
        valores.add(3);

        System.out.println("Revisão Manhã");

        System.out.print("Informe um numero inteiro: ");
        num1 = ler.nextInt();
        System.out.print("Informe um num. inteiro até 127: ");
        b = ler.nextByte();
        System.out.print("Informe um numero inteiro médio: ");
        num2 = ler.nextShort();
        System.out.print("Informe um num. inteiro grande: ");
        num3 = ler.nextLong();
        System.out.print("Informe um numero com decimal: ");
        num4 = ler.nextDouble();
        System.out.print("Informe um num. decimal pequeno: ");
        num5 = ler.nextFloat();
        System.out.print("Informe seu nome completo: ");
        ler.nextLine();
        texto = ler.nextLine();
        texto = texto.toUpperCase();
        System.out.print("Informe o primeiro nome de sua mãe: ");
        textoCurto = ler.next();
        textoCurto = textoCurto.toUpperCase();
        System.out.print("Informe seu sexo: ");
        sexo = ler.next().charAt(0);
        System.out.println("--- Impressão ---");
        System.out.println("inteiro: " + num1);
        System.out.println("byte: " + b);
        System.out.println("short: " + num2);
        System.out.println("long: " + num3);
        System.out.println("double: " + num4);
        System.out.println("float: " + num5);
        System.out.println("Seu nome é: " + texto);
        System.out.println("Nome de sua mãe é: " + textoCurto);
        System.out.println("Seu sexo é: " + sexo);
        verifica = num1 >= num2;
        if (verifica) {
            System.out.println("num1 é maior ou igual que num2.");
        } else {
            System.out.println("num2 é maior que num1.");
        }
        System.out.println("Vetor");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Posição: " + i + " | valor: " + vet[i]);
        }

        System.out.println("ArrayList");
        for (int i = 0; i < valores.size(); i++) {
            System.out.println("Posição: " + i + " | Valor: " + valores.get(i));
        }

        System.out.println("ArrayList-Impressão 2");
        valores.forEach((i) -> System.out.println("Valor: " + i));

        System.out.println("ArrayList-Impressão 3");
        System.out.println("Valores: " + valores.toString());
    }

}

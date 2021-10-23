package com.company;
import org.w3c.dom.ls.LSOutput;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringProcessor processor = new StringProcessor();
        /*String prikol = in.nextLine();
        StringBuilder sus = new StringBuilder(prikol);
        StringProcessor processor = new StringProcessor();
        int N = in.nextInt();
        try {
            processor.Expansion(N, sus);
        }catch(IllegalArgumentException e)
        {
            System.err.println("Введено отрицательное число");
        }
        System.out.println(processor.Expansion(N, sus));*/
        String a = in.nextLine();
        /*String b = in.nextLine();

        try {
            processor.Occurrences(a,b);
        }catch(IllegalArgumentException e)
        {
            System.out.println("Ваша вторая строка в пиве (пустая)");
        }
        System.out.println(processor.Occurrences(a,b));*/
        StringBuilder b = processor.Remake(a);
        System.out.println(b);
    }
}

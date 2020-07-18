package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RemoveA mRemoveA = new RemoveA();
        System.out.println("enter string : ");
        String mInputValue = sc.next();
        System.out.println("result string : " + mRemoveA.removeAlphabetA(mInputValue));
    }
}

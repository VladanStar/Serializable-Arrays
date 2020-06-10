package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // write your code here
        int[] numbers = {1, 2, 3, 4, 5};
        String[] strings = {"John", "Susan", "Kim"};
        // kreiranje izlaznog toka za datoteke array.dat
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.dat", true));

        // pisanje niza u izlaz toka objekata
        output.writeObject(numbers);
        output.writeObject(strings);

        // zatvaranje toka
        output.close();

        // kreiranje ulaznog toka za datoteku array.dat
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));
        int[] newNumbers = (int[]) (input.readObject());
        String[] newStrings = (String[]) (input.readObject());

        // prikaz niza
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.print(newNumbers[i] + " ");
            System.out.println();
        }
        for (int i = 0; i < newStrings.length; i++) {
            System.out.print(newStrings[i] + " ");
            System.out.println();
        }
        // zatvaranje toka
        input.close();

    }
}

package org.example;

public class JavaProgram {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";

        text = text.replace(".", " ").replace("/", " ");
        String[] textData = text.split(" ");

        Person[] persone = new Person[textData.length / 3]; // Osigurava pravilan broj objekata
        int brojacPersona = 0;
        for (int i = 0; i < textData.length; i += 3) {
            Person person = new Person(textData[i], textData[i + 1], textData[i + 2]);
            persone[brojacPersona] = person;
            brojacPersona++;
        }
        for (int i = 0; i < persone.length; i++) {
            System.out.println(persone[i].toString());
        }
    }
}


package org.example;

public class Person {
    private String ime;
    private String prezime;
    private String mestoRodjenja;

    public Person(String ime, String prezime, String mestoRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.mestoRodjenja = mestoRodjenja;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + mestoRodjenja;
    }
}


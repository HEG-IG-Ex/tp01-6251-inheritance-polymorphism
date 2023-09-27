package test;

import modele.Employee;
import modele.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add(new Student("Leo", "Reed", "Mardi 10h15"));
        list.add(new Student("Linda", "Knight", "Mardi 13h15", "jeudi"));
        list.add(new Employee("Cameron", "Hurst", 6000, "Programmation", "Assistant"));
        list.add(new Employee("Edward", "Price", 10000, "Comptabilité", "Professeur"));
        list.add(new Student("Joseph", "James", "Mardi 13h15"));
        list.add(new Student("Lucy", "Hopkins", "Mardi 15h15", "mercredi"));
        list.add(new Employee("Samantha", "Woodward", 7000, "Modélisation", "Assistant"));
        list.add(new Employee("Adam", "Barrett", 15000, "Cisco", "Professeur"));
        list.add(new Student("Fluvia", "Giordano", "Mardi 10h15"));
        list.add(new Student("Elio", "Baresi", "Mardi 15h15", "vendredi"));
        list.add(new Student("Dani", "Sjörberg", "Mardi 13h15"));
        list.add(new Student("Atle", "Ström", "Mardi 10h15", "lundi"));

        for (Object o : list){
            System.out.println(o.toString());
        }

    }
}

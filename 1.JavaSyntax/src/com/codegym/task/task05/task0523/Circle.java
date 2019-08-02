package com.codegym.task.task05.task0523;

/* 
Constructor

*/

public class Circle {
    public Color color; //TWORZENIE OBJEKTU O NAZWIE color PRZYPISANEGO DO KLASY Color

    public static void main(String[] args) {
        Circle circle = new Circle(); //TUTAJ TWORZYMY OBJEKT ODWOLUJACY SIE DO CIRCLE O NAZWIE circle I WYWOLUJEMY NA NIM KONSTRUKTOR Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {
        color = new Color(); //PO WYWOLANIU KONSTRUKTORA ZOSTAJE PRZYPISANE DO ZMIENNEJ GLOBALNEJ ZDEKLAROWANEJ W GLOWNEJ KLASIE KONSTRUKTOR KTORY SIE NIE WYWOLUJE BO NIE JEST ZAPISANY.
        //DZIEKI TEMU MAMY STWORZONY OBJEKT color DO W ZAKRESIE GLOBALNYM DO KTOREGO MOZEMY ODWOLAC SIE Z METODY GLOWNEJ I KLASY Color
        //UWAGA DO TEGO OBJEKTOW NIE MOZEMY TWORZYC W ZAKRESIE KLASY !
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Bus[] mas = new Bus[3];

        mas[0] = new Bus();
        mas[1] = new Bus();
        mas[2] = new Bus();

        mas[0].setNambbus(312);
        mas[0].setNambway(66);
        mas[0].setName("Иванов И.И");
        mas[0].setYear(2001);
        mas[0].setBrand("МАЗ");
        mas[0].setMileage(250000);

        mas[1].setNambbus(313);
        mas[1].setNambway(67);
        mas[1].setName("Петров И.И");
        mas[1].setYear(2004);
        mas[1].setBrand("МАЗ");
        mas[1].setMileage(270000);

        mas[2].setNambbus(315);
        mas[2].setNambway(68);
        mas[2].setName("Сидоров И.И");
        mas[2].setYear(2014);
        mas[2].setBrand("МАЗ");
        mas[2].setMileage(2300);

        for (Bus bus:mas) {
          if (bus.getNambway()==67){
              System.out.println(" Номер втобуса " + bus.getNambbus());
          }
        }

        for (Bus bus:mas) {
            if (bus.getYear()<2002){
                System.out.println(" Номер втобуса " + bus.getNambbus());
            }
        }

        for (Bus bus:mas) {
            if (bus.getMileage()>1000){
                System.out.println(" Номер втобуса " + bus.getNambbus());
            }
        }

    }

}

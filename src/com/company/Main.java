package com.company;

public class Main {
    public static void main(String[] args) {
        Bank kontoBankowe = new Bank.Builder(2137)
                .wlasciciel("Stachu Jones")
                .wspolWlasciciel("Jadwiga Hymel")
                .saldo(100)
                .build();

        Bank kontoBankowe2 = new Bank.Builder(100)
                .wlasciciel("Dovahkiin")
                .wspolWlasciciel("Alduin")
                .saldo(100000)
                .kredyt(1000)
                .oprocentowanieKredytu(2.5)
                .build();
    }
}

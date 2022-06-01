package com.company;

public class Bank {
    private long nrKonta;
    private String wlasciciel;
    private String wspolWlasciciel;
    private double saldo;
    private double kredyt;
    private double oprocentowanieKredytu;

    public long getNrKonta() {
        return nrKonta;
    }
    public void setNrKonta(long nrKonta) {
        this.nrKonta = nrKonta;
    }
    public String getWlasciciel() {
        return wlasciciel;
    }
    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }
    public String getWspolWlasciciel() {
        return wspolWlasciciel;
    }
    public void setWspolWlasciciel(String wspolWlasciciel) {
        this.wspolWlasciciel = wspolWlasciciel;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public double getKredyt() {
        return kredyt;
    }
    public void setKredyt(double kredyt) {
        this.kredyt = kredyt;
    }
    public double getOprocentowanieKredytu() {
        return oprocentowanieKredytu;
    }
    public void setOprocentowanieKredytu(double oprocentowanieKredytu) {
        this.oprocentowanieKredytu = oprocentowanieKredytu;
    }

    public static class Builder {
        private long nrKonta;
        private String wlasciciel;
        private String wspolWlasciciel;
        private double saldo;
        private double kredyt;
        private double oprocentowanieKredytu;

        public Builder(long nrKonta) {
            this.nrKonta = nrKonta;
        }
        public Builder wlasciciel(String wlasciciel){
            this.wlasciciel = wlasciciel;
            return this;
        }
        public Builder wspolWlasciciel(String wspolWlasciciel){
            this.wspolWlasciciel = wspolWlasciciel;
            return this;
        }
        public Builder saldo(double saldo){
            this.saldo = saldo;
            return this;
        }
        public Builder kredyt(double kredyt){
            this.kredyt = kredyt;
            return this;
        }
        public Builder oprocentowanieKredytu(double oprocentowanieKredytu){
            this.oprocentowanieKredytu = oprocentowanieKredytu;
            return this;
        }
        public Bank build(){
            Bank kontoBankowe = new Bank();
            kontoBankowe.nrKonta = this.nrKonta;
            kontoBankowe.wlasciciel = this.wlasciciel;
            kontoBankowe.wspolWlasciciel = this.wspolWlasciciel;
            kontoBankowe.saldo = this.saldo;
            kontoBankowe.kredyt = this.kredyt;
            kontoBankowe.oprocentowanieKredytu = this.oprocentowanieKredytu;
            System.out.println("Pomyślnie utworzono konto bankowe o numerze: "+this.nrKonta);
            System.out.println("Właściciel: "+this.wlasciciel);
            System.out.println("Współwłaściciel: "+this.wspolWlasciciel);
            System.out.println("Saldo: "+this.saldo);
            System.out.println("Kredyt: "+this.kredyt);
            System.out.println("Oprocentowanie kredytu: "+this.oprocentowanieKredytu);
            return kontoBankowe;
        }
    }
    private Bank() {

    }
}

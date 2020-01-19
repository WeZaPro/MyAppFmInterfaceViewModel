package com.taweesak.myappfminterfaceviewmodel;

public class MyModel {
    private double numberA,numberB;
    private double result;

    public MyModel() {
    }

    public MyModel(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    /*public double getNumberA() {
        return numberA;
    }*/

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    /*public double getNumberB() {
        return numberB;
    }*/

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getResult() {
        result = this.numberA*this.numberB;
        return result;
    }

    /*public void setResult(double numberA,double numberB) {
        this.result = numberA*numberB;
    }*/
}

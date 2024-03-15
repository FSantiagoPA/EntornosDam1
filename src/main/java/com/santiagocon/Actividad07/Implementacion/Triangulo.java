package com.santiagocon.Actividad07.Implementacion;

public class Triangulo implements Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return (base * altura) / 2;
    }
    public double calcularPerimetro(){
        return base + altura + Math.sqrt(base * base + altura * altura);
    }
}

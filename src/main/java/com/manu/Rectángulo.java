package com.manu;

public class Rectángulo {
    int base;
    int altura;

    Rectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
}

double calcularArea() {
    return (2 *base) + (2 *altura);
}

public String calcularPerímetro() {
    return null;
}
}
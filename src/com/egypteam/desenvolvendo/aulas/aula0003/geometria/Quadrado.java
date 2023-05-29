package com.egypteam.desenvolvendo.aulas.aula0003.geometria;

public class Quadrado {

    private int lado = 0;

    public Quadrado() {
        this.lado = 10;
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    private void pintaBorda() {

        System.out.print('+');

        for (int i = 0; i < lado; i++) {
            System.out.print('-');
        }

        System.out.println('+');

    }

    private void pintaInterno() {
        System.out.print('|');
        for (int i = 0; i < lado; i++) {
            System.out.print(' ');
        }
        System.out.println('|');
    }

    private void pintaCabecalho() {

        System.out.println(
            this.lado == 0 ?
                "Este é um quadrado nulo"
            :
                this.lado % 2 == 0 ?
                    "Este é um quadrado par"
                :
                    "Este é um quadrado ímpar"
        );

    }

    public void pintaQuadrado() {
        
        pintaCabecalho();
        
        pintaBorda();
        for (int i = 0; i < lado; i++) {
            pintaInterno();
        }
        pintaBorda();

    }

    public int getArea() {
        return this.lado * this.lado;
    }
    
}

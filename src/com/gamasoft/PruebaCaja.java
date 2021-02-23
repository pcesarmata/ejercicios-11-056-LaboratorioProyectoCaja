package com.gamasoft;

public class PruebaCaja {

    public static void main(String[] args) {
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProfundo = 6;

        Caja objCaja1 = new Caja();
        int resultado = objCaja1.calcularVolumen(medidaAncho, medidaAlto, medidaProfundo);

        System.out.println("resultado = " + resultado);

        Caja objCaja2 = new Caja(2 , 4 , 6) ;
        System.out.println("objCaja2 = " + objCaja2.calcularVolumen());

    }
}

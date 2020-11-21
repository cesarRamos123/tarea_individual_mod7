/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Ramos
 */
public class principal {
    private double valor,resultado ;
    private int divisa,divisaf;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisaf() {
        return divisaf;
    }

    public void setDivisaf(int divisaf) {
        this.divisaf = divisaf;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public principal() {
    }
    
    
    public double convertir (){
        
        if(divisa==0 && divisaf==1){
        resultado = valor * 0.85;
        }
         if (divisa==0 && divisaf==0){
            resultado=valor;
         }
        if (divisa==0 && divisaf==2){
            resultado=valor*28.84;
        }
         if (divisa==1 && divisaf==0){
            resultado=valor*1.19;
         }
         if (divisa==1 && divisaf==2){
            resultado=valor*24.32;
         }
         if (divisa==2 && divisaf==0){
            resultado=valor*0.03;
         }
         if (divisa==2 && divisaf==1){
            resultado=valor*0.04;
         }
        if (divisa==2 && divisaf==2){
            resultado=valor;
        }
        return resultado;
    }
     
    }


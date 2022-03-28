package br.calebe.ticketmachine.core;

import java.util.Iterator;

public class Troco5 {
    
    public Troco4(int valor) {
        PapelMoeda[] papeisMoeda;
        int novoValor;
        int valorOriginal=valor;
        papeisMoeda = new PapelMoeda[6];
        int count = 0;
        while (true) {
            novoValor=valorOriginal-100;
            count++;
            if(novoValor<100){
                break;
            }
        }
        papeisMoeda[5] = new PapelMoeda(100, count);
        count = 0;
        while (true) {
            novoValor=novoValor-50;
            count++;
            if(novoValor<50){
                break;
            }
        }
        papeisMoeda[4] = new PapelMoeda(50, count);
        count = 0;
        while (true) {
            novoValor=novoValor-20;
            count++;
            if(novoValor<20){
                break;
            }
        }
        papeisMoeda[3] = new PapelMoeda(20, count);
        count = 0;
        while (true) {
            novoValor=novoValor-10;
            count++;
            if(novoValor<10){
                break;
            }
        }
        papeisMoeda[2] = new PapelMoeda(10, count);
        count = 0;
        while (true) {
            novoValor=novoValor-5;
            count++;
            if(novoValor<5){
                break;
            }
        }
        papeisMoeda[1] = new PapelMoeda(5, count);
        count = 0;
        while (true) {
            novoValor=novoValor-2;
            count++;
            if(novoValor<2){
                break;
            }
        }
        papeisMoeda[1] = new PapelMoeda(2, count);
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }
}
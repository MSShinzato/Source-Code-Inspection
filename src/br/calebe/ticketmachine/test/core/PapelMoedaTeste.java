package br.calebe.ticketmachine.test.core;

import br.calebe.ticketmachine.core.PapelMoeda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PapelMoedaTeste {
    
    
    @Test
    public void getValor(){
        PapelMoeda x = new PapelMoeda(0,0);
        assertEquals(0,x.getValor());
    }
    @Test
    public void getQuantidade(){
        PapelMoeda x = new PapelMoeda(0,0);
        assertEquals(0,x.getQuantidade());
    }
}

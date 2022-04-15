package br.calebe.ticketmachine.test.core;


import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicketMachineTeste {
    
    
    @Test
    public void getSaldo(){
        TicketMachine x = new TicketMachine(0);
        assertEquals(0, x.getSaldo());
    }

    @Test
    public void inserir() throws PapelMoedaInvalidaException{
        TicketMachine x = new TicketMachine(0);
        x.inserir(5);
        assertEquals(5,x.getSaldo());
    }

    @Test
    public void imprimir() throws SaldoInsuficienteException{
        TicketMachine x = new TicketMachine(0);
        String result = "*****************\n";
        result += "*** R$ " + 0 + ",00 ****\n";
        result += "*****************\n";

        assertEquals(result, x.imprimir());
    }


}

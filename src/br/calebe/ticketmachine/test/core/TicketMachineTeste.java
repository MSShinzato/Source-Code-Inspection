package br.calebe.ticketmachine.test.core;


import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicketMachineTeste {
    
    
    @Test
    public void imprimir() throws SaldoInsuficienteException{
        TicketMachine x = new TicketMachine(0);
        String result = "*****************\n";
        result += "*** R$ " + 0 + ",00 ****\n";
        result += "*****************\n";

        assertEquals(result, x.imprimir());
    }


}

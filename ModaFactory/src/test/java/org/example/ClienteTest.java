package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveVestirCamisaCasual() {
        FabricaDeRoupas fabrica = new FabricaDeRoupasCasuais();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Vestindo uma camisa casual", cliente.vestirCamisa());
    }

    @Test
    void deveVestirCalcaCasual() {
        FabricaDeRoupas fabrica = new FabricaDeRoupasCasuais();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Vestindo uma calça casual", cliente.vestirCalca());
    }

    @Test
    void deveVestirCamisaFormal() {
        FabricaDeRoupas fabrica = new FabricaDeRoupasFormais();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Vestindo uma camisa formal", cliente.vestirCamisa());
    }

    @Test
    void deveVestirCalcaFormal() {
        FabricaDeRoupas fabrica = new FabricaDeRoupasFormais();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Vestindo uma calça formal", cliente.vestirCalca());
    }

}
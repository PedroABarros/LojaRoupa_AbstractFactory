package org.example;

public class FabricaDeRoupasCasuais implements FabricaDeRoupas {

    @Override
    public Camisa createCamisa() {
        return new CamisaCasual();
    }

    @Override
    public Calca createCalca() {
        return new CalcaCasual();
    }
}
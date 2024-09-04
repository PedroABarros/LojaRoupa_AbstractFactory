package org.example;

public class FabricaDeRoupasFormais implements FabricaDeRoupas {

    @Override
    public Camisa createCamisa() {
        return new CamisaFormal();
    }

    @Override
    public Calca createCalca() {
        return new CalcaFormal();
    }
}

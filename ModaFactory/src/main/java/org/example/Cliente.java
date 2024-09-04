package org.example;

public class Cliente {

    private Camisa camisa;
    private Calca calca;

    public Cliente(FabricaDeRoupas fabrica) {
        this.camisa = fabrica.createCamisa();
        this.calca = fabrica.createCalca();
    }

    public String vestirCamisa() {
        return this.camisa.vestir();
    }

    public String vestirCalca() {
        return this.calca.vestir();
    }
}

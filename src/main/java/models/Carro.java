package models;

public class Carro {

    private String marca;
    private String modelo;
    private String variante;
    private Integer ano;


    public Carro(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro: \n" +
                "marca: " + marca + '\n' +
                "modelo: " + modelo + '\n' +
                "variante: " + (variante == null ? "Não possui variante" : variante) + '\n' +
                "ano: " + ano;
    }
}

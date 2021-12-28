package br.com.alura.microservice.loja.controller.dto;

public class EnderecoDto {

    private String rua;
    private int num;
    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EnderecoDto{" +
                "rua='" + rua + '\'' +
                ", num=" + num +
                ", estado='" + estado + '\'' +
                '}';
    }

}

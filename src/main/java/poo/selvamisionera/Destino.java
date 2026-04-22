package poo.selvamisionera;

public class Destino {

    private String lugar;
    private String tipoCarga;
    private double valorCarga;

    public Destino() {
    }

    public Destino(String lugar, String tipoCarga, double valorCarga) {
        this.lugar = lugar;
        setTipoCarga(tipoCarga);
        this.valorCarga = valorCarga;
    }

    public String getLugar() {return lugar;}

    public void setLugar(String lugar) {this.lugar = lugar;}

    public String getTipoCarga() {return tipoCarga;}

    public void setTipoCarga(String tipoCarga) {
        String palabra = tipoCarga.toLowerCase(); // Paso todo a minuscula por las dudas
        if (palabra.equals("cemento") || palabra.equals("piedra") || palabra.equals("madera")) {
            this.tipoCarga = palabra;
        } else {
            this.tipoCarga = "Carga invalida";
        }
    }

    public double getValorCarga() {return valorCarga;}

    public void setValorCarga(double valorCarga) {this.valorCarga = valorCarga;}
}
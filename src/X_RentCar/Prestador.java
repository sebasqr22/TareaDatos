package X_RentCar;

import X_RentCar.factory.User;


public class Prestador extends User {

    int cantidadCarros = 0;
    Carro[] carrosRegistrados = new Carro[10];
    double rating = 0;


    public int getCantidadCarros() {
        return cantidadCarros;
    }

    public void setCantidadCarros(int cantidadCarros) {
        this.cantidadCarros = cantidadCarros;
    }

    public Carro[] getCarrosRegistrados() {
        return carrosRegistrados;
    }

    public void setCarrosRegistrados(Carro[] carrosRegistrados) {
        this.carrosRegistrados = carrosRegistrados;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Mensajeria mensajeria(){
        return new Mensajeria();

    }

    public SegurosEmpresa Seguros_Empresa(){
        return new SegurosEmpresa();
    }
}


class Carro {

    String marca;
    String modelo;
    String extras;
    String combustible;
    int placa;
    int kilometraje;
    boolean disponibilidad;
    int precio;


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

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}


class Mensajeria{
    public static void mensajeria(String[] args){
        conexionCliente();
        llamadaCliente();
    }
}


class SegurosEmpresa{
    public static void seguros(String[] args){
        agregarSeguros();
    }
}
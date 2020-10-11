package X_RentCar;

import X_RentCar.factory.User;

public class Cliente extends User {

    Carro carroAlquilado;
    double rating;
    int[] localizacion = new int[2];

    public Cliente() {
        this.carroAlquilado = null;
        this.rating = 0.0;

    }


    public Carro getCarroAlquilado() {
        return carroAlquilado;
    }

    public void setCarroAlquilado(Carro carroAlquilado) {
        this.carroAlquilado = carroAlquilado;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int[] getLocalizacion() {
        return localizacion;
    }

    public void UpdateGPS(int x, int y) {
        this.localizacion[0] = x;
        this.localizacion[1] = y;
    }
    public Reportes_y_Ayuda Reportes_Ayuda(){
        return new Reportes_y_Ayuda();
    }
    public Mensajeria mensajeria(){
        return new Mensajeria();
    }

}

//Las siguientes clases se basan en funciones y conexiones que existirían en la aplicación completa

class Reportes_y_Ayuda{
    public static void reportes_y_ayuda(String[] args){
        reportarDaño();
        conexion911();
        conexionGrua();
    }
}

class Mensajeria{
    public static void mensajeria(String[] args){
        llamadasPrestador();
        conexionPrestador();
    }
}
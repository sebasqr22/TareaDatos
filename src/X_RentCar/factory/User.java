package X_RentCar.factory;
//Clase padre User
public class User {
    String Facebook;
    int Cedula;
    int Telefono;
    String FechaVencimientoLicensia;
    String Direccion;
    String CuentaBanco;


    public void setFacebook(String facebook) {
        Facebook = facebook;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public void setFechaVencimientoLicensia(String fechaVencimientoLicensia) {
        FechaVencimientoLicensia = fechaVencimientoLicensia;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setCuentaBanco(String cuentaBanco) {
        CuentaBanco = cuentaBanco;
    }
}

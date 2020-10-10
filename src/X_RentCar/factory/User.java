package X_RentCar.factory;

public interface User {
    String Facebook = null;
    int cedula = 0;
    int telefono = 0;
    String vencimientoLicencia = null;
    String direccion = null;
    String cuentaBanco = null;

    int getFacebook();
    void setFacebook(String facebook);
    int getCedula();
    void setCedula(int cedula);
    int getTelefono();
    void setTelefono(int telefono);
    String getVencimientoLicencia();
    void setVencimientoLicencia(String vencimientoLicencia);
    String getDireccion();
    void setDireccion(String direccion);
    String getCuentaBanco();
    void setCuentaBanco(String cuentaBanco);

}


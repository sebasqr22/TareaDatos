public class Prestador implements User{

    public interface prestador{
        int cantidadCarros = 0;
        Carro[] carrosRegistrados = new Carro[10];
        double rating = 0;

        int get_cantidadCarros();
        void set_cantidadCarros(int cantidadCarros);
        String get_carrosRegistrados();
        void set_carrosRegistrados(String carrosRegistrados);
        double getRating();
        void setRating(int rating);
        void set_RegistrarCarro();

    }
}


class Carro {

    public static void carros(String[] args){

        String marca = null;
        String modelo = null;
        String extras = null;
        String combustible = null;
        int placa = 0;
        int kilometraje = 0;
        boolean disponibilidad = true;
        int precio = 0;

        setMarca(marca);
        setModelo(modelo);
        setExtras(extras);
        setCombustible(combustible);
        setPlaca(placa);
        setKilometraje(kilometraje);
        setDisponibilidad(disponibilidad);
        setPrecio(precio);
        getMarca();
        getModelo();
        getExtras();
        getCombustible();
        getPlaca();
        getKilometraje();
        getDisponibilidad();
        getPrecio();

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
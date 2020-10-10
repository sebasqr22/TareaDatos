package X_RentCar.factory;



public class User_Factory implements Abstract_Factory<User>{

    @Override
    public User create(String UserType) {
        if (UserType.equalsIgnoreCase("cliente")) {
            return new Cliente();
        }else if (UserType.equalsIgnoreCase("prestador")) {
            return new Prestador();
        }

    }
}

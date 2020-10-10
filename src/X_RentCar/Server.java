package X_RentCar;

public class Server {


	Prestador[] prestadores = new Prestador[100];
	int iP = 0;
	int iC = 0;
	// partiendo de que en la aplicacion real ambas clases existen en el codigo
	Cliente[] clientes = new Cliente[100];

	public Prestador[] getPrestadores() {

		return prestadores;
	}

	public void setPrestadores(Prestador presta) {

		this.prestadores[iP] = presta;
		this.iP++;
	}

	public Cliente[] getClientes() {

		return clientes;
	}

	public void setClientes(Cliente cliente) {

		this.clientes[iC] += cliente;
		this.iC++;
	}
		



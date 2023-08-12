
public class Truck extends Vehicle {

	private int cargocap;

	public Truck(int p, int f, int m, int c) { // inicializa membros Vehicles usando construtor Vehicles
		super(p, f, m);
		cargocap = c;
	}

	int getCargo() {return cargocap;}

	void putCargo(int c) {cargocap = c;	}

}

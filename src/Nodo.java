

public class Nodo {
	
	Nodo siguiente;
	Object dato;
	

	public Nodo(Object dato) {
		super();
		this.siguiente = null;
		this.dato = dato;
	}

	Nodo VerSiguiente(){
		return this.siguiente;
		
	}
	
	void agregar (Nodo n) {
		this.siguiente = n;
	}
	
	Object VerDatos () {
		return dato;
		
	}

}

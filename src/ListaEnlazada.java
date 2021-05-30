
public class ListaEnlazada {

	Nodo cabeza;
	int tamaño;
	
	
	
	public ListaEnlazada() {
		super();
		this.cabeza = null;
		this.tamaño = 0;
	}

	void agregarDatos (Object o) {
		if (cabeza == null) {
			cabeza = new Nodo(o);
		}else {
			Nodo temp = cabeza;
			Nodo nuevo = new Nodo(o);
			nuevo.agregar(temp);
			cabeza = nuevo;
		}
		tamaño++;
	}

	Object ver (int indice) {
		Nodo temp = cabeza;
		for (int i = 0; i < indice; i++) {
			temp = temp.VerSiguiente();
		}
		return temp.VerDatos();
	}
	
	public static void main(String[] args) {
		
		ListaEnlazada l = new ListaEnlazada();
		l.agregarDatos(23);
		l.agregarDatos("yft");
		l.agregarDatos(98);
		
		System.out.println(l.ver(2));
		

	}
	
	 	

}

package futbol;

public abstract class Futbolista implements Comparable<Object> {
	private String nombre;
	private int edad;
	private final String posicion;
	
	// Constructores
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre= nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	
	//Metodos 
	@Override
	public abstract int compareTo(Object o);
	
	//Metodo equals
	public boolean equals(Futbolista f) {
		if (this == f) {
			return true;
		}
		return false;
	}
		
	//Metodo jugarConLasManos
	public abstract boolean jugarConLasManos();
	
	//Metodo to String
	@Override
	public String toString() {
		return "El futbolista "+nombre+" tiene "+edad+", y juega de "+posicion;
	}
	public String getPosicion() {
		return posicion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}

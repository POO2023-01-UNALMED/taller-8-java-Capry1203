package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	//Constructores 
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	//Metodos
	public int compareTo(Object portero) {
		return Math.abs(this.golesRecibidos - ((Portero)portero).golesRecibidos);
	}
	
	//Metodos jugarConLasManos
	public boolean jugarConLasManos() {
		return true;
	}
	
	// toString
	public String toString() {
		return "El futbolista" +getNombre()+ "tiene" +getEdad()+ ",y juega de" 
				+ getPosicion()+"con el dorsal"+dorsal+". Le han marcado"+golesRecibidos;
	}
}

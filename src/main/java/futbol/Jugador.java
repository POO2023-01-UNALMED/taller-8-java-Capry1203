package futbol;
import java.lang.Math;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	//Constructores 
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	public Jugador(){
		super();
		golesMarcados = 289;
		dorsal = 7;
	}
	//Metodos 
	// compare to
	@Override
	public int compareTo(Object jugador) {
		return Math.abs(this.getEdad() - ((Futbolista)jugador).getEdad());
	}
	
	public boolean jugarConLasManos() {
		if(this.getPosicion().equals("Portero")) {
			return true;
		}
		return false;
	}

	//Metodo toString
	@Override
	public String toString() {
		return "El futbolista " +getNombre()+ " tiene " +getEdad()+ ", y juega de " + 
	    getPosicion()+" con el dorsal "+dorsal+". Ha marcado "+golesMarcados;
	}
}

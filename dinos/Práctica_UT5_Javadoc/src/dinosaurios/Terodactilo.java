package dinosaurios;

/*La clase Terodáctilo representa a un tipo de dinosaurio volador.*/

public class Terodactilo {
	private String nombre;
	private int envergadura;

	/* Crea un nuevo terodáctilo con el nombre y la envergadura especificados. */

	public Terodactilo(String nombre, int envergadura) {
		this.nombre = nombre;
		this.envergadura = envergadura;
	}

	/* Obtiene el nombre del terodáctilo. */
	public String getNombre() {
		return nombre;
	}

	/* Obtiene la envergadura del terodáctilo. */
	public int getEnvergadura() {
		return envergadura;
	}

	/* Realiza un vuelo. */
	public void volar() {
		System.out.println("¡El terodáctilo está volando!");
	}

	/* Emitir sonido de terodáctilo. */
	public void emitirSonido() {
		System.out.println("¡Aaahhhhhhh!");
	}
	 /*Realiza un ataque aéreo.*/
    public boolean ataqueAereo(String objetivo) {
        System.out.println("El terodáctilo está atacando a " + objetivo + " desde el aire.");
        // Lógica del ataque
        return true; // Supongamos que siempre es exitoso 
    }
}

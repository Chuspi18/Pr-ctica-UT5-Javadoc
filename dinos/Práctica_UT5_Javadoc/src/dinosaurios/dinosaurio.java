package dinosaurios;

/* La clase Dinosaurio representa a un dinosaurio con su nombre y edad. */
public class dinosaurio {
    private String nombre;
    private int edad;

    /*Crea un nuevo dinosaurio con el nombre y la edad especificados.*/
    public dinosaurio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*Obtiene el nombre del dinosaurio.*/
    public String getNombre() {
        return nombre;
    }

    /*Obtiene la edad del dinosaurio.*/
    public int getEdad() {
        return edad;
    }

    /*Hace que el dinosaurio cumpla un año más.*/
    public void cumpleAnios() {
        edad++;
    }

    /*Imprime un rugido del dinosaurio.*/
    public void rugir() {
        System.out.println("¡ROAARRR!");
    }
}

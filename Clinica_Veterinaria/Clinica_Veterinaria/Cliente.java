public class Cliente {
    // Atributos
    private String idCliente;
    private String nombre;
    private String telefono;

    // Constructor (para inicializar los datos)
    public Cliente(String idCliente, String nombre, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Métodos para obtener y modificar los datos (Getters y Setters)
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método principal para mostrar la información del cliente
    public void mostrarDatos() {
        System.out.println("--- DATOS DEL CLIENTE ---");
        System.out.println("ID: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}
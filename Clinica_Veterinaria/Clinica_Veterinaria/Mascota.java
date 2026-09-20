public class Mascota {
    // Atributos
    private String idMascota;
    private String nombreMascota;
    private String especie; // Perro, Gato, etc.
    private String raza;
    private int edad;
    private Cliente clienteAsociado; // Objeto Cliente

    // Constructor corregido
    public Mascota(String idMascota, String nombreMascota, String especie, String raza, int edad, Cliente clienteAsociado) {
        this.idMascota = idMascota;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.clienteAsociado = clienteAsociado;
    }

    // Getters y Setters corregidos
    public String getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    // Método para mostrar la información de la mascota
    public void mostrarMascota() {
        System.out.println("--- DATOS DE LA MASCOTA ---");
        System.out.println("ID Mascota: " + idMascota);
        System.out.println("Nombre: " + nombreMascota);
        System.out.println("Especie: " + especie);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        // Si quieres mostrar el nombre del dueño asociado:
        if (clienteAsociado != null) {
            System.out.println("Dueño asociado: " + clienteAsociado.getNombre());
        }
    }
}
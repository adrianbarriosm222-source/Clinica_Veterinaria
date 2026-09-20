public class Cita {
    // Atributos
    private String idCita;
    private String fecha;
    private String hora;
    private String motivo;
    private Mascota mascotaAsociada; // Objeto Mascota

    // Constructor
    public Cita(String idCita, String fecha, String hora, String motivo, Mascota mascotaAsociada) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.mascotaAsociada = mascotaAsociada;
    }

    // Getters y Setters
    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Mascota getMascotaAsociada() {
        return mascotaAsociada;
    }

    public void setMascotaAsociada(Mascota mascotaAsociada) {
        this.mascotaAsociada = mascotaAsociada;
    }

    // Método para mostrar los detalles de la cita
    public void mostrarCita() {
        System.out.println("--- DETALLES DE LA CITA ---");
        System.out.println("ID Cita: " + idCita);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Motivo: " + motivo);
        if (mascotaAsociada != null) {
            System.out.println("Mascota paciente: " + mascotaAsociada.getNombreMascota());
        }
    }
}
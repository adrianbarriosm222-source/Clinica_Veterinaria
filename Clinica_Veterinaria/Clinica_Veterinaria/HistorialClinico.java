public class HistorialClinico {
    // Atributos
    private String idConsulta;
    private String sintomas;
    private String diagnostico;
    private String tratamiento;
    private Mascota mascotaAsociada; // Objeto Mascota

    // Constructor
    public HistorialClinico(String idConsulta, String sintomas, String diagnostico, String tratamiento, Mascota mascotaAsociada) {
        this.idConsulta = idConsulta;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.mascotaAsociada = mascotaAsociada;
    }

    // Getters y Setters
    public String getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(String idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Mascota getMascotaAsociada() {
        return mascotaAsociada;
    }

    public void setMascotaAsociada(Mascota mascotaAsociada) {
        this.mascotaAsociada = mascotaAsociada;
    }

    // Método para mostrar el historial médico
    public void mostrarHistorial() {
        System.out.println("--- HISTORIAL CLÍNICO / CONSULTA ---");
        System.out.println("ID Consulta: " + idConsulta);
        if (mascotaAsociada != null) {
            System.out.println("Paciente: " + mascotaAsociada.getNombreMascota());
        }
        System.out.println("Síntomas: " + sintomas);
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println("Tratamiento: " + tratamiento);
    }
}
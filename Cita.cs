using System;

namespace ClinicaVeterinaria
{
    public class Cita
    {
        public string IdCita { get; set; }
        public string Fecha { get; set; }
        public string Motivo { get; set; }
        public double CostoConsulta { get; set; }
        public Mascota MascotaPaciente { get; set; }

        public Cita(string idCita, string fecha, string motivo, double costoConsulta, Mascota mascotaPaciente)
        {
            IdCita = idCita;
            Fecha = fecha;
            Motivo = motivo;
            CostoConsulta = costoConsulta;
            MascotaPaciente = mascotaPaciente;
        }

        // Método 1: Muestra los datos de la cita y la mascota
        public void MostrarCita()
        {
            Console.WriteLine($"[CITA #{IdCita}] Fecha: {Fecha} | Motivo: {Motivo}");
            MascotaPaciente.MostrarMascota();
        }

        // Método 2: Muestra el formato completo de factura con costos
        public void MostrarFactura()
        {
            Console.WriteLine("\n========================================");
            Console.WriteLine("          FACTURA VETERINARIA           ");
            Console.WriteLine("========================================");
            Console.WriteLine($"Fecha de emisión: {DateTime.Now.ToShortDateString()}");
            Console.WriteLine($"ID Cita: {IdCita} | Fecha prog: {Fecha}");
            Console.WriteLine($"Motivo: {Motivo}");
            Console.WriteLine("----------------------------------------");
            MascotaPaciente.MostrarMascota();
            Console.WriteLine("----------------------------------------");
            Console.WriteLine($"Consulta Médica / Insumos: ${CostoConsulta:F2}");
            Console.WriteLine($"TOTAL A PAGAR:            ${CostoConsulta:F2}");
            Console.WriteLine("========================================\n");
        }
    }
}
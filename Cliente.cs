using System;

namespace ClinicaVeterinaria
{
    public class Cliente
    {
        public string IdCliente { get; set; }
        public string Nombre { get; set; }
        public string Telefono { get; set; }

        public Cliente(string idCliente, string nombre, string telefono)
        {
            IdCliente = idCliente;
            Nombre = nombre;
            Telefono = telefono;
        }

        public void MostrarDatos()
        {
            Console.WriteLine($"Tutor: {Nombre} | Teléfono: {Telefono} (ID: {IdCliente})");
        }
    }
}
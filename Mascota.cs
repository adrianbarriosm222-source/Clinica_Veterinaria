using System;

namespace ClinicaVeterinaria
{
    public class Mascota
    {
        public string IdMascota { get; set; }
        public string NombreMascota { get; set; }
        public string Especie { get; set; }
        public int Edad { get; set; }
        public Cliente DuenoAsociado { get; set; }

        public Mascota(string idMascota, string nombreMascota, string especie, int edad, Cliente duenoAsociado)
        {
            IdMascota = idMascota;
            NombreMascota = nombreMascota;
            Especie = especie;
            Edad = edad;
            DuenoAsociado = duenoAsociado;
        }

        public void MostrarMascota()
        {
            Console.WriteLine($"Mascota: {NombreMascota} | Especie: {Especie} | Edad: {Edad} años");
            Console.Write("Dueño -> ");
            DuenoAsociado.MostrarDatos();
        }
    }
}
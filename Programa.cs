using System;

namespace ClinicaVeterinaria
{
    class Program
    {
        static void Main(string[] args)
        {
            Cliente c1 = new Cliente("C001", "Carlos Pérez", "5551-2345");
            Mascota m1 = new Mascota("M001", "Firu", "Perro", 3, c1);
            Cita cita1 = new Cita("T001", "19/09/2026", "Chequeo general y vacunas", 45.00, m1);

            int opcion = 0;

            do
            {
                Console.Clear();
                Console.WriteLine("========================================");
                Console.WriteLine("       SISTEMA VETERINARIO CLÍNICO      ");
                Console.WriteLine("========================================");
                Console.WriteLine(" 1. Ver Datos del Tutor");
                Console.WriteLine(" 2. Ver Datos de la Mascota");
                Console.WriteLine(" 3. Ver Detalles de la Cita");
                Console.WriteLine(" 4. Mostrar Factura y Cobro");
                Console.WriteLine(" 5. Salir");
                Console.WriteLine("========================================");
                Console.Write("Seleccione una opción: ");

                string entrada = Console.ReadLine();
                if (int.TryParse(entrada, out opcion))
                {
                    switch (opcion)
                    {
                        case 1:
                            Console.Clear();
                            Console.WriteLine("--- REGISTRO DE TUTOR ---");
                            c1.MostrarDatos();
                            Console.WriteLine("\n(Presione una tecla para volver al menú)");
                            Console.ReadKey();
                            break;

                        case 2:
                            Console.Clear();
                            Console.WriteLine("--- REGISTRO DE MASCOTA ---");
                            m1.MostrarMascota();
                            Console.WriteLine("\n(Presione una tecla para volver al menú)");
                            Console.ReadKey();
                            break;

                        case 3:
                            Console.Clear();
                            Console.WriteLine("--- EXPEDIENTE DE CITA ---");
                            cita1.MostrarCita();
                            Console.WriteLine("\n(Presione una tecla para volver al menú)");
                            Console.ReadKey();
                            break;

                        case 4:
                            Console.Clear();
                            cita1.MostrarFactura();
                            Console.WriteLine("Presione una tecla para volver al menú...");
                            Console.ReadKey();
                            break;

                        case 5:
                            Console.WriteLine("\nSaliendo del sistema. ¡Hasta luego!");
                            break;

                        default:
                            Console.WriteLine("\nOpción inválida. Intente de nuevo.");
                            System.Threading.Thread.Sleep(1500);
                            break;
                    }
                }
                else
                {
                    Console.WriteLine("\nPor favor, ingrese un número válido.");
                    System.Threading.Thread.Sleep(1500);
                }

            } while (opcion != 5);
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Refugio refugio = new Refugio();
        int opcion = 0;
        int contadorId = 1;
        refugio.registrarAnimal(new Perro(contadorId++, "Tobby", 3, "ACTIVO"));
        refugio.registrarAnimal(new Gato(contadorId++, "Michi", 2, "ACTIVO"));
        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN DEL REFUGIO ===");
            System.out.println("1. Mostrar Animales");
            System.out.println("2. Escuchar Sonido de Tobby (ID 1)");
            System.out.println("3. Escuchar Sonido de Michi (ID 2)");
            System.out.println("4. Cambiar Estado de Tobby a ADOPTADO");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int caracter = System.in.read();
            while (System.in.available() > 0) {
                System.in.read();
            }
            opcion = caracter - '0'; 
            switch (opcion) {
                case 1:
                    refugio.mostrarAnimales();
                    break;

                case 2:
                    refugio.ejecutarSonidoAnimal(1);
                    break;

                case 3:
                    refugio.ejecutarSonidoAnimal(2);
                    break;

                case 4:
                    refugio.cambiarEstadoAnimal(1, "ADOPTADO");
                    break;

                case 5:
                    System.out.println("Saliendo del sistema... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}
public class Perro extends Animal {
public Perro(int id, String nombre, int edad, String estado) {
    super(id, nombre, edad, estado);
}
@Override
    public void hacerSonido() {
        System.out.println("¡Guau! ¡Guau!");
    }
    @Override
    public void mostrarInfo() {
        System.out.print("[PERRO] ");
        super.mostrarInfo();
    }
}

import java.util.ArrayList;
import java.util.List;
public class Refugio {
    private List<Animal> listaAnimales;

    public Refugio() {
        this.listaAnimales = new ArrayList<>();
    }
    public List<Animal> getlistaAnimales() {
        return listaAnimales;
    }

  
    public void registrarAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println("¡Animal registrado con éxito!");
    }

    public void mostrarAnimales() {
        if (listaAnimales.isEmpty()) {
            System.out.println("No hay animales registrados en el refugio.");
            return;
        }
        System.out.println("LISTA DE ANIMALES EN EL REFUGIO ===");
        for (Animal animal : listaAnimales) {
            animal.mostrarInfo();
        }
    }

    public Animal buscarAnimalPorId(int id) {
        for (Animal animal : listaAnimales) {
            if (animal.getid() == id) {
                return animal;
            }
        }
        return null;
    }

    public void cambiarEstadoAnimal(int id, String nuevoEstado) {
        Animal animal = buscarAnimalPorId(id);
        if (animal != null) {
            animal.setestado(nuevoEstado);
            System.out.println("Estado actualizado a: " + nuevoEstado);
        } else {
            System.out.println("Error: No se encontró ningún animal con el ID especificado.");
        }
    }

    public void ejecutarSonidoAnimal(int id) {
        Animal animal = buscarAnimalPorId(id);
        if (animal != null) {
            System.out.print(animal.getnombre() + " dice: ");
            animal.hacerSonido();
        } else {
            System.out.println("Error: No se encontró ningún animal con el ID especificado.");
        }
    }
}



public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String estado;

    public Animal(int id, String nombre, int edad, String estado ) {
        if (id >= 0){
            this.id = id;
        }else {
            this.id = 0;
        }
        this.nombre = nombre;

        if (edad >=0){
            this.edad = edad;
        } else {
            this.edad = 0;
        } 
        this.estado = estado;
}
public int getid() {
    return id;
}
public String getnombre(){
    return nombre;
}
public int getedad(){
    return edad;
}
public String getestado(){
    return estado;
}
public void setid(int id){
    if (id >= 0) {
        this.id = id;
    } else {
        System.out.println("Error: El ID no puede ser negativo.");
    }
}
public void setnombre (String nombre){
    if (nombre !=null && !nombre.isEmpty()){
        this.nombre = nombre;
    }else {
        System.out.println("Error nombre no puede estar vacio")
    }
}
public void setedad(int edad) {
    if (edad >= 0) {
        this.edad = edad;
    } else {
        System.out.println("Error: La edad no puede ser negativa.");
    }
    public void setestado (String estado){
    if (estado !=null && !estado.isEmpty()){
        this.estado = estado;
    }else {
        System.out.println("Error nombre no puede estar vacio")
    }
}public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " años | Estado: " + estado);
    }
}

}

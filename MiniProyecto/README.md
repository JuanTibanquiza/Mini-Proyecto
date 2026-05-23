# Sistema de Gestión de Refugio de Animales

### Estudiante: Juan Tibanquiza


## Descripción breve del sistema
Este programa simula el funcionamiento interno de un refugio de animales utilizando Java. Está diseñado para gestionar la información de las mascotas de forma ordenada y sin usar herramientas externas pesadas. El sistema permite registrar animales, cambiar sus estados de adopción y activar sus comportamientos individuales directamente desde una interfaz de consola.


## Estructura básica de clases

El sistema está organizado bajo los pilares de la Programación Orientada a Objetos mediante las siguientes clases:

* Animal (Clase Base): Es la ficha de registro general. Define que cualquier animal que entre al refugio debe tener obligatoriamente ID, nombre, edad y estado (si está ACTIVO o ya fue ADOPTADO). Tiene filtros de seguridad que evitan que se registren datos erróneos.
* Perro y Gato (Subclases o Clases Hijas): Son variaciones del molde base. Por ser animales ya heredan el nombre, ID y edad automáticamente. Su única diferencia es que cada una sobrescribe el método de comportamiento para actuar a su manera: el perro ladra y el gato maúlla (Polimorfismo).
* Refugio (Clase Gestora): Es el cerebro o administrador del lugar. Adentro guarda una lista dinámica (ArrayList) donde apunta a todos los animales que van llegando. Sabe cómo buscar a un animal por su ID, cómo mostrar la lista completa en la pantalla y cómo cambiar el estado a ADOPTADO.
* App (Clase Principal y Menú): Es el panel con botones que ve el usuario en la pantalla. Para cumplir estrictamente con las reglas de no usar librerías externas como Scanner, lee el teclado usando una herramienta nativa muy básica de Java (System.in.read) para manejar las opciones del menú interactivo.


## Funcionamiento del Polimorfismo
Lo más importante del código ocurre al hacer los sonidos. El administrador del refugio revisa la lista tratando a todos los animales por igual. Pero, gracias al polimorfismo, en el segundo exacto en que el programa toca la ficha de un perro, el sistema sabe que debe ladrar; y si toca la de un gato, sabe que debe maullar, sin que el programador tenga que indicárselo manualmente.

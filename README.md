# Javanttcourse
Este es un programa de java que permite gestionar un stock para cualquier tipo de producto y forma parte de un curso impartido por FACTUM y NTT DATA

El código es un pequeño programa de consola que sirve como gestor de inventario de productos. El programa utiliza la clase Producto para almacenar información de cada producto, y una lista de objetos Producto para llevar un registro del inventario.

El programa ofrece al usuario un menú con cinco opciones:

Agregar producto al inventario.
Modificar un producto existente en el inventario.
Eliminar un producto del inventario.
Listar todos los productos en el inventario.
Salir del programa.
El programa utiliza un bucle while para ejecutar el menú en un ciclo continuo hasta que el usuario elija la opción de salir.

El programa utiliza la clase Scanner para leer la entrada del usuario desde la consola. Las opciones seleccionadas por el usuario se manejan en un bloque try-catch, donde se manejan excepciones en caso de que el usuario ingrese un valor no numérico o un índice inválido.

Las opciones de agregar, modificar y eliminar un producto del inventario se implementan utilizando los métodos add(), set(), y remove() de la lista de productos. La opción de listar productos muestra los elementos de la lista en una iteración for si la lista no está vacía.

En general, el código es fácil de entender y seguir debido a su simplicidad. Aunque no utiliza una estructura de base de datos, este programa sirve como una buena introducción al concepto de gestión de inventarios y puede ser utilizado como punto de partida para proyectos más complejos en este ámbito.

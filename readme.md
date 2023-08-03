README - Proyecto RestauranX

Autor: Simon Zelada
https://github.com/zeladaguerrasimon/ProyectoPrueba

Este proyecto RestauranX es una aplicación de gestión para un restaurante que permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) relacionadas con camareros, platos, mesas y pedidos. La aplicación está desarrollada utilizando Java, Spring Boot y Spring Data JPA.

Modelo de Datos
El modelo de datos de la aplicación está representado por las siguientes entidades:

Camarero: Representa a un camarero del restaurante con atributos como ID, Nombre, Edad y Fecha_Inicio.
Plato: Representa a un plato del menú con atributos como ID, Nombre, Descripción, Precio y Categoría.
Mesa: Representa a una mesa del restaurante con atributos como ID, Numero, Capacidad y Ubicacion.
Pedido: Representa un pedido realizado por un cliente con atributos como ID, Mesa_ID, Camarero_ID, Fecha y Total.
DetallePedido: Representa los detalles de un pedido con atributos como Pedido_ID, Plato_ID, Cantidad y Subtotal.
Controladores
La aplicación cuenta con varios controladores que gestionan las operaciones CRUD relacionadas con cada entidad:

CamareroController: Maneja las operaciones CRUD de los camareros.
PlatoController: Maneja las operaciones CRUD de los platos del menú.
MesaController: Maneja las operaciones CRUD de las mesas del restaurante.
PedidoController: Maneja las operaciones CRUD de los pedidos y detalles de los pedidos.
Repositorios
Se utilizan interfaces de repositorio que extienden JpaRepository de Spring Data JPA para manejar las operaciones de acceso a la base de datos de forma sencilla y sin necesidad de implementar las consultas manualmente:

CamareroRepository: Repositorio para la entidad Camarero.
PlatoRepository: Repositorio para la entidad Plato.
MesaRepository: Repositorio para la entidad Mesa.
PedidoRepository: Repositorio para la entidad Pedido.
DetallePedidoRepository: Repositorio para la entidad DetallePedido.
Archivo SQL
El archivo restauranx.sql ubicado en la carpeta resources contiene el script SQL para la creación de las tablas y la inserción de datos iniciales en la base de datos. Asegúrate de ejecutar este script en tu base de datos antes de iniciar la aplicación.

Cómo Ejecutar la Aplicación
Para ejecutar la aplicación, asegúrate de tener configurada correctamente tu base de datos y haber ejecutado el archivo SQL. Luego, simplemente puedes ejecutar la clase Application.java ubicada en el paquete com.tu_empresa.tu_proyecto para iniciar la aplicación.

Vista HTML
Para la vista HTML que muestra el historial de pedidos y detalles de pedidos, hemos creado una plantilla llamada ver_detalle_pedido.html que se encuentra en la carpeta templates. Esta plantilla utiliza Thymeleaf para mostrar los detalles de los pedidos y un enlace para volver al historial de pedidos.

Es importante tener en cuenta que este README es solo una guía básica y puedes ajustar los detalles según las necesidades y características específicas de tu proyecto. Si tienes preguntas adicionales o necesitas más detalles sobre algún aspecto particular del proyecto, no dudes en consultar la documentación de Spring Boot y Spring Data JPA, ya que proporcionan información detallada sobre cómo desarrollar aplicaciones web con Java.

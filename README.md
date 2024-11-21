Para conectar al FrontEnd : https://github.com/1010David/FrontEnd_del_Back-https-github.com-1010David-Creando_API_-_Connecting

# ScreenMatch API Connecting

Una aplicación web desarrollada con **Spring Boot** que conecta el back-end con el front-end, siguiendo el patrón de diseño **MVC** (Model-View-Controller). Esta API está diseñada para gestionar datos de series y facilitar la comunicación entre las capas de la aplicación de manera organizada y escalable.

## Características principales

### Conexión entre back-end y front-end
- La API se ejecuta en el servidor local (`localhost:8080`), permitiendo que el front-end acceda a los datos a través de endpoints específicos.
- Configuración de **CORS** para resolver problemas de comunicación entre diferentes dominios.

### Organización en capas con el patrón MVC
- Estructura del proyecto basada en el modelo MVC, asegurando una separación clara de responsabilidades:
    - **Modelos**: Representación de las entidades y su relación con la base de datos.
    - **Controladores**: Manejo de las rutas y la comunicación con el cliente.
    - **Servicios**: Gestión de las reglas de negocio.

### Rutas y controladores
- Implementación de **rutas API RESTful** utilizando anotaciones como `@RestController` y `@GetMapping`.
- Rutas organizadas con prefijos fijos, como `"/series"`, mediante `@RequestMapping`.
- Manejo de parámetros dinámicos en las rutas utilizando `@PathVariable`.

### Buenas prácticas
- Uso del patrón **DTO (Data Transfer Object)** para personalizar y asegurar los datos enviados al cliente.
- Extracción de métodos comunes para mejorar la reutilización y el mantenimiento del código.
- Separación de responsabilidades mediante la creación de una clase de servicios (`SerieService`), reduciendo la carga de los controladores.

### Desarrollo incremental
- Adopción de un enfoque de trabajo incremental para integrar el back-end con el front-end.
- Validación exhaustiva del código en diferentes escenarios para garantizar su correcto funcionamiento.

### Optimización para desarrollo
- **Live Reload** con Spring Boot Devtools, eliminando la necesidad de reiniciar el servidor después de cada cambio.
- Configuración simplificada del servidor utilizando la dependencia `spring-boot-starter-web`.

## Funcionalidades

- **Consultar todas las series**: Devuelve una lista de todas las series almacenadas en la base de datos.
- **Consultar una serie por ID**: Retorna los datos de una serie específica a partir de su ID.
- **Buscar episodios por temporada**: Permite buscar episodios filtrados por temporada o título.
- **Manejo de errores y serialización**:
    - Prevención de problemas de serialización circular en entidades relacionadas.
    - Uso de herramientas para serializar datos de forma segura y eficiente.

## Tecnologías utilizadas

- **Java** (JDK 17+)
- **Spring Boot** (v3.2+)
- **H2 Database** para pruebas y desarrollo local
- **Spring Data JPA** para interactuar con la base de datos
- **Spring Boot Devtools** para desarrollo ágil
- **IntelliJ IDEA** como entorno de desarrollo



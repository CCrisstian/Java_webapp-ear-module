<p>En un proyecto modular, con un enfoque <b>EAR</b> (<b>Enterprise Archive</b>), cada módulo tiene un propósito específico dentro de la arquitectura empresarial.</p>

<h3>webapp-ear-ear</h3>

- <b>Tipo</b>: `EAR` (`Enterprise Archive`)
- <b>Propósito</b>:
Este módulo actúa como el contenedor principal del proyecto. Su función es empaquetar y desplegar toda la aplicación en un servidor de aplicaciones, en este caso `Wildfly`. Contiene los submódulos `webapp-ear-ejb` y `webapp-ear-war`, combinándolos en un único archivo `.ear` para facilitar su despliegue.
- <b>Características principales</b>:
  - Define las dependencias de los submódulos (`webapp-ear-ejb` y `webapp-ear-war`) y las agrupa.
  - Utiliza el plugin `maven-ear-plugin` para empaquetar los módulos EJB y WAR en un archivo .ear.
  - Es el punto de entrada para la ejecución de la aplicación en el servidor.

<h3>webapp-ear-ejb</h3>

- <b>Tipo</b>: `EJB` (`Enterprise JavaBean`)
- <b>Propósito</b>:
Este módulo es el núcleo de la lógica empresarial. Aquí se definen los <b>servicios, componentes transaccionales y reglas de negocio</b>. Al ser un módulo `EJB`, está diseñado para manejar <b>transacciones, seguridad, concurrencia y acceso a bases de datos</b>.
- <b>Características principales</b>:
  - Contiene las clases y servicios que representan la lógica empresarial.
  - Puede incluir lógica compleja como validaciones, operaciones CRUD y consultas a la base de datos.
  - Al ser un módulo `EJB`, se comunica con otros componentes del sistema, como el módulo `WAR` o <b>bases de datos</b>.
 
<h3>webapp-ear-war</h3>

- <b>Tipo</b>: `WAR` (`Web Application Archive`)
- <b>Propósito</b>:
Este módulo es responsable de la capa de presentación de la aplicación. Contiene las vistas (archivos JSP, JSF o HTML), los controladores (Servlets) y los recursos estáticos como CSS, JS e imágenes. Este módulo interactúa con el módulo `webapp-ear-ejb` para invocar la lógica empresarial.
- <b>Características principales</b>:
  - Contiene Servlets y otras clases relacionadas con la gestión de solicitudes y respuestas HTTP.
  - Incluye librerías como `jakarta.servlet.jsp.jstl` para manejar etiquetas JSP y facilitar la construcción de vistas dinámicas.
  - Es el punto de interacción entre el usuario y la lógica empresarial (módulo `EJB`).

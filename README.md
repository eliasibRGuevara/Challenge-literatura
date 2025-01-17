# Proyecto GestorLibros

Bienvenido al proyecto GestorLibros, una aplicación Java basada en Spring Boot que te permite gestionar libros y autores de manera eficiente y fácil. 🎉

## Descripción del Proyecto 📚

El proyecto GestorLibros está diseñado para bibliotecas, clubes de lectura y aficionados a los libros. Permite buscar, registrar y listar libros y autores con una interfaz amigable y lógica robusta.

## Funcionalidades Principales 🚀

- **Gestión de Autores:** Registra, consulta y actualiza información sobre autores.
- **Gestión de Libros:** Registra y consulta libros vinculados a sus respectivos autores.
- **Consulta y Filtrado:** Filtra libros por idioma, fecha de publicación, y más.
- **Documentación Automática:** Generación de documentación de la API con SpringDoc.

## Tecnologías Utilizadas 🛠️

- **Java 11**
- **Spring Boot**
- **Spring Data JPA**
- **Maven**
- **H2 Database**
- **SpringDoc OpenAPI**

## Requisitos Previos 📋

1. Tener instalado [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Tener instalado [Maven](https://maven.apache.org/).

## Instrucciones de Ejecución 💻

1. Clona este repositorio:

   ```bash
   git clone https://github.com/eliasibRGuevara/challenge-literatura.git
   ```

2. Accede al directorio del proyecto:

   ```bash
   cd challenge-literatur
   ```

3. Ejecuta la aplicación:

   ```bash
   ./mvnw spring-boot:run
   ```

4. Accede a la aplicación en tu navegador en `http://localhost:8080`.

## Ejemplo de Uso 📖

### Registro de un Autor

Usa el siguiente endpoint para registrar un autor:

```http
POST /api/autores
Content-Type: application/json
{
  "nombre": "Gabriel García Márquez",
  "nacionalidad": "Colombiana"
}
```

### Listado de Libros

```http
GET /api/libros
```


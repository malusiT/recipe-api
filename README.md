# Recipe API

A RESTful Recipe Library API built with Spring Boot, Spring Data JPA, and Spring HATEOAS.

This project lets clients create, retrieve, update, and delete recipes over standard HTTP methods. It started from the official Spring "Building REST services" tutorial, but the domain, structure, and implementation have been customised and extended to model a more realistic recipe API — including a PostgreSQL-backed data model, timestamps, and OpenAPI docs.

## Tech Stack

- Java 21
- Maven
- Spring Boot
- Spring Web (MVC)
- Spring Data JPA / Hibernate
- Spring HATEOAS
- Bean Validation (Jakarta Validation)
- PostgreSQL
- springdoc-openapi (Swagger UI)

## Data Model

### Recipe

| Field         | Type            | Notes                          |
|---------------|-----------------|---------------------------------|
| `id`          | `Long`          | Auto-generated identifier       |
| `name`        | `String`        | Recipe name                     |
| `description` | `String`        | Short description                |
| `ingredients` | `List<String>`  | Ingredient list                  |
| `instructions`| `List<String>`  | Step-by-step instructions        |
| `duration`    | `int`           | Preparation/cook time            |
| `createdAt`   | `Instant`       | Set automatically on creation    |
| `updatedAt`   | `Instant`       | Set automatically on update      |

## API Base URL

```
http://localhost:8080/api/v1/recipes
```

## API Docs

This application uses springdoc-openapi to generate Swagger documentation:

```
http://localhost:8080/swagger-ui/index.html
```

## Features

- RESTful CRUD API for managing recipes
- Spring Data JPA persistence backed by PostgreSQL
- Spring HATEOAS hypermedia links on responses
- Auto-generated `createdAt` / `updatedAt` timestamps
- Preloaded sample recipe data on startup (only if the database is empty)
- Centralized exception handling with proper HTTP status codes (404 on missing recipe)
- Interactive OpenAPI/Swagger documentation

## API Endpoints

#### Get all recipes
```
GET /api/v1/recipes
```
Returns a HATEOAS collection of recipes with links.

#### Get a single recipe by ID
```
GET /api/v1/recipes/{id}
```
*Example:* `GET /api/v1/recipes/1`

#### Create a new recipe
```
POST /api/v1/recipes
```
**Request body:**
```json
{
  "name": "Pancakes",
  "description": "Simple homemade pancakes",
  "ingredients": [
    "1 cup flour",
    "1 egg",
    "1 cup milk"
  ],
  "instructions": [
    "Mix ingredients",
    "Heat pan",
    "Cook until golden"
  ],
  "duration": 20
}
```

#### Update an existing recipe
```
PUT /api/v1/recipes/{id}
```

#### Delete a recipe
```
DELETE /api/v1/recipes/{id}
```

## Error Handling

If a recipe is not found, the API returns:
- HTTP 404 Not Found
- A descriptive error message, via a `@RestControllerAdvice` global exception handler

## Running Locally

1. Clone the repository
2. Ensure Java 21 and Maven are installed:
   ```
   java -version
   mvn -version
   ```
3. Create a local PostgreSQL database and update `src/main/resources/application.properties` with your own connection details (URL, username, password) — do not commit real credentials.
4. Run the application:
   ```
   mvn spring-boot:run
   ```
5. Access the API at:
   ```
   http://localhost:8080/api/v1/recipes
   ```

## Deployment

Previously deployed on Railway; that instance has since expired and is no longer live. The app can be redeployed to Railway, Render, Fly.io, or any host that supports a Spring Boot app plus a PostgreSQL instance.

## License

See [LICENSE](./LICENSE).

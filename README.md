# CONVERSOR_DE_MONEDAS 💱💰
Made by May Version 1.0 Build Tool Java Librería Gson

## Descripción del Sistema 💵
Este proyecto, **CONVERSOR_DE_MONEDAS**, es una aplicación de escritorio desarrollada en Java que funciona como un conversor de monedas. Utiliza la librería **Gson** para manejar datos JSON y consumir información de una API externa que proporciona las tasas de conversión actualizadas.  

La arquitectura del proyecto está organizada de forma simple, con métodos para mostrar el menú, realizar la conversión y obtener las tasas de cambio desde la API, permitiendo una fácil ampliación a nuevas monedas en el futuro.

## Características Principales 💶
- **Conversión de Monedas:** Permite convertir entre diferentes monedas como Dólar, Peso Argentino, Real Brasileño y Peso Colombiano.
- **Integración con API Externa:** Obtiene datos actualizados de tasas de cambio mediante la API de ExchangeRate.
- **Interfaz de Usuario Simple:** Funciona mediante consola con menú interactivo.
- **Manejo de JSON:** Utiliza Gson para parsear los datos obtenidos de la API.

## Tecnologías Utilizadas 💴
- **Java:** Lenguaje de programación principal.
- **Gson:** Librería para manejar JSON.
- **HTTP Client de Java:** Para realizar solicitudes HTTP a la API de tasas de cambio.

## Cómo Ejecutar el Sistema 💷

### 1. Clonar el Repositorio
```
git clone https://github.com/tu_usuario/CONVERSOR_DE_MONEDAS.git
cd CONVERSOR_DE_MONEDAS
```
### 2. Asegúrate de tener Java instalado en tu sistema. Luego, desde la carpeta del proyecto:
```
javac -cp "lib/gson.jar" src/Principal.java
```
### 3.Ejecutar la Aplicación
```
java -cp "src;lib/gson.jar" Principal
```
### 4. Uso

- Al iniciar, el sistema mostrará un menú de opciones.

- Ingresa el número de la opción que deseas realizar.

- Ingresa el monto a convertir y el sistema mostrará el resultado utilizando la tasa de cambio actual.

## Futuras Mejoras 🪙

- Crear interfaz gráfica (GUI) para mejorar la experiencia del usuario.

- Ampliar a más monedas y unidades.

- Guardar historial de conversiones.

- Manejar errores y excepciones de forma más robusta (como problemas de conexión a la API).

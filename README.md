# Conversor de Divisas

Este programa en Java permite convertir entre diferentes divisas utilizando la API de ExchangeRate-API.

## Requisitos

- Java 8 o superior.
- Conexión a Internet para realizar las consultas a la API de ExchangeRate-API.

## Uso

1. Ejecutar el programa desde la línea de comandos o desde un entorno de desarrollo Java.
2. Seleccionar la opción correspondiente al tipo de conversión deseada según el menú proporcionado.
3. Ingresar la cantidad a convertir.
4. El programa mostrará el resultado de la conversión y registrará la transacción.
5. Se puede seleccionar la opción "Otro tipo de cambio" para ingresar divisas no listadas en el menú.

## Clases

### `Conversor`

Esta clase se encarga de realizar la conexión con la API de ExchangeRate-API para obtener los valores de conversión de divisas. Además, registra todas las conversiones realizadas.

#### Métodos:

- `conexionConversion(String divisaBase, String divisaTarget, double cantidad)`: Realiza una solicitud HTTP a la API de ExchangeRate-API para obtener la tasa de conversión entre dos divisas y devuelve un objeto de tipo `ConversosRecord`.
- `registrarConversion(String monedaOrigen, String monedaDestino, double cantidad)`: Registra la conversión realizada, incluyendo la cantidad, las divisas de origen y destino, así como la fecha y hora de la transacción.

### `Principal`

Esta clase contiene el método `main` y proporciona un menú interactivo para que el usuario seleccione el tipo de conversión deseada.

## Dependencias

- Gson: Esta librería se utiliza para convertir los datos JSON obtenidos de la API a objetos Java.

## Ejemplo de Uso

CONVERSOR DE MONEDAS

Digite el numero de la opcion que desea ejecutar
Nuestras monedas principales

1. Dólar =>> Peso Argentino
2. Peso Argentino =>> Dólar
3. Dólar =>> Real Brasileño
4. Real Brasileño =>> Dólar
5. Dólar =>> Peso Colombiano
6. Peso Colombiano =>> Dólar
7. Otro tipo de cambio
8. Salir

Digite el monto a convertir
100
Moneda Base: USD
Moneda A Convertir: ARS
Cantidad Convertida: 10100.00



## Notas

- El programa maneja errores en la entrada del usuario para garantizar una experiencia de usuario fluida.
- Los registros de las conversiones se muestran al finalizar la ejecución del programa.

¡Gracias por utilizar nuestro conversor de divisas!


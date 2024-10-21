# Monitoreando

Imagina que estás creando una aplicación de monitoreo del mercado de valores. La aplicación descarga la información de bolsa desde varias fuentes en formato XML para presentarla al usuario con bonitos gráficos y diagramas.

En cierto momento, decides mejorar la aplicación integrando una inteligente biblioteca de análisis de una tercera persona. Pero hay una trampa: la biblioteca de análisis solo funciona con datos en formato JSON.

Importante: No se pide implementar el parseo de XML a JSON, asumir que cuentan con una función `parse(XML) :: JSON` e `iparse(JSON) :: XML`.

Resolver utilizando el patrón Adapter, señalando cada rol.

## Patrón Adapter

Se utiliza el patrón Adapter para convertir los datos de XML a JSON, permitiendo la integración de la biblioteca de análisis.

### Clases Implementadas

- **Main**: Coordina la ejecución de la aplicación, creando instancias de las clases necesarias y gestionando el flujo de datos.

- **DatosXML**: Representa los datos en formato XML. Esta clase contiene un campo para almacenar el XML y un método para acceder a esos datos.

- **BibliotecaAnalisis**: Clase que proporciona funcionalidad para analizar datos en formato JSON. Esta clase tiene un método que realiza el análisis y devuelve un resultado indicando el éxito de la operación.

- **AdapterXMLaJSON**: Actúa como adaptador entre los datos en formato XML y la biblioteca de análisis. Esta clase convierte el XML en JSON y llama a la biblioteca para realizar el análisis, asegurando que las dos partes del sistema se comuniquen correctamente a pesar de sus diferencias de formato.



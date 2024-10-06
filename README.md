# Monitoreando

Imagina que estás creando una aplicación de monitoreo del mercado de
valores. La aplicación descarga la información de bolsa desde varias
fuentes en formato XML para presentarla al usuario con bonitos gráficos y
diagramas.

En cierto momento, decides mejorar la aplicación integrando una
inteligente biblioteca de análisis de una tercera persona. Pero hay una
trampa: la biblioteca de análisis solo funciona con datos en formato
JSON.

Importante: No se pide implementar el parseo de XML a JSON, asumir que cuentan con una funcion parse(XML) :: JSON e iparse(JSON) :: XML

Resolver utilizando el patron Adapter, señalando cada rol.

## Patrón Adapter

Se utiliza el patrón Adapter para convertir los datos de XML a JSON, permitiendo la integración de la biblioteca de análisis.

### Clases Implementadas

- **Main**: Coordina la ejecución de la aplicación.
- **DatosXML**: Representa los datos en formato XML.
- **BibliotecaAnalisis**: Biblioteca de análisis que acepta datos en formato JSON.
- **AdapterXMLaJSON**: Adapta y convierte datos de XML a JSON.


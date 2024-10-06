package ar.edu.davinci;

public class Main {
    public static void main(String[] args) {

        String datosXML = "<data><stock><name>ABC Corp</name><value>100</value></stock></data>";

        BibliotecaAnalisis bibliotecaAnalisis = new BibliotecaAnalisis();

        DatosJSON adaptador = new AdapterXMLaJSON(bibliotecaAnalisis, datosXML);

        String resultado = adaptador.obtenerDatos();
        System.out.println(resultado);
    }
}

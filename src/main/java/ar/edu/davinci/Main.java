package ar.edu.davinci;

public class Main {
    public static void main(String[] args) {
        String datosXML = "<data><stock><name>ABC Corp</name><value>100</value></stock></data>";

        BibliotecaAnalisis bibliotecaAnalisis = new BibliotecaAnalisis();

        AdapterXMLaJSON adaptador = new AdapterXMLaJSON(bibliotecaAnalisis);

        String resultado = adaptador.obtenerDatos(datosXML);

        System.out.println(resultado);
    }
}

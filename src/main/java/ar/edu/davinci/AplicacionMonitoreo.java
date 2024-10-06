package ar.edu.davinci;

public class AplicacionMonitoreo {
    public static void main(String[] args) {

        String datosXML = "<data>...</data>";

        BibliotecaAnalisis bibliotecaAnalisis = new BibliotecaAnalisis();
        DatosJSON adaptador = new AdapterXMLaJSON(bibliotecaAnalisis, datosXML);

        String resultado = adaptador.obtenerDatos();
        System.out.println(resultado);
    }
}


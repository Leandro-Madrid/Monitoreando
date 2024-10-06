package ar.edu.davinci;

public class AdapterXMLaJSON implements DatosJSON {
    private BibliotecaAnalisis bibliotecaAnalisis;
    private String xmlData;

    public AdapterXMLaJSON(BibliotecaAnalisis bibliotecaAnalisis, String xmlData) {
        this.bibliotecaAnalisis = bibliotecaAnalisis;
        this.xmlData = xmlData;
    }

    @Override
    public String obtenerDatos() {

        String jsonData = parse(xmlData);
        return bibliotecaAnalisis.analizarDatos(jsonData);
    }

    private String parse(String xml) {

        return "{...}";
    }
}

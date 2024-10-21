package ar.edu.davinci;

public class AdapterXMLaJSON implements DatosJSON {
    private BibliotecaAnalisis bibliotecaAnalisis;

    public AdapterXMLaJSON(BibliotecaAnalisis bibliotecaAnalisis) {
        this.bibliotecaAnalisis = bibliotecaAnalisis;
    }

    @Override
    public String obtenerDatos(String xmlData) {
        String jsonData = parse(xmlData);
        return bibliotecaAnalisis.analizarDatos(jsonData);
    }

    private String parse(String xml) {
        return "{...}";
    }
}

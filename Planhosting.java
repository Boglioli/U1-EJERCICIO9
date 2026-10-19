public class Planhosting {
    private String nombreDominio;
    private int cantidadMaximaGB;
    private double espacioOcupadoGB;

    public Planhosting(String nombreDominio, int cantidadMaximaGB, double espacioOcupadoGB) {
        this.nombreDominio = nombreDominio;
        this.cantidadMaximaGB = cantidadMaximaGB;
        this.espacioOcupadoGB = espacioOcupadoGB;
    }
    public void subirArchivo(double pesoGB) {
        if (pesoGB <= 0) {
            System.out.println("el peso del archivo debe ser mayor a 0.");
        } else if (espacioOcupadoGB + pesoGB <= cantidadMaximaGB) {
            espacioOcupadoGB += pesoGB;
            System.out.println("archivo subido correctamente, espacio ocupado: " + espacioOcupadoGB + " GB ");

        } else {
            System.out.println("No hay suficiente espacio disponible para subir el archivo." + " se supera la capacidad maxima");

        }
    }
}

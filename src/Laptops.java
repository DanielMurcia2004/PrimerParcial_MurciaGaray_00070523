public class Laptops extends Articulo{
    //atributos
    String memoria;
    String marca;

    //constructores
    public Laptops(){}

    public Laptops(String nombreProducto, String modelo, String descripcion, float precio, int ID_Producto,String memoria, String marca) {
        super(nombreProducto, modelo, descripcion, precio,ID_Producto);
        this.memoria = memoria;
        this.marca = marca;
    }

    //getters y setters
    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //metodos
    void ObtenerPrecioLap(){

    }

    void MostrarDescripLap(){

    }
}

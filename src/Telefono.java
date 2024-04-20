public class Telefono extends Articulo{
    //atributos
    String marca;
    String  color;
    //constructores
    public Telefono(){}

    public Telefono(String nombreProducto,String modelo, String descripcion, float precio,int ID_Producto,String marca, String color) {
        super(nombreProducto,modelo, descripcion, precio, ID_Producto);
        this.marca = marca;
        this.color = color;
    }

    public Telefono(String nombreProducto, String modelo, String descripcion, float precio, int idProducto) {
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //metodos
    void mostrarDescripTelefono(){

    }
    void ObtenerPrecio(){

    }
    void MostrarDescripcionTelefono(){

    }

}

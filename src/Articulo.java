public abstract class Articulo {
    //atributos
    private String nombreProducto;
    private String modelo;
    private String descripcion;
    private float precio;
    private int ID_Producto;

    //constructoes
    public Articulo(){}

    public Articulo(String nombreProducto, String modelo, String descripcion, float precio,int ID_Producto) {
        this.nombreProducto = nombreProducto;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ID_Producto = ID_Producto;

    }

    //getters y setters
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }
}

package edu.umss.dip.svservice.dto;




import edu.umss.dip.svservice.model.Equipo;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

public class EquipoDto extends DtoBase<Equipo> {

    private Long categoriaId;
    private String modelo;
    private String codigo;
    private boolean vendido;
    private double precio;
    private String imagen;
    private String marca;
    private String descripcion;
    private long anio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getAnio() {
        return anio;
    }

    public void setAnio(long anio) {
        this.anio = anio;
    }

    @Override
    public EquipoDto toDto(Equipo element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setCategoriaId(element.getCategoria().getId());
        setImageBase64(element);
        return this;
    }

    private void setImageBase64(Equipo equipo) {
        if (equipo.getImagen() != null) {
            byte[] bytes = new byte[equipo.getImagen().length];
            for (int i = 0; i < equipo.getImagen().length; i++) {
                bytes[i] = equipo.getImagen()[i];
            }
            String imageStr = Base64.encodeBase64String(bytes);
            this.setImagen(imageStr);

        }
    }
}

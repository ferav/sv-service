

package edu.umss.dip.svservice.dto;


import edu.umss.dip.svservice.model.Categoria;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;

public class CategoriaDto extends DtoBase<Categoria> {

    private String nombre;
    private String url_Categoria;
    private String imagen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl_Categoria() {
        return url_Categoria;
    }

    public void setUrl_Categoria(String url_Categoria) {
        this.url_Categoria = url_Categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public CategoriaDto toDto(Categoria element, ModelMapper mapper) {
        super.toDto(element, mapper);
        if (element.getImagen() != null) {
            byte[] bytes = new byte[element.getImagen().length];
            for (int i = 0; i < element.getImagen().length; i++) {
                bytes[i] = element.getImagen()[i];
            }
            String imageStr = Base64.encodeBase64String(bytes);
            setImagen(imageStr);
        }
        return this;
    }

}

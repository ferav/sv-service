/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.svservice.dto;



import edu.umss.dip.svservice.model.Imagen;
import org.apache.tomcat.util.codec.binary.Base64;
import org.modelmapper.ModelMapper;


public class ImagenDto extends DtoBase<Imagen> {
    private Long equipoId;
    private String imagen;


    public Long getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(Long equipoId) {
        this.equipoId = equipoId;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public DtoBase toDto(Imagen element, ModelMapper mapper) {
        super.toDto(element, mapper);
        setEquipoId(element.getEquipo().getId());
        setImageBase64(element);
        return this;
    }

    private void setImageBase64(Imagen ImagenG) {
        if (ImagenG.getImagen() != null) {
            byte[] bytes = new byte[ImagenG.getImagen().length];
            for (int i = 0; i < ImagenG.getImagen().length; i++) {
                bytes[i] = ImagenG.getImagen()[i];
            }
            String imageStr = Base64.encodeBase64String(bytes);
            this.setImagen(imageStr);

        }
    }
}
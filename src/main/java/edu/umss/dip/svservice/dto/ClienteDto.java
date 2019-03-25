

package edu.umss.dip.svservice.dto;


import edu.umss.dip.svservice.model.Cliente;
import org.modelmapper.ModelMapper;

public class ClienteDto extends DtoBase<Cliente> {
    private String nombre;
    private String apellidos;
    private int ci;
    private String telefono;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public ClienteDto toDto(Cliente cliente, ModelMapper mapper) {
        super.toDto(cliente, mapper);
        return this;
    }
}

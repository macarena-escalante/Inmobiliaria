package ar.com.ada.api.inmobiliaria.entities.persona;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import ar.com.ada.api.inmobiliaria.entities.inmueble.Inmueble;

/**
 * Locador
 */
@Entity
@Table(name = "locador")
public class Locador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locador_id")
    private int locadorId;

    private String nombre;

    private String dni;

    private int telefono;

    private String email;

    private String direccion;

    @OneToMany(mappedBy = "locador", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Inmueble> inmuebles;

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
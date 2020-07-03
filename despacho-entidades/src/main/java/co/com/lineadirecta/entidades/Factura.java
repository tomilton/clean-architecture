package co.com.lineadirecta.entidades;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="Facturas")
public class Factura{

    @Id
    private String id;
    private Date creacion;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Caja> cajas;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public List<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(List<Caja> cajas) {
        this.cajas = cajas;
    }
}

package mx.ipn.dae.calmecac.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.ipn.dae.calmecac.model.Direccion;
import mx.ipn.dae.calmecac.model.Entidad;
import mx.ipn.dae.calmecac.model.MunicipioPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T18:31:30")
@StaticMetamodel(Municipio.class)
public class Municipio_ { 

    public static volatile SingularAttribute<Municipio, String> nbMunicipio;
    public static volatile SingularAttribute<Municipio, Entidad> entidad;
    public static volatile ListAttribute<Municipio, Direccion> direccionList;
    public static volatile SingularAttribute<Municipio, MunicipioPK> municipioPK;
    public static volatile SingularAttribute<Municipio, Boolean> stActivo;

}
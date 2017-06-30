package mx.ipn.dae.calmecac.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.ipn.dae.calmecac.model.Municipio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T18:31:30")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, Integer> idDireccion;
    public static volatile SingularAttribute<Direccion, String> txColonia;
    public static volatile SingularAttribute<Direccion, String> txNumeroInt;
    public static volatile SingularAttribute<Direccion, String> txCalle;
    public static volatile SingularAttribute<Direccion, String> txLocalidad;
    public static volatile SingularAttribute<Direccion, Municipio> municipio;
    public static volatile SingularAttribute<Direccion, String> txCp;
    public static volatile SingularAttribute<Direccion, String> txNumeroExt;

}
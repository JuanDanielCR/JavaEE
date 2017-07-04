package mx.ipn.dae.calmecac.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.ipn.dae.calmecac.model.Municipio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-04T18:38:19")
@StaticMetamodel(Entidad.class)
public class Entidad_ { 

    public static volatile SingularAttribute<Entidad, String> idEntidad;
    public static volatile SingularAttribute<Entidad, String> nbEntidad;
    public static volatile ListAttribute<Entidad, Municipio> municipioList;
    public static volatile SingularAttribute<Entidad, Boolean> stActivo;

}
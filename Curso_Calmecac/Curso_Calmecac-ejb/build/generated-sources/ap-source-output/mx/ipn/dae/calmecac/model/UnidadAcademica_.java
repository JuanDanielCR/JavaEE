package mx.ipn.dae.calmecac.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.ipn.dae.calmecac.model.Edificio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T18:31:30")
@StaticMetamodel(UnidadAcademica.class)
public class UnidadAcademica_ { 

    public static volatile SingularAttribute<UnidadAcademica, Integer> idUnidad;
    public static volatile SingularAttribute<UnidadAcademica, String> txClave;
    public static volatile SingularAttribute<UnidadAcademica, String> txAcronimo;
    public static volatile ListAttribute<UnidadAcademica, Edificio> edificioList;
    public static volatile SingularAttribute<UnidadAcademica, String> nombre;

}
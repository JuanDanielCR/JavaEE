package mx.ipn.dae.calmecac.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.ipn.dae.calmecac.model.Nivel;
import mx.ipn.dae.calmecac.model.UnidadAcademica;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T18:31:30")
@StaticMetamodel(Edificio.class)
public class Edificio_ { 

    public static volatile ListAttribute<Edificio, Nivel> nivelList;
    public static volatile SingularAttribute<Edificio, Integer> idEdifcio;
    public static volatile SingularAttribute<Edificio, UnidadAcademica> idUnidad;
    public static volatile SingularAttribute<Edificio, String> txObservacion;
    public static volatile SingularAttribute<Edificio, Integer> nuNivel;
    public static volatile SingularAttribute<Edificio, String> nbEdificio;

}
package mx.ipn.dae.calmecac.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.ipn.dae.calmecac.model.Nivel;
import mx.ipn.dae.calmecac.model.TipoActividad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-30T18:31:30")
@StaticMetamodel(Salon.class)
public class Salon_ { 

    public static volatile SingularAttribute<Salon, Integer> idSalon;
    public static volatile SingularAttribute<Salon, String> txObservacion;
    public static volatile SingularAttribute<Salon, TipoActividad> idTipo;
    public static volatile SingularAttribute<Salon, Boolean> stDiscapacidad;
    public static volatile SingularAttribute<Salon, Nivel> nivel;
    public static volatile SingularAttribute<Salon, String> nbSalon;
    public static volatile SingularAttribute<Salon, Integer> nuCapacidad;

}
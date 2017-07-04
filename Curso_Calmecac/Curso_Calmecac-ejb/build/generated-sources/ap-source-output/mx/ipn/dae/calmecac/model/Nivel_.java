package mx.ipn.dae.calmecac.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.ipn.dae.calmecac.model.Edificio;
import mx.ipn.dae.calmecac.model.NivelPK;
import mx.ipn.dae.calmecac.model.Salon;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-04T18:38:19")
@StaticMetamodel(Nivel.class)
public class Nivel_ { 

    public static volatile SingularAttribute<Nivel, NivelPK> nivelPK;
    public static volatile ListAttribute<Nivel, Salon> salonList;
    public static volatile SingularAttribute<Nivel, Edificio> edificio;

}
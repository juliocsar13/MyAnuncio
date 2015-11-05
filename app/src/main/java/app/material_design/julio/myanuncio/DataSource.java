package app.material_design.julio.myanuncio;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by (U) on 31/10/2015.
 */



public class DataSource {

    static List TipoAnuncio = new ArrayList<TipoAnuncio>();

    static{

        TipoAnuncio.add(new TipoAnuncio("EMPLEOS","0 avisos"));
        TipoAnuncio.add(new TipoAnuncio("ALQUILERES","0 avisos"));
        TipoAnuncio.add(new TipoAnuncio("AUTOMOVILES","0 avisos"));
        TipoAnuncio.add(new TipoAnuncio("INMUEBLES","0 avisos"));
        TipoAnuncio.add(new TipoAnuncio("VARIOS","0 avisos"));

    }

}
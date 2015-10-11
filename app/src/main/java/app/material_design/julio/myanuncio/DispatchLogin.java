package app.material_design.julio.myanuncio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseUser;

/**
 * Created by Julio on 10/10/2015.
 */
public class DispatchLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (ParseUser.getCurrentUser() != null) {
            // Start an intent for the logged in activity
            // iniciar una intencion para conectar a la actividad
            startActivity(new Intent(this, MapsActivity.class));
        } else {
            // Start and intent for the logged out activity
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}

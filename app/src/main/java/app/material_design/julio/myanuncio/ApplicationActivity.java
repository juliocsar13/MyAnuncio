package app.material_design.julio.myanuncio;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Julio on 10/10/2015.
 */
public class ApplicationActivity extends android.app.Application {

    public void onCreate() {
        Parse.initialize(this, getString(R.string.PARSE_APP_ID), getString(R.string.PARSE_CLIENT_ID));
    }
}
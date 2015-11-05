package fusster.eu.fuckandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class startscreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscreen);
    }
    public void connect(View view) {
        onClicks toast = new onClicks(this);
    }
}

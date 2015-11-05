package fusster.eu.fuckandroid;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
public class onClicks extends Activity {
        Context c;
        public void selfDestruct() {
            Toast.makeText(this.c, "sometext", Toast.LENGTH_SHORT).show();
        }
        public void connect() {

        }
        public onClicks(Context c) {
            this.c = c;
        }
    }

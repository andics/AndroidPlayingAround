 package fusster.eu.fuckandroid;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;

 /**
  * Created by Genata on 5.10.2015 г..
  */
 public class Methods extends Activity{
     Context c;
     public void selfDestruct() {
         Toast.makeText(this.c, "sometext", Toast.LENGTH_SHORT).show();
     }
     public void connect(View view) {

     }
     public Methods(Context c) {
         this.c = c;
     }
 }
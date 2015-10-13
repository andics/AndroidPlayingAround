 package fusster.eu.fuckandroid;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

 /**
  * Created by Genata on 5.10.2015 г..
  */
 public class Methods extends Activity{
     Context c;
     public void selfDestruct(Context c) {
         Toast.makeText(c, "sometext", Toast.LENGTH_SHORT).show();
     }
     public Methods(Context c) {
         this.c = c;
         selfDestruct(this.c);
     }
 }
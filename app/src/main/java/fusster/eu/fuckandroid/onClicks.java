package fusster.eu.fuckandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.InetAddress;
import java.net.UnknownHostException;

import fusster.eu.fuckandroid.GameClient.Server;
import fusster.eu.fuckandroid.GameClient.Target;
import fusster.eu.fuckandroid.GameClient.Utils;

public class onClicks extends Activity {
    Context c;
    public onClicks(Context c) {
        this.c = c;
    }
    public void toast(String t) {
        Toast.makeText(this.c, t, Toast.LENGTH_SHORT).show();
    }

    public void connect(View view) {
        TextView name = (TextView) findViewById(R.id.name);
        TextView ip = (TextView) findViewById(R.id.ip);
        Utils.name = name.toString().trim();
        try {
            Server.connect(InetAddress.getByName(ip.toString()), 9876);
        } catch (UnknownHostException e) {
            toast(e.getMessage());
        }
    }
    public void shoot() {
        startActivity(new Intent(this, Target.class));
    }
}

package fusster.eu.fuckandroid.GameClient;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import fusster.eu.fuckandroid.R;

public class Target extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        ListView targets = (ListView) findViewById(R.id.listView);
        ListAdapter adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Utils.players);
        targets.setAdapter(adapt);
    }
}

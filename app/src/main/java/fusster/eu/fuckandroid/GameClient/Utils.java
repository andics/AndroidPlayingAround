package fusster.eu.fuckandroid.GameClient;

import android.content.Context;
import android.widget.Toast;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String name;
    public static int ammo;
    public static int shieldsUsed;
    public static List<String> players = new ArrayList<>();
    public static void append(String str) {

    }
    public static void add(String name) {
        players.add(name);
    }
    public static String getTarget() {
        return null;
    }
}
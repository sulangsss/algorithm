package main.libs;

/**
 * Created by sulang on 16-9-5.
 */
public class LogUtils {
    public static void logi(String tag, String message) {
//        Logger.getGlobal().log(Level.INFO, tag + ":" + message);
        System.out.println(tag + ":" + message);
    }
}

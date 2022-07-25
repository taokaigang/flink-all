package day26.cScanner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 */
public class Logs {
    private static PrintStream printStream;
    private static SimpleDateFormat sdf;
    static {
        try {
            printStream = new PrintStream(new FileOutputStream("file\\day26\\logs", true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String format = "yyyy/MM/dd HH:mm:ss: ";
        sdf = new SimpleDateFormat(format);
    }

    public static void println(String msg) {
        printStream.println(sdf.format(new Date()) + msg);
    }
}

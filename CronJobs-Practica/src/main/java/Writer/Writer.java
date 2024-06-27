package Writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Writer {

    public void writeLine(String filePath, String line) {
        System.out.println("Attempting to write to file: " + filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(line);
            writer.newLine();
            System.out.println("Write successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getCurrentTimestampedLine(String message) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        return "[" + dtf.format(now) + "] " + message;
    }
}

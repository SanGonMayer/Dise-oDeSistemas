package Writer;

public class MainWriter {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java -jar MyWriterProject.jar <file-path> <message>");
            return;
        }

        String filePath = args[0];
        String message = args[1];
        System.out.println("File path: " + filePath);
        System.out.println("Message: " + message);

        Writer writer = new Writer();
        String line = Writer.getCurrentTimestampedLine(message);
        System.out.println("Generated line: " + line);

        writer.writeLine(filePath, line);
        System.out.println("Process completed");
    }
}

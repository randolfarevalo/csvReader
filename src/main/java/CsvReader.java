import java.io.*;
import java.util.*;

public class CsvReader {

    /***
     * Read the csv file content
     * @param fileName
     * @return
     */
    public List<List<String>> getCsvContent(String fileName)
    {
        int headerLine = 0;

        List<List<String>> records = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int currentLine = 0;

            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if(currentLine != headerLine) {
                    records.add(Arrays.asList(values));
                }
                currentLine++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records;
    }
}

import java.sql.SQLException;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        CsvReader reader = new CsvReader();

        List<List<String>> content = reader.getCsvContent("sample.csv");

        for(List<String> row : content){
            try {

            }
            catch (ArrayIndexOutOfBoundsException ioob) {
                System.out.println("there is no value for the specified index");
            }
        }

        try
        {
            OracleDbConnect db = new OracleDbConnect();
        } catch (SQLException e) {
            System.out.println("db connect error");
        }
    }
}

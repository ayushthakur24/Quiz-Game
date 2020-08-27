package Bean;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;

public class WriteJSONToFile {

	public static void writeJSON(JSONArray convertScoresToResultSet) {
		
		try (FileWriter file = new FileWriter(".\\Resources\\userResults.json")) {
			 
            file.write(convertScoresToResultSet.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }		
	}

}

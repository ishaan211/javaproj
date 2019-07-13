package highPerformanceAlgoImp;
import java.util.Arrays;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class Csv {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CSVReader reader = new CSVReader(new FileReader("path of csv"));
			String[] nextline;
			while((nextline = reader.readnext()) != null) {
				if(nextline != null) {
					System.out.println(Arrays.toString(nextline));
				}
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Inventory {
	private HashMap<Item, Integer> items;
	
	public Inventory(String database) {
		Scanner s = new Scanner(System.in);
		
		try {
			Scanner reader = new Scanner(new File("./" + database));
			if (reader.hasNext()) {
				reader.nextLine();
			}
			while (reader.hasNext()) {
				String line = reader.nextLine();
				String[] 
				
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("File mispelled or not found. Try again");
			s.close();
			return;
		} catch (ParseException e) {
			e.printStackTrace();
			s.close();
			return;
		}
	}
}

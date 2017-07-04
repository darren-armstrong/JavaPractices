import java.util.*;

public class Folders {

	public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {
		Collection<String> names = new ArrayList<String>();
		String name;
		String[] lines = xml.replaceAll("'", "\"").split("<");
		for(String line : lines){
			if(line.toLowerCase().contains("folder") && line.toLowerCase().contains("name")){
				name = line.substring(line.indexOf("=\""), line.lastIndexOf("\""));
				if(name.length() != 0 && (name.toLowerCase().charAt(0) == Character.toLowerCase(startingLetter))){
					names.add(name);
				}
			}
		}
		
		return names;
	}

}

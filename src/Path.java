import java.util.*;

public class Path {
	private String path;

	public Path(String path) {
       this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
    	Collection<String> newPathDir = Arrays.asList(newPath.split("/"));
    	if(!newPath.matches("[0-9]")){
    		if(newPath.charAt(0) == '/')
    			this.path = "/";
    		for(String dir : newPathDir){
    			if((dir.contains("..")) && this.path != "/"){
    				this.path = path.substring(0, path.lastIndexOf('/'));
    				continue;
    			}
    				
    			if(dir.matches("^[a-zA-Z]*$"))
    				if(this.path != "/")
    					this.path += "/" + dir;
    				else
    					this.path += dir;
    		}
    	}
       
       
    }

}

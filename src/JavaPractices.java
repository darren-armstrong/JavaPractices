import java.util.Collection;

public class JavaPractices {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Path path = new Path("/a/b/c/d");
        path.cd("../x/./gygyg/yh/../d");
        System.out.println(path.getPath());
	}

}

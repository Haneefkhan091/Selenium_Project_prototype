package DataDriveIndpendent;

import java.io.IOException;
import java.util.ArrayList;

public class AccessDDD {
public static void main(String[] args) throws IOException {
	DD data= new DD();
	ArrayList d =  data.getData("Add signUP");
	
	System.out.println(d.get(0));
	System.out.println(d.get(1));
	System.out.println(d.get(2));
	System.out.println(d.get(3));
}
}

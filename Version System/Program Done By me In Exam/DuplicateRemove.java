import java.util.*;

public class DuplicateRemove{

 public static void main(String[] args){
 	List<String> x = new ArrayList<String>();
	
	x.add("Hello");
	x.add("Hello");
	x.add("World");
	
	// Now Current String is "Hello Hello Wolrd"

	List<String> y = removeDupli(x);

	for(String a : y){
		System.out.print(a + " ");
	}

	// Now Current String is "Hello Wolrd"
 }

 public static List<String> removeDupli(List<String> x){
 	List<String> y = new ArrayList<>();

	for(String a : x){
		if(!y.contains(a)){
			y.add(a);
		}
	}

	return y;
 }

}
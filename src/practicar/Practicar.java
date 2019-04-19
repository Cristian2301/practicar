package practicar;

public class Practicar {
	String a = "abc"; 
	String s = "a"; 
	String t;
	
	public Integer cantidadLetrasS() {
		return s.length();
	}
	
	
	public Integer cantidadLetrasT() {
		return t.length();
	}
	
	
	public Integer indexOfLibertad() {
		return "Libertad".indexOf("t"); 
	}
	
	
	public Integer lastIndex() {
		return "Universidad".lastIndexOf('i'); 
	}
	
	
	public String subString() {
		return "Quilmes".substring(2,4); 
	}
	
	public Boolean empiezaCon() {
		return (a.length() + a).startsWith("a"); 
	}
	
	
	public Boolean esIgual() {
		return s == a; 
	}
	
	public Boolean substringIgual() {
		return a.substring(1,3).equals("bc");
	}
	
}







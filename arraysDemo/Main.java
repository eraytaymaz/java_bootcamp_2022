package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String ogrenciler[] = new String[4];
		ogrenciler[0] = "Eray";
		ogrenciler[1] = "Berkay";
		ogrenciler[2] = "Alperen";
		ogrenciler[3] = "Tamer";
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}

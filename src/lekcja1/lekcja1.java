package lekcja1;

public class lekcja1 {

	public static void main(String[] args) {
		
		int x;
	
		
		System.out.println("Hello world");


		student st1=new student();
		student st2=new student();
		
		st1.wiek=44;
		st1.imie="Henio";
		st1.nazwisko="Moczyg¹bka";
		
		st2.wiek=22;
		st2.imie="Zyghfryd";
		st2.nazwisko="Vonjungingen";
		
		System.out.println("student 1 Imie: "+st1.imie +" \nNazwisko: " +st1.nazwisko);
		
		
		for (x=0; x<10; x++) { 
		 
			System.out.println("\n"+x);
		}
		}
		
	}


package InicioPaquete;

public class Principal {

	public static void main(String[] args) {
		
		Autor autor1=new Autor();
		autor1.setNombre("Pepe");	autor1.setEdad(30);

		Autor autor2=new Autor("Juan", 45);
		
		Libro libro1=new Libro();
		libro1.setTitulo("La familia");		
		libro1.setAutor(autor1);
		
		Libro libro2=new Libro("El camino", autor2);
		
		Libro libro3=new Libro("El sol");		
		libro3.setAutor(autor2);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro3.toString());
		
		System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
		System.out.println("Se presta el libro 1");
		libro1.prestar();
		System.out.println(libro1.toString());
		
		System.out.println("se devuelve el libro 1");
		libro1.devolver();
		
		System.out.println(libro1.toString());
		
		
		
	}

}

package cargarTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class cargarTest {

	static ArrayList<Test> listadoTest = new ArrayList<Test>();
	
	final static String INGLES = "INGLES";
	final static String TITULO = "TITULO";
	final static String PREGUNTA = "Pregunta:";
	final static String RESPUESTA = "Respuesta:";
	final static String ENUNCIADO = "Enunciado:";
	final static String EXPLICACION = "Explicacion:";

	public static void main(String[] args) {
		
     	System.out.println("Carga de test");
		System.out.println(" ");
		String carpeta = "F:\\Eclipse\\Eclipse IDE\\workSpace\\Test-Fran-Definitivo\\programa\\src\\resources\\testIngles";

		// Invoco a la función para "leer"
		listFilesForFolder(new File(carpeta));
		System.out.println("Fin ejecucion");
	}

	// recorre los ficheros y los lee.
	public static void listFilesForFolder(File folder) {
		int aux = 0;
		for (final File fileEntry : folder.listFiles()) {

			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);

			} else {
				System.out.println(fileEntry.getName());
				Path filePath = Paths.get(fileEntry.getAbsolutePath());
					try {
						String content = Files.readString(filePath);

						System.out.println(content);
					} catch (IOException e) {
						e.printStackTrace();
					}
				aux++;
			}
		}
		System.out.println("Total Files: " + aux);
	}

////instancia primer objeto
//		Test miObjetoTest = new Test();
//
//		miObjetoTest.setTituloTest("este es un titulo del test");
//
//		listadoTest.add(miObjetoTest);
//
//		
////instancia segúndo objeto		
//		Test miObjetoTest2 = new Test();
//
//		miObjetoTest2.setTituloTest("este es un titulo del test2");
//		
//		listadoTest.add(miObjetoTest2);

}

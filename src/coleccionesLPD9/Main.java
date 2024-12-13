package coleccionesLPD9;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> diccionarioEspIng = new HashMap<>();
		diccionarioEspIng.put("gato","cat");
        diccionarioEspIng.put("corazon","heart");
        diccionarioEspIng.put("comida","food");
        diccionarioEspIng.put("cantar","sing");
        diccionarioEspIng.put("cama","bed");
        diccionarioEspIng.put("celular","phone");
        diccionarioEspIng.put("ventana","window");
        diccionarioEspIng.put("mano","hand");
        diccionarioEspIng.put("falda","skirt");
        diccionarioEspIng.put("avena","oatmeal");
        diccionarioEspIng.put("silla","chair");
        diccionarioEspIng.put("piso","floor");
        diccionarioEspIng.put("cuarto","room");
        diccionarioEspIng.put("maquillaje","makeup");
        diccionarioEspIng.put("aguacate","avocado");
        diccionarioEspIng.put("platano","banana");
        diccionarioEspIng.put("rojo","red");
        diccionarioEspIng.put("azul","blue");
        diccionarioEspIng.put("uno","one");
        diccionarioEspIng.put("mesa","table");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español");
        String respuestaUsuario = scanner.nextLine().trim().toLowerCase();
        
        if(diccionarioEspIng.containsKey(respuestaUsuario)) {
        	System.out.println("La traducción de " + respuestaUsuario +" "+ diccionarioEspIng.get(respuestaUsuario));
        }else {
        	System.out.println("La palabra no es encuentra en el diccionario");
        }
        scanner.close();
	}

}

package com.generation.clase1602;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase1602Application {

    /* condicionales en JS
	 * if(condicion){
	 * se ejecuta aqui si se cumple la condicion
	 * }else if(condicion) {
	 * si no se cumple lo de arriba pero la de aqui, entra aqui 
	 * }else{
	 * si no se cumple ninguna de las condiciones anteriores, se realiza esta opcion
	 * }
	 * esto se escribe y funciona exactamente igual en JAVA
	 */

	 /*cuales son los ciclos que conocemos
	  * For, while, do...while
	  * for en JS (sabemos cuantas veces se va a repetir el ciclo)(el for se puede ocupar con 
	            cualquier cosa no solo con los arrays)
	   for (let i = 0; condicion (ej i<10); i++){
	   mientras la condicion sea verdad, esto se va a ejecutar
	  }
	  * while en JS (no sabemos exactamente cuantas veces se repetira el ciclo, pero si se sabe
	    cuando va a terminar)
	  while(condicion){
		mientras la condicion sea verdad, esto se va a ejecutar
	  }
	  * do...while en JS (haz esto y mientras esto sea verdad repitelo)
	  do{
        entra al menos una vez y luego comprueba la condicion y si es verdadera vuelve a iterar
	  }while (condicion);

	  -------------------------------------------------------

	  *los while se escriben exactamente igual en JAVA, pero el for cambia LEVEMENTE
      for (int i = 0; condicion; i++){
		mientras la condicion sea verdad , esto se va a ejecutar 
	  }

	  */

	  /*------------------------------------------------------------
	  /*2DA PARTE DE LA CLASE */

	  /*Como se escribian los arrays en JS
	   * const nomArray = [];
	   * Array en JAVA
	   * paso 1: importar libreria de array (import java.util.ArrayList;)
	   * primero definimos el tipo de dato (arrayList)
	   * luego definimos el tipo de dato QUE VA A CONTENER  el arrayList
	   * luego se le entrega el nombre y se inicializa con el new
	   * ArrayList <String> nomArrayString = new ArrayList<String>();
	   * ArrayList <Integer> nomArrayInt = new ArrayList<Integer>();
	   * Este es un ejemplo de ArrayList<String>
	   * ["String1", "String2", "String3"]
	   * ["String2", 2, "otro string"] -> esto esta malo, porque tiene un valor int
	   * Este es un ejemplo de ArrayList<Integer>
	   * [1, 2, 4, 14]
	   * [1, 2, 4.4, 7] -> esto esta malo, porque tiene un valor Double dentro de un Array de Strings 
	   * 
	   * 
	   * FUNCIONALIDADES PARA LOS ARRAYLIST
	   * 
	   * para agregar datos a un ArrayList 
	   * nomArrayString.add("palabra");
	   * 
	   * para obtener el valor que existe en un indice predeterminado
	   * nomArrayString.get(0); (donde 0 es el indice que yo voy a buscar)
	   * 
	   * para cambiar un dato en especifico segun su indice
	   * nomArrayString.set(0, "newString1"); (donde 0 es el indice que yo voy a cambiar y
	   * "new String1" sera la nueva palabra)
	   * 
	   * para remover o eliminar un dato segun su indice
	   * nomArrayString.remove(0); donde 0 es el indice
	   * 
	   * para limpiar un arrayList COMPLETO, BORRA TODOO
	   * nomArrayString.clear();
	   * 
	   * para obtener la cantidad de datos que tiene un arrayList
	   * nomArrayString.size();
	   * 
	   * HashMap
	   * para poder ocupar HashMap debemos primero importar su libreria 
	   * (import java.util.HashMap;)
	   * para poder definir un HashMap, se hace de la siguiente forma
	   * HashMap <String, Double> nomHashMap = new HashMap<String, Double>()
	   * ejemplo de como se veria en consola
	   * (si yo lo defino como un double, string o lo que sea todos los datos tienen que ser lo que se definio)
	   * [
	   * {"pamela": 4.0}
	   * {"fabian": 6.8}
	   * {"diego": 6.5}
	   * ]
	   * 
	   * como ingresamos datos al HashMap
	   * nomHashMap.put("Danissa", 6.2);
	   * nomHashMAP.Put("Camila", 6.3);
	   * 
	   * como obtener datos segun la llaver
	   * nomHashMap.get("Fabian")
	   * //devuelve -> 6.8
	   * 
	   * Como podemos remover datos segun una llave
	   * nomHashMap.remove("pamela");
	   * 
	   * como limpiar todos los valores de un HashMap
	   * nomHashMap.clear();
	   * 
	   * como obtengo el valor total de los datos que tengo en un HashMap
	   * nomHashMap.size();
	   * 
	   * Como iterar un HashMap obteniendo la llave y el valor manda el tipo de dato de la llave
	   * for(String i : nomHashMap.keySet()){
	   * System.out.printIn("Key: " + i + "valor: "+ nomHashMap.get(i));
	   * }
	   */
	   }
	   
	




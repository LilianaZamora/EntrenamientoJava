package JavaCollection;

import java.util.*;

public class ColeccionesJava {

	public static void main(String[] args) {

		System.out.println("-------------LIST-------------");	
		//Lista dinámica
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Uno");
		arrayList.add("Dos");
		arrayList.add("Tres");
		System.out.println("ArrayList: " + arrayList);
		arrayList.remove("Tres");		
		arrayList.set(1,"Cuatro");
		System.out.println("ArrayList: " + arrayList);
		
		//Lista doblemente enlazada
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Uno");
		linkedList.add("Dos");
		linkedList.add("Tres");
		System.out.println("LinkedList: " + linkedList);
		linkedList.remove(1);		
		linkedList.remove("Uno");	
		System.out.println("LinkedList: " + linkedList);
		
		System.out.println("-------------SET-------------");	
		//No mantiene el orden, no permiote duplicación, calcula su hassCode y lo usa para determinar en qué casilla
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Manzana");
		hashSet.add("Pera");
		hashSet.add("Banano");
		hashSet.add("Nueces");
		System.out.println("HashSet: " + hashSet);	
		
		//TreeSet
		//No acepta repetidos y mantiene el orden alfabético
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Manzana");
		treeSet.add("Banano");
		treeSet.add("Naranja");
		treeSet.add("Manzana");
		treeSet.add("Aguacate");
		treeSet.add("Uva");
		treeSet.remove("Uva");
		System.out.println("TreeSet: " + treeSet);	
		
		//Mantiene orden de inserción, lista doblemente enlazada
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Manzana");
		linkedHashSet.add("Banano");
		linkedHashSet.add("Naranja");
		linkedHashSet.add("Limón");
		System.out.println("LinkedHashSet: " + linkedHashSet);	
		
		System.out.println("-------------QUEUE-------------");
		//Orden natural, ordena por elemento mínimo por defecto
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(30);
		priorityQueue.add(28);
		priorityQueue.add(2);
		priorityQueue.add(50);
		priorityQueue.add(7);
		priorityQueue.add(1);
		System.out.println("Queue: " + priorityQueue);		
		
		//Orden natural, ordena por elemento mínimo por defecto
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Frente");
		arrayDeque.addLast("Final");
		arrayDeque.addFirst("Inicio");
		System.out.println("ArrayDeque: " + arrayDeque);	
		
		System.out.println("-------------MAP-------------");
		
		//Sin orden garantizado
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Tres");
		hashMap.put(1, "Uno");
		hashMap.put(2, "Dos");
		System.out.println("HashMap: " + hashMap);	
		
		//Orden por clave
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(3, "Tres");
		treeMap.put(1, "Uno");	
		treeMap.put(4, "Cuatro");	
		treeMap.put(2, "Dos");
		treeMap.put(6, "Seis");			
		System.out.println("TreeMap: " + treeMap);	
		
		//Mantiene orden de inserción
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(3, "Tres");
		linkedHashMap.put(1, "Uno");	
		linkedHashMap.put(4, "Cuatro");	
		linkedHashMap.put(2, "Dos");
		linkedHashMap.put(6, "Seis");			
		System.out.println("LinkedHashMap: " + linkedHashMap);	
	}
}

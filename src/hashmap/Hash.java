package hashmap;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Hash {
	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();
		
		/* HASHMAP
		 * put(key, value) -> adicionar um elemento em uma chave
		 * remove(key) -> remove um elemento
		 * contains(key) -> verifica se ha uma chave na lista
		 * get(key) -> retorna o valor de uma chave
		 * clear() -> limpa um conjunto
		 * size() -> retorna o valor de uma lista
		 * keySet() -> retorna um set com as chaves contidas no map
		 * values() -> retorna um Collection<V>
		 */
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}
}

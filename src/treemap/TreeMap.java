package treemap;

import java.util.Map;

public class TreeMap {

	public static void main(String[] args) {
		
		// tree map
		/* put(key, value) -> insere um elemento em uma chave
		 * remove(key) -> remove uma chave
		 * containsKey(key) -> verifica se existe uma dada chave
		 * get(key) -> recupera um elemento através de uma chave
		 * clear() -> limpa o conjunto
		 * size() -> obtem o tamanho do conjunto
		 * keySet() - retorna um set com as chaves do map
		 * values() - retorna uma coleção do tipo valor
		 */
		
		Map<String, String> map = (Map<String, String>) new TreeMap();
		Map<String, String> cookies = map;
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "98956557");
		
		cookies.remove("email");
		
		System.out.println("ALL COOKIES");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		

	}

}

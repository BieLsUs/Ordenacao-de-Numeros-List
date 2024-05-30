import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	private List<Integer> numeroOrdenados;
	
	public OrdenacaoNumeros() {
		this.numeroOrdenados = new ArrayList<>();
	}
	
	
	public void adicionarNumero(int numero) {
		this.numeroOrdenados.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numeroAscendente = new ArrayList<>(this.numeroOrdenados);
		if(!numeroOrdenados.isEmpty()) {
			 Collections.sort(numeroAscendente);
		}else {
			System.out.println("Lista vazia!");
		}
		return numeroAscendente;
	}
	
	public List<Integer> ordenarDescendente() {
		List<Integer> numeroDescendente = new ArrayList<>(this.numeroOrdenados);
			
		if(!numeroOrdenados.isEmpty()) {
			numeroDescendente.sort(Collections.reverseOrder());
		}else {
			System.out.println("Lista vazia!");
		}
		return numeroDescendente;
	}
	
	
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
		
		
		ordenacaoNumeros.adicionarNumero(9);
		ordenacaoNumeros.adicionarNumero(-2);
		ordenacaoNumeros.adicionarNumero(1);
		ordenacaoNumeros.adicionarNumero(-1);
		ordenacaoNumeros.adicionarNumero(10);
		
		System.out.println(ordenacaoNumeros.ordenarAscendente());
		System.out.println(ordenacaoNumeros.ordenarDescendente());
	
	}
	
	
}

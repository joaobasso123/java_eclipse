package curso_orientado_objeto;

public class SplitStringVet {

	public static void main(String[] args) {
		String s = "potato apple lemon orange";
		
		String[] vet = s.split(" ");
		
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
		System.out.println(vet[3]);
	}

}

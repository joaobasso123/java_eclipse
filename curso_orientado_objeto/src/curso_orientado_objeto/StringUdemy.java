package curso_orientado_objeto;

public class StringUdemy {

	public static void main(String[] args) {
String original = "abcde FGHIJ ABC abc DEFG" ;
		
		String s01 = original.toLowerCase(); //deixa tudo em maiusculo
		String s02 = original.toUpperCase(); //deixa tudo em minusculo
		String s03 = original.trim(); //trim remove espaços
		String s04 = original.substring(2);//mostra as letras a partir do (2) no caso do "c" em diante
		String s05 = original.substring(2,9);//mostra as letras a partir do (2 ate o 9)
		String s06 = original.replace('a','x');// sempre que achar um "a" minusculo troca por "x" minusculo
		String s07 = original.replace("abc", "xy"); //funciona também com substring
		int i = original.indexOf("bc");// primeira ocorrencia do "bc" i passa a valer = 1 em diante
		int j = original.lastIndexOf("bc");// ultima ocorrencia do "bc" j passa a valer = 17 antes
		
		System.out.println("Original: - " + original + " -");
		System.out.println("toLowerCase: - " + s01 + " -");
		System.out.println("toUpperCase: - " + s02 + " -");
		System.out.println("trim: - " + s03 + " -"); 
		System.out.println("substring(2): - " + s04 + " -");
		System.out.println("substring(2,9): - " + s05 + " -");
		System.out.println("replace('a','x'): - " + s06 + " -");
		System.out.println("replace(abc,xy): - " + s07 + " -");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last Index Of(bc): " + j);
	}

}

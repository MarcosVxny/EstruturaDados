package EstruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String nomeLivro;
		int opcao;
		
		Stack<String> listaLivros = new Stack<>();
		
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("                                                  ");
			System.out.println("                    BIBLIOTECA                    ");
			System.out.println("                                                  ");
			System.out.println("--------------------------------------------------");
			System.out.println("(1) Adicionar livros..............................");
			System.out.println("(2) Listar todos os livros........................");
			System.out.println("(3) Retirar livro.................................");
			System.out.println("(0) Sair..........................................");
			System.out.println("--------------------------------------------------");
			System.out.println("\nPor favor, digite sua opção: ");
			opcao = leia.nextInt();
			leia.nextLine();
		
			switch(opcao) {
			
			case 0:
			System.err.println("\nPrograma Finalizado !!!!");
			break;
			
			case 1:
				System.out.println("\nInforme o nome do livro para adiciona-lo");
				nomeLivro = leia.nextLine();
				listaLivros.add(nomeLivro);
				break;
			case 2:
				if (!listaLivros.isEmpty()) {
					System.out.println("Os livros sao:");
					System.out.println(listaLivros);
				}else {
					System.err.println("\nNao ha nenhum livro");
				}
			case 3:
				if (!listaLivros.isEmpty()) {
					System.out.println("\nInforme o livro que queira remover: ");
					String nomeLivroARemover = leia.nextLine();
					if (listaLivros.contains(nomeLivroARemover)) {
					listaLivros.remove(nomeLivroARemover);
					}else {
						System.out.println("\nLivro nao encontrado!!");
					}
				}else {
					System.out.println("\nA lista esta vazia");
				}
				break;
				default:
					System.err.println("\nOpcao Invalida");
			}
			
			}while(opcao != 0);
		leia.close();

      }					
			
}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	



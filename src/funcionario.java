import java.util.Locale;
import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// VARIAVEIS //
		String nome;
		int horasTrabalhadas, opcaoMenu;
		horasTrabalhadas = 0;
		double valorHora = 0.0;
		char opcao;
		
		boolean boleana = true;
		while(boleana) {
			System.out.println("Nome: ");
			nome = sc.next();
			
			System.out.println("Horas trabalhadas: ");
			horasTrabalhadas = sc.nextInt();
			while(horasTrabalhadas < 0) {
				System.out.println("Horas trabalhadas precisa ser POSITIVAS. Tente novamente: ");
				horasTrabalhadas = sc.nextInt();
			}
			
			System.out.println("Valor por hora: ");
			valorHora = sc.nextDouble();
			while(valorHora < 0) {
				System.out.println("Valor por hora precisa ser POSITIVO. Tente novamente: ");
				valorHora = sc.nextDouble();
			}
			
			System.out.println("Digitar outro (S/N)? ");
			opcao = sc.next().charAt(0);
			opcao = Character.toLowerCase(opcao);
			if(opcao == 's') {
				boleana = true;
			}else if(opcao == 'n') {
				boleana = false;
			}
		}
		
		boolean boleanMenu = true;
		while(boleanMenu) {
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("1 - Total de horas trabalhadas");
			System.out.println("2 - Custo total");
			System.out.println("3 - Nome da pessoa que ganhou mais");
			System.out.println("4 - Sair");
			opcaoMenu = sc.nextInt();
			
			if(opcaoMenu == 4) {
				boleanMenu = false;
			}
		}
		
		System.out.println(" ");
		System.out.println("FIM DO PROGRAMA!");
		
		sc.close();
	}

}

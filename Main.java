
import java.util.Scanner;
import java.util.Date;

public class Main {
	public static void main(String[] args){
		System.out.println(" Programa de agenda em Java, Aqui você poderá se organizar colocando suas atividades do dia ");

		Date date = new Date();

		System.out.printf( "%s %tB %<te, %<tY", "Due date:", date );

		Scanner input = new Scanner(System.in);

		String descricaoAtividade;
		int horas;
		int minutos;
		int tempoDoDia;

		System.out.println(" \n O que você tem pra fazer hoje?");
		descricaoAtividade = input.nextLine();

		System.out.println( "  Resposta da primeira pergunta: " + descricaoAtividade );

	}
}

import java.util.Scanner;
/*
 * impact factor = citations / no of articles
 * 1 bribe = 1 citation
 * no of bribes  = impact factor * no of articles
 * but since impact factor is round up, formula is no of articles *(impact factor -1) + 1
 */
public class Faktor {
	int impact;
	int articles;
	int citations;
	public int bribes(int art, int imp) {
		if(art<1 || art > 100 || imp<1 || imp>100) {
			System.out.println("Error! Input exceeds bounds!!");
		}
		return (art*(imp-1))+1;
	}
	public static void main(String[] args) {
		Faktor faktor = new Faktor();
	//System.out.println("Enter desired articles, and required impact factor: ");
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	String[] pair = input.split(" ");
	faktor.articles = Integer.parseInt(pair[0].trim());
	faktor.impact = Integer.parseInt(pair[1].trim());
	faktor.citations = faktor.bribes(faktor.articles, faktor.impact);
	System.out.println(faktor.citations);
	}
}

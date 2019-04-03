import java.util.Scanner;
public class Controller {
	static View view=new View();
	static Model model=new Model();
	//(1) Wprowadz macierze wejsciowe
	private static void enterMatrix(Scanner scanner) {
		view.diplayRequest("liczbe wierszy macierzy A");
		int a=scanner.nextInt();
		view.diplayRequest("liczbe kolumn macierzy A");
		int b=scanner.nextInt();
		view.diplayRequest("liczbe wierszy macierzy B");
		int c=scanner.nextInt();
		view.diplayRequest("liczbe kolumn macierzy B");
		int d=scanner.nextInt();
		model.create('A',a, b);
		model.create('B',c, d);
		model.fillMatrix('A');
		model.fillMatrix('B');
		menu();
	}
	//(2) Operacje arytmetyczne
	private static void aritmeticOperation(Scanner scanner) {
		view.displayArithmeticOperation();
		switch(scanner.nextInt()) {
		case 1: transposingMatrixs(); break;
		case 2: multiplyMatrixs(); break;
		case 3: transposingMatrix(); break;
		default: view.displayError(); aritmeticOperation(scanner);break;
		}
	}
	//(3) Wyswietl macierze
	private static void displayMatrixs(Scanner scanner) {
		view.displayMatrixs();
		switch(scanner.nextInt()) {
		case 1: view.displayMatrix(model.getMatrix('A')); view.displayMatrix(model.getMatrix('B')); break;
		case 2: view.displayMatrix(model.getMatrix('C')); break;
		default: view.displayError(); displayMatrixs(scanner);break;
		}
		menu();
	}
	private static void transposingMatrixs() {
		model.transposingMatrix('A');
		model.transposingMatrix('B');
		menu();
	}
	private static void multiplyMatrixs() {
		model.multyplyMatrixs();
		menu();
	}
	private static void transposingMatrix() {
		model.transposingMatrix('C');
		menu();
	}
	public static void menu() {
		Scanner scanner=new Scanner(System.in);
		view.displayMenu();
		switch(scanner.nextInt()) {
			case 1: enterMatrix(scanner); break;
			case 2: aritmeticOperation(scanner); break;
			case 3: displayMatrixs(scanner); break;
			default: view.displayError(); menu();
		}
		scanner.close();
	}
	public static void main(String[] args) {
		menu();
	}

}

import static java.lang.System.out;
public class View {
	//wyswietlanie menu glownego
	public void displayMenu() {
		out.println("1. Wprowadz macierze wejsciowe.");
		out.println("2. Operacje arytmetyczne.");
		out.println("3. Wyswietl macierze.");
	}
	//wyswietlanie opcji operacji arytmetycznych
	public void displayArithmeticOperation() {
		out.println("1. Transponuj macierze wejsciowe.");
		out.println("2. Pomnoz macierze wejsciowe");
		out.println("3. Transponuj macierz wynikowa");
	}
	//wyswietlanie opcji wyswietlenia macierzy
	public void displayMatrixs() {
		out.println("1. Wyswietl macierze wejsciowe.");
		out.println("2. Wyswietl macierz wynikowa");
	}
	//wyswietlenie macierzy
	public void displayMatrix(Matrix m) {
		if(m!=null) {
			out.println("Macierz:");
			m.displayMatrix();
		}
		else {System.err.println("Brak macierzy!");}
	}
	//wyswietlanie informacji o bledzie
	public void displayError() {
		System.err.println("BLAD");
	}
	//wyswietlenie prosby o podanie parametrow
	public void diplayRequest(String s) {
		out.println("Podaj "+s);
	}
}

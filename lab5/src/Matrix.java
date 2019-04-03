import java.util.Scanner;
import static java.lang.System.out;
public class Matrix {
	int m;//liczba wierszy
	int k;//liczba kolumn
	int[][] elements;//elementy macierzy
	//konstruktor
	public Matrix(int m, int k){this.m=m;this.k=k;this.elements=new int[m][k];}
	//transponowanie macierzy
	public int[][]transposing() {
		int[][] newElements=new int[k][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<k;j++) {
				newElements[j][i]=elements[i][j];
			}
		}
		return newElements;
	}
	//wypelnienie macierzy
	public void fillElements() {
		Scanner scanner=new Scanner(System.in);
		out.println("Podaj wartosci elementow macierzy:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<k;j++) elements[i][j]=scanner.nextInt();
		}
		
	}
	//wyswietlenie macierzy
	public void displayMatrix() {
		for(int i=0;i<m;i++) {
			for(int j=0;j<k;j++) out.print(elements[i][j]);
			out.println();
		}
	}
	//ustawienie wartosci wszystkich elementow
	public void setElements(int[][] elements) {this.elements=elements;}
	public int getDimensions(char s) {
		if(s=='m') {return this.m;}
		if(s=='k') {return this.k;}
		return -1;
	}
	public int getElement(int i, int j) {return this.elements[i][j];}
	public void setRows(int m) {this.m=m;}
	public void setColumns(int k) {this.k=k;}
}

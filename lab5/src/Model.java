public class Model {
	private Matrix A;
	private Matrix B;
	private Matrix C;
	private View view=new View(); 
	public void create(char s, int rows, int columns) {
		if(s=='A') {A=new Matrix(rows,columns);}
		if(s=='B') {B=new Matrix(rows,columns);}
	}
	public void fillMatrix(char s) {
		if(s=='A') {A.fillElements();}
		if(s=='B') {B.fillElements();}
	}
	public Matrix getMatrix(char s) {
		if(s=='A') {return A;}
		if(s=='B') {return B;}
		if(s=='C') {return C;}
		return null;
	}
	public void transposingMatrix(char s) {
		int k,m;
		if(s=='A') {
			if(A!=null) {
				A.setElements(A.transposing());
				k=A.getDimensions('k');
				m=A.getDimensions('m');
				A.setRows(k);
				A.setColumns(m);
			}
			else {System.err.println("Brak macierzy A");}
		}
		if(s=='B') {
			if(B!=null) {
				B.setElements(B.transposing());
				k=B.getDimensions('k');
				m=B.getDimensions('m');
				B.setRows(k);
				B.setColumns(m);
			}
			else {System.err.println("Brak macierzy B");}
		}
		if(s=='C') {
			if(C!=null) {
				C.setElements(C.transposing());
				k=C.getDimensions('k');
				m=C.getDimensions('m');
				C.setRows(k);
				C.setColumns(m);
			}
			else {System.err.println("Brak macierzy C");}	
		}
	}
	public void multyplyMatrixs() {
		if(A!=null && B!=null) {
		int sum=0;
		int[][] table=new int[A.getDimensions('m')][B.getDimensions('k')];
		for(int i=0;i<A.getDimensions('m');i++) {
			for(int j=0;j<B.getDimensions('k');j++) {
				for(int k=0;k<A.getDimensions('k');k++) {
					sum=sum+A.getElement(i,k)*B.getElement(k, j);
				}
				table[i][j]=sum;
				sum=0;
			}
		}
		C=new Matrix(A.getDimensions('m'),B.getDimensions('k'));
		C.setElements(table);
		}
		else {System.err.println("Brak macierzy A lub/i B");}
	}
}

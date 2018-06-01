import java.util.ArrayList;

public class tablero {
		
	private int[][] tablero;
    private boolean[] candidatos;
    private int suma=0;
    private int dim;
    private int cantTablero=0;
    
    public tablero(int k, int s, int dimension) {
    	this.tablero=new int[dimension][dimension];
    	this.candidatos=new boolean[k];
    	this.suma=s;
    	this.dim=dimension;
    }
    
    public void resolver() {
    	setCandidatos();
    	if (candidatos.length>(dim*dim)) {
    		result_backtracking(0,0);
		}else {
			System.out.println("Cantidad de numeros insuficiente");
		}
    	
    }
    
    public void setCandidatos() {
    	for (int i = 0; i < candidatos.length; i++) {
			candidatos[i]=true;
		}
    }
    
    public void result_backtracking(int row, int col){
    	for (int i = 1; i <=this.candidatos.length ; i++) {
			if (nroFactible(i)) {
				
				tablero[row][col]=i; 
				candidatos[i-1]=false;
				
				if (haySolucion()) {
					
					cantTablero+=1;
					System.out.println("\n");
					System.out.println("Solucion numero: "+cantTablero+" -------------");
					imprimirTablero();
					
				}else {
					
					if(col<(dim-1)) {
						
						result_backtracking(row,col+1);
					}else {
						
						if(row<(dim-1)) {
							result_backtracking(row+1,0);
						}
					}
				}
				
				tablero[row][col]=0;
				candidatos[i-1]=true;
				
			}
		}
    }
    public boolean haySolucion() {
    	for (int i = 0; i <dim; i++) {
			if (!filaValida(i)||!colValida(i)) {
				return false;
			}
			
		}
    	return true;
    }
    
    public boolean filaValida(int row) {
    	int suma=0;
    	for (int i = 0; i <dim; i++) {
			suma+=tablero[row][i];
		}
    	if (suma!=this.suma) {
			return false;
		}else {
			return true;
		}
    }

    public boolean colValida(int col) {
    	int suma=0;
    	for (int i = 0; i <dim; i++) {
			suma+=tablero[i][col];
		}
    	if (suma!=this.suma) {
			return false;
		}else {
			return true;
		}

    }
    public boolean nroFactible(int n) {
    	if (candidatos[n-1]==true) {
			return true;
		}
    	return false;
    }
    public void imprimirTablero() {
    	
    	for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    



}

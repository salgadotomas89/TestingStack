package cl.ubb.kata.stack.clase;

public class Stack {
	int tamaņoPila=0;
	boolean estado=true;
	int[] numeros=new int[2];
	
	public boolean esVacia() {				
		if(tamaņoPila==0){
			return estado;
		}else{
			estado=false;
			return estado;
		}		
	}

	public void push(int i) {			
		numeros[tamaņoPila]=i;//numeros[0]=i	
		tamaņoPila=tamaņoPila+1;//tamaņoPila aumenta en 1
				
	}
	
	public void push2(int i,int x) {	
		numeros[tamaņoPila]=i;
		tamaņoPila=tamaņoPila+1;
		numeros[tamaņoPila]=x;
		tamaņoPila=tamaņoPila+1;
		
	}
	
	public boolean tamaņoStackEs2(){
		if(tamaņoPila==2){
			estado=true;
			return estado;
		}else{
			estado=false;
			return estado;
		}
		
	}
}

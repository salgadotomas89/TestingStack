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
		numeros[tamaņoPila]=i;
		tamaņoPila=tamaņoPila+1;
	}
	
	public int tamaņo(){
		return tamaņoPila;
	}
	
	public int pop(int x){								
		return x;
	}
	
	public int top(int x){
		
		return x;
	}
	
}

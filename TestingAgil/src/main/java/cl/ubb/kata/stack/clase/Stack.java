package cl.ubb.kata.stack.clase;

public class Stack {
	int tamañoPila=0;
	boolean estado=true;
	int[] numeros=new int[2];
	
	public boolean esVacia() {				
		if(tamañoPila==0){
			return estado;
		}else{
			estado=false;
			return estado;
		}		
	}

	public void push(int i) {			
		numeros[tamañoPila]=i;
		tamañoPila=tamañoPila+1;
	}
	
	public int tamaño(){
		return tamañoPila;
	}
	
	public int pop(int x){								
		return x;
	}
	
	public int top(int x){
		
		return x;
	}
	
}

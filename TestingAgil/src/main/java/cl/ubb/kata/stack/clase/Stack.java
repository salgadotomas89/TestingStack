package cl.ubb.kata.stack.clase;

public class Stack {
	int tama�oPila=0;
	boolean estado=true;
	int[] numeros=new int[2];
	
	public boolean esVacia() {				
		if(tama�oPila==0){
			return estado;
		}else{
			estado=false;
			return estado;
		}		
	}

	public void push(int i) {			
		numeros[tama�oPila]=i;
		tama�oPila=tama�oPila+1;
	}
	
	public int tama�o(){
		return tama�oPila;
	}
	
	public int pop(int x){								
		return x;
	}
	
	public int top(int x){
		
		return x;
	}
	
}

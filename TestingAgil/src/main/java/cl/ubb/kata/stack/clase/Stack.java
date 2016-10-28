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
		numeros[tamañoPila]=i;//numeros[0]=i	
		tamañoPila=tamañoPila+1;//tamañoPila aumenta en 1
				
	}
	
	public void push2(int i,int x) {	
		numeros[tamañoPila]=i;
		tamañoPila=tamañoPila+1;
		numeros[tamañoPila]=x;
		tamañoPila=tamañoPila+1;
		
	}
	
	public boolean tamañoStackEs2(){
		if(tamañoPila==2){
			estado=true;
			return estado;
		}else{
			estado=false;
			return estado;
		}
		
	}
}

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
		numeros[tama�oPila]=i;//numeros[0]=i	
		tama�oPila=tama�oPila+1;//tama�oPila aumenta en 1
				
	}
	
	public void push2(int i,int x) {	
		numeros[tama�oPila]=i;
		tama�oPila=tama�oPila+1;
		numeros[tama�oPila]=x;
		tama�oPila=tama�oPila+1;
		
	}
	
	public boolean tama�oStackEs2(){
		if(tama�oPila==2){
			estado=true;
			return estado;
		}else{
			estado=false;
			return estado;
		}
		
	}
}

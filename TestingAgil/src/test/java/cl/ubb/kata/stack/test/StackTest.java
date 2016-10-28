package cl.ubb.kata.stack.test;
import cl.ubb.kata.stack.clase.Stack;
import static org.junit.Assert.*;
import org.junit.Test;


public class StackTest {
	@Test
	
	public void validarQuePilaVacia() {
		//arrange
		Stack pila = new Stack();
		boolean estado= true;
		
		//act
		estado=pila.esVacia();
		
		//assert
		assertEquals(true, estado);		
	}
	@Test
	public void agregarNumero1PilaNoEsVacia(){
		//arrange
		Stack pila= new Stack();
		
		//act
		pila.push(1);
		
		//assert
		assertEquals(false, pila.esVacia());		

	}
	
	@Test
	public void agregarNumero1YNumero2PilaNoEsvacia(){
		//arrange
		Stack pila=new Stack();
		//act
		pila.push2(1,2);
		//assert
		assertEquals(false, pila.esVacia());		

	}
	
	@Test
	public void agregar2NumerosTamañoEs2(){
		//arrange
		Stack pila= new Stack();
		//act
		pila.push2(1, 2);
		//assert
		assertEquals(true,pila.tamañoStackEs2());
	}
	
	
}

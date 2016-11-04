package cl.ubb.kata.stack.test;
import cl.ubb.kata.stack.clase.Stack;
import cl.ubb.kata.stack.clase.StackException;

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
		pila.push(2);
		
		//assert
		assertEquals(false, pila.esVacia());		

	}
	
	@Test
	public void agregarNumero1YNumero2PilaNoEsvacia(){
		//arrange
		Stack pila=new Stack();
		//act
		pila.push(1);
		pila.push(2);
		//assert
		assertEquals(false, pila.esVacia());		

	}
	
	@Test
	public void agregar2NumerosTamañoEs2(){
		//arrange
		Stack pila= new Stack();
		//act
		pila.push(1);
		pila.push(2);
		//assert
		assertEquals(2,pila.tamaño());
	}
	
	@Test
	public void agregar1NumeroHacerPopStackDevuelveNumero1(){
		//arrange
		Stack pila= new Stack();
		//act
		pila.push(1);
		int pop=pila.pop(1);
		//assert
		assertEquals(1,pop);
	}
	@Test
	 public void agregar1y2HacerPopStackDevuelveNumero2(){
		//arrange
		Stack pila= new Stack();
		//act
		pila.push(1);
		pila.push(2);
		//assert
		assertEquals(2,pila.pop(2));
	}
	//7
	@Test
	 public void agregar3y4HacerPop2VecesStackDevuelve4y3(){
		//arrange
		Stack pila= new Stack();
		//act
		pila.push(3);
		pila.push(4);
		
		//assert
		assertEquals(4,pila.pop(4));
		assertEquals(3,pila.pop(3));
	}
	/*
	@Test(expected=StackException.class)
	public void hacerPopEn1StackVacioLanzaError()throws StackException{
		//arrange
		Stack pila= new Stack();
		//act		
		pila.pop(1);
		//assert
		//assertEquals(4,pop);
	}*/
	
	@Test
	public void agregar1HacerTopDevuelve1(){
		//arrange
		Stack pila = new Stack();
		//act
		pila.push(1);
		//assert
		assertEquals(1,pila.top(1));
	}
	
	@Test
	public void agregar1y2HacerTopDevuelve2(){
		//arrange
		Stack pila = new Stack();
		//act
		pila.push(1);
		pila.push(2);
		//assert
		
		assertEquals(2,pila.top(2));
	}
	
	
}

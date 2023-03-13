package lambda;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p=new Persona() {
			@Override
			public void mensaje() {
				System.out.println("Soy el anónimo");
			}
		};
		Persona p2=new Persona();
		
		p.mensaje();
		p2.mensaje();
		
		IMiInterfaz i=new IMiInterfaz() {

			@Override
			public void m() {
				System.out.println("HOLA");
			}
			
		};//Por instrucción
		
		i.m();
		
		IMiInterfaz i2 = () -> System.out.println("Adíos");
		//Sintaxis simplificada para describir un método
		i2.m();
		
		IOperacionEntera suma=(a, b)->a+b, 
				resta=(a,b)->a-b;
		
		suma.operacion(2, 3);
		resta.operacion(3, 2); 
		
		BiFunction<Integer, Integer, Integer> suma2=(a, b)-> a+b;
		
		BiFunction<Integer, Integer, Double> division=(a, b)->(double)a/b;
		
		System.out.println(suma2.apply(2, 3));
		System.out.println(division.apply(10, 3));
		
		Predicate<String> masque5 = (s)-> {
			System.out.println(s.length()>5);
			return s.length()>5;
		};
		
		masque5.test("Hsddfola");
	}

}

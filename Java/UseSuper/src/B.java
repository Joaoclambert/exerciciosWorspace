
public class B extends A {

	int i; // ESTA VARIAVEL I OCULTA VAR DE A.

	B(int a, int b) {
		super.i = a; // i de A, aqui super.i referencia i de A.
		i = b; // i de B.
	}

	void show(){
		System.out.println("i in superclass (A): " + super.i);
		System.out.println("i in subclass (B): " + i);
	}
}
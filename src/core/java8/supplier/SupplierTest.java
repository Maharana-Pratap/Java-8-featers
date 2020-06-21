package core.java8.supplier;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> sup = () -> Math.random();
		DoubleSupplier sup2 = Math::random;
		
		System.out.println(sup.get());
		System.out.println(sup2.getAsDouble());
	}

}

package core.adapterEx;

public class BirdAdaptor implements Toy {

	Bird bird;
	
	BirdAdaptor(Bird bird) {
		this.bird=bird;
	}
	
	@Override
	public void createSound() {
		this.bird.speak();
	}

}

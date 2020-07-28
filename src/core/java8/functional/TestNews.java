package core.java8.functional;

interface News {
	void show(String name);
}

public class TestNews {

	public void showNews(News n) {
		n.show("Zee News");
	}
	
	public static void main(String[] args) {
		TestNews ts = new TestNews();
		ts.showNews((p1) -> System.out.println(p1));
	}
}

import java.time.LocalDate;

public class TestArticles {
	public static void main(String[] args) {
		LocalDate timeNow = LocalDate.now();
		Article A1 = new Article("Kwaku Bonsam", timeNow);
		A1.setnumLikes(3);
		System.out.println(A1.avgLikes());
	}
}

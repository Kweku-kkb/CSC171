/* Name: Kweku Ofori
 * NetID: kofori
 * Assignment Number: 3
 * Lab Section: MW 4:50pm
 * I did not collaborate with anyone on this assignment
*/
import java.time.LocalDate;

public class Article {
	
	private String author;
	private String text;
	private LocalDate date;
	private static int totalArticles;
	private static int numLikes;
	private static int numUnlikes;
	private static Article mostLikedArticle = new Article(null);
	private static Article mostUnlikedArticle = new Article(null);
	
	//constructor 1
	public Article(String author, LocalDate date) {
		this.author = author;
		this.date = date;
		this.totalArticles += 1;
	}
	
	//constructor 2
	public Article(String name) {
		this.author = author;
		this.text = null;
		this.numLikes = 0;
		this.totalArticles += 1;
	}
	public void numLikes(int numLikes) {
		this.numLikes += this.numLikes;
	}
	public void numUnlikes(int numUnlikes) {
		this.numUnlikes -= this.numUnlikes;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getnumLikes() {
		return numLikes;
	}
	public void setnumLikes(int numLikes) {
		if(this.numLikes > mostLikedArticle.getnumLikes()) {
			mostLikedArticle = this;
		}
		this.numLikes = numLikes;
	}
	
	public int getnumUnlikes() {
		return numUnlikes;
	}
	public void setUnlikes(int numUnlikes) {
		if(this.numUnlikes > mostUnlikedArticle.getnumUnlikes()) {
			mostUnlikedArticle = this;
		}
		this.numUnlikes = numUnlikes;
	}
	public int avgLikes() {
		if(totalArticles == 0) {
			return 0;
		}
		return ((numLikes-numUnlikes)/totalArticles);
	}
	
	public String toString() {
		return "Name " + author +"Date " + date + "texts " + text + 
				"likes " + numLikes + "unlikes" + numUnlikes;
	}
	
	public static Article bestArticle() {
		return mostLikedArticle;
	}
	
	public static Article worstArticle() {
		return mostUnlikedArticle;
	}
}



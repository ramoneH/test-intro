package encapsulation;

public class Book {
private String author;
private String title;
private String cover; 
private double size;
private int pageNum;


public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCover() {
	return cover;
}
public void setCover(String cover) {
	this.cover = cover;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
public int getPageNum() {
	return pageNum;
}
public void setPageNum(int pageNum) {
	this.pageNum = pageNum;
}



}

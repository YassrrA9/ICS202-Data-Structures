package Practicee;

 class Book {
	 private String title;
	 private int pages;
	 
	 public Book(String title, int pages) {
		 this.title = title;
		 this.pages = pages;
	 }
	 
	 public String getTitle() {
		 return this.title;
	 }
	 public int getPages() {
		 return this.pages;
	 }
	 public String toString() {
		return String.format("Title : %s \t  Number Of Pages : %d ", this.title, this.getPages());
	 }

}

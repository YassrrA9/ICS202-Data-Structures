package Practicee;

 class Textbook extends Book {
	 private String course;
	 
	 public Textbook(String title, int pages, String course) {
		 super(title,pages);
		 this.course = course;
	 }
	 @Override 
	 public String getTitle() {
		 return String.format("Title : %S \t Course : %S", super.getTitle(),this.getCourse());
	 }
	 
	 public String getCourse() {
		 return this.course;
	 }
	 
	 @Override
	 public String toString() {
		 return super.toString()+"\t Course : "+this.getCourse();
	 }

}

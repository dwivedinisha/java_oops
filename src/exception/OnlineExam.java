package exception;

//Custom Exception: Thrown when exam duration is invalid
class InvalidDurationException extends Exception {
 public InvalidDurationException(String msg) {
     super(msg);
 }
}

//Custom Exception: Thrown when marks are not in the valid range
class InvalidMarksException extends RuntimeException {
 public InvalidMarksException(String msg) {
     super(msg);
 }
}

class OnlineExam {
 private String examName;
 private int duration;  // in minutes
 private double marks;

 // Constructor with custom exception check
 public OnlineExam(String examName, int duration) throws InvalidDurationException {
     if (duration <= 0) {
         throw new InvalidDurationException("Exam duration must be greater than 0 minutes");
     }
     this.examName = examName;
     this.duration = duration;
     this.marks = 0.0;
 }

 // Method to submit exam with marks
 public void submitExam(double marks) throws InvalidMarksException {
     if (marks < 0 || marks > 100) {
         throw new InvalidMarksException("Marks must be between 0 and 100");
     }
     this.marks = marks;
     System.out.println("Exam submitted successfully with marks: " + marks);
 }

 // Display exam summary
 public void displayExam() {
     System.out.println("Exam: " + examName + ", Duration: " + duration + " mins, Marks: " + marks);
 }

 public static void main(String[] args) {
     try {
         OnlineExam javaExam = new OnlineExam("Java OOP Exam", 90);

         try {
             javaExam.submitExam(120);  // invalid marks
         } catch (InvalidMarksException e) {
             System.out.println("Error: " + e.getMessage());
         }

         javaExam.submitExam(85); // valid marks
         javaExam.displayExam();

     } catch (InvalidDurationException e) {
         System.out.println("Exam creation error: " + e.getMessage());
     }
 }
}
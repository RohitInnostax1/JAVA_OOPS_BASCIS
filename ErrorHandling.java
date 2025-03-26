public class ErrorHandling {
    enum Degrees {
        BTECH, BCA, MTECH, MCA
    }

    public void validate(String degree) {
        try {
       
            if (Degrees.valueOf(degree.toUpperCase()) == Degrees.BTECH) {
                throw new EnumConstantNotPresentException(Degrees.class, degree);
            } else {
                System.out.println("Person is eligible to apply for this job post.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Degree! Please enter a valid degree: BTECH, BCA, MTECH, or MCA.");
        }
    }

    public static void main(String[] args) {
        ErrorHandling obj = new ErrorHandling();
        // obj.validate("BTECH"); 
        obj.validate("MCA");   
        obj.validate("MBA");   
    }
}

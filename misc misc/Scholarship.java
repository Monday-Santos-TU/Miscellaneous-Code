public class Scholarship {
    public static void main(String args[]) {
        int gpa = readInt("What is the student's GPA? ");
        int ap = readInt("How many AP classes is the student taking? ");
        int sat = readInt("What is the student's SAT score? ");
        
        int total = 0;

        if(gpa >= 99) 
        {
            total += 1000;
        }
        else if(gpa >= 93) 
        {
            total += 500;
        }
        else if(gpa >= 86)
        {
            total += 300;
        }
        else if(gpa >= 81)
        {
            total += 100;
        }

        total += 100 * ap;

        if(sat >= 2201)
        {
            total += 700;
        }
        else if(sat >= 2001)
        {
            total += 400;
        }
        else if(sat >= 1800)
        {
            total += 200;
        }

        System.out.println("Your student has earned $" + total + "!");
    }

    /** CodeHS's readInt method
      * prints out the parameter and gets an integer input
      * @param text to print out
      * @return user input as an integer
      */
    public static int readInt(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.println(text);
        return sc.nextInt();
    }

    /** CodeHS's readDouble method
      * prints out the parameter and gets a double input
      * @param text to print out
      * @return user input as a double
      */
    public static double readDouble(String text) {
        Scanner sc = new Scanner(System.in);

        System.out.println(text);
        return sc.nextDouble();
    }
}

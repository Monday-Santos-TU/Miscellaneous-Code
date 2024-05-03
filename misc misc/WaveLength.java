import java.util.Scanner;

public class WaveLength {
    public static void main(String[] args) {
        int wavelength = readInt("What is the wavelength?");

        if(wavelength > 700) 
        {
            System.out.println("Your wavelength makes infared light!");
        }
        else if(wavelength > 630)
        {
            System.out.println("Your wavelength makes red light!");
        }
        else if(wavelength > 590) 
        {
            System.out.println("Your wavelength makes orange light!");
        }
        else if(wavelength > 560)
        {
            System.out.println("Your wavelength makes yellow light!");
        }
        else if(wavelength > 490) 
        {
            System.out.println("Your wavelength makes green light!");
        }
        else if(wavelength > 450)
        {
            System.out.println("Your wavelength makes blue light!");
        }
        else if(wavelength == 450)
        {
            System.out.println("Your wavelength makes light blue light!");
        }
        else if(wavelength > 400) 
        {
            System.out.println("Your wavelength makes violet light!");
        }
        else
        {
            System.out.println("Your wavelength makes Ultra Violet light!");
        }
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

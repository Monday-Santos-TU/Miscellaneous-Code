class Main {
  public static void main(String[] args) {
    boxing();
    printBinaryIntegers();
    showcaseParse();
  }

  public static void boxing() {
    int primitive = 0;
    System.out.println("This is an example of an integer primitive: " + primitive);
    
    Integer wrapper = new Integer(primitive);
    System.out.println("This is an example of a wrapper class using autoboxing: " + wrapper);

    primitive = wrapper;
    System.out.println("This is an example of an integer primitive using unboxing: " + primitive);
  }

  public static void printBinaryIntegers() {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    
    System.out.println(Integer.toBinaryString(min));
    System.out.println(Integer.toBinaryString(max));
  }

  public static void showcaseParse() {
    String str1 = "11";
    String str2 = "1.1";

    int i = Integer.parseInt(str1);
    double d = Double.parseDouble(str2);

    System.out.print(str1 + str2);
    System.out.println(i + d);
  }
}

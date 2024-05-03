public class Main {
    public static void main(String[] args) {
        BoxOfCandy boc = new BoxOfCandy();
        boc.box = new Candy[4][3];
        boc.box[0][1] = new Candy("lime");
        boc.box[1][1] = new Candy("orange");
        boc.box[2][2] = new Candy("cherry");
        boc.box[3][1] = new Candy("lemon");
        boc.box[3][2] = new Candy("grape");

        System.out.println(boc);

        System.out.println(boc.moveCandyToFirstRow(0));

        System.out.println(boc.moveCandyToFirstRow(1));
        System.out.println(boc);

        System.out.println(boc.moveCandyToFirstRow(2));
        System.out.println(boc);


        BoxOfCandy boc2 = new BoxOfCandy();
        boc2.box = new Candy[3][5];
        boc2.box[0][0] = new Candy("lime");
        boc2.box[0][1] = new Candy("lime");
        boc2.box[0][3] = new Candy("lemon");
        boc2.box[1][0] = new Candy("orange");
        boc2.box[1][3] = new Candy("lime");
        boc2.box[1][4] = new Candy("lime");
        boc2.box[2][0] = new Candy("cherry");
        boc2.box[2][2] = new Candy("lemon");
        boc2.box[2][4] = new Candy("orange");

        System.out.println(boc2);

        boc2.removeNextByFlavor("cherry");
        System.out.println(boc2);

        boc2.removeNextByFlavor("lime");
        System.out.println(boc2);

        if(boc2.removeNextByFlavor("grape") == null)
            System.out.println("No grape!");
        System.out.println(boc2);*/
    }
}

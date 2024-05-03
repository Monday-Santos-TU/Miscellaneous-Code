import java.util.Arrays;

public class BoxOfCandy {
    Candy[][] box;

    // AP CSA FRQ question 4 part a
    public boolean moveCandyToFirstRow(int col) {
        if(box[0][col] != null) {
            return true;
        }

        for(int row = 1; row < box.length; row++) {
            if(box[row][col] != null) {
                box[0][col] = box[row][col];
                box[row][col] = null;
                return true;
            }
        }

        return false;
    }

    // AP CSA FRQ question 4 part b
    public Candy removeNextByFlavor(String flavor) {
        for(int i = box.length - 1; i >= 0; i--) {
            for(int j = 0; j < box[0].length; j++) {
                if(box[i][j] != null && box[i][j].getFlavor().equals(flavor)) {
                    Candy temp = box[i][j];
                    box[i][j] = null;
                    return temp;
                }
            }
        }

        return null;
    }

    public String toString() {
        String temp = "";

        for(Candy[] c : box) {
            temp += Arrays.toString(c) + "\n";
        }

        return temp;
    }
}

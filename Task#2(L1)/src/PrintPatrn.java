public class PrintPatrn {
    public static void main(String[] args) {
        int i, j, row = 5;
//Outer loop work for rows
        for (i = 0; i < row; i++) {

             for(j=row-i;j>1;j--) {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0;j<i;j++) {
//prints star
                System.out.print("* ");
            }
            System.out.print("* ");

            for(j=0;j<i;j++) {
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}

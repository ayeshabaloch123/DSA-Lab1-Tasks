public class pattern3 {
    public static void main(String[] args) {

            int rows=9,i=0,j=0;
            for(i=1;i<=rows;i+=2){
                for(j=rows-i;j>1;j-=2){
                    System.out.print("  ");
                }
                int k=0;
                for(j=i;j>=2;j-=2){
                    k++;
                }
                for(j=i;j>=2;j-=2){
                    System.out.print((i-k)+" ");
                    k--;
                }
                System.out.print(i+" ");
                k=1;
                for(j=i;j>=2;j-=2){
                    System.out.print((i-k)+" ");
                    k++;
                }
                System.out.println();
            }

    }
}

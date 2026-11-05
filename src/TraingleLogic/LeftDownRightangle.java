package TraingleLogic;

public class LeftDownRightangle {
//              *
//              * *
//              * * *
    static void main(String[] args) {
        int n=3;
        int nst=1;
        int nsp=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int j=1;j<=nsp;j++){
                System.out.print("");
            }
            System.out.println();
            nst++;
            nsp--;
        }
    }
}

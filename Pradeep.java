import java.util.Scanner;
public class Pradeep { public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = scan.nextInt();

    for(int i = 0 ; i < n ; i++ ){
        for(int j = 0 ; j < n ; j++){
            if (j==0 || (i == 0 && j<= (n-1)/2) || (j== (n-1)/2 && i <= (n-1)/2) || (i == (n-1)/2 && j <= (n-1)/2) ){
                System.out.print("* "); }
            else{
                System.out.print("  ");
            }
        }  System.out.print(" ");
        for(int j = 0 ; j < n ; j++){
            if (j==0 || (i == 0 && j<= (n-1)/2) || (j== (n-1)/2 && i <= (n-1)/2) || (i == (n-1)/2 && j <= (n-1)/2)
                    || i- j == (n-1)/2){
                System.out.print("* "); }
            else{
                System.out.print("  ");
            }
        }  System.out.print(" ");
        for(int j = 0 ; j < n ; j++){
            if (i + j == (n-1)/2 || j-i == (n-1)/2 || (i == (n-1)/3 && i+j >(n-1)/2 && j-i <(n-1)/2) ){
                System.out.print("* "); }
            else{
                System.out.print("  ");
            }
        }  System.out.print(" ");
        for(int j = 0 ; j < n ; j++){
            if (j == 0 || ( i == 0 && j < (n-1)/2) || ( i == n-1 && j < (n-1)/2 ) || (j == (n-1)/2 && i > 0 && i < (n-1))){
                System.out.print("* "); }
            else{
                System.out.print("  ");
            }
        }  System.out.print(" ");
        for(int j = 0 ; j < n ; j++){
            if ((i == 0 && j <= (n-1)/2) || (i == (n-1)/2 && j <= (n-1)/2) ||  (i == (n-1 ) && j <= (n-1)/2)
                    || (j == 0)){
                System.out.print("* "); }
            else{
                System.out.print("  ");
            }
        }  System.out.print(" ");
        for(int j = 0 ; j < n ; j++){
            if ((i == 0 && j <= (n-1)/2) || (i == (n-1)/2 && j <= (n-1)/2) ||  (i == (n-1 ) && j <= (n-1)/2)
                    || (j == 0)){
                System.out.print("* "); }
            else{
                System.out.print("  ");
            }
        }  System.out.print(" ");
        for(int j = 0 ; j < n ; j++){
            if (j==0 || (i == 0 && j<= (n-1)/2) || (j== (n-1)/2 && i <= (n-1)/2) || (i == (n-1)/2 && j <= (n-1)/2) ){
                System.out.print("* "); }
            else{
                System.out.print("  ");
            }
        }   System.out.println(" ");
    }
}
}

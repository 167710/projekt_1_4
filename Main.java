import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
    System.out.println("Podaj liczbe: ");
    System.out.println("1.liczba do potegi A do B");
    System.out.println("2.suma pierwiastkow");
    System.out.println("3.max");
    System.out.println("4.iloraz bez dzielenia przez 0");
    int liczba = scan.nextInt();
    double A = scan.nextInt();
    double B = scan.nextInt();
    switch(liczba){
      case 1:
        double C = A;
        for (double i=1; i<B; i++){
          C=C*A;
        }
        System.out.println(C);
        break;
      case 2:
        double AA=Math.sqrt(A);
        double BB=Math.sqrt(B);
        double D=AA+BB;
        System.out.println(D);
        break;
      case 3
        if(A>B){
          System.out.println(A);
        }
        else{
          System.out.println(B);
        }
        break;
      case 4:
        if(B==0){
          System.out.println("dzielenie przez 0");
          break;
        }
        double dziel = A/B;
        System.out.println(dziel);
        break;
      }
  }
}
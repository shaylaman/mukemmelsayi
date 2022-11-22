import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bkr sayi giriniz: ");
        int n = inp.nextInt();
        int ob=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                ob+=i;}
        }
        if(ob == n){
            System.out.println("Mukrmmel sayifir");}
        else{
            System.out.println("mukemmel bir sayi degildir");
        }
    }
}
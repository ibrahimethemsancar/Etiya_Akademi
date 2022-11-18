public class Main {
    public static void main(String[] args) {
        int number = -1;
        boolean isPrime = true ;

        if(number ==1){
            System.out.println("sayı asal değildir.");
            return;
        }
        if(number<1) {
            System.out.println("Geçersiz sayı");
            return;
        }
        for (int i=2;i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("sayı asaldır.");
        }else System.out.println("sayı asal değildir.");

    }
}
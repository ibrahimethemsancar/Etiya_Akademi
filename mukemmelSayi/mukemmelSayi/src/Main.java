public class Main {
    public static void main(String[] args) {
        int number = 40;
        int sum = 0;
        for (int i=1;i<number;i++){
            if(number % i == 0){
                sum +=i;
            }
        }
        if(sum == number){
            System.out.println(number + " bir mükemmel sayıdır.");
        }else System.out.println(number + " bir mükemmel sayı değildir.");
    }
}
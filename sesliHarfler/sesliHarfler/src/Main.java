public class Main {
    public static void main(String[] args) {
        char harf = 'A';

        //My solution

       /* char[] inceHarfler = new char[]{'e', 'i', 'ö', 'ü'};
        boolean kalinHarfMi = true;
        for (char inceHarf : inceHarfler ){
            if(inceHarf == Character.toLowerCase(harf)){
                kalinHarfMi = false;
            }
        }
        if(kalinHarfMi){
            System.out.println(harf + " bir sesli kalın harftir. ");
        }else System.out.println(harf + " bir sesli ince harftir. ");*/

        switch (Character.toLowerCase(harf)){
            case 'e':
            case'i' :
            case 'u':
            case 'ü':
                System.out.println("ince sesli harf");
            default:
                System.out.println("kalın sesli harf");

        }
    }
}
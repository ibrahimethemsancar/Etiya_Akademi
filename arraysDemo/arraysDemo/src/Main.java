public class Main {
    public static void main(String[] args) {
        String ogrenci2 = "İbrahim";
        String ogrenci1 = "Ethem";
        String ogrenci3 = "Sancar";
        String ogrenci4 = "Cahit";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------");
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "İbrahim";
        ogrenciler[1] = "Ethem";
        ogrenciler[2] = "Sancar";
        ogrenciler[3] = "Cahit";
        //ogrenciler[4] = "Ahmet";
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------------");
        for (String ogrenci :ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
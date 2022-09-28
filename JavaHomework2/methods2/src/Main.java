public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yenimesaj = sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla(15,7);
        int toplam = topla2(2,3,4);
        System.out.println(toplam);

    }

    public static void ekle() {

        System.out.println("Added.");
    }

    public static void sil() {

        System.out.println("Deleted.");
    }

    public static void guncelle() {

        System.out.println("Updated.");
    }

    public static int topla(int sayi1,int sayi2){

        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
         int toplam = 0;
         for (int sayi : sayilar){
             toplam += sayi;

         }
        return toplam;
    }

    public static String sehirVer(){

        return "Ankara";
    }
}
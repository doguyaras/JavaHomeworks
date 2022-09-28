public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak = 0;
        boolean varMi =false;

        /*for (int i =0; i< sayilar.length ; i++) {
            if(aranacak == sayilar[i]) {
                System.out.println("Aranan sayı bulunmuştur.");

            }
        }*/

        for (int sayi: sayilar) {
            if (sayi ==aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı bulunmuştur.");
        }
        else {
            System.out.println("Sayı bulunamamıştır.");
        }

    }
}
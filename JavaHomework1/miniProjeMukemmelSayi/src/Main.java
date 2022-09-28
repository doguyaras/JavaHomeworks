public class Main {

    public static void main(String[] args) {
        int number = 28;
        int temp = 0;

        if(number<1) {
            System.out.println("Geçersiz bir sayı girdiniz");
            return;
        }
        if(number == 1) {
            System.out.println("1 mükemmel bir sayı değildir.");
            return;
        }

        for(int i =1; i < number ; i++) {

            if(number % i == 0) {
                temp = temp + i;
            }

        }
        if(temp == number) {
            System.out.println("Bu sayı mükemmel bir sayıdır.");
        }
        else{
            System.out.println("Bu sayı mükemmel bir sayı değildir.");
        }

    }
}
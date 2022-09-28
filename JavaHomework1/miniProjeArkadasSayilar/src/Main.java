public class Main {

    public static void main(String[] args) {

        int number1 = 220;
        int number2 = 284;
        int temp1 =0;
        int temp2 =0;

        if(number1==1 && number2==1) {
            System.out.println("1 arkadaş sayı değildir.");
            return;
        }

        if(number1<1 && number2<1) {
            System.out.println("Geçersiz sayı girdiniz");
            return;
        }

        for (int i = 1; i<number1 ; i++) {
            if (number1 % i == 0) {
                temp1 = temp1 +i;
            }
        }
        for (int j = 1; j<number2 ; j++) {
            if (number2 % j == 0) {
                temp2 = temp2 +j;
            }
        }
        if(temp1==number2 && temp2 ==number1) {
            System.out.println("Bu sayılar Arkadaş sayılardır.");
        }
        else {
            System.out.println("Bu sayılar Arkadaş değildir.");
        }


    }
}
import java.util.Scanner;

public class CinZodyagiProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String cinZodyagi = "";

        if (dogumYili % 12 == 0) {
            cinZodyagi = "Maymun";
        } else if (dogumYili % 12 == 1) {
            cinZodyagi = "Horoz";
        } else if (dogumYili % 12 == 2) {
            cinZodyagi = "Köpek";
        } else if (dogumYili % 12 == 3) {
            cinZodyagi = "Domuz";
        } else if (dogumYili % 12 == 4) {
            cinZodyagi = "Fare";
        } else if (dogumYili % 12 == 5) {
            cinZodyagi = "Öküz";
        } else if (dogumYili % 12 == 6) {
            cinZodyagi = "Kaplan";
        } else if (dogumYili % 12 == 7) {
            cinZodyagi = "Tavşan";
        } else if (dogumYili % 12 == 8) {
            cinZodyagi = "Ejderha";
        } else if (dogumYili % 12 == 9) {
            cinZodyagi = "Yılan";
        } else if (dogumYili % 12 == 10) {
            cinZodyagi = "At";
        } else if (dogumYili % 12 == 11) {
            cinZodyagi = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);

        scanner.close();
    }
}

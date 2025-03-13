import java.util.Scanner;
import java.util.Random;

public class Game {
    private int targetNumber;
    private boolean isRunning;
    private Player player;
    private Scanner scanner;

    public Game() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; 
        isRunning = true;
        player = new Player();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== Game Tebak Angka ===");
        System.out.println("Tebak angka antara 1 - 100!");

        while (isRunning) {
            System.out.print("Masukkan tebakan: ");
            int guess = scanner.nextInt();
            player.setGuess(guess);

            if (player.getGuess() == targetNumber) {
                System.out.println("Selamat! Anda menebak dengan benar.");
                isRunning = false;
            } else if (player.getGuess() < targetNumber) {
                System.out.println("Tebakan terlalu rendah, coba lagi!");
            } else {
                System.out.println("Tebakan terlalu tinggi, coba lagi!");
            }
        }

        System.out.println("Game selesa");
    }

    public void start() {
    System.out.println("=== Game Tebak Angka ===");
    System.out.println("Tebak angka antara 1 - 100!");
    
    int guess;
    do {
        System.out.print("Masukkan tebakan: ");
        guess = scanner.nextInt();
        player.setGuess(guess);

        if (player.getGuess() < targetNumber) {
            System.out.println("Tebakan terlalu rendah, coba lagi!");
        } else if (player.getGuess() > targetNumber) {
            System.out.println("Tebakan terlalu tinggi, coba lagi!");
        }

    } while (player.getGuess() != targetNumber); 

    System.out.println("Selamat! Anda menebak dengan benar.");
    System.out.println("Game selesai. Terima kasih telah bermain!");
}

}

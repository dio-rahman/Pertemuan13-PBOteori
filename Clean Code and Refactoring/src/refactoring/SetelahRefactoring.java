package refactoring;

import java.util.Scanner;

public class SetelahRefactoring {
    private static int tambah(int a, int b) {
        return a + b;
    }
    private static int kurang(int a, int b) {
        return a - b;
    }
    private static int kali(int a, int b) {
        return a * b;
    }
    private static double bagi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Tidak bisa dibagi nol.");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai pertama: ");
        int nilaiA = scanner.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int nilaiB = scanner.nextInt();
        System.out.print("Masukkan operasi (tambah/kurang/kali/bagi): ");
        String operation = scanner.next();
        try {
            switch (operation.toLowerCase()) {
                case "tambah":
                    System.out.println("Hasil: " + tambah(nilaiA, nilaiB));
                    break;
                case "kurang":
                    System.out.println("Hasil: " + kurang(nilaiA, nilaiB));
                    break;
                case "kali":
                    System.out.println("Hasil: " + kali(nilaiA, nilaiB));
                    break;
                case "bagi":
                    System.out.println("Hasil: " + bagi(nilaiA, nilaiB));
                    break;
                default:
                    System.out.println("Error: Operasi tidak dikenali.");
            }
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

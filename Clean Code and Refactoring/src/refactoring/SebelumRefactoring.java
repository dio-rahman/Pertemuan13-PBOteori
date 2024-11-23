package refactoring;

public class SebelumRefactoring {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 5;
        String operasi = "tambah";

        if (operasi.equals("tambah")) {
            System.out.println("Result: " + (nilaiA + nilaiB));
        } 
        else if (operasi.equals("kurang")) {
            System.out.println("Result: " + (nilaiA - nilaiB));
        } 
        else if (operasi.equals("kali")) {
            System.out.println("Result: " + (nilaiA * nilaiB));
        } 
        else if (operasi.equals("bagi")) {
            if (nilaiB != 0) {
                System.out.println("Result: " + (nilaiA / nilaiB));
            } else {
                System.out.println("Error: Tidak bisa dibagi nol.");
            }
        } 
        else {
            System.out.println("Error: Operasi gagal.");
        }
    }
}
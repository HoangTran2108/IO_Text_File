import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CopyAndWriteFile f = new CopyAndWriteFile();
        System.out.println("Nhập vào source path: ");
        Scanner scanner = new Scanner(System.in);
        String sourcePath = scanner.nextLine();

        System.out.println("Nhập vào target path: ");
        String targetPath = scanner.nextLine();

        f.copyFileAndWrite(sourcePath, targetPath);
    }
}
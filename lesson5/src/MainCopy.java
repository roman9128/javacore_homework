import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class MainCopy {
    public static void main(String[] args) throws IOException {

        String srcPath = "C:/Users/Роман/Desktop/Javacore_homework/lesson5";
        String destPath = "./backup";

        makeFullBackUp(srcPath, destPath); // копирует и файлы, и директории
        copyOnlyFiles(srcPath, destPath); // копирует только файлы

    }

    private static void makeFullBackUp(String srcPath, String destPath) throws IOException {

        Path src = Paths.get(srcPath);
        Path dest = Paths.get(destPath);
        Files.walk(src).forEach(file -> {
            try {
                copyAll(file, dest.resolve(src.relativize(file)));
            } catch (IOException e) {
                e.getMessage();
            }
        });
    }

    private static void copyAll(Path source, Path dest) throws IOException {

        try {
            Files.copy(source, dest);
        } catch (IOException e) {
            e.getLocalizedMessage();
        }
    }

    private static void copyOnlyFiles(String srcPath, String destPath) throws IOException {
        File srcDir = new File(srcPath);
        File copyDir = new File(destPath);
        if (!copyDir.exists()) {
            Files.createDirectory(Paths.get(destPath));
        }
        for (File file : srcDir.listFiles()) {
            if (file.isFile()) {
                Files.copy(Paths.get(file.getAbsolutePath()), Paths.get(copyDir + "/" +
                        file.getName()), REPLACE_EXISTING);
            }
        }
    }
}
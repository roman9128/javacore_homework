import java.io.FileWriter;
import java.io.IOException;

public class MainByte {
    public static void main(String[] args) throws IOException {

        int[] arr = { 1, 2, 3, 0, 1, 2, 3, 0, 1 };
        int fieldCode = 0;

        for (int i = 0; i < arr.length; i++) {
            fieldCode = fieldCode << 2;
            fieldCode = fieldCode + arr[i];
        }

        try (FileWriter writer = new FileWriter("fieldbinarycode.txt", false)) {
            writer.write(Integer.toBinaryString(fieldCode)); // записываю в двоичном выражении
        }
        try (FileWriter writer = new FileWriter("fieldintegercode.txt", false)) {
            writer.write(Integer.toString(fieldCode)); // записываю в десятичном выражении
        }
    }
}

// Предположить, что числа в исходном массиве из 9 элементов
// имеют диапазон [0, 3] и представляют собой, например,
// состояния ячеек поля для игры в крестики-нолики,
// где 0 – это пустое поле, 1 – это поле с крестиком,
// 2 – это поле с ноликом, 3 – резервное значение.
// Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
// Записать в файл 9 значений так, чтобы они заняли три байта.
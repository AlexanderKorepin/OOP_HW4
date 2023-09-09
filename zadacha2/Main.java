package zadacha2;

public class Main {
    public static void main(String[] args) {
        PrintArray printArr = new PrintArray();

        String[] String = {"Привет!", "Пока!"};
        Integer[] Int = {1, 5, 2, 3};

        printArr.printArray(String);
        printArr.printArray(Int);
    }
}
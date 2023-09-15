public class Num1 {
    public static void main(String[] args) {
        int[] sequence = new int[1000]; // Создаем массив для хранения последовательности.
        // Заполните массив sequence данными или сгенерируйте их случайным образом.

        int maxR = -1; // Переменная для хранения максимального значения R.
        
        // Проходим по всем элементам последовательности.
        for (int i = 0; i < sequence.length; i++) {
            for (int j = i + 1; j < sequence.length; j++) {
                int product = sequence[i] * sequence[j];
                
                // Проверяем, что произведение кратно 14 и больше текущего максимального значения R.
                if (product % 14 == 0 && product > maxR) {
                    maxR = product; // Обновляем максимальное значение R.
                }
            }
        }
        
        if (maxR == -1) {
            System.out.println("-1"); // Если не нашли подходящего значения R, выводим -1.
        } else {
            System.out.println("Максимальное подходящее R: " + maxR);
        }
    }
}

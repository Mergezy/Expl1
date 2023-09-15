public class Num2 {
    public static void main(String[] args) {
        int[] sequence = new int[1000]; // Создаем массив для хранения последовательности.
        // Заполните массив sequence данными или сгенерируйте их случайным образом.

        int minR = Integer.MAX_VALUE; // Используем максимальное значение для поиска минимального R.
        
        // Проходим по всем элементам последовательности.
        for (int i = 0; i < sequence.length; i++) {
            for (int j = i + 1; j < sequence.length; j++) {
                int product = sequence[i] * sequence[j];
                
                // Проверяем, что произведение кратно 21 и меньше текущего минимального значения R.
                if (product % 21 == 0 && product < minR) {
                    minR = product; // Обновляем минимальное значение R.
                }
            }
        }
        
        if (minR == Integer.MAX_VALUE) {
            System.out.println("-1"); // Если не нашли подходящего значения R, выводим -1.
        } else {
            System.out.println("Минимальное подходящее R: " + minR);
        }
    }
}

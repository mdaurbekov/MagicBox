import java.util.Random;

public class MagicBox<T> {

    T[] items;

    public MagicBox(T[] itemss) {
        this.items = itemss;
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }

        }

        return false;
    }

    T pick() {
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        int count = 0;
        for (T item : items) {
            if (item == null) {
                count++;
            }
        }
        if (count > 0) {
            throw new RuntimeException("Осталось заполнить ячеек: " + count);
        }
        return items[randomInt];
    }

}

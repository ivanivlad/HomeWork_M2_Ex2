package maps;

import java.util.Objects;

public class Item {
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Item{"
                + "name='" + name + '\''
                + "hash='" + this.hashCode() + '\''
                + '}';
    }
}

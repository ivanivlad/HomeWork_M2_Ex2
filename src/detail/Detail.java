package detail;

public class Detail {
    private String name;

    public Detail(String name) {
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
        ((Detail) o).name = this.name;
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Detail{"
                + "name='" + name + '\''
                + "hash='" + hashCode() + '\''
                + '}';
    }
}
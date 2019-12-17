package lesson01.Metallica;

public abstract class InstrumentsBase implements Guitars, Microphone, Drums, Tuner {
    String name;
    String type;

    public InstrumentsBase(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "InstrumentsBase{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public InstrumentsBase setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public InstrumentsBase setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstrumentsBase that = (InstrumentsBase) o;

        if (!name.equals(that.name)) return false;
        return type.equals(that.type);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}

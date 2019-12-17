package Orchestra;

public abstract class BaseInstrumentData implements InstrumentFunctionality{
    String type;
    String name;

    public BaseInstrumentData(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseInstrumentData{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public BaseInstrumentData setType(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public BaseInstrumentData setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseInstrumentData that = (BaseInstrumentData) o;

        if (!type.equals(that.type)) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}

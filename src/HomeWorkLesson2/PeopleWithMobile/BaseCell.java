package HomeWorkLesson2.PeopleWithMobile;

public abstract class BaseCell implements Cell {
    public String model;

    public BaseCell(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public BaseCell setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public String toString() {
        return "BaseCell{" +
                "model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseCell baseCell = (BaseCell) o;

        return model.equals(baseCell.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}

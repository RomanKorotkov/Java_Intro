package HomeWorkLesson2.MobileGenerics;

//Base class included model phone String
public abstract class BaseCell implements Cell {
    public String model;

    //Constructor
    public BaseCell(String model) {
        this.model = model;
    }

    //Getter/Setter
    public String getModel() {
        return model;
    }

    public BaseCell setModel(String model) {
        this.model = model;
        return this;
    }

    //ToString
    @Override
    public String toString() {
        return "BaseCell{" +
                "model='" + model + '\'' +
                '}';
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseCell baseCell = (BaseCell) o;

        return model.equals(baseCell.model);
    }

    //Hash code
    @Override
    public int hashCode() {
        return model.hashCode();
    }
}

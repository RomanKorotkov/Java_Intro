package lesson01.Delete;

public abstract class BaseCell implements Cell {

    protected String model;

    public BaseCell(String model){
        this.model = model;
    }
   @Override
    public String getCellModel(){
       return model;

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

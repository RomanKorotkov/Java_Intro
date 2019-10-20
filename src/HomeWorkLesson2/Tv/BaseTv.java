package HomeWorkLesson2.Tv;

public abstract class BaseTv implements Tv {
    String model;
    String screen_size;

    public BaseTv(String model, String screen_size) {
        this.model = model;
        this.screen_size = screen_size;
    }

    public String getModel() {
        return model;
    }

    public BaseTv setModel(String model) {
        this.model = model;
        return this;
    }

    public String getScreen_size() {
        return screen_size;
    }

    public BaseTv setScreen_size(String screen_size) {
        this.screen_size = screen_size;
        return this;
    }

    @Override
    public String toString() {
        return "BaseTv{" +
                "model='" + model + '\'' +
                ", screen_size='" + screen_size + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseTv baseTv = (BaseTv) o;

        if (!model.equals(baseTv.model)) return false;
        return screen_size.equals(baseTv.screen_size);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + screen_size.hashCode();
        return result;
    }
}

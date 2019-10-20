package HomeWorkLesson2.Tv;

public abstract class BaseDVDPlayer implements DVD {
    String model;

    public BaseDVDPlayer(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "DVDPlayer{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public BaseDVDPlayer setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseDVDPlayer dvdPlayer = (BaseDVDPlayer) o;

        return model.equals(dvdPlayer.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}

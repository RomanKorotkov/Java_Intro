package SongsList;

public enum Type {
    SHORT("7LP"),
    LONG("20LP");

    public String type;

    Type(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

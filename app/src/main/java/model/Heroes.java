package model;
//insert can be done without class but now using class
public class Heroes {
    private String _id;
    private String name;
    private String dec;

    public Heroes(String name, String desc){
        this.name = name;
        this.name = desc;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}

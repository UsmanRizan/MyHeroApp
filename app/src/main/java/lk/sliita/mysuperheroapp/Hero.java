package lk.sliita.mysuperheroapp;


public class Hero {
    private String name;
    private String universe;
    private String gender;
    private int image;
    private String url;

    public Hero(String name, String universe, String gender, int image, String url) {
        this.name = name;
        this.universe = universe;
        this.gender = gender;
        this.image = image;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUniverse() {
        return universe;
    }

    public String getGender() {
        return gender;
    }

    public int getImage() {
        return image;
    }

    public String getUrl() {
        return url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
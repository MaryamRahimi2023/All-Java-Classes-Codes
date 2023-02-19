package class25;

public class Dog {

    private String name;
    private String color;
    private String breed;


    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public String getName() {// create getter (to get) and setter (to set) methods for your filed to have more control on your filed
        return name;
    }// here we have return coz we only need print of the filed

    public void setName(String name) {// here we have void to set or assign the value and print it
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

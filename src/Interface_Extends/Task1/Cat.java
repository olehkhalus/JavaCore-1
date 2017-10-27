package Interface_Extends.Task1;

public class Cat implements Animal {
   String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat (){

    }
    public String voice() {
        return "Myau";
    }

    public String feed() {
        return "lets ok";
    }
}

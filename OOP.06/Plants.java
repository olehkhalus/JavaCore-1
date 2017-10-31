import java.awt.*;
import java.lang.reflect.Type;


public class Plants {
    private int size;
    private Color color;
    private Type type;

    enum Type {
        TREE,GRASS, FLOWER}
    public class TypeException extends IllegalArgumentException {
        public TypeException (String msg) {
            super(msg);
        }
    }
    enum Color {
        YELLOW, GREEN, WHITE, RED}
    public class ColorException extends Exception {
        public ColorException(String msg) {
            super(msg);
        }
    }

    Plants(){}

    Plants (int size, String color, String type) throws ColorException, TypeException{
        this.size = size;
        this.color = stringToColorEnum(color);
        this.type = stringToTypeEnum(type);
    }
    private Color stringToColorEnum (String color) throws ColorException{
        switch (color.toLowerCase()) {
            case "red" : return Color.RED;
            case "white" : return Color.WHITE;
            case "yellow" : return Color.YELLOW;
            case "green" : return Color.GREEN;
            default : throw new ColorException("Input only color green, yellow, red or white");
        }
    }
    private Type stringToTypeEnum (String type) throws TypeException{
        switch (type.toLowerCase()) {
            case "tree" : return Type.TREE;
            case "flower" : return Type.FLOWER;
            case "grass" : return Type.GRASS;
            default : throw new TypeException("Input only type tree, flower, grass");
        }
    }
    @Override
    public String toString() {
        return String.format("Size is: %d, color is: "+color+ ", type is: "+type, size);
    }


}
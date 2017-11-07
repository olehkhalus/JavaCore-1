package Exception.Task1.Task2;

public class Plants {
    int size;
    Color color;
    Type type;


    public Plants(String type, String color, int size) throws ColorException,TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }
    public enum Color {White, Red, Blue}

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.Blue;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }
    public enum Type {Rose, Chamomile, Orchid}

    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "orchid" : return Type.Orchid;
            case "rose" : return Type.Rose;
            case "chamomile" : return Type.Chamomile;
            default : throw new TypeException("Input only type orchid, rose or chamomile");
        }
    }

}

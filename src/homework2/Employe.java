package homework2;

public class Employe {
    private String name;
    private double rate;
    private double hours;
    static int totalHours;
    static int number = 0;
    static int sum = 0;

    public Employe(){
        number++;
    }

    public Employe(String name, double rate){
        number++;
    }

    public Employe(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        number++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public double getRate(){
        return rate;
    }

    public void setRate(double rate){
        this.rate = rate;
        sum += rate;
    }

    public void changeRate(int rate) {
        sum -= this.rate;
        this.rate = rate;
        sum += rate;
    }


    public double getHours(){
        return hours;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    public double salary() {
        return rate * hours;
    }

    public double bonuses(){
       return salary()*(30/100);

    }
    public double totalSalary(){
        return salary() + bonuses();
    }

    @Override
    public String toString() {
        return " Employe [name=" + name + ", rate=" + rate + ", hours ="+ hours + ", salary = "+ totalSalary()+"]";
    }



}

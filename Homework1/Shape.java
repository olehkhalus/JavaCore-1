import java.util.*;
public class Shape {
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
    int rows_number=scanner.nextInt();
    int asterisks_number=1;
    int e=1;
    for(int i=rows_number;i>0;i--){

        for(int j=rows_number-e;j>0;j--){
            System.out.print(" ");
        }

        for(int d=1;d<=asterisks_number;d++){
            System.out.print("/\\ ");
        }

        System.out.println("");
        asterisks_number+=2;
        e++;
    }
}
}

import java.util.Arrays;

public class task3array
{ public static void main(String[] args) {
    int[] temperatures;
    temperatures  = new int[5];
    temperatures[0]=55;
    temperatures[1]=18;
    temperatures[2]=36;
    temperatures[3]=44;
    temperatures[4]=23;

    temperatures[2]=32;

    for (int temperature: temperatures){
        System.out.println(temperature);
    }

}
}
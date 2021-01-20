package MinMax;


public class Main {

public static void main(String[] args) {

    int[] a = {4,12,45,49,5};
    int max = 0;
    int min = max;

    for (int i = 0, j = 0; i<a.length; i++){
        if (a[i] > max){
            max = a[i];

        }
        if (a[j] < max){
            min = a[j];
        }

    }

    System.out.println("Maximum v poli: " + max);
    System.out.println("Minimum v poli: " + min);
 }
}

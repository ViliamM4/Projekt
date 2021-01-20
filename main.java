# Projekt
public class main {

public static void main(String[] args) {

    int[] a = {4,12,45,9,5};
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

    System.out.println("The maximum number in the array is: " + max);
    System.out.println("The minimum number in the array is: " + min);
 }
}
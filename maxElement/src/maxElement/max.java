package maxElement;

public class max {
	public static void main(String[] args) {
	
		int array[] = {1,2,4,5,6,55,22,4,9,40,20,100,80,70,66,20,80,40,90};
		System.out.println("The maximum number in the array is : "+findmax(array));
	}


public static int findmax (int [] maxaray) {
	int max = maxaray[0];
for (int i = 0; i < maxaray.length; i++) {
        if (maxaray[i] > max) {
            max = maxaray[i];
        }
    }

    return max;
}}

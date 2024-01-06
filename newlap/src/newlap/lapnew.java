package newlap;

public class lapnew {
    static int[] array;

    public lapnew(int[] array) {
        this.array = array;
    }

    public static int calculateSum(int[] myArray) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int ar[]) {
        if (ar.length == 0) {
            return 0;
        }
        return (double) calculateSum(ar) / ar.length;
    }

    public int findMaximum(int array[]) {
        if (array.length == 0) {
            return Integer.MIN_VALUE; // Return a sentinel value for an empty array
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int findMinimum(int array[]) {
        if (array.length == 0) {
            return Integer.MAX_VALUE; // Return a sentinel value for an empty array
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] myArray = {3, 7, 1, 9, 5,8,9,10,16,18};
        lapnew arrayOperations = new lapnew(myArray);


        System.out.println("Sum: " + arrayOperations.calculateSum(myArray));
        System.out.println("Average: " + arrayOperations.calculateAverage(myArray));
        System.out.println("Maximum: " + arrayOperations.findMaximum(myArray));
        System.out.println("Minimum: " + arrayOperations.findMinimum(myArray));
    }
    }


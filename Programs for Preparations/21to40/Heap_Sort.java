import java.util.Scanner;

public class Heap_Sort {

  // Main heap sort method
  public static void sort(double arr[]) {
    int n = arr.length;

    // Build max heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--)
      heapify(arr, n, i);

    // Extract elements one by one from the heap
    for (int i = n - 1; i >= 0; i--) {
      // Move current root to end
      double temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      // Call max heapify on the reduced heap
      heapify(arr, i, 0);
    }
  }

  // To heapify a subtree rooted with node i
  public static void heapify(double arr[], int n, int i) {
    int largest = i; // Initialize largest as root
    int left = 2 * i + 1; // left = 2*i + 1
    int right = 2 * i + 2; // right = 2*i + 2

    // If left child is larger than root
    if (left < n && arr[left] > arr[largest])
      largest = left;

    // If right child is larger than largest so far
    if (right < n && arr[right] > arr[largest])
      largest = right;

    // If largest is not root
    if (largest != i) {
      double swap = arr[i];
      arr[i] = arr[largest];
      arr[largest] = swap;

      // Recursively heapify the affected subtree
      heapify(arr, n, largest);
    }
  }

  public static double[] inputList_for_sortint() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter The Size Of Array :- ");
    int n = sc.nextInt();

    double[] x = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.print("x[" + i + "] = ");
      x[i] = sc.nextDouble();
    }

    return x;
  }

  public static void print_sorted_list(double[] x) {

    System.out.print("[ ");
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
    }
    System.out.print("]");
  }

  public static void main(String[] args) {
    double[] x = inputList_for_sortint();

    sort(x);

    print_sorted_list(x);
  }

}
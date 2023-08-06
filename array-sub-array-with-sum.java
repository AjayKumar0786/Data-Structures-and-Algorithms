import java.util.*;

public class Main {

	
	public static int subArraySum(int arr[], int n, int sum)
	{
		int curr_sum, i, j;

		// Pick a starting point
		for (i = 0; i < n; i++) {
			curr_sum = 0;

			// try all subarrays starting with 'i'
			for (j = i; j < n; j++) {
				curr_sum = curr_sum + arr[j];

				if (curr_sum == sum) {
					System.out.print(
						"Sum found between indexes " + i
						+ " and " + j);
					return 1;
				}
			}
		}

		System.out.print("No subarray found");
		return 0;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int n = arr.length;
		int sum = 33;

		// Function call
		subArraySum(arr, n, sum);
	}
}



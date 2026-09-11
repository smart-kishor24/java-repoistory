/*package demo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


package demo;
public class Main {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 60;

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}

package demo;
public class Main {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}
	
	
}

package demo;
public class Main {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(i+""+j);
			}
		}
	}
}

package demo;
 public class Main {
	public static void main(String[] args) {
		int[] arr = {2,8,3,7,5,5};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 10) {
					System.out.println(arr[i] + "+"+arr[j]+"=10");
				}
			}
		}
	}
	
		
}

package demo;
public class SumPairs {

    public static void main(String[] args) {

        int[] arr = {28, 37, 55};

        for (int num : arr) {

            int first = num / 10;
            int second = num % 10;

            if (first + second == 10) {
                System.out.println(first + " + " + second + " = 10");
            }
        }
    }
}


package demo;

public class Main  {
    public static void main(String[] args) {
    	int[] arr = {2,3,2,4,3,2};
    	
    	for (int i = 0; i < arr.length; i++) {
    		
    		boolean alreadyCounted = false;
    		
    		for (int k =0; k < i; k++) {
    			if (arr[k] == arr[i]) {
    				alreadyCounted = true;
    				break;
    			}
    		}
    			
    			if (alreadyCounted) {
    				continue;
    			}
    			int count = 0;
    			
    			for (int j = 0; j < arr.length; j++) {
    				
    				if (arr[i] == arr[j]) {
    					count++;
    				}
    			}
    			System.out.println(arr[i] + "->" + count);
    		}
    	
    	
    }
}

package demo;
class Main {
	// 0(1) Space complexeity 
	static int sum (int a,int b) {
		int result = a + b;
		return result;
	}
	public static void main(String[] args) {
		int a  = 10;
		int b  = 20;
		int result =  sum (a,b);
		System.out.println("Sum=" + result);
		
	}
}


package demo;
class Main {
	static int[] copyArray(int[] arr) {
		int [] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		return  result;
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int[] result = copyArray(arr);
		System.out.println("Copied Array:");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

package demo;
public class Main {
	public static void main(String[] args) {
		int n = 3;
		int [][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = i + j;
			}
		}
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(matrix[i][j] + "");
			}
			System.out.println();
			
		}
	}
}

package demo;
public class Main {

    static int binarySearch(int[] arr, int low, int high, int target) {

        // Base condition
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Search in the right half
        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);
        }

        // Search in the left half
        return binarySearch(arr, low, mid - 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 60;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}*/




















































































































































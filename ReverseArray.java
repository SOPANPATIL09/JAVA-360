public class ReverseArray {
    
public int[] reverse(int arr[]) {
    int n = arr.length;
    int reversedArr[] = new int[n];
    
    for (int i = 0; i < n; i++) {
        reversedArr[i] = arr[n - 1 - i];
    }
    
    return reversedArr;
}
}
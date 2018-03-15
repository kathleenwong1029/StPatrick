/*We tested arrays that were already sorted in ascending or descending order, or a random array
by using the midpoint, the first element, the last element, and a random element as the pivot
point.*/
public class QuickSortTester {


    public static void getTime(int[] arr) {
	long startTime = 0;
	long totalTime = 0;
	long averageTime = 0;

	startTime = System.nanoTime();

	//QuickSort.qsort( arr, arr.length/2 ); //chooses middle value as pvtPos
  //QuickSort.qsort( arr, 0 ); //chooses leftmost value as pvtPos
  //QuickSort.qsort( arr, arr.length-1 ); //chooses rightmost value as pvtPos
  QuickSort.qsort( arr, (int)(Math.random()*arr.length) ); //choose random value as pvtPos


	totalTime = System.nanoTime() - startTime;
	averageTime = totalTime / 1000;

	  // System.out.println("Total time: " + totalTime);
	  // System.out.println("\nAverage time: " + averageTime);

	System.out.println(arr.length + "," + averageTime );
    }

    public static void main(String[] args) {
	// test case

  //Random Array
	//  System.out.println("Array Length, Average Time");
	// for (int i = 1000 ; i <= 10000 ; i += 50) {
	//     int[] example = QuickSort.buildArray(i,100);
	//     getTime(example);
	// }

  //Sorted Ascending Array
  // for (int i = 1000 ; i <= 10000 ; i += 50){
  //   int[] example = new int [i];
  //   for (int j =0; j<i; j++){
  //     example[j]=j;
  //   }
  //   getTime(example);}

  //Sorted Descending Array
  for (int i = 1000 ; i <= 10000 ; i += 50){
    int[] example = new int [i];
    int number = 0;
    for (int j =i; j>0; j--){
      example[number]=j;
      number ++;
    }
      getTime(example);}



}
}

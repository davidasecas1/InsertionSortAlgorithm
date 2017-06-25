/**
 * @author David Espejo Antiñolo
 */
public class Alg {
	/**
	 * Main method. I declare initial unsorted array with some numbers that can be changed. I also declare
	 * the variables for execution time. I create a sorted float array in which I the function with the unsorted
	 * array as parameter. Then I print the sorted array and the execution time.
	 */
	public static void main(String[] args) {
		float[] input={5,8,7,4,2,6,10,15,3,12,13,15,75,41,36,11,85};
		double TInicio,TFin,tiempo;
		TInicio=System.nanoTime();
		float[] sorted=insertionSort(input);
		TFin=System.nanoTime();
		tiempo=TFin-TInicio;
		for(int i=0;i<sorted.length;i++){
			System.out.print(sorted[i]);
			if(i!=sorted.length-1)System.out.print(", ");
		}
		System.out.println();
		System.out.println("Tiempo requerido: "+tiempo/1000+" microsegundos");
	}
	/**
	 * This type of sort is called insertionSort, it starts comparing one elements with the previous one, if it's
	 * smaller it swaps it.
	 * @param unsorted the array you want to sort
	 * @return the sorted array you give in the parameter. In this case, lowest to highest.
	 */
	private static float[] insertionSort(float[] unsorted){
		float temp=0;
		float[] sorted=unsorted;
		int n=sorted.length;
		for(int i=1;i<n;i++){
			if(sorted[i]<sorted[i-1]){
				temp=sorted[i-1];
				sorted[i-1]=sorted[i];
				sorted[i]=temp;//SWAP
				if(i>1){ //With this a number will do multiple swaps. Being the key at the next loop.
					i-=2;
				}
			}
		}
		return sorted;
	}
}

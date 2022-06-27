package A2comp352;

public class driverarrPQ {

	public static void main(String[] args) {

		System.out.println("\nMyPQUnsortedArray<K,V>\n");
		
		UnsortedArrayPriorityQueue<Integer,String> queue= new UnsortedArrayPriorityQueue<>();

	        queue.insert(9, "Sana");

	        queue.insert(35, "Manoukian");
	        queue.insert(25, "Conco");
	        queue.insert(6, "uni");

	        queue.insert(2, "computer");
	        queue.insert(59, "science");
	        queue.insert(39, "Data ");
	        queue.insert(320, "algo");
	        queue.print();

	        System.out.println("\nCalling for the first time RemoveMin()\n");
	        queue.removemin();
	        System.out.println("*********");
	        queue.print();
	        System.out.println("\nCalling for the second time RemoveMin()\n");
	        queue.removemin();
	        System.out.println("**********");
	        queue.print();
	        queue.removemin();
	        System.out.println("***********");
	        queue.print();
	        
	     System.out.println("\nMyPQSortedArray<K,V>\n");   
		
		SortedArrayPriorityQueue<Integer, String> queue2 = new SortedArrayPriorityQueue<>();

		queue2.insert(9, "Sana");

	        queue2.insert(35, "Manoukian");
	        queue2.insert(25, "Conco");
	        queue2.insert(6, "uni");

	        queue2.insert(2, "computer");
	        queue2.insert(59, "science");
	        queue2.insert(39, "Data ");
	        queue2.insert(320, "algo");
	        queue2.print();
		
		System.out.println("\nCalling for the first time RemoveMin()\n");
		queue2.removemin();
		System.out.println("**************");
		
		
		queue2.print();
		
		System.out.println("\nCalling for the second time RemoveMin()\n");
		queue2.removemin();
		System.out.println("****************");
		queue2.print();
		queue.removemin();
        System.out.println("****************");
        queue.print();
        
        
        
        
        MyPQSortedList<Integer,String> queue3= new MyPQSortedList<>();

                queue3.insert(9, "Sana");

	        queue3.insert(35, "Manoukian");
	        queue3.insert(25, "Conco");
	        queue3.insert(6, "uni");

	        queue3.insert(2, "computer");
	        queue3.insert(59, "science");
	        queue3.insert(39, "Data ");
	        queue3.insert(320, "algo");
	        queue3.print();

        System.out.println("\nCalling for the first time RemoveMin()\n");
        queue.removemin();
        System.out.println("*****************");
        queue.print();
        System.out.println("\nCalling for the second time RemoveMin()\n");
        queue.removemin();
        System.out.println("****************");
        queue.print();
        queue.removemin();
        System.out.println("******************");
        queue.print();
        
        
        
        
        MyPQUnsortedList<Integer,String> queue4= new MyPQUnsortedList<>();

        queue4.insert(9, "Sana");

        queue4.insert(35, "Manoukian");
        queue4.insert(25, "Conco");
        queue4.insert(6, "uni");

        queue4.insert(2, "computer");
        queue4.insert(59, "science");
        queue4.insert(39, "Data ");
        queue4.insert(320, "algo");
        queue4.print();

        System.out.println("\nCalling for the first time RemoveMin()\n");
        queue.removemin();
        System.out.println("***************");
        queue.print();
        System.out.println("\nCalling for the second time RemoveMin()\n");
        queue.removemin();
        System.out.println("***************");
        queue.print();
        queue.removemin();
        System.out.println("****************");
        queue.print();
	}

}

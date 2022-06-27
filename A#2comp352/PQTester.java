import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class PQTester {
    public static void main(String[] args) throws IOException {
        int N = 100;
        String filePath = null;
        if (N >= 1 && N < 10000){
            filePath = "elements_test_file1.txt";
        }
        if (N >= 10000 && N < 100000){
            filePath = "elements_test_file2.txt";
        }
        if (N >= 100000 && N < 1000000){
            filePath = "elements_test_file3.txt";
        }
        String str;
        BufferedReader in = new BufferedReader(new FileReader(filePath));

        List<String> list = new ArrayList<String>();
        while ((str = in.readLine()) != null) {
            list.add(str);
        }

        String[] valueArr = list.toArray(new String[0]);
        int[] arrKey = new int[N];
        for (int i = 0; i < N; i++) {
            arrKey[i] = (int) (Math.random() * N + 1);
        }

        long begin;
        long end;
        long runtime[] = new long[8];

        MyPQUnsortedArray unsortedArray = new MyPQUnsortedArray();
        MyPQUnsortedList unsortedList = new MyPQUnsortedList();
        MyPQSortedArray sortedArray = new MyPQSortedArray();
        MyPQSortedList sortedList = new MyPQSortedList();

        //unsortedArray
        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            unsortedArray.insert(arrKey[i], valueArr[i]);
        }
        end = System.nanoTime();
        runtime[0] = end - begin;

        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            unsortedArray.removeMin();
        }
        end = System.nanoTime();
        runtime[1] = end - begin;

        //unsortedList
        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            unsortedList.insert(arrKey[i], valueArr[i]);
        }
        end = System.nanoTime();
        runtime[2] = end - begin;

        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            unsortedList.removeMin();
        }
        end = System.nanoTime();
        runtime[3] = end - begin;

        //SortedArray
        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            sortedArray.insert(arrKey[i], valueArr[i]);
        }
        end = System.nanoTime();
        runtime[4] = end - begin;

        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            sortedArray.removeMin();
        }
        end = System.nanoTime();
        runtime[5] = end - begin;

        //SortedList
        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            sortedList.insert(arrKey[i], valueArr[i]);
        }
        end = System.nanoTime();
        runtime[6] = end - begin;

        begin = System.nanoTime();
        for (int i = 0; i < N; i++) {
            sortedList.removeMin();
        }
        end = System.nanoTime();
        runtime[7] = end - begin;

        for (int i = 0; i < 8; i++) {
            runtime[i] = runtime[i] / 1000000;
        }
        String[] titles = {"MyPQUnsortedArray","MyPQUnsortedList","MyPQSortedArray","MyPQSortedList"};
        Formatter fmt = new Formatter();
        fmt.format("%20s %20s %20s\n", "N="+N, "Insert(k,v) ms", "Remove(k,v) ms");
        for (int i = 0; i < 4; i++)
        {
            fmt.format("%20s %20s %20s\n", titles[i], runtime[i], runtime[i+1]);
        }
        FileWriter fileWriter = new FileWriter("pqtestrun.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(fmt);
        printWriter.close();
        System.out.println(fmt);
    }

}




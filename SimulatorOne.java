import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

import static java.util.Arrays.deepToString;

public class SimulatorOne {

    public static void main(String[] args) throws FileNotFoundException {

        File text = new File("test.txt");
        Scanner scnr = new Scanner(text);
        ArrayList<String> lines = new ArrayList<>();
        while (scnr.hasNextLine()) {
            lines.add(scnr.nextLine());
        }

        int numNodes = Integer.parseInt(lines.get(0));
        Node[][] nodes = new Node[numNodes][5];
        for (int i =1; i < numNodes+1;i++) {
            String[] x = lines.get(i).split(" ");
            int counter = 1;
            for (int j=1;j < x.length - 1;j+=2) {
                Node n = new Node(Integer.parseInt(x[j]), Integer.parseInt(x[j+1]));
                nodes[i-1][j-counter] = n;
                counter++;

            }
        }
        System.out.println(deepToString(nodes));

    }

}


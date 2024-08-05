import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<Coordinate> inputValues = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            inputValues.add(
                    new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))
            );
        }
        Collections.sort(inputValues);
        
        for (Coordinate v : inputValues) {
            bw.write(v.getX() + " " + v.getY() + "\n");
        }
        bw.flush();
        bw.close();

    }
}

class Coordinate implements Comparable<Coordinate> {
    private int X;
    private int Y;

    Coordinate(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if (this.X == o.X) {
            return this.Y - o.Y;
        }
        return this.X - o.X;
    }
}
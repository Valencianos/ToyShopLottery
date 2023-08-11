package ToyShopModules;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Lottery {
    private static PriorityQueue<Toys> sequence;
    private static int[] toyId;
    private static float[] toyFreq;

    public Lottery() {
        sequence = new PriorityQueue<>((t1, t2) -> Float.compare(t1.getFreq(), t2.getFreq()));
    }

    public static void put(String input) {
        String[] parts = input.split(" ");
        int id = Integer.parseInt(parts[0]);
        String name = parts[1];
        int qty = Integer.parseInt(parts[2]);
        float freq = Float.parseFloat(parts[3]);

        Toys toy = new Toys(id, name, qty, freq);
        sequence.add(toy);

        int queueSize = sequence.size();
        toyId = new int[queueSize];
        toyFreq = new float[queueSize];

        int i = 0;
        for (Toys t : sequence) {
            toyId[i] = t.getId();
            toyFreq[i] = t.getFreq();
            i++;
        }
    }

    public static int getToyId() {
        Random random = new Random();
        double randomNumber = random.nextDouble();

        if (randomNumber <= 0.2) {
            return 1;
        } else if (randomNumber <= 0.4) {
            return 2;
        } else {
            return 3;
        }
    }

    public static Toys getToyById(int id) {
        for (Toys toy : sequence) {
            if (toy.getId() == id) {
                return toy;
            }
        }
        return null;
    }

    public void addToy(Toys toy) {
        sequence.add(toy);
    }

    public static void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < sequence.size(); i++) {
                writer.write(sequence.peek().getName() + " " + toyId[i] + " " + toyFreq[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

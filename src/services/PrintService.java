package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();


    public void addValue(T value) {
        list.add(value);
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List cannot be empty");
        }

        return list.get(0);
    }

    public void Print() {

        if (!list.isEmpty()) {

            System.out.print("[" + list.get(0));
            for (int i = 1; i < list.size(); i++) {

                System.out.print("," + list.get(i));
            }
            System.out.println("]");

        } else {

            throw new IllegalStateException("List cannot be empty");

        }


    }

}

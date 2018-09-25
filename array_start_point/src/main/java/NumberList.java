import com.sun.tools.doclets.formats.html.resources.standard;

import java.util.ArrayList;

public class NumberList {
    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers){
        this.numbers = numbers;

    }

    public int getNumberCount(){
        return this.numbers.size();
    }

    public void addNumber(int newNumber) {
        this.numbers.add(newNumber);
    }

    public int getNumberAtIndex(int index) {
        return this.numbers.get(index);
    }

    public int calculateTotal() {
        int total = 0;
//        standard for loop
//        for(int i = 0; i < getNumberCount(); i++){
//            total += getNumberAtIndex(i);
//        }

//        enhanced for loop
        for (int number : this.numbers){
            total += number;
        }

        return total;
    }
}

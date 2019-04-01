package highArray;

public class HighArrayRun {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray array = new HighArray(maxSize);

        array.insert(22);
        array.insert(33);
        array.insert(44);
        array.insert(11);
        array.insert(66);
        array.insert(77);
        array.insert(88);
        array.insert(55);
        array.insert(00);
        array.insert(99);

        array.display();

        int searchKey = 34;
        if (array.find(searchKey))
            System.out.println("Number: " + searchKey + " is found ");
        else
            System.out.println("Number: " + searchKey + " do not found!");

        array.delete(00);
        array.delete(55);
        array.delete(22);

        array.display();
    }
}

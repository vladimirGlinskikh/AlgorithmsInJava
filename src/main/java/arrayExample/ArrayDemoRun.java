package arrayExample;

public class ArrayDemoRun {
    public static void main(String[] args) {
        ArraysDemo arr = new ArraysDemo(20);
        int nElems = 0;
        int i;

        arr.setElem(0, 34);
        arr.setElem(1, 56);
        arr.setElem(2, 23);
        arr.setElem(3, 89);
        arr.setElem(4, 60);
        arr.setElem(5, 12);
        arr.setElem(6, 90);
        arr.setElem(7, 78);
        arr.setElem(8, 67);
        arr.setElem(9, 20);
        nElems = 10;

        for (i = 0; i < nElems; i++) {
            System.out.println(arr.getElem(i) + " ");
        }
        System.out.println("");

        int searchKey = 56;
        for (i = 0; i < nElems; i++)
            if (arr.getElem(i) == searchKey)
                break;
        if (i == nElems)
            System.out.println("Number: " + searchKey + " not found!");
        else
            System.out.println("Number found: " + searchKey);


        int deleteKey = 23;
        for (i = 0; i < nElems; i++) {
            if (arr.getElem(i) == deleteKey) {
                System.out.println("deleteKey: " + deleteKey + " is found and deleted!");
                for (int k = i; k < nElems; k++)
                    arr.setElem(k, arr.getElem(k + 1));
                nElems--;
            }
        }
        for (i = 0; i < nElems; i++)
            System.out.println(arr.getElem(i) + " ");
        System.out.println("");
    }
}

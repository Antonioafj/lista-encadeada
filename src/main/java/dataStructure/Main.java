package dataStructure;

public class Main {

    public static void main(String[] args) {
        LinkediList list = new LinkediList ("elemento 1");

        list.append("elemento 2");
        list.append("elemento 3");
        list.preprend("elemento 0");

        list.remove(2);
        list.print();

//        list.insert(3, "elemento 2.5");

//        System.out.println(list.get(2).data);

//        System.out.println(list.removeFirst().data);
//        list.print();
//
//        list.set(1, "elemento 0.5");
//        list.print();

//        list.getHead();
//        list.getTail();
//        list.getLength();
//
//        list.print();
    }


}

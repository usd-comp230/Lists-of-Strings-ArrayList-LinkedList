public class ArrayStringList implements StringList {

    String[] elements;
    int size;

    // How will we construct it?
    public ArrayStringList() {
        elements = new String[2];
        this.size = 0;
    }

    // How will we implement the methods?
    public void add(String s) {
        elements[size] = s;
        size++;
    }

    public String get(int index) {
        return elements[index];
    }

    public int size() {
        return size;
    }













//    private void expandCapacity() {
//        int currentSize = this.elements.length;
//        if(this.size < currentSize) { return; }
//        String[] expanded = ;
//        for(int i = 0; i < ; i += 1) {
//        }
//    }






}

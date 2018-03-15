package Patterns.Iterator;

public class NameRepository implements Container {
    public String names[] = {"Michael", "Lisa", "Niels", "Thomas"};

    @Override
    public Iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        //Metode til at tjekke om der er flere navne i listen
        @Override
        public boolean hasNext(){
            if (index < names.length){
                return true;
            }
            return false;
        }

        //Metode til at udskrive alle navne i listen
        @Override
        public Object next(){
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}

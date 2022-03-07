package sk.resy;

public interface Residence {
    // implicitne vsetko je public
    int x = 10;

    int getSize();
    default int getValue() { // "default" iba pre interface
        return 10;
    }

    default Residence basic(int x) {
        return new Residence(){
            @Override public int getSize() {
                return x;
            }
        };
    }


    private int add(int a ) { // private IBA metody, nie policka
        return a + 1;
    }



}

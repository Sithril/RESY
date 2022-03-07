package sk.resy;

public interface Residence {

    default int getSize() {
        return 100;
    }
    default int getValue() {
        return 10;
    }

    default Residence basic(int x) {
        return new Residence(){
            @Override public int getSize() {
                return x;
            }
        };
    }



}

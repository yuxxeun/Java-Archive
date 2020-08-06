package pbo1;

public class Overloading {
    public void Tampil() {
        System.out.println("I LOVE JAVA");
    }
    public void Tampil( int i ) {
        System.out.println("Method dengan 1 parameter = " + i);
    }
    public void Tampil( int i, int j ) {
        System.out.println("Method dengan 2 parameter = " + i + " & " + j );
    }
    public void Tampil ( String atr ) {
            System.out.println( atr );
        }
        public static void main( String a[] ) {
            Overloading objek = new Overloading();
            objek.Tampil();
            objek.Tampil(8);
            objek.Tampil(6, 7);
            objek.Tampil("Hello Java!");
    }
}

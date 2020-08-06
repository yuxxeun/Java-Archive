package pbo1;

public class MainEnkapsulasi {
        public static void main( String args[]  )
        {
            Enkapsulasi ob = new Enkapsulasi();
            ob.setAlas(5);
            ob.setTinggi(7);
            System.out.println("Alas segitiga " + ob.getAlas() );
            System.out.println("Tinggi segitiga " + ob.getTinggi() );
            ob.setLuasSegitiga( ob.getAlas(), ob.getTinggi() );
            System.out.println("Luas segitiga " + ob.getLuasSegitiga() );
        }
}

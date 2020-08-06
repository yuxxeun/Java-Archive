package pbo1;

public class SepedaMotor {
    private String merk;
    private long harga;

    public void setMerk( String merkMotor ) { merk = merkMotor; }

    public String getMerk() { return merk; }

    public long Harga( long hargaMotor ) {
        return harga = hargaMotor;
    }
}
class Main {
    public static void main( String[] args ) {
        SepedaMotor motor = new SepedaMotor();
        motor.setMerk( "Suzuki" );

        System.out.println("Merk motor ini adalah " + motor.getMerk() );
        System.out.println("Harga motor ini adalah " + motor.Harga( 11_000_000 ));
    }
}

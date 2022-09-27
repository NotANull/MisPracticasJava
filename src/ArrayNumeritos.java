class ArrayNumeritos {
    
    private final int dimF;
    private int dimL;
    private final int[] arrayNumeros;

    public ArrayNumeritos(int dimF) {
        this.dimF = dimF;
        this.arrayNumeros = new int[dimF];
        this.dimL = 0;
    }

    public int getDimF() {
        return dimF;
    }
    
    public int getDimL() {
        return dimL;
    }
    
    public void insertarNumero(int n) {
        if (this.dimL < this.dimF) {
            this.arrayNumeros[this.dimL] = n;
            this.dimL++;
        }
    }

    public void mostrarArray() {
        for (int i = 0; i < this.dimF; i++) {
            System.out.print("[" + this.arrayNumeros[i] + "]");
        }
    }
}

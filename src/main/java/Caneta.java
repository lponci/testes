public class Caneta {
    public String modelo, cor;
    private float ponta;
    protected int carga = 100;
    private boolean tampada;

    void status() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("A cor da caneta é " + getCor());
        System.out.println("Ponta: " + getPonta() + "mm");
        System.out.println("Carga: " + getCarga() + "%");
        System.out.println("Esta tampada? " + getTampa());
    }

    public Caneta(String m, String c, Float p) {
        setModelo(m);
        setCor(c);
        setPonta(p);
        tampar();
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Destampe para usar!!");
        } else {
            System.out.println("Rasbiscando!!!!");
            this.carga -= 5;
        }
    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int ca) {
        this.carga = ca;
    }

    public String getTampa() {
        String tampa = (this.tampada == true) ? "Sim" : "Não";
        return (tampa);
    }
}

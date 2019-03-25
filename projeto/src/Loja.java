public class Loja {
    public int caixa;

    public void compra(Produto p,Cliente c){
        if (p.getPreco()>c.getSaldo())
            System.out.println("Saldo insuficiente");
        else{
            c.setSaldo(c.getSaldo()-p.getPreco());
            this.caixa=caixa+p.getPreco();
            System.out.println(caixa);

        }
    }

}

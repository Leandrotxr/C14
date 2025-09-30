package br.inatel.cdg.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {

    private List<Brownie> brownies;
    private CupomDesconto desconto;

    public CarrinhoCompra() {
        brownies = new ArrayList<>();
    }

    public void adicionaBrownie(Brownie brownie) throws NumeroNegativoException {
        if(brownie.getQtd() > 0){
            brownies.add(brownie);
        }else{
            throw new NumeroNegativoException("Não é possivel adicionar uma quantidade negativa");
        }
    }

    public double somaTotal() {
        double soma = 0;
        for (Brownie b : brownies) {
            soma += b.getValor();
        }
        if(desconto != null && desconto.getDesconto() > 0){
            return somaTotalComDesconto(soma, desconto.getDesconto());
        }else{
            return soma;
        }
    }

    public double somaTotalComDesconto(double soma, double desconto) {
        return soma = soma - (desconto * soma);
    }

    public double somaTotalItens() {
        double total = 0;
        for (Brownie brownie : brownies) {
            total += brownie.getQtd();
        }
        return total;
    }

    public CupomDesconto getDesconto() {
        return desconto;
    }

    public void setDesconto(CupomDesconto desconto) {
        this.desconto = desconto;
    }
}

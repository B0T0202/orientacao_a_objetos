public class AssinaturaPremium extends Assinatura {

    public AssinaturaPremium(double p) {
        super(p);
    }

    @Override
    public String exibirBeneicios() {
        return "Filmes em 4k + Sem Anúncios";
    }
}

public class main {
    public static void main(String[] args){

    
    luffy luffy = new luffy();
    luffy.nome = "luffy";
    luffy.recompensa = 300000000000L;
    luffy.tesouro = "Thounsand_Sunny";
    luffy.sonho = "Ser o Rei Dos Piratas"; 

System.out.println( "nome" + luffy.nome);
System.out.println("sonho" + luffy.sonho);
System.out.println( "tesouro" + luffy.tesouro);
System.out.println( "recompensa" + luffy.recompensa);


    sanji sanji = new sanji();
    sanji.nome = "sanji";
    sanji.recompensa = 1032000000;
    sanji.tesouro = "Thounsand_Sunny";
    sanji.sonho = "encontrar o All Blue";

System.out.println( "nome" + sanji.nome);
System.out.println("sonho" + sanji.sonho);
System.out.println( "tesouro" + sanji.sonho);
System.out.println( "recompensa" + sanji.recompensa);


    zoro zoro = new zoro();
    zoro.nome = "zoro";
    zoro.recompensa = 120000000000L;
    zoro.tesouro = "Thounsand_Sunny";
    zoro.sonho = "se tornar o maior espadachim do mundo";

System.out.println( "nome" + zoro.nome);
System.out.println("sonho" + zoro.sonho);
System.out.println( "tesouro" + zoro.tesouro);
System.out.println( "recompensa" + zoro.recompensa);


    nami nami = new nami();
    nami.nome = "nami";
    nami.recompensa = 366000000;
    nami.tesouro = "suas tangerinas (mikans)";
    nami.sonho = "desenhar um mapa completo do mundo inteiro";

System.out.println( "nome" + nami.nome);
System.out.println("sonho" + nami.sonho);
System.out.println( "tesouro" + nami.tesouro);
System.out.println( "recompensa" + nami.recompensa);



System.out.println("Metodos -> ataques");
zoro.atacar();
luffy.atacar();
nami.atacar();
}
}
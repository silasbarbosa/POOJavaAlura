public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco1() {
        return preco1;
    }
    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }
    public double getPreco2() {
        return preco2;
    }
    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }
    public double getPreco3() {
        return preco3;
    }
    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }

    public double calcularMaiorPreco(){
        double maior;
        if(preco1> preco2){
            if(preco1>preco3){
                maior = preco1;
            }
            else{ 
                maior = preco3;
            }
        }
        else {
            if(preco2 > preco3){
                maior = preco2;
            }
            else{
                maior = preco3;
            }
        }
        return maior;
    }

    public double calcularMenorPreco(){
    double menor;
        if(preco1<preco2){
            if(preco1<preco3){
                menor = preco1;
            }
            else{ 
                menor = preco3;
            }
        }
        else {
            if(preco2 < preco3){
                menor = preco2;
            }
            else{
                menor = preco3;
            }
        }
        return menor;


    }
    
    public void exibirInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + preco1);
        System.out.println("Preço Ano 2: " + preco2);
        System.out.println("Preço Ano 3: " + preco3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

}

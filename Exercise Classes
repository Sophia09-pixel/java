package primeiro_projeto;

public class Carro {

    public int porta;
    private boolean paradoCarro=false;
    protected String cor;
    
    public void mostrar() {
        System.out.println("Quantidade de Portas: "+this.porta);
        
        if(this.paradoCarro==true) {
            System.out.println("O carro está: parado ");
        }else {
            System.out.println("O carro está: andando");
        }
          
        
        System.out.println("A cor do carro é: "+this.cor);
    }

    public void andar() {
        this.paradoCarro = false;
    }
    
    public void parado() {
        this.paradoCarro = true;
    }
}
// Other class
package primeiro_projeto;

public class PrimeiraClasse {

    public static void main(String[] args) {
         Carro carro = new Carro();
         
         carro.porta = 4;
         carro.cor   = "amarelo";
         
         carro.parado();
         
        carro.mostrar();
         
        carro.andar();
        
        carro.mostrar();
    }
    


}

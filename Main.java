package abstrato;

public class Main {
    public static void Main(String[] args){
        Funcionario dev = new Desenvolvedor("Raphael", 12000, 1500);
        Funcionario gerente = new Gerente("Caroline", 10000,2000)

        System.out.println("Salario do Desenvolvedor" + dev.getNome()+ ": " + dev.calcularSalario());
        System.out.println("Salario do Gerente" + gerente.getNome() + ": " + gerente.calcularSalario());
    }
    
}

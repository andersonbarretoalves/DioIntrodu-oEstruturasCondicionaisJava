public class ExemploForArray {
    //EM ARRAY O INDICE É INICIADO NO ZERO.
    public static void main(String[] args) {
        String alunos[] = { "OTAWIO", "MARCOS", "HERMANO", "ANDERSON" };

        for (String aluno : alunos){
            System.out.println("Nome do Aluno é: " + aluno);
        }

        /* for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        } */
    }    
}

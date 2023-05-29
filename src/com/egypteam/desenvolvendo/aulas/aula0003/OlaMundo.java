package com.egypteam.desenvolvendo.aulas.aula0003;

/*
 * Esta é a classe OlaMundo
 * Estamos descrevendo este comentário em outro formato que é o comentário multi-linha (ou multiline - em programação, costumamos manter alguns termos em inglês)
 * Essa classe possui um método estático (conversaremos sobre isso mais para frente), chamado "main".
 */
public class OlaMundo {

    /*
     * Construtor da classe OlaMundo
     */
    public OlaMundo() {
        this.prop1 = "Olá, Mundo dentro de uma propriedade 1, mas inicializada no construtor!";
    }

    /*
     * Aqui, estamos declarando e inicializando uma propriedade pública "prop1" da classe "OlaMundo".
     * É uma propriedade cujo tipo é a classe String
     * Uma propriedade nada mais é que uma variável que é armazenada e associada a uma instância, ou seja, a um objeto
     * A visibilidade tanto das propriedades podem ser:
     *   "public" (Pode ser acessado a partir de qualquer classe)
     *   "protected" (Pode ser acessada a partir do método de qualquer subclasse - falaremos sobre subclasses posteriormente)
     *   "private" (Só pode ser acessada a partir da própria classe)
     */
    public String prop1 = "Olá, Mundo dentro de uma propriedade 1!";

    /*
     * Aqui estamos declarando um método.
     * O método dada mais é que uma lógica (uma sequência de comandos, como um subprograma), que executa determinada tarefa, e em alguns casos, retorna um valor.
     * No caso abaixo, como estamos utilizando o tipo de retorno "void", a função não retorna nada.
     */
    public void digaOlaMundo() {

        String str1;
        String str2 = "Olá, Mundo Dois!";

        str1 = "Olá, Mundo Um!";

        int a = 2;
        int b = 3;
        int c = a + b;

        // Isto é um comentário
        // Comandos simples basicamente chamam métodos de um objeto, que é uma instância de uma classe
        // O comando abaixo chama o método "println" do objeto instanciado em System.out, com um único parâmetro "Olá, Mundo"
        // Este método desempenha a função de imprimir um texto na saída padrão, que no caso é a tela da linha de comando.
        System.out.println("Olá, Mundo!");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(c);
        System.out.println(String.format("Formatação de texto: %d", c));
        System.out.println(prop1);

    }

    /*
     * O método estático main é um padrão adotado pelo Java e pela JVM
     * Quando você executa a classe através do comando java, a JVM faz uma chamada para o método main, que é chamado de entry point (ou ponto de entrada)
     * Por essa razão, quando você compilou o programa e executou a classe, o programa imprimiu (exibiu) na tela o texto "Olá, Mundo".
     * Neste novo exemplo, modificamos o método mai n para utilizar uma instância da classe "OlaMundo" e chamar o método "digaOlaMundo", para exemplificar comandos de chamada.
     */
    public static void main(String[] args) {

        /*
         * Aqui, estamos declarando uma variável chamada "olaMundo". Observe atentamente letras maiúsculas e letras minúsculas. Elas são consideradas diferentes em Java
         * Essa variável, como toda variável em Java (que é uma linguagem fortemente tipada), tem um tipo.
         * No caso, o tipo dessa variável "olaMundo" é a classe "OlaMundo", que é exatamente a classe definida nesse arquivo.
         * Então além de declararmos a variável na linha abaixo, estamos atribuindo um valor a essa variável, valor esse que é uma nova instância (em memória) da classe "OlaMundo"
         */
        OlaMundo olaMundo = new OlaMundo();

        /*
         * O comando abaixo é uma chamada ao método "digaOlaMundo" do objeto contido na variável "olaMundo", que foi atribuída no comando anterior
         * Esse comando irá executar o método "digaOlaMundo"
         */
        olaMundo.digaOlaMundo(); // Esta linha serve para chamar o método digaOlaMundo do objeto olaMundo

    }

}

package com.egypteam.desenvolvendo.aulas.aula0001;

/*
 * Esta é a classe OlaMundo
 * Estamos descrevendo este comentário em outro formato que é o comentário multi-linha (ou multiline - em programação, costumamos manter alguns termos em inglês)
 * Essa classe possui um método estático (conversaremos sobre isso mais para frente), chamado "main".
 */
public class OlaMundo {

    /*
     * Aqui estamos declarando um método.
     * O método dada mais é que uma lógica (uma sequência de comandos, como um subprograma), que executa determinada tarefa, e em alguns casos, retorna um valor.
     * No caso abaixo, como estamos utilizando o tipo de retorno "void", a função não retorna nada.
     */
    public void digaOlaMundo() {

        // Isto é um comentário
        // Comandos simples basicamente chamam métodos de um objeto, que é uma instância de uma classe
        // O comando abaixo chama o método "println" do objeto instanciado em System.out, com um único parâmetro "Olá, Mundo"
        // Este método desempenha a função de imprimir um texto na saída padrão, que no caso é a tela da linha de comando.
        System.out.println("Olá, Mundo!");

    }

    /*
     * O método estático main é um padrão adotado pelo Java e pela JVM
     * Quando você executa a classe através do comando java, a JVM faz uma chamada para o método main, que é chamado de entry point (ou ponto de entrada)
     * Por essa razão, quando você compilou o programa e executou a classe, o programa imprimiu (exibiu) na tela o texto "Olá, Mundo".
     * Neste novo exemplo, modificamos o método main para utilizar uma instância da classe "OlaMundo" e chamar o método "digaOlaMundo", para exemplificar comandos de chamada.
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
        olaMundo.digaOlaMundo();

    }

}

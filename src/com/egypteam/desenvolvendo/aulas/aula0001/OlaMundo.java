package com.egypteam.desenvolvendo.aulas.aula0001;

/*
 * Esta é a classe OlaMundo
 * Estamos descrevendo este comentário em outro formato que é o comentário multi-linha (ou multiline - em programação, costumamos manter alguns termos em inglês)
 * Essa classe possui um método estático (conversaremos sobre isso mais para frente), chamado "main".
 */
public class OlaMundo {

    /*
     * O método estático main é um padrão adotado pelo Java e pela JVM
     * Quando você executa a classe através do comando java, a JVM faz uma chamada para o método main, que é chamado de entry point (ou ponto de entrada)
     * Por essa razão, quando você compilou o programa e executou a classe, o programa imprimiu (exibiu) na tela o texto "Olá, Mundo".
     */
    public static void main(String[] args) {

        // Isto é um comentário
        // Comandos simples basicamente chamam métodos de um objeto, que é uma instância de uma classe
        // O comando abaixo chama o método "println" do objeto instanciado em System.out, com um único parâmetro "Olá, Mundo"
        // Este método desempenha a função de imprimir um texto na saída padrão, que no caso é a tela da linha de comando.
        System.out.println("Olá, Mundo!");

    }

}

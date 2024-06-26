# Calculadora Simples em Java 

Este é um projeto de uma calculadora simples em Java, que realiza operações básicas entre dois números como adição, subtração, multiplicação, divisão e exponenciação, usando conceitos de orientação a objetos e tratamento de exceções.

## Funcionalidades

- **Operações suportadas:** Adição (+), Subtração (-), Multiplicação (*), Divisão (/) e Exponenciação (^).
- **Validação de operações:** A calculadora valida as operações de entrada para garantir que apenas operações suportadas sejam realizadas.
- **Lida com erros:** A calculadora evita que o programa se encerre caso algum erro de leitura de variável aconteça, operações inexistentes e números fora do padrão.
- **Não permite divisão com 0:** Caso algum dos números dentro da operação de divisão (/) for 0, retornará que é inválido.
## Requisitos

- **Java:** Certifique-se de ter o **JDK** (Java Development Kit) instalado em sua máquina. O projeto foi desenvolvido usando Java 17.
### Com IDE e git hub
-  É necessário ter uma Ambiente Integrado de Desenvolvimento (IDE) instalada que suporte a linguagem de programação Java como o **VSCode**, faça download das extenções java. Conecte ao github
### Com Git:
- **GitBash:** Utilize o **GitBash** para clonar e executar o projeto.
## Como usar com GitBash

1. Clone este repositório para sua máquina local:

    ```bash
    git clone https://github.com/Guustavohgp/Calculadora_Java_Poo.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd Calculadora_Java_Poo/
    ```

3. Verificar se o JDK está instalado:

    ```bash
    java -version
    ```

4. Compilar os aquivos.java:

    ```bash
    javac src/poo/*.java
    ```
5. Executar a classe principal:

    ```bash
    java -cp src poo.Calculadora
    ```

6. Siga as instruções na linha de comando para realizar um cálculo. Você será solicitado a inserir dois números e o operador desejado.

## Como usar com VSCode
1. Abra o VSCode
    
    Use o comando **Ctrl + Shift + P** para abrir a **Command Palette** e digite:
    
    ```bash
    Git: Clonar
    ```
    Cole o comando:
    ```bash
    git clone https://github.com/Guustavohgp/Calculadora_Java_Poo.git
    ```
2. Faça as instalações necessárias
3. Abra a pasta **Calculadora_Java_POO**
4. Abra a pasta **src\poo**
5. Clique em **Calculadora.java** e em seguida em **Run** para executar
6. Siga as instruções no **terminal** para realizar um cálculo. Você será solicitado a inserir dois números e o operador desejado.
## Exemplo de Uso

```plaintext
CALCULADORA
Deseja Continuar? s/n
s
Informe o valor do primeiro numero:
5
Digite o sinal da operação que deseja realizar ( +, -, *, / ):
*
Informe o valor do segundo numero:
3

O resultado de 5.0 * 3.0 é: 15.0
```
## Autor
Guustavohgp
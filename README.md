# Funcionamento do programa - Carlos Eduardo Alves da Silva Delfino
O programa simula um gerenciamento de usuários de uma biblioteca, destacando os níveis de acessos
e responsabilidade. O principal objetivo é mostrar o funcionamento de heranças e polimorfismo na 
Orientação a Objetos.

O sistema possui as seguintes classes:
- `Usuário` (superclasse): define atributos/características gerais (comum a todas classes)
- `Leitor` (subclasse): representa o usuário padrão com permissão de consulta e reserva de livros
- `Bibliotecario` (subclasse): representa o usuário com permissões para gerenciar livros, como cadastrar 
e retirar livros
- `Administrador` (subclasse): representa o usuário com todas as permissões anteriores, e adiciona permissões para gerenciar outros usuários.

# Herança
A herança foi utilizada para criar uma hierarquia entre as classes, em que as subclasses adquirem 
os métodos e propriedades da superclasse.

A classe base é `Usuario`, que possui atributos que são comuns a todas as outras classes. Ex:
- `Usuario`: define atributos comuns
- `Leitor`: herda permissões de `Usuario` e adiciona permissão de consulta e reserva
- `Bibliotecario`: herda permissões de `Leitor` e adiciona permissões para gerenciar
livros, como cadastrar e retirar livros
- `Administrador`: possui todas as permissões das classes anteriores, e adiciona permissões
para gerenciar outros usuários.

# Polimorfismo 
Permite que um método se comporte de diferentes formas dependendo do objeto que o executa, além 
disso permite reuso de código.

O método `exibirMenu()` foi definido na superclasse `Usuario` e foi sobrecrito em cada subclasse 
usando a anotação `@Override`. Onde cada classe adapta o método conforme suas permissões.
## Projeto de exemplo para utilização de Singleton

### Singleton
- Pattern criacional
- Garante a criação de uma única instância de uma classe através de toda a aplicação, mantendo um ponto global de acesso ao seu objeto
- Muito parecido com variável global

### Motivação através de exemplos
- Única conexão com banco de dados
- Acesso ao sistema de arquivos de um sistema
- Sistema de logs
- Lazy construction -> Só instancia o objeto quando você chama ele
- Não há parâmetros para sua construção
- Acessível de forma global
	
### Estrutura principal 
- Método construtor é privado. Não consegue dar new no objeto
- Método "getInstance" responsável por criar o objeto
- Ele verifica se o objeto existe, caso contrário cria
- Possui outros métodos como uma classe qualquer
	
### Not thread safe vs Thread safe
- Padrão "original" singleton não é thread safe. Isso é grave
- Existem formas de contornar o problema através de variações desse padrão
	
### Consequências: Singleton como um anti-pattern
- Alto acoplamento
- Acesso global de um objeto
- Não é thread safe
- Dificuldade para trabalhar com testes
- Quebra o SOLID
- SRP (ela possui a responsabilidade de se gerenciar)
- Pode ser facilmente substituída através de Injeção de Dependência

Referências e links utilizados:
- Textos do README.md foram retirados do vídeo: Tudo sobre o Design Pattern Singleton disponível em https://www.youtube.com/watch?v=IXgE3jmwdk0&list=PL5aY_NrL1rjtP1GVk1lxifkeob1F09L4p&index=2


- Exemplo de código foi retirado do site baeldung disponível em https://www.baeldung.com/java-singleton


- Exemplos Singleton, DemoSingleThread, DemoMultiThread e ThreadSafe foram retirados do site Refactoring Guru disponível em https://refactoring.guru/pt-br/design-patterns/singleton/java/example#lang-features


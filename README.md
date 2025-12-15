# Kambam (Projeto de Estudo)

Este projeto é um **gerenciador simples de tarefas (Tasks)** desenvolvido em **Java**, com foco em **praticar Programação Orientada a Objetos (POO)**, organização em camadas e boas práticas de código.

O objetivo principal não é a complexidade, mas sim a **clareza da arquitetura**, o uso correto de **entidades**, **serviços**, **enums** e **validações**.

---

## Objetivo do Projeto

* Praticar conceitos fundamentais de **POO em Java**
* Trabalhar com **encapsulamento, validações e enums**
* Separar responsabilidades entre **Entity** e **Service**
* Simular um pequeno sistema de gerenciamento de tarefas

---

## Estrutura do Projeto

```
Kambam/
├── Entity/
│   ├── Tesk.java
│   └── User.java
│
├── Enums/
│   ├── Priority.java
│   └── Status.java
│
├── Service/
│   └── TeskManeger.java
│
├── Utils/
│   └── Validator.java
│
└── Main.java
```

---

## Principais Conceitos Utilizados

### Entity

* **Tesk**: representa uma tarefa
* **User**: representa o responsável pela tarefa

As entidades utilizam:

* Atributos privados
* Construtor
* Getters e setters

---

### Enums

* **Priority**: define a prioridade da tarefa (ex: LOW, MEDIUM, HIGH)
* **Status**: define o estado da tarefa (ex: GETTING_STARTED, IN_PROGRESS, DONE)

Enums garantem padronização e evitam valores inválidos.

---

### Service

* **TeskManeger**: responsável por gerenciar as tarefas

Responsabilidades:

* Criar tarefas
* Armazenar tarefas em uma lista
* Listar tarefas

Isso mantém a lógica de negócio separada das entidades.

---

### Utils

* **Validator**: centraliza as validações de dados

Exemplos:

* Validação de título
* Validação de descrição
* Validação de prioridade

Essa abordagem evita código duplicado e melhora a manutenção.

---

## Exemplo de Uso

```java
void main() {
    User user1 = new User(
        "Guilherme",
        "figueira.gui1@gmail.com",
        "Casadogui123!@",
        1
    );

    TeskManeger teskManeger = new TeskManeger();

    teskManeger.createTesk(
        1,
        "Estudar Java",
        "Estudar Java pelo DevDojo ou projeto solo",
        user1,
        Status.GETTING_STARTED,
        Priority.LOW
    );

    teskManeger.listTesks();
}
```

---

## Saída Esperada

```
Tesk{id=1, title='Estudar Java', description='Estudar Java pelo DevDojo ou projeto solo', priority=LOW, status=GETTING_STARTED, user=Guilherme}
```

---

## Observações

* Este projeto é **educacional**
* Não utiliza banco de dados
* Todas as informações são mantidas em memória
* Ideal para praticar fundamentos antes de avançar para frameworks

---

## Próximos Passos (Ideias)

* Persistência com banco de dados
* Interface gráfica ou API REST
* Filtros por status ou prioridade
* Testes unitários

---

## Autor

Projeto desenvolvido por **Guilherme Vicente** como parte dos estudos em Java e Programação Orientada a Objetos.

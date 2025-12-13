# Gerenciando Meu Dindin

A criação desse projeto se fez possível após a conclusão do meu projeto da faculdade, na disciplina de banco de dados, onde foi elaborado a documentação para a criação de um banco de dados, para um sistema de gerenciamento financeiro pessoal. A partir desse [documento](https://github.com/ViniCristhian/CJOBDD1/blob/main/Relat%C3%B3rio%201%20-%20Projeto%20Final.pdf), estou iniciando o desenvolvimento da primeira parte do sistema o back-end. As tecnologias escolhidas para o desenvolvimento do back-end do projeto foram Java, Spring Framework, o banco de dados será o MySQL e o Docker que irá rodar o banco de dados.


### Requisitos e Regra de Negócio

Abaixo são mostrados os requisitos e regras de negócio levantados para o desenvolvimento do sistema, os requisitos e regras de negócio são as mesmas da documentação do projeto de banco de dados.

#### 1. Requisitos Funcionais

|  ID  | Descrição dos Requisitos |
| :--: | ------------------------ |
| RF01 | O sistema deve manter o cadastro de novos usuários. |
| RF02 | O sistema deve permitir que o usuário faça login e logout. |
| RF03 | O sistema deve manter o cadastro de Entradas (Receitas). |
| RF04 | O sistema deve manter o cadastro de Saídas (Despesas/Gastos). |
| RF05 | O sistema deve permitir a criação e o cadastro de Categorias (ex: Mercado, Aluguel, Salário) para associar a Entradas e Saídas. |
| RF06 | O sistema deve permitir a edição e exclusão de Entradas, Saídas e Categorias cadastradas. |
| RF07 | O sistema deve permitir a visualização do saldo total atual do usuário. |
| RF08 | O sistema deve permitir a filtragem das transações (Entradas e Saídas) por período (mês, ano), categoria e tipo (receita/despesa). |
| RF09 | O sistema deve gerar relatórios e gráficos que mostrem a distribuição de gastos por categoria ao longo do tempo. |
| RF10 | O sistema deve permitir que o usuário associe cada transação (Entrada/Saída) a uma Categoria. |

#### 2. Requisitos Não Funcionais

|   ID  | Descrição dos Requisitos Não Funcionais |
|  :--: | --------------------------------------- |
| RNF01 | O sistema deve garantir a segurança dos dados pessoais e financeiros do usuário. |
| RNF02 | O sistema deve apresentar uma interface simples e prática. |
| RNF03 | O sistema deve ter disponibilidade de acesso 24 horas por dia, 7 dias por semana. |
| RNF04 | O sistema deve garantir a integridade dos dados, impedindo que transações fiquem sem categoria, por exemplo. |
| RNF05 | O sistema deve ter um tempo de resposta rápido, especialmente na visualização de saldos e relatórios. |

#### 3. Regra de Negócio

|  ID  | Descrição da Regra de Negócio |
| :--: | ----------------------------- |
| RN01 | O Usuário é a principal entidade; todas as transações devem estar vinculadas a um único Usuário. |
| RN02 | É obrigatório que toda Transação seja associada a uma Categoria. |
| RN03 | O saldo total é calculado pela soma dos valores das transações vinculadas ao tipo "Receita" menos a soma dos valores vinculadas ao tipo "Despesa". |
| RN04 | O sistema deve registrar a data e o valor de toda transação. |
| RN05 | O Sistema terá apenas dois tipos de transação fixos: Receita e Despesa. O usuário não poderá cadastrar novos tipos. |
| RN06 | O valor de toda transação deve ser um número positivo. |

### Diagrama das Entidades

![Foto do diagrama](https://drive.google.com/file/d/1qAxgvwM_2yGPwhDIFKWwKZOwusyribC8/view)
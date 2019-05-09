# Monitoring_Project
As a monitor of the discipline Programming for mobile devices I was proposed to develop the discipline's project by my Mentor. Next..

## *Guilherme Afonso*

### 1. Objetivos.
* Exercitar os conceitos básicos vistos na disciplina: Activity, Intent, View, etc.
* Praticar o uso de componentes visuais, como listas, Widgets, imagens, etc.
* Instigar nos estudantes a criatividade para o projeto de telas e aplicações.
* Promover o desenvolvimento aplicações completas e o auto-aprendizado.

### 2. Descrição.
O controle e planejamento da vida acadêmica é essencial para que os alunos obtenham
êxito na graduação e se tornem bons profissionais. E comum aos professores observar que
alunos deixaram tarefas para a última hora ou mesmo que se esqueceram da atividade.

Outro problema é o controle das faltas e de suas notas.

Esse trabalho consiste do desenvolvimento de um aplicativo para organizar a vida acadêmica
de estudantes. Como principais funcionalidades, a aplicação deve:

###### (i) permitir o cadastro das disciplinas que o estudante está cursando e das tarefas associadas a cada disciplina;
###### (ii) o acompanhamento das notas e faltas do estudante em cada atividade/disciplina;
###### (iii) notificar o usuário quando a data de entrega de uma determinada tarefa se aproximar.

O seguintes dados devem ser armazenados para cada **Disciplina**:

* **Nome** Identificador da disciplina/ matéria (ex.: CSI401);
* **Semestre** Indicador do semestre em que o aluno está cursando a disciplina (ex.: 2o);
* **Faltas** Número de faltas que o aluno teve na disciplina;
* **Limite de Faltas** Limite de faltas que o aluno pode ter para não ser reprovado;
* **Meta** Objetivo de nota a ser alcançado (ex.: 80 pontos);
* **Andamento** Indica se a disciplina está em andamento ou já foi encerrada;

Analogamente, os seguintes dados devem ser armazenados para cada **Tarefa**:

* **Disciplina:** Disciplina à qual a tarefa pertence (ex.: CSI401);
* **Descrição** Breve descrição da tarefa (ex.: Prova 1);
* **Valor** Número de pontos que a atividade vale (ex.: 30 pontos);
* **Nota** Nota obtida na atividade (ex.: 25 pontos);
* **Data de entrega** Data na qual a atividade deverá ser entregue/realizada (ex.: 26/jun/19);
*1. Exibir apenas as opções das disciplinas cadastradas.
2. Sugiro o uso de estrutura de dados própria para datas, por exemplo Calendar no Java*
* **Tipo** Caracterizador do tipo de atividade com, ao menos, as seguintes opções de tipo:
prova, trabalho, seminário, outro;
* Prioridade Objetivo de nota a ser alcançado (ex.: 80 pontos);

Formalmente, como requisitos funcionais, a aplicação deve:

###### **(a)** Cadastrar e permitir a edição de disciplinas;
###### **(b)** Exibir a lista de disciplinas cadastradas;
###### **(c)** Cadastrar e permitir a edição de tarefas;
###### **(d)** Exibir a lista de tarefas cadastradas;
###### **(e)** Persistir todos os dados de alguma forma;
###### **(f)** Ordenar a lista de tarefas da de data de entrega mais próxima para a mais distante;
###### **(g)** Exibir, para cada disciplina, a nota total nas atividades já realizadas e as faltas;
###### **(h)** Notificar o usuário um dia antes da data de entrega de cada tarefa;
###### **(i)** Exibir gráficos de notas categorizados por tipo de avaliação e por disciplina.
###### **(j)** Fazer login de usuário pela conta Google;

O trabalho é dividido em três etapas, sendo que a etapa 1 compreende o atendimento dos
requisitos (a) e (b); a etapa 2 compreende do atendimento dos requisitos (c), (d), (e) e (f)
e a etapa 3 compreende o atendimento dos requisitos (g), (h) e (i).

# Monitoring_Project
As a monitor of the discipline Programming for mobile devices I was proposed to develop the discipline's project by my Mentor. Next..


1. Objetivos.
• Exercitar os conceitos b´asicos vistos na disciplina: Activity, Intent, View, etc.
• Praticar o uso de componentes visuais, como listas, Widgets, imagens, etc.
• Instigar nos estudantes a criatividade para o projeto de telas e aplica¸c˜oes.
• Promover o desenvolvimento aplica¸c˜oes completas e o auto-aprendizado.
2. Descri¸c˜ao.
O controle e planejamento da vida acadˆemica ´e essencial para que os alunos obtenham
ˆexito na gradua¸c˜ao e se tornem bons profissionais. E comum aos professores observar que ´
alunos deixaram tarefas para a ´ultima hora ou mesmo que se esqueceram da atividade.
Outro problema ´e o controle das faltas e de suas notas.
Esse trabalho consiste do desenvolvimento de um aplicativo para organizar a vida acadˆemica
de estudantes. Como principais funcionalidades, a aplica¸c˜ao deve (i) permitir o cadastro
das disciplinas que o estudante est´a cursando e das tarefas associadas a cada disciplina;
(ii) o acompanhamento das notas e faltas do estudante em cada atividade/disciplina; (iii)
notificar o usu´ario quando a data de entrega de uma determinada tarefa se aproximar. O
seguintes dados devem ser armazenados para cada Disciplina:
- Nome Identificador da disciplina/ mat´eria (ex.: CSI401);
- Semestre Indicador do semestre em que o aluno est´a cursando a disciplina (ex.: 2o
);
- Faltas N´umero de faltas que o aluno teve na disciplina;
- Limite de Faltas Limite de faltas que o aluno pode ter para n˜ao ser reprovado;
- Meta Objetivo de nota a ser alcan¸cado (ex.: 80 pontos);
- Andamento Indica se a disciplina est´a em andamento ou j´a foi encerrada;
Analogamente, os seguintes dados devem ser armazenados para cada Tarefa:
- Disciplina Disciplina `a qual a tarefa pertence (ex.: CSI401)1
;
- Descri¸c˜ao Breve descri¸c˜ao da tarefa (ex.: Prova 1);
- Valor N´umero de pontos que a atividade vale (ex.: 30 pontos);
- Nota Nota obtida na atividade (ex.: 25 pontos);
- Data de entrega Data na qual a atividade dever´a ser entregue/realizada (ex.: 26/jun/19)2
;
1Exibir apenas as op¸c˜oes das disciplinas cadastradas.
2Sugiro o uso de estrutura de dados pr´opria para datas, por exemplo Calendar no Java
- Tipo Caracterizador do tipo de atividade com, ao menos, as seguintes op¸c˜oes de tipo:
prova, trabalho, semin´ario, outro;
- Prioridade Objetivo de nota a ser alcan¸cado (ex.: 80 pontos);
Formalmente, como requisitos funcionais, a aplica¸c˜ao deve:
(a) Cadastrar e permitir a edi¸c˜ao de disciplinas;
(b) Exibir a lista de disciplinas cadastradas;
(c) Cadastrar e permitir a edi¸c˜ao de tarefas;
(d) Exibir a lista de tarefas cadastradas;
(e) Persistir todos os dados de alguma forma;
(f) Ordenar a lista de tarefas da de data de entrega mais pr´oxima para a mais distante;
(g) Exibir, para cada disciplina, a nota total nas atividades j´a realizadas e as faltas;
(h) Notificar o usu´ario um dia antes da data de entrega de cada tarefa;
(i) Exibir gr´aficos de notas categorizados por tipo de avalia¸c˜ao e por disciplina 3
.
(j) Fazer login de usu´ario pela conta Google;
O trabalho ´e dividido em trˆes etapas, sendo que a etapa 1 compreende o atendimento dos
requisitos (a) e (b); a etapa 2 compreende do atendimento dos requisitos (c), (d), (e) e (f)
e a etapa 3 compreende o atendimento dos requisitos (g), (h) e (i). Ser˜ao concedidos at´e
5 pontos extras para o atendimento do requisito (j).
O design de telas e de navega¸c˜ao faz parte do trabalho e ser´a considerado na avalia¸c˜ao.
O uso de imagens, listas e variados Widgets ´e fortemente recomendado. Um sugest˜ao ´e
buscar na Play Store por aplicativos de proposta similar para inspira¸c˜ao

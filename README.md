## Projeto Senai - Conclusão de curso do Senai
# senaIfit1.0 - Criado no Spring Boot - BackEnd

### Projeto consiste no desenvolvimento de um aplicativo de estabelecimentos Fitness com a linguagem Java Web.
### Projeto final de conclusão do curso técnico em de desenvolvimento de sistemas.

### O sistema foi elaborado tendo as seguintes características em mente:
• Usuários
- o Cliente: nossos clientes são usuários que vão utilizar serviços da academia.
Precisamos de suas informações pessoais de modo a identificá-los (cpf, data de
nascimento, nome, endereço, sexo, peso e altura)
- o Instrutor: um diferencial do produto são instrutores que ajudarão a aumentar o
engajamento nas unidades parceiras. Eles precisam ser identificados (cpf, data de
nascimento, nome, endereço, sexo, número do registro profissional, peso e altura)
- Parceiros: 
o Os parceiros são as academias e estúdios. Eles possuem endereço e data que
ingressaram no programa
- Atividade
o Todos os usuários da plataforma deverão realizar checkin quando forem utilizar um
parceiro. No ato do checkin, o senaiFit deverá apresentar aos clientes uma sugestão
da atividade física a ser praticada. Essa sugestão na primeira versão do senaiFit
servirão apenas de experimento, e, portanto, ao realizar o checkin cada usuário
deverá receber apenas uma sugestão de duração da atividade. 
- A sugestão deve
variar de acordo com a faixa etária do usuário, seguindo a regra abaixo:
- Para usuários entre 14 e 18 anos, o máximo de 45 minutos de atividades por
checkin, limitado a 135 minutos por semana;
4
- Para usuários entre 18 e 60 anos, o máximo de 60 minutos de atividade por
checkin, limitado a 420 minutos por semana;
- Para usuários acima de 60 anos, o máximo de 30 minutos de atividade por
checkin, limitado a 90 minutos por semana.
- Caso um usuário exceda o limite sugerido, ao realizar um checkin o sistema não deve
indicar a duração da atividade física. A sugestão deve ser substituída pelo aviso
“Cuidado! O excesso de atividade física também pode fazer mal para sua saúde!”
- O exercício além do nível permitido não é proibido. Apenas a mensagem de aviso
deve ser exibida.
- Relatórios
o É importante que acompanhemos a adesão de nossos usuários. O sistema deve ser
capaz de exibir:
- Quantos checkins um determinado parceiro teve em um mês;
- Quantos checkins um determinado usuário teve em um mês;
- Quantos usuários superaram a sugestão de atividades em um mês.

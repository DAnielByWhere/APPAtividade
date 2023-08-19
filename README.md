# APPAtividade
Atividade de Fixação atribuída pela professora Aline Firmino Brito 

# Atvidade realizada em dupla
# MEMBROS: Ana Betriz e Daniel Biondi, 2DS, Basilidides de Godoy, 2023.

### Criação do Projeto
Criamos o projeto do Android Studio no dia 13 de agosto de 2023, nenhuma adição foi feita ao projeto neste dia, ao não ser pelos primeiros passos do Git,
que foram os comandos `git init`, `git status`, `git add .`, `git commit`, `git remote add origin`, `git branch` e `git push`, e a criação do repositorio no GitHub Web. 
Os códigos podem ser vistos em execução a baixo:

<br><br><br>

![1Print (GitInit)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/78baf96f-c2f1-4947-9cf0-bbd001c1bf1a)<br>
Esse é o código que da inicio ao git no repositorio do aplicativo, o repositorio foi criado pelo Android Studio. 

<br><br><br>

![2Print(GitStatus)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/86c8b7dd-e856-488b-b945-126037c53405)<br>
O Git Status foi utilizado para verificar se o git está funcionando da forma correta, e também para verificarmos os arquivos que deveriam ser adicionados e commitados.

<br><br><br>

![3Print(GitAdd )](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/e666939c-fd71-4fb3-b66f-7499edceeff4)<br>
O Git Add foi utilizado para adicionar os arquivos pendentes ao indice para serem commitados.

<br><br><br>

![4Print(GitStatus)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/d86b4609-d2e9-4b2d-97b1-56f1b92c833b)<br>
Novamente utilizamos o Git Status para verificar se todos os arquivos pendentes foram adicionados ao índice.

<br><br><br>

![5Print(GitCommit)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/365e3b03-b329-4578-a504-cc4e72a3375a)<br>
O Git Commit -a -m, foi utilizado para dar commit nos arquivos. 

- "-a" foi utilizado para informar o git que deve ser feito commit para preparar automaticamente os arquivos que foram modificados e excluídos, 
mas os novos arquivos sobre os quais você não informou o Git não são afetados.

- "-m" para adicionar a mensagem ao commit.
- 
<br><br><br>

![6Print(GitStatus)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/a0bd691e-90d1-4401-9012-105fdc974d02)<br>
Git Status utilizado para verificar se não há nenhum arquivo pendente ao commit.

<br><br><br>

![7Print(GitRemoteAddOrigin)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/148e8a18-46e2-47a5-bcd9-635362395099)<br>
Este comando foi utilizado para adicionar o repositorio remoto a configuração do git utilizando o link do repositorio do git na web, fazendo a conexão do repositorio local com o remoto.

<br><br><br>

![8Print(GitBranch)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/c6408730-bb36-46a0-a4ed-c9e99ca70f45)<br>
Este comando foi utilizado para definir que a branch main é a principal da aplicação e para parear as outras branchs a essa.

<br><br><br>

![9Print (GitPush)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/1d908381-5ed2-4b2e-a51f-70e39a175b6d)<br>
O Git Push foi utilizado para "empurrar" as informações e alterações feitas no repositorio local ao remoto, atualizando o remoto.

<br><br><br>

### Criação das telas
No dia 14 criamos as telas no Android Studio, as telas podem ser vistas a baixo junto com os códigos utilizados no dia.

<br><br><br>

![20Print(Tela Inicial)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/cec4dd3a-2883-4cad-9d31-ae28971a76f8)<br>
Na tela principal, temos dois Buttons e uma TextView. Os dois botões estão com seus atributos `OnClick` associados a intents, que são utilizadas para abrir as telas orientadas no código das intents:<br>
`
public void abrirSecond(View view) {
Intent intent = new Intent(this, SecondActivity.class);
startActivity(intent);
    }
`

<br><br><br>

![19Print(Tela Exercicio1)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/f0a70033-7e97-421d-8f7c-0a679d099b0a)<br>
O Exercicio 1 possui duas EditTexts que são campos em que o usario pode inserir informações em formato de texto.<br>
Uma TextView que a principio não tem valor, já que ira receber ao executarmos o código.<br>
E um Button para executar o código que está ligado ao método da ação a ser executada por meio do `OnClick`.

<br><br>

![18Print(Tela Exercicio6)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/b162b04c-6f35-4df6-b6ef-c8cf909ce876)<br>
Esse exercicio (Exercicio 6) possui uma imagem retirada do proprio exercicio que é uma ImageView.<br>
Duas EditTexts onde o usuario ira inserir o que é solicitado, e caso haja algum erro, uma mensagem ira aparecer na:<br>
TextView que a principio, também n possui valor, ja que ira exibir uma mensagem ao executarmos o código.<br>
E um Button para executar o código que está ligado ao método da ação a ser executada por meio do `OnClick`.

<br><br>

### Ambos os códigos serão explicados na sessão da Criação das Funcionalidades.

<br><br><br>

![10Print(GitStatus Criação das telas)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/920494bb-9a7b-4209-8940-d9e917823780)<br>
Git Status utilizado para checar as alterações feitas ao montarmos as telas.

<br><br><br>

![11Print(GitAdd Criação das telas)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/94acbb91-3960-4d38-a2ea-0130e6a0d91e)<br>
O Git Add foi utilizado para adicionar os arquivos pendentes ao indice para serem commitados após montarmos as telas.

<br><br><br>

![12Print(GitStatus Criação das telas)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/7c70dc2a-5449-44a4-bd15-d598050d9271)<br>
Novamente utilizamos o Git Status para verificar se todos os arquivos pendentes foram adicionados ao índice após montarmos as telas.

<br><br><br>

![13Print(GitCommit Criação das telas)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/4fda18b6-395c-4a55-964d-3681b4561dd7)<br>
O Git Commit -a -m, foi utilizado para dar commit nos arquivos que foram modificados após a montagem das telas. 

- "-a" foi utilizado para informar o git que deve ser feito commit para preparar automaticamente os arquivos que foram modificados e excluídos, 
mas os novos arquivos sobre os quais você não informou o Git não são afetados.

- "-m" para adicionar a mensagem ao commit.

<br><br><br>

![14Print(GitPush Criação das telas)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/4187e160-6d18-479e-b2b0-972c3878f4b6)<br>
Git Push utilizado para enviar as alterações ao repositorio remoto após a montagem das telas.

<br><br><br>

### Adicionando Funcionalidades/Métodos
No dia 15 de agosto de 2023, montamos a escrevemos os códigos das funcionalidade ou metódos, que podem ser visto a baixo.<br><br>

![15Print(Codigo Exercicio1)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/01e2e54c-1d10-4179-aa4c-47c1108997ec)<br>
Aqui temos o código utilizado no Exercicio 1.<br>
No começo da tela temos a declaração das 3 variaveis que serão utilizadas `editTextA`, `editTextB` e `textViewResultado`;<br>
Dentro do método `OnCreate` temos a associação das variaveis aos campos que ou receberão os valores das variaveis, ou irão informar os valores das variaveis;<br>
Os campos sendo `editTextA`, `editTextB` e `textViewResultado`;<br>
Logo a abaixo temos o método utilizado, que é informado como um método publico, com o nome `verificarMultiplos`;<br>
Depois, temos a declaração de variaveis que irão receber e converter as informações dos campos em tipo int;<br>
E a estrutura de condicional, que de forma simples diz que se o resto das divisões dos valores de A e B ou B e A, for igual a 0, eles são multiplos;<br>
Caso contrario, eles não são multiplos;<br>
E nas duas situações temos o código `textView.setText` que ira setar um texto para a TextView, neste caso sendo "São Multiplos" e "Não são multiplos".

<br><br><br>

![16Print(Codigo Exercicio6)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/fe7d07b9-20a9-41ef-b351-cd1bb0ec394a)<br>
![17Print(Codigo Exercicio6)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/756582de-47b6-498b-bd01-ce2f8887807e)<br>
Aqui temos o código utilizado no Exercicio 6.<br>
No começo da tela (primeira print) temos a declaração das 3 variaveis que serão utilizadas `editTextOpcao`, `editTextQTD` e `textViewPreco`;<br>
Depois, temos a declaração da variavel que irá receber e converter as informações do campo `editTextQTD` em tipo int;<br>
E duas variaveis, uma que recebera os valores dos produtos de forma individual, e a outra que irá receber o valor total da multiplicação do `Valor` vezes o `Preco`;<br>
E uma variavel que irá receber o código em String, cada código sendo uma letra das opções disponiveis, que são `C`, `R` e `S`;<br><br>
## !O Switch Case esta sendo utilizado como sugestão do Android Studio, o código foi inicialmente feito com If e Else

<br><br>

De forma simples de dizer, o código funciona em casos (explicação baseada no switch case). Caso o código digitado seja "C", o `Valor` recebera 2, e uma conta será feita utilizando a `QTD` e o `Valor`, convertendo de volta para int.<br>
Em resumo é isso, a mesma coisa acontece nos outros dois casos, com a unica diferença sendo o numero atribuido ao `Valor`, em `R` sendo 2.50 e em `S` sendo 1.50.<br>
Já o ultimo caso, caso o código inserido pelo usuario esteja errado ou a quantidade não seja um numero, o sistema avisa dizendo que há algo errado.<br>
Em todos os casos, uma mensagem é inserida a tela dizendo o valor a ser pago.

<br><br><br>

![21Print(GitStatus Funcionalidades)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/9641f86e-75e6-42be-a44a-9b23854189c7)<br>
Git Status utilizado para checar as alterações feitas ao adicionarmos as funcionalidades.

<br><br><br>

![22Print(GitAdd funcionalidades)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/382258c6-1c4a-4c23-a767-38d016f6e045)<br>
O Git Add foi utilizado para adicionar os arquivos pendentes ao indice para serem commitados após adicionarmos as funcionalidades.

<br><br><br>

![23Print(GitStatus Funcionalidades)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/f9c523a6-2a3b-43f0-beff-b3c3224c729a)<br>
Novamente utilizamos o Git Status para verificar se todos os arquivos pendentes foram adicionados ao índice após criarmos os métodos.

<br><br><br>

![24Print(GitCommit funcionalidades)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/d1a5df3d-d28b-4c27-9e7d-bde42639d710)
O Git Commit -a -m, foi utilizado para dar commit nos arquivos que foram modificados após adicionarmos as funcionalidades. 

- "-a" foi utilizado para informar o git que deve ser feito commit para preparar automaticamente os arquivos que foram modificados e excluídos, 
mas os novos arquivos sobre os quais você não informou o Git não são afetados.

- "-m" para adicionar a mensagem ao commit.
- 
<br><br><br>

![25Print(GitStatus Funcionalidades)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/d8c34fd0-e6d0-4b31-a64c-ba678e295805)
Git Status utilizado para verificar se não há nenhum arquivo pendente ao commit após adicionarmos as funcionalidades.

<br><br><br>

![26Print(Funcionalidades)](https://github.com/DAnielByWhere/APPAtividade/assets/127262745/0a6cb1d3-7c9d-487a-8fb1-7f8d8ba3f996)<br>
Git Push utilizado para enviar as alterações ao repositorio remoto após adicionarmos as funcionalidades.
<br><br><br>

### Link do vídeo do aplicativo funcionando (Canal do membro Daniel Biondi)
### https://youtu.be/49N0vjnZYvM

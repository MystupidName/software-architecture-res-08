Utilizar linhas de comando para executar e testar o projeto

para executá-lo, utilizar a seguinte instrução:
$ mvn clean spring-boot:run

As instruções seguem o modelo descrito abaixo:

método  | URl                 | JSON de retorno                                           | Finalidade
GET     | /funcionarios       | [{"id":<value>,"nome":<>,"idade":<>,"salario":<>},{...}]  |
POST    | /funcionarios       | [{"id":<value>,"nome":<>,"idade":<>,"salario":<>},{...}]
PUT     | /funcionarios/{id}  |
DELETE  | /funcionarios/{id}  |

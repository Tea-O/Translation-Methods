# Кс- Грамматика

```
S -> FT N(AS);

FT -> TYPE SUB

SUB -> "*" SUB
SUB -> EPS

AS -> EPS 
AS -> AS'
AS' -> A AS"
AS" -> EPS 
AS'' ->  "," AS'

A -> TYPE AN

AN -> "*" AN
AN -> N
N -> IDENTIFIER
```

| Нетерминалы            | Описание                                                                   |
|------------------------|----------------------------------------------------------------------------|
| ```S -> FT N(AS);```   | Описание функции в С                                                       |
| ```FT -> TYPE```       | Описание типа функции в С                                                  |                         
| ```N -> IDENTIFIER```  | Имя функции или аргумента в функции                                        |
| ```AS -> EPS```        | отсутствие аргументов в функции                                            |
| ```AS -> AS'```        | агрументы в функции                                                        |
| ``` AS' -> A AS"```    | описание текущего аргумента и переход к <br/>следующему если такой имеется |
| ```AS'' ->  "," AS'``` | переход к описанию следующего аргумента функции                            |
| ```A -> TYPE AN```     | описание типа аргумента                                                    |
| ```AS" -> EPS ```      | отсутсвие последующего аргумента функции                                   |
| ```AN -> "*" AN```     | описание указателя на аргумент/указатель и переход к следующему описанию   |
| ```AN -> N```          | описание имени аргумента                                                   |

# First and Follow

| Нетерминалы | Fisrt           | Follow     |
|-------------|-----------------|------------|
| ```S```     | TYPE            | $          |
| ```FT```    | TYPE            | IDENTIFIER |
| ```AS```    | EPS, TYPE       | )          |
| ```AS'```   | TYPE            | )          |
| ```AS''```  | "," , EPS       | )          |
| ```A```     | TYPE            | ",", )     |
| ```AN```    | "*" ,IDENTIFIER | ",", )     |

по множеству first и follow построим Parser


grammar lab3;

@header {
import java.util.stream.IntStream;
import java.util.*;
}

start returns [StringBuilder res] @init {
    Map<String, Integer> vars = new HashMap<>();
    StringBuilder res = new StringBuilder();
    $res = res;
} : (assign[vars, res])*;

assign [Map<String, Integer> vars, StringBuilder res] :
    variable ASSIGN expr[vars] SEMICOLON {
        $vars.put($variable.text, $expr.val);
        $res.append($variable.text + "=" + $expr.val + ";\n");
    }
    ;

expr [Map<String, Integer> vars] returns [int val]:
    mulDivTerm[vars] { int mulDivTermResult = $mulDivTerm.val; }
    addSub[vars, mulDivTermResult] { $val = $addSub.val; }
    ;


addSub [Map<String, Integer> vars, int acc] returns [int val] :
    (op=(ADD|SUB) mulDivTerm[vars] { acc = ($op.getType() == ADD) ?
    acc + $mulDivTerm.val : acc - $mulDivTerm.val; })
    addSub[vars, acc] { $val = $addSub.val; } |
    { $val = acc; };

mulDivTerm [Map <String, Integer> vars] returns [int val]:
    term[vars] { int termResult = $term.val; }
    mulDiv[vars, termResult] { $val = $mulDiv.val; }
    ;

mulDiv [Map <String, Integer> vars, int acc] returns [int val]:
    (op=(MUL|DIV) term[vars] {acc = ($op.getType() == MUL) ?
    acc * $term.val : acc / $term.val; })
    mulDiv[vars, acc] {$val = $mulDiv.val;} |
    {$val = acc;};

term [Map <String, Integer> vars] returns [int val]:
    '(' expr[vars] ')' { $val = $expr.val; } |
    number { $val = Integer.parseInt($number.text); } |
    variable {
        Integer varValue = $vars.get($variable.text);
        $val = (varValue == null) ? 0 : varValue;
    } |
    '[' n=expr[$vars] COMMA k=expr[$vars] ']' {
        int nkValue = $n.val- $k.val;
        int nFactorial = IntStream.rangeClosed(2, $n.val).reduce(1, (x, y) -> x * y);
        int kFactorial = IntStream.rangeClosed(2, $k.val).reduce(1, (x, y) -> x * y);
        int nkFactorial = IntStream.rangeClosed(2, nkValue).reduce(1, (x, y) -> x * y);
        $val = nFactorial / (kFactorial * nkFactorial);
    };




VAR: [a-z]+[A-Z0-9]*;
NUM: [0-9]+;
ASSIGN: '=';
SEMICOLON: ';';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
COMMA: ',';
variable : VAR;
number: NUM;
WS : [ \n\r\t]+ -> skip;


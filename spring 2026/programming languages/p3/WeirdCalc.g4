// GRAMMAR
grammar WeirdCalc;

@header {
import java.util.HashMap;
import java.util.Map;
}

@members {
    // dictionary for storing variables and their values
    Map<String, Integer> memory = new HashMap<>();
}

// PARSER
// handles all lines in the program (even empty ones)
program
    @init { memory.clear(); }
    : program line
    | // empty
    ;

// single line: assignment or print
line
    : assignment SEMI
    | print SEMI
    ;

// updates variable with result of an expression
assignment
    : IDENTIFIER ASSIGN exp {
        memory.put($IDENTIFIER.text, $exp.val);
    }
    ;

// print value or newline
print
    : PRINT LPAREN exp RPAREN {
        System.out.println($exp.val);
    }
    | PRINT LPAREN RPAREN {
        System.out.println();
    }
    ;

// handles # operator logic: 0 if left divisible by right, 1 otherwise
exp returns [int val]
    : left=exp HASH right=item { $val = ($left.val % $right.val == 0) ? 0 : 1; }
    | item { $val = $item.val; }
    ;

// handles @ and ~ operators 
item returns [int val]
    : left=operand AT right=item { $val = Math.abs($left.val + $right.val); }   //adds and abs the values 
    | left=operand TILDE right=item { $val = ($left.val * $left.val) + ($right.val * $right.val); } // sums their squares
    | operand { $val = $operand.val; }
    ;

// handles $ operator (checks sign of value: -1, 0, or 1)
operand returns [int val]
    : DOLLAR operand {
        if ($operand.val < 0) $val = -1;
        else if ($operand.val == 0) $val = 0;
        else $val = 1;
    }
    | data {
        $val = $data.val;
    }
    ;

// gets value from a number or stored variable
data returns [int val]
    : number {
        $val = $number.val;
    }
    | IDENTIFIER {
        if (memory.containsKey($IDENTIFIER.text)) {
            $val = memory.get($IDENTIFIER.text);
        } else {
            System.err.println("Error: Variable '" + $IDENTIFIER.text + "' is not initialized.");
            $val = 0;
        }
    }
    ;

// returns int value of number + handles negatives
number returns [int val]
    : MINUS DIGITS {
        $val = -Integer.parseInt($DIGITS.text);
    }
    | DIGITS {
        $val = Integer.parseInt($DIGITS.text);
    }
    ;



// LEXER
SEMI: ';';
ASSIGN: '=';
PRINT: 'print';
LPAREN: '(';
RPAREN: ')';
HASH: '#';
AT: '@';
TILDE: '~';
DOLLAR: '$';
MINUS: '-';

// digits
fragment DIGIT: [0-9];
DIGITS: DIGIT+;

// identifiers
fragment LETTER: [a-zA-Z];
fragment LETTER_OR_DIGIT: [a-zA-Z0-9];
IDENTIFIER: LETTER LETTER_OR_DIGIT*;

// ignore whitespace and comments
WS: [ \t\r\n\f]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
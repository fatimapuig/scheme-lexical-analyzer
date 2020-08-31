%%
/* A scanner for Scheme written in JFLEX */

%class Scanner 

%standalone


/* Rules */


/* Identifiers */
Reserved = "access" | "and" | "begin" | "bkpt" | "case" | "cond" | "cons-stream" | "declare"
            | "default-object?" | "define" | "deine-integrable" | "define-macro" | "define-structure"
            | "define-syntax" | "delay" | "do" | "fluid-let" | "if" | "in-package" | "lambda"
            | "let" | "let*" | "let-syntax" | "letrec" | "local-declare" | "macro" | "make-environment"
            | "named-lambda" | "or" | "quasiquote" | "quote" | "scode-quote" | "sequence" | "set!"
            | "the-environment" | "unassigned?" | "using-syntax"
Identifier = {Initial}({Subsequent}*) | [\+\-] | "..."
Initial = {Letter} | [!$%&*\/:<=>?~_\^]
Subsequent = {Initial} | {Digit} | [\.+\-]
Whitespace = [ \n\r\t]+
Letter = [a-zA-Z]
Digit = [0-9]

/* Booleans */
Boolean = "#"[TFtf]

/* Numbers */
Num = {Prefix}{Complex}
Complex = {Real} | {Real}[@]{Real} | {Real} [+-] {Imag} | [+-]{Imag}
Imag = {UReal}?[i]
Real = {Sign}{UReal}
UReal = {UInteger} | {UInteger}[\/]{UInteger} | {Decimal}
UInteger = {Digit}+[#]*
Prefix = {Radix}{Exactness} | {Exactness}{Radix}
Decimal = {UInteger}{Exponent} | "."{Digit}+"#"*{Suffix} | {Digit}+"."{Digit}*"#"*{Suffix}
            | {Digit}+"#"+".""#"*{Suffix}
Radix = "" | "#d"

Suffix =  "" | {Exponent}
Exponent = {ExponentMarker}{Sign}{Digit}+
ExponentMarker = [esfdl]
Sign = "" | [+-]
Exactness = "" | "#"[ie]

/* Miscellaneous */
Dot = "."
QuotationMarks = ['`]
UnquotationMarks = "," | ",@"

/* Parentheses */
OpenParenthesis = "("
CloseParenthesis = ")"
OpenVectorParenthesis = "*("

/* Characters */
Character = "#"[\\]. | "#"[\\]{Whitespace}


%%


;.*$ {/* Skip Comment */}
{Whitespace} {/* Skip Whitespace */}

/* Relevant Tokens */
{Reserved} {System.out.printf("RESERVED \t\t %s \n",yytext());}
{Dot} {System.out.printf("DOT \t\t %s \n",yytext());}
{QuotationMarks} {System.out.printf("QUOTATIONMARKS \t\t %s \n",yytext());}
{UnquotationMarks} {System.out.printf("UNQUOTATIONMARKS \t\t %s \n",yytext());}
{OpenParenthesis} {System.out.printf("OPENPAREN \t\t %s \n",yytext());}
{CloseParenthesis} {System.out.printf("CLOSEPAREN \t\t %s \n",yytext());}
{OpenVectorParenthesis} {System.out.printf("OPENVECTORPAREN \t\t %s \n",yytext());}
{Character} {System.out.printf("CHARACTER \t\t %s \n",yytext());}
{Num} {System.out.printf("NUMBER \t\t\t %s \n",yytext());}
{Boolean} {System.out.printf("BOOLEAN \t\t %s \n",yytext());}
{Identifier} {System.out.printf("IDENTIFIER \t\t %s \n",yytext());}
. {System.out.printf("UNIDENTIFIED SYM \t\t %s \n",yytext());}

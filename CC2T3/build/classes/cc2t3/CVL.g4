grammar CVL;

@members {
        private void stop(String string) {
            throw new ParseCancellationException(string);
        }
}

documento : listaCampos+=campo+;

campo: nomeCampo=ID ':' valor;

valor: STRING | '{' documento '}';

ID: ( 'a'..'z' ) ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

COMENTARIO: '#' ~('\n' | '\r')* ('\n' | '\r') {skip();};

STRING: '"' (~('\n' | '\r' | '"')*? )'"';

WS: [ \t\r\n]+ {skip();};

ERROR: . {stop("Linha "+getLine()+": "+getText()+" - simbolo nao identificado");};
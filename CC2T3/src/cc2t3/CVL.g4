grammar CVL;

documento : campo*;

campo: nomeCampo=ID ':' valor;

valor: STRING | '{' documento '}';

ID: ( 'a'..'z' ) ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')* ;

COMENTARIO: '#' ~('\n' | '\r')* ('\n' | '\r') {skip();};

STRING: '"'~('\n')*'"';

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};
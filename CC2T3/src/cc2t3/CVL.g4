grammar CVL;

curriculo: 'curriculo:' nome especialidade contato;

nome: 'nome:' CADEIA;

especialidade: 'especialidade:' CADEIA;

contato: 'contato:' (tel | email)+  ;

email: 'email:' MAIL;

tel: 'tel:' TELEFONE;

fragment
DIGITO: ('0'..'9'); 

NUMERO: DIGITO DIGITO DIGITO DIGITO DIGITO '-' DIGITO DIGITO DIGITO DIGITO;

DDD: '(' ('0'..'9') ('0'..'9') ')';

fragment
CARACTERE: ('a'..'z' | 'A'..'Z');

TELEFONE: DDD NUMERO;

MAIL: CARACTERE+ '@' CARACTERE+ '.' CARACTERE CARACTERE CARACTERE;

COMENTARIO: '#' ~('\n' | '\r')* ('\n' | '\r') {skip();};

CADEIA: '"'~('\n')*'"';

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

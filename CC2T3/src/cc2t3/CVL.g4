grammar CVL;

curriculo: 'curriculo:' nome especialidade contato formacoes idiomas;

nome: 'nome:' CADEIA;

especialidade: 'especialidade:' CADEIA;

contato: 'contato:' (tel | email | redess)+;

formacoes: 'formacoes:' (formacao)+;

formacao: curso=CADEIA universidade=CADEIA inicio=ANO ' - ' atual=(ANO | 'Presente');

idiomas: 'idiomas:' (idioma += IDIOMA)+;

email: 'email:' MAIL;

tel: 'tel:' TELEFONE;

redess: 'social:' (linkedin | github | lattes)+;

linkedin: ('http://' | 'https://')? ('www.')? 'linkedin.com/in/' linkedinU=USUARIO;

github: ('http://' | 'https://')? ('www.')? 'github.com/' githubU=USUARIO;

lattes: ('http://' | 'https://')? ('www.')? 'lattes.cnpq.br/' lattesU=USUARIO;

fragment
DIGITO: ('0'..'9'); 

IDIOMA: '"'~('\t' | '\r' | '\n')* ('(Nativo)' | '(Avançado)' | '(Intermediário)' | '(Básico)')'"';

USUARIO: '"'~(' ' | '\t' | '\r' | '\n')*'"';
  
NUMERO: DIGITO DIGITO DIGITO DIGITO DIGITO '-' DIGITO DIGITO DIGITO DIGITO;

DDD: '(' ('0'..'9') ('0'..'9') ')';

fragment
CARACTERE: ('a'..'z' | 'A'..'Z');

TELEFONE: DDD NUMERO;

MAIL: CARACTERE+ '@' CARACTERE+ '.' CARACTERE CARACTERE CARACTERE;

COMENTARIO: '#' ~('\n' | '\r')* ('\n' | '\r') {skip();};

CADEIA: '"'~('\n')*'"';

ANO: DIGITO DIGITO DIGITO DIGITO;

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

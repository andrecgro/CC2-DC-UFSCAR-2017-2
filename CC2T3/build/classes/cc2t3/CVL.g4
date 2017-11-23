grammar CVL;

curriculo: 'curriculo:' nome especialidade contato formacao idiomas resumo experiencias projetos;

nome: 'nome:' CADEIA;

especialidade: 'especialidade:' CADEIA;

contato: 'contato:' (tel | email | redess)+;

formacao: 'formacao:' CADEIA=curso CADEIA=universidade ANO=inicio ' - ' (ANO=atual | 'Presente');

idiomas: 'idiomas:' IDIOMA;

email: 'email:' MAIL;

tel: 'tel:' TELEFONE;

redess: 'social:' (linkedin | github | lattes)+;

linkedin: ('http://' | 'https://')? ('www.')? 'linkedin.com/in/' USUARIO=linkedin;

github: ('http://' | 'https://')? ('www.')? 'github.com/' USUARIO=github;

lattes: ('http://' | 'https://')? ('www.')? 'lattes.cnpq.br/' USUARIO=lattes;

fragment
DIGITO: ('0'..'9'); 

USUARIO: '"'~(' ' | '\t' | '\r' | '\n')*'"';

NUMERO: DIGITO DIGITO DIGITO DIGITO DIGITO '-' DIGITO DIGITO DIGITO DIGITO;

DDD: '(' ('0'..'9') ('0'..'9') ')';

fragment
CARACTERE: ('a'..'z' | 'A'..'Z');

TELEFONE: DDD NUMERO;

MAIL: CARACTERE+ '@' CARACTERE+ '.' CARACTERE CARACTERE CARACTERE;

COMENTARIO: '#' ~('\n' | '\r')* ('\n' | '\r') {skip();};

CADEIA: '"'~('\n')*'"';

IDIOMA:  '"'~(' ' | '\t' | '\r' | '\n')* ('Nativo' | 'Avançado' | 'Intermediário' | 'Básico')'"';

ANO: DIGITO DIGITO DIGITO DIGITO;

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};

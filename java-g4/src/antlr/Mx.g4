grammar Mx;

program: String*;

String: [a-zA-Z0-9_]+;

WS: [ \t\r\n]+ -> skip;

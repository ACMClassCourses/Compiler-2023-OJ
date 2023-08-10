grammar Mx;

// Note: this is just a demo, not a complete complete grammar for Mx language.

program: String*;

String: [a-zA-Z0-9_]+;

WS: [ \t\r\n]+ -> skip;

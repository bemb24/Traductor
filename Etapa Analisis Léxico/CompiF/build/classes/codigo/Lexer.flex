package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
Len = [a-zA-Z_]+
Dig = [0-9]+
Esp = [ ,\t,\r]+
%{
    public String lexeme;
%}
%%
"hello" | "hi" {lexeme=yytext(); return hola;}
I {lexeme=yytext(); return yo;}
you {lexeme=yytext(); return tú;}
she {lexeme=yytext(); return ella;}
he {lexeme=yytext(); return él;}
it {lexeme=yytext(); return ello;}
we {lexeme=yytext(); return nosotros;}
they {lexeme=yytext(); return ellos;}
red {lexeme = yytext(); return rojo;}
yellow {lexeme = yytext(); return amarillo;}
pink {lexeme = yytext(); return rosado;}
purple {lexeme = yytext(); return morado;}
blue {lexeme = yytext(); return azul;}
orange {lexeme = yytext(); return naranja;}
green {lexeme = yytext(); return verde;}
white {lexeme = yytext(); return blanco;}
gray {lexeme = yytext(); return gris;}
black {lexeme = yytext(); return negro;}
good {lexeme = yytext(); return bueno;}
bad {lexeme = yytext(); return malo;}
thin {lexeme = yytext(); return delgado;}
fat {lexeme = yytext(); return gordo;}
dry {lexeme = yytext(); return seco;}
short {lexeme = yytext(); return corto;}
this {lexeme = yytext(); return este;}
that {lexeme = yytext(); return aquel;}
these {lexeme = yytext(); return estos;}
those {lexeme = yytext(); return aquellos;}
each {lexeme = yytext(); return cada;}
every {lexeme = yytext(); return todo;}
some {lexeme = yytext(); return algún;}
any {lexeme = yytext(); return cualquier;}
what {lexeme = yytext(); return qué;}
which {lexeme = yytext(); return cuál;}
whose {lexeme = yytext(); return de_quién;}
how {lexeme = yytext(); return cuantos;}
my {lexeme = yytext(); return mi;}
your {lexeme = yytext(); return tu;}
"his" | "her" | "its" | "their" {lexeme = yytext(); return su;}
our {lexeme = yytext(); return nuestro;}
is {lexeme = yytext(); return es;}
have {lexeme = yytext(); return tengo;}
am {lexeme = yytext(); return soy;}
are {lexeme = yytext(); return eres;}
yes {lexeme = yytext(); return si;}
not {lexeme = yytext(); return no;}
dog {lexeme = yytext(); return perro;}
cat {lexeme = yytext(); return gato;}
rooster {lexeme = yytext(); return gallo;}
hen {lexeme = yytext(); return gallina;}
sheep {lexeme = yytext(); return obeja;}
duck {lexeme = yytext(); return pato;}
turkey {lexeme = yytext(); return pavo;}
rabbit {lexeme = yytext(); return conejo;}
pig {lexeme = yytext(); return cerdo;}
cow {lexeme = yytext(); return vaca;}
penguin {lexeme = yytext(); return pingüino;}
deer {lexeme = yytext(); return venado;}
whale {lexeme = yytext(); return ballena;}
horse {lexeme = yytext(); return caballo;}
frog {lexeme = yytext(); return rana;}
bull {lexeme = yytext(); return toro;}
man {lexeme = yytext(); return hombre;}
men {lexeme = yytext(); return hombres;}
woman {lexeme = yytext(); return mujer;}
women {lexeme = yytext(); return mujeres;}
boy {lexeme = yytext(); return niño;}
boys {lexeme = yytext(); return niños;}
girl {lexeme = yytext(); return niña;}
girls {lexeme = yytext(); return niñas;}
car {lexeme = yytext(); return carro;}
plane {lexeme = yytext(); return avión;}
bicycle {lexeme = yytext(); return bicicleta;}
bus {lexeme = yytext(); return bus;}
boat {lexeme = yytext(); return barco;}
train {lexeme = yytext(); return tren;}
jobs {lexeme = yytext(); return empleos;}
nurse {lexeme = yytext(); return enfermera;}
doctor {lexeme = yytext(); return doctor;}
teacher {lexeme = yytext(); return maestro;}
cook {lexeme = yytext(); return cocinero;}
farmer {lexeme = yytext(); return granjero;}
hair {lexeme = yytext(); return cabello;}
head {lexeme = yytext(); return cabeza;}
ear {lexeme = yytext(); return oreja;}
eyes {lexeme = yytext(); return ojos;}
nose {lexeme = yytext(); return nariz;}
mouth {lexeme = yytext(); return boca;}
shoulder {lexeme = yytext(); return hombro;}
arm {lexeme = yytext(); return brazo;}
hand {lexeme = yytext(); return mano;}
knee {lexeme = yytext(); return rodilla;}
leg {lexeme = yytext(); return pierna;}
foot {lexeme = yytext(); return pie;}
feet {lexeme = yytext(); return pies;}
book {lexeme = yytext(); return libro;}
desk {lexeme = yytext(); return escritorio;}
chair {lexeme = yytext(); return silla;}
computer {lexeme = yytext(); return computadora;}
glue {lexeme = yytext(); return pegamento;}
{Esp} {/*Ignore*/}
. {return ERROR;} 

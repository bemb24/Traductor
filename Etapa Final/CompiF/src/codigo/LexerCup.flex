package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
Len = [a-zA-Z_]+
Dig = [0-9]+
Esp = [ ,\t,\r,\n]+
%{
    private Symbol symbol (int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol (int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%
"hello"|"hi" {return new Symbol(sym.hola, yychar, yyline,yytext());}
"goodbye"|"bye" {return new Symbol(sym.adios, yychar, yyline,yytext());}
I {return new Symbol(sym.yo, yychar, yyline,yytext());}
you {return new Symbol(sym.tú, yychar, yyline,yytext());}
she {return new Symbol(sym.ella, yychar, yyline,yytext());}
he {return new Symbol(sym.él, yychar, yyline,yytext());}
it {return new Symbol(sym.ello, yychar, yyline,yytext());}
we {return new Symbol(sym.nosotros, yychar, yyline,yytext());}
they {return new Symbol(sym.ellos, yychar, yyline,yytext());}
red {return new Symbol(sym.rojo, yychar, yyline,yytext());}
yellow {return new Symbol(sym.amarillo, yychar, yyline,yytext());}
pink {return new Symbol(sym.rosado, yychar, yyline,yytext());}
purple {return new Symbol(sym.morado, yychar, yyline,yytext());}
blue {return new Symbol(sym.azul, yychar, yyline,yytext());}
orange {return new Symbol(sym.naranja, yychar, yyline,yytext());}
green {return new Symbol(sym.verde, yychar, yyline,yytext());}
white {return new Symbol(sym.blanco, yychar, yyline,yytext());}
gray {return new Symbol(sym.gris, yychar, yyline,yytext());}
black {return new Symbol(sym.negro, yychar, yyline,yytext());}
good {return new Symbol(sym.bueno, yychar, yyline,yytext());} 
bad {return new Symbol(sym.malo, yychar, yyline,yytext());}
thin {return new Symbol(sym.delgado, yychar, yyline,yytext());}
fat {return new Symbol(sym.gordo, yychar, yyline,yytext());}
dry {return new Symbol(sym.seco, yychar, yyline,yytext());}
short {return new Symbol(sym.corto, yychar, yyline,yytext());}
"this" | "east" {return new Symbol(sym.este, yychar, yyline,yytext());}
that {return new Symbol(sym.aquel, yychar, yyline,yytext());}
these {return new Symbol(sym.estos, yychar, yyline,yytext());}
those {return new Symbol(sym.aquellos, yychar, yyline,yytext());}
each {return new Symbol(sym.cada, yychar, yyline,yytext());}
every {return new Symbol(sym.todo, yychar, yyline,yytext());}
some {return new Symbol(sym.algún, yychar, yyline,yytext());}
any {return new Symbol(sym.cualquier, yychar, yyline,yytext());}
what {return new Symbol(sym.qué, yychar, yyline,yytext());}
which {return new Symbol(sym.cuál, yychar, yyline,yytext());}
whose {return new Symbol(sym.de_quién, yychar, yyline,yytext());}
how {return new Symbol(sym.cuantos, yychar, yyline,yytext());}
my {return new Symbol(sym.mi, yychar, yyline,yytext());}
your {return new Symbol(sym.tu, yychar, yyline,yytext());}
"his" | "her" | "its" | "your" | "their" {return new Symbol(sym.su, yychar, yyline,yytext());}
our {return new Symbol(sym.nuestro, yychar, yyline,yytext());}
is {return new Symbol(sym.es, yychar, yyline,yytext());}
am {return new Symbol(sym.soy, yychar, yyline,yytext());}
are {return new Symbol(sym.eres, yychar, yyline,yytext());}
yes {return new Symbol(sym.si, yychar, yyline,yytext());}
"not"|"don't" {return new Symbol(sym.no, yychar, yyline,yytext());}
dog {return new Symbol(sym.perro, yychar, yyline,yytext());}
cat {return new Symbol(sym.gato, yychar, yyline,yytext());}
rooster {return new Symbol(sym.gallo, yychar, yyline,yytext());}
hen {return new Symbol(sym.gallina, yychar, yyline,yytext());}
sheep {return new Symbol(sym.obeja, yychar, yyline,yytext());}
duck {return new Symbol(sym.pato, yychar, yyline,yytext());}
turkey {return new Symbol(sym.pavo, yychar, yyline,yytext());}
rabbit {return new Symbol(sym.conejo, yychar, yyline,yytext());}
pig {return new Symbol(sym.cerdo, yychar, yyline,yytext());}
cow {return new Symbol(sym.vaca, yychar, yyline,yytext());}
penguin {return new Symbol(sym.pingüino, yychar, yyline,yytext());}
deer {return new Symbol(sym.venado, yychar, yyline,yytext());}
whale {return new Symbol(sym.ballena, yychar, yyline,yytext());}
horse {return new Symbol(sym.caballo, yychar, yyline,yytext());}
frog {return new Symbol(sym.rana, yychar, yyline,yytext());}
bull {return new Symbol(sym.toro, yychar, yyline,yytext());}
man {return new Symbol(sym.hombre, yychar, yyline,yytext());}
men {return new Symbol(sym.hombres, yychar, yyline,yytext());}
woman {return new Symbol(sym.mujer, yychar, yyline,yytext());}
women {return new Symbol(sym.mujeres, yychar, yyline,yytext());}
boy {return new Symbol(sym.niño, yychar, yyline,yytext());}
boys {return new Symbol(sym.niños, yychar, yyline,yytext());}
girl {return new Symbol(sym.niña, yychar, yyline,yytext());}
girls {return new Symbol(sym.niñas, yychar, yyline,yytext());}
car {return new Symbol(sym.carro, yychar, yyline,yytext());}
plane {return new Symbol(sym.avión, yychar, yyline,yytext());}
bicycle {return new Symbol(sym.bicicleta, yychar, yyline,yytext());}
bus {return new Symbol(sym.bus, yychar, yyline,yytext());}
boat {return new Symbol(sym.barco, yychar, yyline,yytext());}
train {return new Symbol(sym.tren, yychar, yyline,yytext());}
jobs {return new Symbol(sym.empleos, yychar, yyline,yytext());}
nurse {return new Symbol(sym.enfermera, yychar, yyline,yytext());}
doctor {return new Symbol(sym.doctor, yychar, yyline,yytext());}
teacher {return new Symbol(sym.maestro, yychar, yyline,yytext());}
cook {return new Symbol(sym.cocinero, yychar, yyline,yytext());}
farmer {return new Symbol(sym.granjero, yychar, yyline,yytext());}
accountant {return new Symbol(sym.contador, yychar, yyline,yytext());}
architect {return new Symbol(sym.arquitecto, yychar, yyline,yytext());}
astronaut {return new Symbol(sym.astronauta, yychar, yyline,yytext());}
baker {return new Symbol(sym.panadero, yychar, yyline,yytext());}
butcher {return new Symbol(sym.carnicero, yychar, yyline,yytext());}
cerpenter {return new Symbol(sym.carpintero, yychar, yyline,yytext());}
cashier {return new Symbol(sym.cajero, yychar, yyline,yytext());}
clear {return new Symbol(sym.limpio, yychar, yyline,yytext());}
clown {return new Symbol(sym.payaso, yychar, yyline,yytext());}
hair {return new Symbol(sym.cabello, yychar, yyline,yytext());}
head {return new Symbol(sym.cabeza, yychar, yyline,yytext());}
ear {return new Symbol(sym.oreja, yychar, yyline,yytext());}
eyes {return new Symbol(sym.ojos, yychar, yyline,yytext());}
Nose {return new Symbol(sym.nariz, yychar, yyline,yytext());}
mouth {return new Symbol(sym.boca, yychar, yyline,yytext());}
shoulder {return new Symbol(sym.hombro, yychar, yyline,yytext());}
arm {return new Symbol(sym.brazo, yychar, yyline,yytext());}
hand {return new Symbol(sym.mano, yychar, yyline,yytext());}
knee {return new Symbol(sym.rodilla, yychar, yyline,yytext());}
leg {return new Symbol(sym.pierna, yychar, yyline,yytext());}
foot {return new Symbol(sym.pie, yychar, yyline,yytext());}
feet {return new Symbol(sym.pies, yychar, yyline,yytext());}
face {return new Symbol(sym.cara, yychar, yyline,yytext());}
tooth {return new Symbol(sym.dientes, yychar, yyline,yytext());}
tongue {return new Symbol(sym.lengua, yychar, yyline,yytext());}
forehead {return new Symbol(sym.frente, yychar, yyline,yytext());}
liver {return new Symbol(sym.higado, yychar, yyline,yytext());}
kidneys {return new Symbol(sym.riñones, yychar, yyline,yytext());}
brain {return new Symbol(sym.cerebro, yychar, yyline,yytext());}
heart {return new Symbol(sym.corazon, yychar, yyline,yytext());}
lungs {return new Symbol(sym.pulmones, yychar, yyline,yytext());}
ankle {return new Symbol(sym.tobillo, yychar, yyline,yytext());}
shin {return new Symbol(sym.espinilla, yychar, yyline,yytext());}
elbow {return new Symbol(sym.codo, yychar, yyline,yytext());}
finger {return new Symbol(sym.dedos, yychar, yyline,yytext());}
palm {return new Symbol(sym.palma, yychar, yyline,yytext());}
book {return new Symbol(sym.libro, yychar, yyline,yytext());}
desk {return new Symbol(sym.escritorio, yychar, yyline,yytext());}
chair {return new Symbol(sym.silla, yychar, yyline,yytext());}
computer {return new Symbol(sym.computadora, yychar, yyline,yytext());}
glue {return new Symbol(sym.pegamento, yychar, yyline,yytext());}
balcony {return new Symbol(sym.balcon, yychar, yyline,yytext());}
ceiling {return new Symbol(sym.tello, yychar, yyline,yytext());}
cornice {return new Symbol(sym.cornisa, yychar, yyline,yytext());}
corridor {return new Symbol(sym.corredor, yychar, yyline,yytext());}
gallery {return new Symbol(sym.galeria, yychar, yyline,yytext());}
hallway {return new Symbol(sym.pasillo, yychar, yyline,yytext());}
hall {return new Symbol(sym.salon, yychar, yyline,yytext());}
room {return new Symbol(sym.habitacion, yychar, yyline,yytext());}
stairs {return new Symbol(sym.escaleras, yychar, yyline,yytext());}
door {return new Symbol(sym.puerta, yychar, yyline,yytext());}
house {return new Symbol(sym.casa, yychar, yyline,yytext());}
kitchen {return new Symbol(sym.cocina, yychar, yyline,yytext());}
garden {return new Symbol(sym.jardin, yychar, yyline,yytext());}
bathroom {return new Symbol(sym.baño, yychar, yyline,yytext());}
bedroom {return new Symbol(sym.dormitorio, yychar, yyline,yytext());}
living room {return new Symbol(sym.sala, yychar, yyline,yytext());}
dining room {return new Symbol(sym.comedor, yychar, yyline,yytext());}
a {return new Symbol(sym.un, yychar, yyline,yytext());}
an {return new Symbol(sym.un, yychar, yyline,yytext());}
the {return new Symbol(sym.la, yychar, yyline,yytext());}
airport {return new Symbol(sym.aeropuerto, yychar, yyline,yytext());}
bakery {return new Symbol(sym.panaderia, yychar, yyline,yytext());}
bank {return new Symbol(sym.banco, yychar, yyline,yytext());}
"bookstore" | "library" {return new Symbol(sym.libreria, yychar, yyline,yytext());}
cafe {return new Symbol(sym.cafe, yychar, yyline,yytext());}
church {return new Symbol(sym.iglesia, yychar, yyline,yytext());}
gym {return new Symbol(sym.gimnasio, yychar, yyline,yytext());}
laundry {return new Symbol(sym.lavanderia, yychar, yyline,yytext());}
museum {return new Symbol(sym.museo, yychar, yyline,yytext());}
pharmacy {return new Symbol(sym.farmacia, yychar, yyline,yytext());}
school {return new Symbol(sym.escuela, yychar, yyline,yytext());}
north {return new Symbol(sym.norte, yychar, yyline,yytext());}
south {return new Symbol(sym.sur, yychar, yyline,yytext());}
east {return new Symbol(sym.este, yychar, yyline,yytext());}
west {return new Symbol(sym.oeste, yychar, yyline,yytext());}
street {return new Symbol(sym.calle, yychar, yyline,yytext());}
left {return new Symbol(sym.izquierda, yychar, yyline,yytext());}
right {return new Symbol(sym.derecha, yychar, yyline,yytext());}
be {return new Symbol(sym.ser, yychar, yyline, yytext());}
begin {return new Symbol(sym.convertirse, yychar, yyline, yytext());}
bite {return new Symbol(sym.morder , yychar, yyline, yytext());}
blow {return new Symbol(sym.soplar, yychar, yyline, yytext());}
bring {return new Symbol(sym.traer, yychar, yyline, yytext());}
burn {return new Symbol(sym.quemar, yychar, yyline, yytext());}
buy {return new Symbol(sym.comprar, yychar, yyline, yytext());}
can {return new Symbol(sym.poder, yychar, yyline, yytext());}
come {return new Symbol(sym.venir, yychar, yyline, yytext());}
draw {return new Symbol(sym.dibujar, yychar, yyline, yytext());}
dram {return new Symbol(sym.soñar, yychar, yyline, yytext());}
drive {return new Symbol(sym.conducir, yychar, yyline, yytext());}
eat {return new Symbol(sym.comer, yychar, yyline, yytext());}
fight {return new Symbol(sym.luchar, yychar, yyline, yytext());}
fly {return new Symbol(sym.volar, yychar, yyline, yytext());}
get {return new Symbol(sym.obtener, yychar, yyline, yytext());}
give {return new Symbol(sym.dar, yychar, yyline, yytext());}
go {return new Symbol(sym.ir, yychar, yyline, yytext());}
have {return new Symbol(sym.tener, yychar, yyline, yytext());}
hear {return new Symbol(sym.escuchar, yychar, yyline, yytext());}
hurt {return new Symbol(sym.herir, yychar, yyline, yytext());}
keep {return new Symbol(sym.mantener, yychar, yyline, yytext());}
know {return new Symbol(sym.saber, yychar, yyline, yytext());}
leave {return new Symbol(sym.salir, yychar, yyline, yytext());}
let {return new Symbol(sym.dejar, yychar, yyline, yytext());}
lie {return new Symbol(sym.mentir, yychar, yyline, yytext());}
light {return new Symbol(sym.luz, yychar, yyline, yytext());}
lose {return new Symbol(sym.perder, yychar, yyline, yytext());}
make {return new Symbol(sym.hacer, yychar, yyline, yytext());}
put {return new Symbol(sym.poner, yychar, yyline, yytext());}
read {return new Symbol(sym.leer, yychar, yyline, yytext());}
rise {return new Symbol(sym.levantar, yychar, yyline, yytext());}
run {return new Symbol(sym.correr, yychar, yyline, yytext());}
say {return new Symbol(sym.decir, yychar, yyline, yytext());}
see {return new Symbol(sym.ver, yychar, yyline, yytext());}
sell {return new Symbol(sym.vender, yychar, yyline, yytext());}
show {return new Symbol(sym.mostrar, yychar, yyline, yytext());}
sing {return new Symbol(sym.cantar, yychar, yyline, yytext());}
sleep {return new Symbol(sym.dormir, yychar, yyline, yytext());}
speak {return new Symbol(sym.hablar, yychar, yyline, yytext());}
swim {return new Symbol(sym.nadar, yychar, yyline, yytext());}
take {return new Symbol(sym.tomar, yychar, yyline, yytext());}
teach {return new Symbol(sym.enseñar, yychar, yyline, yytext());}
tell {return new Symbol(sym.contar, yychar, yyline, yytext());}
think {return new Symbol(sym.pensar, yychar, yyline, yytext());}
wake {return new Symbol(sym.despertar, yychar, yyline, yytext());}
win {return new Symbol(sym.ganar, yychar, yyline, yytext());}
write {return new Symbol(sym.escribir, yychar, yyline, yytext());}
but {return new Symbol(sym.pero, yychar, yyline, yytext());}
"however"|"nonetheless"|"still"|"yet" {return new Symbol(sym.sin_embargo, yychar, yyline, yytext());}
instead {return new Symbol(sym.en_su_lugar, yychar, yyline, yytext());}
because {return new Symbol(sym.porque, yychar, yyline, yytext());}
from {return new Symbol(sym.de, yychar, yyline, yytext());}
"since"|"as" {return new Symbol(sym.puesto_que, yychar, yyline, yytext());}
than {return new Symbol(sym.que, yychar, yyline, yytext());}
to {return new Symbol(sym.a, yychar, yyline, yytext());}
"on"|"in" {return new Symbol(sym.en, yychar, yyline, yytext());}
with {return new Symbol(sym.con, yychar, yyline, yytext());}
{Esp} {/*Ignore*/}
. {return new Symbol(sym.ERROR, yychar, yyline,yytext());}  


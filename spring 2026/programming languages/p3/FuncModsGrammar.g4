grammar FuncModsGrammar;

//options
//@header {
    //import java.util.ArrayList;
//}

//parser
program : func_mods;

func_mods : access_mod static final;

access_mod : PUBLIC | PRIVATE | PROTECTED;
static : STATIC | /* empty */ ;
final : FINAL | ;

//lexer
PUBLIC : 'public';
PRIVATE : 'private';
PROTECTED : 'protected';
STATIC : 'static';
FINAL: 'final';

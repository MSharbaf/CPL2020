package org.xtext.example.cpl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCPLLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_SINGLE_QUOTED_STRING=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLE_QUOTED_STRING=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_ESCAPED_ID=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_LETTER_CHARACTER=11;
    public static final int T__19=19;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int RULE_ESCAPED_CHARACTER=10;
    public static final int T__95=95;
    public static final int RULE_ML_SINGLE_QUOTED_STRING=13;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=8;
    public static final int RULE_UNQUOTED_STRING=9;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int RULE_SIMPLE_ID=6;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalCPLLexer() {;} 
    public InternalCPLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCPLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCPL.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:11:7: ( 'import' )
            // InternalCPL.g:11:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:12:7: ( 'domain' )
            // InternalCPL.g:12:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:13:7: ( 'or' )
            // InternalCPL.g:13:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:14:7: ( 'and' )
            // InternalCPL.g:14:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:15:7: ( 'isEquivalent' )
            // InternalCPL.g:15:9: 'isEquivalent'
            {
            match("isEquivalent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:16:7: ( 'isContradict' )
            // InternalCPL.g:16:9: 'isContradict'
            {
            match("isContradict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:17:7: ( '>' )
            // InternalCPL.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18:7: ( '<' )
            // InternalCPL.g:18:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:19:7: ( '==' )
            // InternalCPL.g:19:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:20:7: ( '<>' )
            // InternalCPL.g:20:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:21:7: ( '!' )
            // InternalCPL.g:21:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:22:7: ( '>=' )
            // InternalCPL.g:22:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:23:7: ( '=<' )
            // InternalCPL.g:23:9: '=<'
            {
            match("=<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:24:7: ( 'IN' )
            // InternalCPL.g:24:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:25:7: ( 'NotIN' )
            // InternalCPL.g:25:9: 'NotIN'
            {
            match("NotIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:26:7: ( '.' )
            // InternalCPL.g:26:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:27:7: ( '->' )
            // InternalCPL.g:27:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:28:7: ( '^' )
            // InternalCPL.g:28:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:29:7: ( '^^' )
            // InternalCPL.g:29:9: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:30:7: ( 'include' )
            // InternalCPL.g:30:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:31:7: ( 'library' )
            // InternalCPL.g:31:9: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:32:7: ( 'Boolean' )
            // InternalCPL.g:32:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:33:7: ( 'Integer' )
            // InternalCPL.g:33:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:34:7: ( 'Real' )
            // InternalCPL.g:34:9: 'Real'
            {
            match("Real"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:35:7: ( 'String' )
            // InternalCPL.g:35:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:36:7: ( 'UnlimitedNatural' )
            // InternalCPL.g:36:9: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:37:7: ( 'OclAny' )
            // InternalCPL.g:37:9: 'OclAny'
            {
            match("OclAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:38:7: ( 'OclInvalid' )
            // InternalCPL.g:38:9: 'OclInvalid'
            {
            match("OclInvalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:39:7: ( 'OclMessage' )
            // InternalCPL.g:39:9: 'OclMessage'
            {
            match("OclMessage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:40:7: ( 'OclState' )
            // InternalCPL.g:40:9: 'OclState'
            {
            match("OclState"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:41:7: ( 'OclVoid' )
            // InternalCPL.g:41:9: 'OclVoid'
            {
            match("OclVoid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:42:7: ( '-' )
            // InternalCPL.g:42:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:43:7: ( 'not' )
            // InternalCPL.g:43:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:44:7: ( 'not2' )
            // InternalCPL.g:44:9: 'not2'
            {
            match("not2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:45:7: ( '*' )
            // InternalCPL.g:45:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:46:7: ( '/' )
            // InternalCPL.g:46:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:47:7: ( '+' )
            // InternalCPL.g:47:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:48:7: ( '<=' )
            // InternalCPL.g:48:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:49:7: ( '=' )
            // InternalCPL.g:49:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:50:7: ( 'and2' )
            // InternalCPL.g:50:9: 'and2'
            {
            match("and2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:51:7: ( 'implies' )
            // InternalCPL.g:51:9: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:52:7: ( 'implies2' )
            // InternalCPL.g:52:9: 'implies2'
            {
            match("implies2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:53:7: ( 'or2' )
            // InternalCPL.g:53:9: 'or2'
            {
            match("or2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:54:7: ( 'xor' )
            // InternalCPL.g:54:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:55:7: ( 'xor2' )
            // InternalCPL.g:55:9: 'xor2'
            {
            match("xor2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:56:7: ( '?.' )
            // InternalCPL.g:56:9: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:57:7: ( '?->' )
            // InternalCPL.g:57:9: '?->'
            {
            match("?->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:58:7: ( 'Map' )
            // InternalCPL.g:58:9: 'Map'
            {
            match("Map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:59:7: ( 'Tuple' )
            // InternalCPL.g:59:9: 'Tuple'
            {
            match("Tuple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:60:7: ( 'Set' )
            // InternalCPL.g:60:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:61:7: ( 'Bag' )
            // InternalCPL.g:61:9: 'Bag'
            {
            match("Bag"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:62:7: ( 'Sequence' )
            // InternalCPL.g:62:9: 'Sequence'
            {
            match("Sequence"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:63:7: ( 'Collection' )
            // InternalCPL.g:63:9: 'Collection'
            {
            match("Collection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:64:7: ( 'OrderedSet' )
            // InternalCPL.g:64:9: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:65:7: ( '|?' )
            // InternalCPL.g:65:9: '|?'
            {
            match("|?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:66:7: ( '?' )
            // InternalCPL.g:66:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:67:7: ( 'conflict' )
            // InternalCPL.g:67:9: 'conflict'
            {
            match("conflict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:68:7: ( '{' )
            // InternalCPL.g:68:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:69:7: ( '}' )
            // InternalCPL.g:69:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:70:7: ( 'inmodel' )
            // InternalCPL.g:70:9: 'inmodel'
            {
            match("inmodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:71:7: ( ':' )
            // InternalCPL.g:71:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:72:7: ( 'where' )
            // InternalCPL.g:72:9: 'where'
            {
            match("where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:73:7: ( 'message' )
            // InternalCPL.g:73:9: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:74:7: ( '(' )
            // InternalCPL.g:74:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:75:7: ( ')' )
            // InternalCPL.g:75:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:76:7: ( 'context' )
            // InternalCPL.g:76:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:77:7: ( 'inv' )
            // InternalCPL.g:77:9: 'inv'
            {
            match("inv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:78:7: ( 'def' )
            // InternalCPL.g:78:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:79:7: ( ',' )
            // InternalCPL.g:79:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:80:7: ( 'pre' )
            // InternalCPL.g:80:9: 'pre'
            {
            match("pre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:81:7: ( 'post' )
            // InternalCPL.g:81:9: 'post'
            {
            match("post"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:82:7: ( 'body' )
            // InternalCPL.g:82:9: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:83:7: ( 'package' )
            // InternalCPL.g:83:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:84:7: ( 'endpackage' )
            // InternalCPL.g:84:9: 'endpackage'
            {
            match("endpackage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:85:7: ( 'derive' )
            // InternalCPL.g:85:9: 'derive'
            {
            match("derive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:86:7: ( 'init' )
            // InternalCPL.g:86:9: 'init'
            {
            match("init"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:87:7: ( '::' )
            // InternalCPL.g:87:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:88:7: ( '..' )
            // InternalCPL.g:88:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:89:7: ( '++' )
            // InternalCPL.g:89:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:90:7: ( 'Lambda' )
            // InternalCPL.g:90:9: 'Lambda'
            {
            match("Lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:91:7: ( '<-' )
            // InternalCPL.g:91:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:92:7: ( 'invalid' )
            // InternalCPL.g:92:9: 'invalid'
            {
            match("invalid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:93:8: ( 'null' )
            // InternalCPL.g:93:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:94:8: ( '[' )
            // InternalCPL.g:94:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:95:8: ( ']' )
            // InternalCPL.g:95:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:96:8: ( 'in' )
            // InternalCPL.g:96:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:97:8: ( 'if' )
            // InternalCPL.g:97:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:98:8: ( 'then' )
            // InternalCPL.g:98:10: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:99:8: ( 'else' )
            // InternalCPL.g:99:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:100:8: ( 'endif' )
            // InternalCPL.g:100:10: 'endif'
            {
            match("endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:101:8: ( 'elseif' )
            // InternalCPL.g:101:10: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:102:8: ( 'let' )
            // InternalCPL.g:102:10: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:103:8: ( 'self' )
            // InternalCPL.g:103:10: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:104:8: ( 'extends' )
            // InternalCPL.g:104:10: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:105:8: ( '&&' )
            // InternalCPL.g:105:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:106:8: ( '::*' )
            // InternalCPL.g:106:10: '::*'
            {
            match("::*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:107:8: ( 'static' )
            // InternalCPL.g:107:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:108:8: ( 'true' )
            // InternalCPL.g:108:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:109:8: ( 'false' )
            // InternalCPL.g:109:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:110:8: ( '@' )
            // InternalCPL.g:110:10: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:111:8: ( '|' )
            // InternalCPL.g:111:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:112:8: ( ';' )
            // InternalCPL.g:112:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:113:8: ( '|1' )
            // InternalCPL.g:113:10: '|1'
            {
            match("|1"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18490:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalCPL.g:18490:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalCPL.g:18490:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCPL.g:18490:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalCPL.g:18490:65: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_UNQUOTED_STRING"
    public final void mRULE_UNQUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_UNQUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18492:22: ( '\\u00C2\\u00A3$%^\\u00C2\\u00A3$%^' )
            // InternalCPL.g:18492:24: '\\u00C2\\u00A3$%^\\u00C2\\u00A3$%^'
            {
            match("\u00C2\u00A3$%^\u00C2\u00A3$%^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNQUOTED_STRING"

    // $ANTLR start "RULE_ESCAPED_CHARACTER"
    public final void mRULE_ESCAPED_CHARACTER() throws RecognitionException {
        try {
            // InternalCPL.g:18494:33: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) )
            // InternalCPL.g:18494:35: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_CHARACTER"

    // $ANTLR start "RULE_LETTER_CHARACTER"
    public final void mRULE_LETTER_CHARACTER() throws RecognitionException {
        try {
            // InternalCPL.g:18496:32: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalCPL.g:18496:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER_CHARACTER"

    // $ANTLR start "RULE_DOUBLE_QUOTED_STRING"
    public final void mRULE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18498:27: ( '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalCPL.g:18498:29: '\"' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalCPL.g:18498:33: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    alt2=1;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCPL.g:18498:34: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalCPL.g:18498:57: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_QUOTED_STRING"

    // $ANTLR start "RULE_SINGLE_QUOTED_STRING"
    public final void mRULE_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18500:27: ( '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalCPL.g:18500:29: '\\'' ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalCPL.g:18500:34: ( RULE_ESCAPED_CHARACTER | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCPL.g:18500:35: RULE_ESCAPED_CHARACTER
            	    {
            	    mRULE_ESCAPED_CHARACTER(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalCPL.g:18500:58: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_ML_SINGLE_QUOTED_STRING"
    public final void mRULE_ML_SINGLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = RULE_ML_SINGLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18502:30: ( '/\\'' ( options {greedy=false; } : . )* '\\'/' )
            // InternalCPL.g:18502:32: '/\\'' ( options {greedy=false; } : . )* '\\'/'
            {
            match("/'"); 

            // InternalCPL.g:18502:38: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCPL.g:18502:66: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("'/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_SINGLE_QUOTED_STRING"

    // $ANTLR start "RULE_SIMPLE_ID"
    public final void mRULE_SIMPLE_ID() throws RecognitionException {
        try {
            int _type = RULE_SIMPLE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18504:16: ( RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )* )
            // InternalCPL.g:18504:18: RULE_LETTER_CHARACTER ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            {
            mRULE_LETTER_CHARACTER(); 
            // InternalCPL.g:18504:40: ( RULE_LETTER_CHARACTER | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCPL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_ID"

    // $ANTLR start "RULE_ESCAPED_ID"
    public final void mRULE_ESCAPED_ID() throws RecognitionException {
        try {
            int _type = RULE_ESCAPED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18506:17: ( '_' RULE_SINGLE_QUOTED_STRING )
            // InternalCPL.g:18506:19: '_' RULE_SINGLE_QUOTED_STRING
            {
            match('_'); 
            mRULE_SINGLE_QUOTED_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPED_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18508:10: ( ( '0' .. '9' )+ )
            // InternalCPL.g:18508:12: ( '0' .. '9' )+
            {
            // InternalCPL.g:18508:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCPL.g:18508:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18510:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCPL.g:18510:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCPL.g:18510:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCPL.g:18510:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18512:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCPL.g:18512:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // InternalCPL.g:18512:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCPL.g:18512:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalCPL.g:18512:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCPL.g:18512:41: ( '\\r' )? '\\n'
                    {
                    // InternalCPL.g:18512:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCPL.g:18512:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18514:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCPL.g:18514:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCPL.g:18514:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCPL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCPL.g:18516:16: ( . )
            // InternalCPL.g:18516:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCPL.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | RULE_STRING | RULE_UNQUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=115;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCPL.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalCPL.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalCPL.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalCPL.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalCPL.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalCPL.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalCPL.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalCPL.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalCPL.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalCPL.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalCPL.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalCPL.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalCPL.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalCPL.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalCPL.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalCPL.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalCPL.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalCPL.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalCPL.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalCPL.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalCPL.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalCPL.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalCPL.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalCPL.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalCPL.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalCPL.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalCPL.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalCPL.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalCPL.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalCPL.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalCPL.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalCPL.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalCPL.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalCPL.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalCPL.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalCPL.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalCPL.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalCPL.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalCPL.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalCPL.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalCPL.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalCPL.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalCPL.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalCPL.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalCPL.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalCPL.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalCPL.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalCPL.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalCPL.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalCPL.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalCPL.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalCPL.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalCPL.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // InternalCPL.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // InternalCPL.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // InternalCPL.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // InternalCPL.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // InternalCPL.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // InternalCPL.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // InternalCPL.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // InternalCPL.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // InternalCPL.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // InternalCPL.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // InternalCPL.g:1:388: T__81
                {
                mT__81(); 

                }
                break;
            case 65 :
                // InternalCPL.g:1:394: T__82
                {
                mT__82(); 

                }
                break;
            case 66 :
                // InternalCPL.g:1:400: T__83
                {
                mT__83(); 

                }
                break;
            case 67 :
                // InternalCPL.g:1:406: T__84
                {
                mT__84(); 

                }
                break;
            case 68 :
                // InternalCPL.g:1:412: T__85
                {
                mT__85(); 

                }
                break;
            case 69 :
                // InternalCPL.g:1:418: T__86
                {
                mT__86(); 

                }
                break;
            case 70 :
                // InternalCPL.g:1:424: T__87
                {
                mT__87(); 

                }
                break;
            case 71 :
                // InternalCPL.g:1:430: T__88
                {
                mT__88(); 

                }
                break;
            case 72 :
                // InternalCPL.g:1:436: T__89
                {
                mT__89(); 

                }
                break;
            case 73 :
                // InternalCPL.g:1:442: T__90
                {
                mT__90(); 

                }
                break;
            case 74 :
                // InternalCPL.g:1:448: T__91
                {
                mT__91(); 

                }
                break;
            case 75 :
                // InternalCPL.g:1:454: T__92
                {
                mT__92(); 

                }
                break;
            case 76 :
                // InternalCPL.g:1:460: T__93
                {
                mT__93(); 

                }
                break;
            case 77 :
                // InternalCPL.g:1:466: T__94
                {
                mT__94(); 

                }
                break;
            case 78 :
                // InternalCPL.g:1:472: T__95
                {
                mT__95(); 

                }
                break;
            case 79 :
                // InternalCPL.g:1:478: T__96
                {
                mT__96(); 

                }
                break;
            case 80 :
                // InternalCPL.g:1:484: T__97
                {
                mT__97(); 

                }
                break;
            case 81 :
                // InternalCPL.g:1:490: T__98
                {
                mT__98(); 

                }
                break;
            case 82 :
                // InternalCPL.g:1:496: T__99
                {
                mT__99(); 

                }
                break;
            case 83 :
                // InternalCPL.g:1:502: T__100
                {
                mT__100(); 

                }
                break;
            case 84 :
                // InternalCPL.g:1:509: T__101
                {
                mT__101(); 

                }
                break;
            case 85 :
                // InternalCPL.g:1:516: T__102
                {
                mT__102(); 

                }
                break;
            case 86 :
                // InternalCPL.g:1:523: T__103
                {
                mT__103(); 

                }
                break;
            case 87 :
                // InternalCPL.g:1:530: T__104
                {
                mT__104(); 

                }
                break;
            case 88 :
                // InternalCPL.g:1:537: T__105
                {
                mT__105(); 

                }
                break;
            case 89 :
                // InternalCPL.g:1:544: T__106
                {
                mT__106(); 

                }
                break;
            case 90 :
                // InternalCPL.g:1:551: T__107
                {
                mT__107(); 

                }
                break;
            case 91 :
                // InternalCPL.g:1:558: T__108
                {
                mT__108(); 

                }
                break;
            case 92 :
                // InternalCPL.g:1:565: T__109
                {
                mT__109(); 

                }
                break;
            case 93 :
                // InternalCPL.g:1:572: T__110
                {
                mT__110(); 

                }
                break;
            case 94 :
                // InternalCPL.g:1:579: T__111
                {
                mT__111(); 

                }
                break;
            case 95 :
                // InternalCPL.g:1:586: T__112
                {
                mT__112(); 

                }
                break;
            case 96 :
                // InternalCPL.g:1:593: T__113
                {
                mT__113(); 

                }
                break;
            case 97 :
                // InternalCPL.g:1:600: T__114
                {
                mT__114(); 

                }
                break;
            case 98 :
                // InternalCPL.g:1:607: T__115
                {
                mT__115(); 

                }
                break;
            case 99 :
                // InternalCPL.g:1:614: T__116
                {
                mT__116(); 

                }
                break;
            case 100 :
                // InternalCPL.g:1:621: T__117
                {
                mT__117(); 

                }
                break;
            case 101 :
                // InternalCPL.g:1:628: T__118
                {
                mT__118(); 

                }
                break;
            case 102 :
                // InternalCPL.g:1:635: T__119
                {
                mT__119(); 

                }
                break;
            case 103 :
                // InternalCPL.g:1:642: T__120
                {
                mT__120(); 

                }
                break;
            case 104 :
                // InternalCPL.g:1:649: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 105 :
                // InternalCPL.g:1:661: RULE_UNQUOTED_STRING
                {
                mRULE_UNQUOTED_STRING(); 

                }
                break;
            case 106 :
                // InternalCPL.g:1:682: RULE_DOUBLE_QUOTED_STRING
                {
                mRULE_DOUBLE_QUOTED_STRING(); 

                }
                break;
            case 107 :
                // InternalCPL.g:1:708: RULE_SINGLE_QUOTED_STRING
                {
                mRULE_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 108 :
                // InternalCPL.g:1:734: RULE_ML_SINGLE_QUOTED_STRING
                {
                mRULE_ML_SINGLE_QUOTED_STRING(); 

                }
                break;
            case 109 :
                // InternalCPL.g:1:763: RULE_SIMPLE_ID
                {
                mRULE_SIMPLE_ID(); 

                }
                break;
            case 110 :
                // InternalCPL.g:1:778: RULE_ESCAPED_ID
                {
                mRULE_ESCAPED_ID(); 

                }
                break;
            case 111 :
                // InternalCPL.g:1:794: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 112 :
                // InternalCPL.g:1:803: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 113 :
                // InternalCPL.g:1:819: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 114 :
                // InternalCPL.g:1:835: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 115 :
                // InternalCPL.g:1:843: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\77\1\105\1\111\1\114\1\uffff\2\77\1\122\1\125\1\127\7\77\1\uffff\1\147\1\151\1\77\1\155\3\77\1\163\1\77\2\uffff\1\170\2\77\3\uffff\4\77\2\uffff\2\77\1\72\1\77\2\uffff\3\72\1\77\4\uffff\2\77\1\u009f\1\u00a0\1\uffff\2\77\1\u00a5\1\77\12\uffff\1\u00a7\2\77\7\uffff\14\77\6\uffff\1\77\3\uffff\3\77\3\uffff\1\77\2\uffff\1\u00bd\1\uffff\2\77\3\uffff\10\77\2\uffff\4\77\1\uffff\1\77\12\uffff\5\77\1\u00d6\1\77\2\uffff\1\77\1\u00d9\1\77\1\u00db\1\uffff\1\u00dd\1\uffff\3\77\1\u00e1\1\77\1\u00e3\2\77\1\u00e6\4\77\1\u00f0\1\77\1\u00f3\1\u00f4\3\77\2\uffff\2\77\1\u00fb\14\77\2\uffff\7\77\1\uffff\1\u0110\1\77\1\uffff\1\77\1\uffff\1\u0113\1\uffff\3\77\1\uffff\1\77\1\uffff\1\u0118\1\77\1\uffff\10\77\1\u0122\1\uffff\1\u0123\1\u0124\2\uffff\6\77\1\uffff\1\u012b\1\77\1\u012d\2\77\1\u0131\2\77\1\u0134\1\u0135\1\u0136\11\77\1\uffff\2\77\1\uffff\1\77\1\u0143\2\77\1\uffff\11\77\3\uffff\1\u014f\3\77\1\u0153\1\77\1\uffff\1\77\1\uffff\1\77\1\u0157\1\77\1\uffff\2\77\3\uffff\1\77\1\u015c\1\u015d\6\77\1\u0164\1\u0165\1\77\1\uffff\2\77\1\u0169\2\77\1\u016c\5\77\1\uffff\3\77\1\uffff\3\77\1\uffff\1\u0178\1\77\1\u017a\1\u017b\2\uffff\1\u017d\2\77\1\u0180\1\u0181\1\u0182\2\uffff\1\u0183\1\u0184\1\u0185\1\uffff\2\77\1\uffff\3\77\1\u018b\3\77\1\u018f\1\u0190\1\u0191\1\77\1\uffff\1\u0193\2\uffff\1\u0194\1\uffff\2\77\6\uffff\1\u0197\3\77\1\u019b\1\uffff\2\77\1\u019e\3\uffff\1\77\2\uffff\2\77\1\uffff\3\77\1\uffff\2\77\1\uffff\4\77\1\u01ab\1\u01ac\1\u01ad\1\u01ae\1\u01af\3\77\5\uffff\1\u01b3\1\u01b4\1\77\2\uffff\3\77\1\u01b9\1\uffff";
    static final String DFA12_eofS =
        "\u01ba\uffff";
    static final String DFA12_minS =
        "\1\0\1\146\1\145\1\162\1\156\1\75\1\55\1\74\1\uffff\1\116\1\157\1\56\1\55\1\136\1\145\1\141\2\145\1\156\1\143\1\157\1\uffff\1\47\1\53\1\157\1\55\1\141\1\165\1\157\1\61\1\157\2\uffff\1\72\1\150\1\145\3\uffff\1\141\1\157\1\154\1\141\2\uffff\1\150\1\145\1\46\1\141\2\uffff\1\0\1\u00a3\1\0\1\47\4\uffff\1\160\1\103\2\60\1\uffff\1\155\1\146\1\60\1\144\12\uffff\1\60\2\164\7\uffff\1\142\1\164\1\157\1\147\1\141\1\162\1\161\2\154\1\144\1\164\1\154\6\uffff\1\162\3\uffff\2\160\1\154\3\uffff\1\156\2\uffff\1\52\1\uffff\1\145\1\163\3\uffff\1\145\1\163\1\143\2\144\1\163\1\164\1\155\2\uffff\1\145\1\165\1\154\1\141\1\uffff\1\154\2\uffff\1\42\1\0\6\uffff\1\154\1\161\1\157\1\154\1\157\1\60\1\164\2\uffff\1\141\1\60\1\151\1\60\1\uffff\1\60\1\uffff\1\145\1\111\1\162\1\60\1\154\1\60\1\154\1\151\1\60\1\165\1\151\1\101\1\145\1\60\1\154\2\60\2\154\1\146\2\uffff\1\162\1\163\1\60\1\164\1\153\1\171\1\151\2\145\1\142\1\156\1\145\1\146\1\164\1\163\1\0\1\uffff\1\162\1\151\1\165\1\156\1\165\1\144\1\154\1\uffff\1\60\1\151\1\uffff\1\166\1\uffff\1\60\1\uffff\1\147\1\116\1\141\1\uffff\1\145\1\uffff\1\60\1\156\1\uffff\1\145\1\155\2\156\1\145\1\164\1\157\1\162\1\60\1\uffff\2\60\2\uffff\2\145\1\154\2\145\1\141\1\uffff\1\60\1\141\1\60\1\141\1\146\1\60\1\156\1\144\3\60\1\151\1\145\1\164\1\145\1\151\1\164\1\144\1\145\1\151\1\uffff\1\156\1\145\1\uffff\1\145\1\60\1\162\1\141\1\uffff\1\147\1\156\1\151\1\171\1\166\1\163\1\141\1\151\1\145\3\uffff\1\60\1\143\1\151\1\170\1\60\1\147\1\uffff\1\147\1\uffff\1\143\1\60\1\146\1\uffff\1\144\1\141\3\uffff\1\143\2\60\1\163\1\166\1\162\1\145\1\154\1\144\2\60\1\162\1\uffff\1\171\1\156\1\60\1\143\1\164\1\60\1\141\1\163\1\164\2\144\1\uffff\1\164\1\143\1\164\1\uffff\2\145\1\153\1\uffff\1\60\1\163\2\60\2\uffff\1\60\2\141\3\60\2\uffff\3\60\1\uffff\2\145\1\uffff\1\154\1\141\1\145\1\60\1\123\1\151\1\164\3\60\1\141\1\uffff\1\60\2\uffff\1\60\1\uffff\1\154\1\144\6\uffff\1\60\1\144\1\151\1\147\1\60\1\uffff\1\145\1\157\1\60\3\uffff\1\147\2\uffff\1\145\1\151\1\uffff\1\116\1\144\1\145\1\uffff\1\164\1\156\1\uffff\1\145\1\156\1\143\1\141\5\60\3\164\5\uffff\2\60\1\165\2\uffff\1\162\1\141\1\154\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\157\1\162\1\156\1\75\1\76\1\75\1\uffff\1\156\1\157\1\56\1\76\1\136\1\151\1\157\1\145\1\164\1\156\1\162\1\165\1\uffff\1\52\1\53\1\157\1\56\1\141\1\165\1\157\1\77\1\157\2\uffff\1\72\1\150\1\145\3\uffff\1\162\1\157\1\170\1\141\2\uffff\1\162\1\164\1\46\1\141\2\uffff\1\uffff\1\u00a3\1\uffff\1\47\4\uffff\1\160\1\105\2\172\1\uffff\1\155\1\162\1\172\1\144\12\uffff\1\172\2\164\7\uffff\1\142\1\164\1\157\1\147\1\141\1\162\1\164\2\154\1\144\1\164\1\154\6\uffff\1\162\3\uffff\2\160\1\154\3\uffff\1\156\2\uffff\1\52\1\uffff\1\145\1\163\3\uffff\1\145\1\163\1\143\2\144\1\163\1\164\1\155\2\uffff\1\145\1\165\1\154\1\141\1\uffff\1\154\2\uffff\1\165\1\uffff\6\uffff\1\157\1\161\1\157\1\154\1\157\1\172\1\164\2\uffff\1\141\1\172\1\151\1\172\1\uffff\1\172\1\uffff\1\145\1\111\1\162\1\172\1\154\1\172\1\154\1\151\1\172\1\165\1\151\1\126\1\145\1\172\1\154\2\172\2\154\1\164\2\uffff\1\162\1\163\1\172\1\164\1\153\1\171\1\160\2\145\1\142\1\156\1\145\1\146\1\164\1\163\1\uffff\1\uffff\1\162\1\151\1\165\1\156\1\165\1\144\1\154\1\uffff\1\172\1\151\1\uffff\1\166\1\uffff\1\172\1\uffff\1\147\1\116\1\141\1\uffff\1\145\1\uffff\1\172\1\156\1\uffff\1\145\1\155\2\156\1\145\1\164\1\157\1\162\1\172\1\uffff\2\172\2\uffff\2\145\1\154\2\145\1\141\1\uffff\1\172\1\141\1\172\1\141\1\146\1\172\1\156\1\144\3\172\1\151\1\145\1\164\1\145\1\151\1\164\1\144\1\145\1\151\1\uffff\1\156\1\145\1\uffff\1\145\1\172\1\162\1\141\1\uffff\1\147\1\156\1\151\1\171\1\166\1\163\1\141\1\151\1\145\3\uffff\1\172\1\143\1\151\1\170\1\172\1\147\1\uffff\1\147\1\uffff\1\143\1\172\1\146\1\uffff\1\144\1\141\3\uffff\1\143\2\172\1\163\1\166\1\162\1\145\1\154\1\144\2\172\1\162\1\uffff\1\171\1\156\1\172\1\143\1\164\1\172\1\141\1\163\1\164\2\144\1\uffff\1\164\1\143\1\164\1\uffff\2\145\1\153\1\uffff\1\172\1\163\2\172\2\uffff\1\172\2\141\3\172\2\uffff\3\172\1\uffff\2\145\1\uffff\1\154\1\141\1\145\1\172\1\123\1\151\1\164\3\172\1\141\1\uffff\1\172\2\uffff\1\172\1\uffff\1\154\1\144\6\uffff\1\172\1\144\1\151\1\147\1\172\1\uffff\1\145\1\157\1\172\3\uffff\1\147\2\uffff\1\145\1\151\1\uffff\1\116\1\144\1\145\1\uffff\1\164\1\156\1\uffff\1\145\1\156\1\143\1\141\5\172\3\164\5\uffff\2\172\1\165\2\uffff\1\162\1\141\1\154\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\13\14\uffff\1\43\11\uffff\1\72\1\73\3\uffff\1\100\1\101\1\105\4\uffff\1\124\1\125\4\uffff\1\144\1\146\4\uffff\1\155\1\157\1\162\1\163\4\uffff\1\155\4\uffff\1\14\1\7\1\12\1\46\1\121\1\10\1\11\1\15\1\47\1\13\3\uffff\1\116\1\20\1\21\1\161\1\40\1\23\1\22\14\uffff\1\43\1\154\1\160\1\44\1\117\1\45\1\uffff\1\56\1\57\1\70\3\uffff\1\67\1\147\1\145\1\uffff\1\72\1\73\1\uffff\1\75\2\uffff\1\100\1\101\1\105\10\uffff\1\124\1\125\4\uffff\1\137\1\uffff\1\144\1\146\2\uffff\1\150\1\151\1\153\1\156\1\157\1\162\7\uffff\1\126\1\127\4\uffff\1\3\1\uffff\1\16\24\uffff\1\140\1\115\20\uffff\1\150\7\uffff\1\103\2\uffff\1\104\1\uffff\1\53\1\uffff\1\4\3\uffff\1\134\1\uffff\1\63\2\uffff\1\62\11\uffff\1\41\2\uffff\1\54\1\60\6\uffff\1\106\24\uffff\1\114\2\uffff\1\50\4\uffff\1\30\11\uffff\1\42\1\123\1\55\6\uffff\1\107\1\uffff\1\110\3\uffff\1\131\2\uffff\1\130\1\142\1\135\14\uffff\1\17\13\uffff\1\61\3\uffff\1\76\3\uffff\1\132\4\uffff\1\143\1\1\6\uffff\1\2\1\113\3\uffff\1\31\2\uffff\1\33\13\uffff\1\133\1\uffff\1\120\1\141\1\uffff\1\51\2\uffff\1\24\1\74\1\122\1\27\1\25\1\26\5\uffff\1\37\3\uffff\1\102\1\77\1\111\1\uffff\1\136\1\52\2\uffff\1\64\3\uffff\1\36\2\uffff\1\71\14\uffff\1\34\1\35\1\66\1\65\1\112\3\uffff\1\5\1\6\4\uffff\1\32";
    static final String DFA12_specialS =
        "\1\3\62\uffff\1\2\1\uffff\1\4\133\uffff\1\0\73\uffff\1\1\u00ec\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\72\2\71\2\72\1\71\22\72\1\71\1\10\1\63\3\72\1\57\1\65\1\44\1\45\1\25\1\27\1\46\1\14\1\13\1\26\12\70\1\41\1\62\1\6\1\7\1\5\1\31\1\61\1\67\1\17\1\34\5\67\1\11\2\67\1\52\1\32\1\12\1\23\2\67\1\20\1\21\1\33\1\22\5\67\1\53\1\72\1\54\1\15\1\66\1\72\1\4\1\50\1\36\1\2\1\51\1\60\2\67\1\1\2\67\1\16\1\43\1\24\1\3\1\47\2\67\1\56\1\55\2\67\1\42\1\30\2\67\1\37\1\35\1\40\104\72\1\64\uff3d\72",
            "\1\76\6\uffff\1\73\1\75\4\uffff\1\74",
            "\1\101\11\uffff\1\100",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\110\17\uffff\1\107\1\106",
            "\1\113\1\112",
            "",
            "\1\116\37\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\124\20\uffff\1\123",
            "\1\126",
            "\1\131\3\uffff\1\130",
            "\1\133\15\uffff\1\132",
            "\1\134",
            "\1\136\16\uffff\1\135",
            "\1\137",
            "\1\140\16\uffff\1\141",
            "\1\142\5\uffff\1\143",
            "",
            "\1\145\2\uffff\1\146",
            "\1\150",
            "\1\152",
            "\1\154\1\153",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\15\uffff\1\161",
            "\1\164",
            "",
            "",
            "\1\167",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "\1\u0080\15\uffff\1\177\2\uffff\1\176",
            "\1\u0081",
            "\1\u0083\1\uffff\1\u0082\11\uffff\1\u0084",
            "\1\u0085",
            "",
            "",
            "\1\u0088\11\uffff\1\u0089",
            "\1\u008a\16\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "",
            "\42\u0091\1\u0092\71\u0091\1\u0090\uffa3\u0091",
            "\1\u0093",
            "\0\u0094",
            "\1\u0095",
            "",
            "",
            "",
            "",
            "\1\u0098",
            "\1\u009a\1\uffff\1\u0099",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\2\77\1\u009b\5\77\1\u009e\3\77\1\u009c\10\77\1\u009d\4\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u00a1",
            "\1\u00a2\13\uffff\1\u00a3",
            "\2\77\1\u00a4\7\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b1\2\uffff\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b7",
            "",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "",
            "\1\u00bb",
            "",
            "",
            "\1\u00bc",
            "",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "",
            "",
            "\1\u00cd\4\uffff\1\u00cd\64\uffff\1\u00cd\5\uffff\1\u00cd\3\uffff\1\u00cd\7\uffff\1\u00cd\3\uffff\1\u00cd\1\uffff\2\u00cd",
            "\42\u0091\1\u0092\71\u0091\1\u0090\uffa3\u0091",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d0\2\uffff\1\u00cf",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\1\u00d5\31\77",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00da",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\2\77\1\u00dc\7\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00e2",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00e4",
            "\1\u00e5",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9\7\uffff\1\u00ea\3\uffff\1\u00eb\5\uffff\1\u00ec\2\uffff\1\u00ed",
            "\1\u00ee",
            "\2\77\1\u00ef\7\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00f1",
            "\2\77\1\u00f2\7\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7\15\uffff\1\u00f8",
            "",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u0100\6\uffff\1\u00ff",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\42\u0091\1\u0092\71\u0091\1\u0090\uffa3\u0091",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0111",
            "",
            "\1\u0112",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u012c",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u012e",
            "\1\u012f",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\10\77\1\u0130\21\77",
            "\1\u0132",
            "\1\u0133",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0140",
            "\1\u0141",
            "",
            "\1\u0142",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0154",
            "",
            "\1\u0155",
            "",
            "\1\u0156",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "",
            "",
            "",
            "\1\u015b",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u016a",
            "\1\u016b",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0179",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\2\77\1\u017c\7\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u017e",
            "\1\u017f",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0192",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u0195",
            "\1\u0196",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u019c",
            "\1\u019d",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "",
            "\1\u019f",
            "",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "",
            "",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u01b5",
            "",
            "",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | RULE_STRING | RULE_UNQUOTED_STRING | RULE_DOUBLE_QUOTED_STRING | RULE_SINGLE_QUOTED_STRING | RULE_ML_SINGLE_QUOTED_STRING | RULE_SIMPLE_ID | RULE_ESCAPED_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_145 = input.LA(1);

                        s = -1;
                        if ( (LA12_145=='\"') ) {s = 146;}

                        else if ( (LA12_145=='\\') ) {s = 144;}

                        else if ( ((LA12_145>='\u0000' && LA12_145<='!')||(LA12_145>='#' && LA12_145<='[')||(LA12_145>=']' && LA12_145<='\uFFFF')) ) {s = 145;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_205 = input.LA(1);

                        s = -1;
                        if ( (LA12_205=='\"') ) {s = 146;}

                        else if ( (LA12_205=='\\') ) {s = 144;}

                        else if ( ((LA12_205>='\u0000' && LA12_205<='!')||(LA12_205>='#' && LA12_205<='[')||(LA12_205>=']' && LA12_205<='\uFFFF')) ) {s = 145;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( (LA12_51=='\\') ) {s = 144;}

                        else if ( ((LA12_51>='\u0000' && LA12_51<='!')||(LA12_51>='#' && LA12_51<='[')||(LA12_51>=']' && LA12_51<='\uFFFF')) ) {s = 145;}

                        else if ( (LA12_51=='\"') ) {s = 146;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='d') ) {s = 2;}

                        else if ( (LA12_0=='o') ) {s = 3;}

                        else if ( (LA12_0=='a') ) {s = 4;}

                        else if ( (LA12_0=='>') ) {s = 5;}

                        else if ( (LA12_0=='<') ) {s = 6;}

                        else if ( (LA12_0=='=') ) {s = 7;}

                        else if ( (LA12_0=='!') ) {s = 8;}

                        else if ( (LA12_0=='I') ) {s = 9;}

                        else if ( (LA12_0=='N') ) {s = 10;}

                        else if ( (LA12_0=='.') ) {s = 11;}

                        else if ( (LA12_0=='-') ) {s = 12;}

                        else if ( (LA12_0=='^') ) {s = 13;}

                        else if ( (LA12_0=='l') ) {s = 14;}

                        else if ( (LA12_0=='B') ) {s = 15;}

                        else if ( (LA12_0=='R') ) {s = 16;}

                        else if ( (LA12_0=='S') ) {s = 17;}

                        else if ( (LA12_0=='U') ) {s = 18;}

                        else if ( (LA12_0=='O') ) {s = 19;}

                        else if ( (LA12_0=='n') ) {s = 20;}

                        else if ( (LA12_0=='*') ) {s = 21;}

                        else if ( (LA12_0=='/') ) {s = 22;}

                        else if ( (LA12_0=='+') ) {s = 23;}

                        else if ( (LA12_0=='x') ) {s = 24;}

                        else if ( (LA12_0=='?') ) {s = 25;}

                        else if ( (LA12_0=='M') ) {s = 26;}

                        else if ( (LA12_0=='T') ) {s = 27;}

                        else if ( (LA12_0=='C') ) {s = 28;}

                        else if ( (LA12_0=='|') ) {s = 29;}

                        else if ( (LA12_0=='c') ) {s = 30;}

                        else if ( (LA12_0=='{') ) {s = 31;}

                        else if ( (LA12_0=='}') ) {s = 32;}

                        else if ( (LA12_0==':') ) {s = 33;}

                        else if ( (LA12_0=='w') ) {s = 34;}

                        else if ( (LA12_0=='m') ) {s = 35;}

                        else if ( (LA12_0=='(') ) {s = 36;}

                        else if ( (LA12_0==')') ) {s = 37;}

                        else if ( (LA12_0==',') ) {s = 38;}

                        else if ( (LA12_0=='p') ) {s = 39;}

                        else if ( (LA12_0=='b') ) {s = 40;}

                        else if ( (LA12_0=='e') ) {s = 41;}

                        else if ( (LA12_0=='L') ) {s = 42;}

                        else if ( (LA12_0=='[') ) {s = 43;}

                        else if ( (LA12_0==']') ) {s = 44;}

                        else if ( (LA12_0=='t') ) {s = 45;}

                        else if ( (LA12_0=='s') ) {s = 46;}

                        else if ( (LA12_0=='&') ) {s = 47;}

                        else if ( (LA12_0=='f') ) {s = 48;}

                        else if ( (LA12_0=='@') ) {s = 49;}

                        else if ( (LA12_0==';') ) {s = 50;}

                        else if ( (LA12_0=='\"') ) {s = 51;}

                        else if ( (LA12_0=='\u00C2') ) {s = 52;}

                        else if ( (LA12_0=='\'') ) {s = 53;}

                        else if ( (LA12_0=='_') ) {s = 54;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='P' && LA12_0<='Q')||(LA12_0>='V' && LA12_0<='Z')||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='u' && LA12_0<='v')||(LA12_0>='y' && LA12_0<='z')) ) {s = 55;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 56;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 57;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='%')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\u00C1')||(LA12_0>='\u00C3' && LA12_0<='\uFFFF')) ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( ((LA12_53>='\u0000' && LA12_53<='\uFFFF')) ) {s = 148;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
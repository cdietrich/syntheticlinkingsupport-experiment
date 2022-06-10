package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interface'", "'spec'", "','"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInterface"
    // InternalMyDsl.g:78:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleInterface EOF )
            // InternalMyDsl.g:80:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMyDsl.g:87:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Interface__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Interface__Group__0 )
            // InternalMyDsl.g:94:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleSpec"
    // InternalMyDsl.g:103:1: entryRuleSpec : ruleSpec EOF ;
    public final void entryRuleSpec() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSpec EOF )
            // InternalMyDsl.g:105:1: ruleSpec EOF
            {
             before(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getSpecRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalMyDsl.g:112:1: ruleSpec : ( ( rule__Spec__Group__0 ) ) ;
    public final void ruleSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Spec__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Spec__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Spec__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Spec__Group__0 )
            {
             before(grammarAccess.getSpecAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Spec__Group__0 )
            // InternalMyDsl.g:119:4: rule__Spec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRulePart"
    // InternalMyDsl.g:128:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulePart EOF )
            // InternalMyDsl.g:130:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            rulePart();

            state._fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalMyDsl.g:137:1: rulePart : ( ( rule__Part__Group__0 ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Part__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Part__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Part__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Part__Group__0 )
            {
             before(grammarAccess.getPartAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Part__Group__0 )
            // InternalMyDsl.g:144:4: rule__Part__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Part__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePart"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:152:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:157:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:164:1: rule__Model__Group__0__Impl : ( ( rule__Model__IfsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:168:1: ( ( ( rule__Model__IfsAssignment_0 )* ) )
            // InternalMyDsl.g:169:1: ( ( rule__Model__IfsAssignment_0 )* )
            {
            // InternalMyDsl.g:169:1: ( ( rule__Model__IfsAssignment_0 )* )
            // InternalMyDsl.g:170:2: ( rule__Model__IfsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getIfsAssignment_0()); 
            // InternalMyDsl.g:171:2: ( rule__Model__IfsAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:171:3: rule__Model__IfsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__IfsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getIfsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:179:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:183:1: ( rule__Model__Group__1__Impl )
            // InternalMyDsl.g:184:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:190:1: rule__Model__Group__1__Impl : ( ( rule__Model__SpecsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:194:1: ( ( ( rule__Model__SpecsAssignment_1 )* ) )
            // InternalMyDsl.g:195:1: ( ( rule__Model__SpecsAssignment_1 )* )
            {
            // InternalMyDsl.g:195:1: ( ( rule__Model__SpecsAssignment_1 )* )
            // InternalMyDsl.g:196:2: ( rule__Model__SpecsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getSpecsAssignment_1()); 
            // InternalMyDsl.g:197:2: ( rule__Model__SpecsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:197:3: rule__Model__SpecsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__SpecsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSpecsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalMyDsl.g:206:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:210:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalMyDsl.g:211:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalMyDsl.g:218:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:222:1: ( ( 'interface' ) )
            // InternalMyDsl.g:223:1: ( 'interface' )
            {
            // InternalMyDsl.g:223:1: ( 'interface' )
            // InternalMyDsl.g:224:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalMyDsl.g:233:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:237:1: ( rule__Interface__Group__1__Impl )
            // InternalMyDsl.g:238:2: rule__Interface__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalMyDsl.g:244:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // InternalMyDsl.g:249:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:249:1: ( ( rule__Interface__NameAssignment_1 ) )
            // InternalMyDsl.g:250:2: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:251:2: ( rule__Interface__NameAssignment_1 )
            // InternalMyDsl.g:251:3: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Spec__Group__0"
    // InternalMyDsl.g:260:1: rule__Spec__Group__0 : rule__Spec__Group__0__Impl rule__Spec__Group__1 ;
    public final void rule__Spec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:264:1: ( rule__Spec__Group__0__Impl rule__Spec__Group__1 )
            // InternalMyDsl.g:265:2: rule__Spec__Group__0__Impl rule__Spec__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Spec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0"


    // $ANTLR start "rule__Spec__Group__0__Impl"
    // InternalMyDsl.g:272:1: rule__Spec__Group__0__Impl : ( () ) ;
    public final void rule__Spec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:276:1: ( ( () ) )
            // InternalMyDsl.g:277:1: ( () )
            {
            // InternalMyDsl.g:277:1: ( () )
            // InternalMyDsl.g:278:2: ()
            {
             before(grammarAccess.getSpecAccess().getSpecAction_0()); 
            // InternalMyDsl.g:279:2: ()
            // InternalMyDsl.g:279:3: 
            {
            }

             after(grammarAccess.getSpecAccess().getSpecAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__0__Impl"


    // $ANTLR start "rule__Spec__Group__1"
    // InternalMyDsl.g:287:1: rule__Spec__Group__1 : rule__Spec__Group__1__Impl rule__Spec__Group__2 ;
    public final void rule__Spec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:1: ( rule__Spec__Group__1__Impl rule__Spec__Group__2 )
            // InternalMyDsl.g:292:2: rule__Spec__Group__1__Impl rule__Spec__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Spec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1"


    // $ANTLR start "rule__Spec__Group__1__Impl"
    // InternalMyDsl.g:299:1: rule__Spec__Group__1__Impl : ( 'spec' ) ;
    public final void rule__Spec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:303:1: ( ( 'spec' ) )
            // InternalMyDsl.g:304:1: ( 'spec' )
            {
            // InternalMyDsl.g:304:1: ( 'spec' )
            // InternalMyDsl.g:305:2: 'spec'
            {
             before(grammarAccess.getSpecAccess().getSpecKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSpecAccess().getSpecKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__1__Impl"


    // $ANTLR start "rule__Spec__Group__2"
    // InternalMyDsl.g:314:1: rule__Spec__Group__2 : rule__Spec__Group__2__Impl ;
    public final void rule__Spec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:318:1: ( rule__Spec__Group__2__Impl )
            // InternalMyDsl.g:319:2: rule__Spec__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__2"


    // $ANTLR start "rule__Spec__Group__2__Impl"
    // InternalMyDsl.g:325:1: rule__Spec__Group__2__Impl : ( ( rule__Spec__PartAssignment_2 ) ) ;
    public final void rule__Spec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:329:1: ( ( ( rule__Spec__PartAssignment_2 ) ) )
            // InternalMyDsl.g:330:1: ( ( rule__Spec__PartAssignment_2 ) )
            {
            // InternalMyDsl.g:330:1: ( ( rule__Spec__PartAssignment_2 ) )
            // InternalMyDsl.g:331:2: ( rule__Spec__PartAssignment_2 )
            {
             before(grammarAccess.getSpecAccess().getPartAssignment_2()); 
            // InternalMyDsl.g:332:2: ( rule__Spec__PartAssignment_2 )
            // InternalMyDsl.g:332:3: rule__Spec__PartAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Spec__PartAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpecAccess().getPartAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__Group__2__Impl"


    // $ANTLR start "rule__Part__Group__0"
    // InternalMyDsl.g:341:1: rule__Part__Group__0 : rule__Part__Group__0__Impl rule__Part__Group__1 ;
    public final void rule__Part__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:345:1: ( rule__Part__Group__0__Impl rule__Part__Group__1 )
            // InternalMyDsl.g:346:2: rule__Part__Group__0__Impl rule__Part__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Part__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Part__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__0"


    // $ANTLR start "rule__Part__Group__0__Impl"
    // InternalMyDsl.g:353:1: rule__Part__Group__0__Impl : ( ( rule__Part__NameAssignment_0 ) ) ;
    public final void rule__Part__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__Part__NameAssignment_0 ) ) )
            // InternalMyDsl.g:358:1: ( ( rule__Part__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:358:1: ( ( rule__Part__NameAssignment_0 ) )
            // InternalMyDsl.g:359:2: ( rule__Part__NameAssignment_0 )
            {
             before(grammarAccess.getPartAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:360:2: ( rule__Part__NameAssignment_0 )
            // InternalMyDsl.g:360:3: rule__Part__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Part__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__0__Impl"


    // $ANTLR start "rule__Part__Group__1"
    // InternalMyDsl.g:368:1: rule__Part__Group__1 : rule__Part__Group__1__Impl ;
    public final void rule__Part__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( rule__Part__Group__1__Impl )
            // InternalMyDsl.g:373:2: rule__Part__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Part__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__1"


    // $ANTLR start "rule__Part__Group__1__Impl"
    // InternalMyDsl.g:379:1: rule__Part__Group__1__Impl : ( ( rule__Part__Group_1__0 )? ) ;
    public final void rule__Part__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( ( ( rule__Part__Group_1__0 )? ) )
            // InternalMyDsl.g:384:1: ( ( rule__Part__Group_1__0 )? )
            {
            // InternalMyDsl.g:384:1: ( ( rule__Part__Group_1__0 )? )
            // InternalMyDsl.g:385:2: ( rule__Part__Group_1__0 )?
            {
             before(grammarAccess.getPartAccess().getGroup_1()); 
            // InternalMyDsl.g:386:2: ( rule__Part__Group_1__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:386:3: rule__Part__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Part__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group__1__Impl"


    // $ANTLR start "rule__Part__Group_1__0"
    // InternalMyDsl.g:395:1: rule__Part__Group_1__0 : rule__Part__Group_1__0__Impl rule__Part__Group_1__1 ;
    public final void rule__Part__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:399:1: ( rule__Part__Group_1__0__Impl rule__Part__Group_1__1 )
            // InternalMyDsl.g:400:2: rule__Part__Group_1__0__Impl rule__Part__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Part__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Part__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1__0"


    // $ANTLR start "rule__Part__Group_1__0__Impl"
    // InternalMyDsl.g:407:1: rule__Part__Group_1__0__Impl : ( ( rule__Part__InterfacesAssignment_1_0 ) ) ;
    public final void rule__Part__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:411:1: ( ( ( rule__Part__InterfacesAssignment_1_0 ) ) )
            // InternalMyDsl.g:412:1: ( ( rule__Part__InterfacesAssignment_1_0 ) )
            {
            // InternalMyDsl.g:412:1: ( ( rule__Part__InterfacesAssignment_1_0 ) )
            // InternalMyDsl.g:413:2: ( rule__Part__InterfacesAssignment_1_0 )
            {
             before(grammarAccess.getPartAccess().getInterfacesAssignment_1_0()); 
            // InternalMyDsl.g:414:2: ( rule__Part__InterfacesAssignment_1_0 )
            // InternalMyDsl.g:414:3: rule__Part__InterfacesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Part__InterfacesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getInterfacesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1__0__Impl"


    // $ANTLR start "rule__Part__Group_1__1"
    // InternalMyDsl.g:422:1: rule__Part__Group_1__1 : rule__Part__Group_1__1__Impl ;
    public final void rule__Part__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:426:1: ( rule__Part__Group_1__1__Impl )
            // InternalMyDsl.g:427:2: rule__Part__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Part__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1__1"


    // $ANTLR start "rule__Part__Group_1__1__Impl"
    // InternalMyDsl.g:433:1: rule__Part__Group_1__1__Impl : ( ( rule__Part__Group_1_1__0 )* ) ;
    public final void rule__Part__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( ( ( rule__Part__Group_1_1__0 )* ) )
            // InternalMyDsl.g:438:1: ( ( rule__Part__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:438:1: ( ( rule__Part__Group_1_1__0 )* )
            // InternalMyDsl.g:439:2: ( rule__Part__Group_1_1__0 )*
            {
             before(grammarAccess.getPartAccess().getGroup_1_1()); 
            // InternalMyDsl.g:440:2: ( rule__Part__Group_1_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:440:3: rule__Part__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Part__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPartAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1__1__Impl"


    // $ANTLR start "rule__Part__Group_1_1__0"
    // InternalMyDsl.g:449:1: rule__Part__Group_1_1__0 : rule__Part__Group_1_1__0__Impl rule__Part__Group_1_1__1 ;
    public final void rule__Part__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( rule__Part__Group_1_1__0__Impl rule__Part__Group_1_1__1 )
            // InternalMyDsl.g:454:2: rule__Part__Group_1_1__0__Impl rule__Part__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Part__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Part__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1_1__0"


    // $ANTLR start "rule__Part__Group_1_1__0__Impl"
    // InternalMyDsl.g:461:1: rule__Part__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Part__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:465:1: ( ( ',' ) )
            // InternalMyDsl.g:466:1: ( ',' )
            {
            // InternalMyDsl.g:466:1: ( ',' )
            // InternalMyDsl.g:467:2: ','
            {
             before(grammarAccess.getPartAccess().getCommaKeyword_1_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPartAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1_1__0__Impl"


    // $ANTLR start "rule__Part__Group_1_1__1"
    // InternalMyDsl.g:476:1: rule__Part__Group_1_1__1 : rule__Part__Group_1_1__1__Impl ;
    public final void rule__Part__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( rule__Part__Group_1_1__1__Impl )
            // InternalMyDsl.g:481:2: rule__Part__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Part__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1_1__1"


    // $ANTLR start "rule__Part__Group_1_1__1__Impl"
    // InternalMyDsl.g:487:1: rule__Part__Group_1_1__1__Impl : ( ( rule__Part__InterfacesAssignment_1_1_1 ) ) ;
    public final void rule__Part__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( ( ( rule__Part__InterfacesAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:492:1: ( ( rule__Part__InterfacesAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:492:1: ( ( rule__Part__InterfacesAssignment_1_1_1 ) )
            // InternalMyDsl.g:493:2: ( rule__Part__InterfacesAssignment_1_1_1 )
            {
             before(grammarAccess.getPartAccess().getInterfacesAssignment_1_1_1()); 
            // InternalMyDsl.g:494:2: ( rule__Part__InterfacesAssignment_1_1_1 )
            // InternalMyDsl.g:494:3: rule__Part__InterfacesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Part__InterfacesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPartAccess().getInterfacesAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__IfsAssignment_0"
    // InternalMyDsl.g:503:1: rule__Model__IfsAssignment_0 : ( ruleInterface ) ;
    public final void rule__Model__IfsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ruleInterface ) )
            // InternalMyDsl.g:508:2: ( ruleInterface )
            {
            // InternalMyDsl.g:508:2: ( ruleInterface )
            // InternalMyDsl.g:509:3: ruleInterface
            {
             before(grammarAccess.getModelAccess().getIfsInterfaceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getModelAccess().getIfsInterfaceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__IfsAssignment_0"


    // $ANTLR start "rule__Model__SpecsAssignment_1"
    // InternalMyDsl.g:518:1: rule__Model__SpecsAssignment_1 : ( ruleSpec ) ;
    public final void rule__Model__SpecsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( ( ruleSpec ) )
            // InternalMyDsl.g:523:2: ( ruleSpec )
            {
            // InternalMyDsl.g:523:2: ( ruleSpec )
            // InternalMyDsl.g:524:3: ruleSpec
            {
             before(grammarAccess.getModelAccess().getSpecsSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpec();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpecsSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SpecsAssignment_1"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // InternalMyDsl.g:533:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:538:2: ( RULE_ID )
            {
            // InternalMyDsl.g:538:2: ( RULE_ID )
            // InternalMyDsl.g:539:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Spec__PartAssignment_2"
    // InternalMyDsl.g:548:1: rule__Spec__PartAssignment_2 : ( rulePart ) ;
    public final void rule__Spec__PartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:552:1: ( ( rulePart ) )
            // InternalMyDsl.g:553:2: ( rulePart )
            {
            // InternalMyDsl.g:553:2: ( rulePart )
            // InternalMyDsl.g:554:3: rulePart
            {
             before(grammarAccess.getSpecAccess().getPartPartParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePart();

            state._fsp--;

             after(grammarAccess.getSpecAccess().getPartPartParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spec__PartAssignment_2"


    // $ANTLR start "rule__Part__NameAssignment_0"
    // InternalMyDsl.g:563:1: rule__Part__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Part__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:568:2: ( RULE_ID )
            {
            // InternalMyDsl.g:568:2: ( RULE_ID )
            // InternalMyDsl.g:569:3: RULE_ID
            {
             before(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__NameAssignment_0"


    // $ANTLR start "rule__Part__InterfacesAssignment_1_0"
    // InternalMyDsl.g:578:1: rule__Part__InterfacesAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Part__InterfacesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:583:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:583:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:584:3: ( RULE_ID )
            {
             before(grammarAccess.getPartAccess().getInterfacesInterfaceCrossReference_1_0_0()); 
            // InternalMyDsl.g:585:3: ( RULE_ID )
            // InternalMyDsl.g:586:4: RULE_ID
            {
             before(grammarAccess.getPartAccess().getInterfacesInterfaceIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartAccess().getInterfacesInterfaceIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getPartAccess().getInterfacesInterfaceCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__InterfacesAssignment_1_0"


    // $ANTLR start "rule__Part__InterfacesAssignment_1_1_1"
    // InternalMyDsl.g:597:1: rule__Part__InterfacesAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Part__InterfacesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:602:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:602:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:603:3: ( RULE_ID )
            {
             before(grammarAccess.getPartAccess().getInterfacesInterfaceCrossReference_1_1_1_0()); 
            // InternalMyDsl.g:604:3: ( RULE_ID )
            // InternalMyDsl.g:605:4: RULE_ID
            {
             before(grammarAccess.getPartAccess().getInterfacesInterfaceIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartAccess().getInterfacesInterfaceIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getPartAccess().getInterfacesInterfaceCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Part__InterfacesAssignment_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});

}
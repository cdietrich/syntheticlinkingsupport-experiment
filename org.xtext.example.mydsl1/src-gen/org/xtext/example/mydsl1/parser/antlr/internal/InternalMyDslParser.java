package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_ifs_0_0= ruleInterface ) )* ( (lv_specs_1_0= ruleSpec ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_ifs_0_0 = null;

        EObject lv_specs_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_ifs_0_0= ruleInterface ) )* ( (lv_specs_1_0= ruleSpec ) )* ) )
            // InternalMyDsl.g:78:2: ( ( (lv_ifs_0_0= ruleInterface ) )* ( (lv_specs_1_0= ruleSpec ) )* )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_ifs_0_0= ruleInterface ) )* ( (lv_specs_1_0= ruleSpec ) )* )
            // InternalMyDsl.g:79:3: ( (lv_ifs_0_0= ruleInterface ) )* ( (lv_specs_1_0= ruleSpec ) )*
            {
            // InternalMyDsl.g:79:3: ( (lv_ifs_0_0= ruleInterface ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_ifs_0_0= ruleInterface )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_ifs_0_0= ruleInterface )
            	    // InternalMyDsl.g:81:5: lv_ifs_0_0= ruleInterface
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getIfsInterfaceParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_ifs_0_0=ruleInterface();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ifs",
            	    						lv_ifs_0_0,
            	    						"org.xtext.example.mydsl1.MyDsl.Interface");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_specs_1_0= ruleSpec ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:99:4: (lv_specs_1_0= ruleSpec )
            	    {
            	    // InternalMyDsl.g:99:4: (lv_specs_1_0= ruleSpec )
            	    // InternalMyDsl.g:100:5: lv_specs_1_0= ruleSpec
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSpecsSpecParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_specs_1_0=ruleSpec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"specs",
            	    						lv_specs_1_0,
            	    						"org.xtext.example.mydsl1.MyDsl.Spec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInterface"
    // InternalMyDsl.g:121:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalMyDsl.g:121:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalMyDsl.g:122:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalMyDsl.g:128:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:135:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:135:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:136:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalMyDsl.g:140:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:141:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:142:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleSpec"
    // InternalMyDsl.g:162:1: entryRuleSpec returns [EObject current=null] : iv_ruleSpec= ruleSpec EOF ;
    public final EObject entryRuleSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpec = null;


        try {
            // InternalMyDsl.g:162:45: (iv_ruleSpec= ruleSpec EOF )
            // InternalMyDsl.g:163:2: iv_ruleSpec= ruleSpec EOF
            {
             newCompositeNode(grammarAccess.getSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpec=ruleSpec();

            state._fsp--;

             current =iv_ruleSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpec"


    // $ANTLR start "ruleSpec"
    // InternalMyDsl.g:169:1: ruleSpec returns [EObject current=null] : ( () otherlv_1= 'spec' ( (lv_part_2_0= rulePart ) ) ) ;
    public final EObject ruleSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_part_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:175:2: ( ( () otherlv_1= 'spec' ( (lv_part_2_0= rulePart ) ) ) )
            // InternalMyDsl.g:176:2: ( () otherlv_1= 'spec' ( (lv_part_2_0= rulePart ) ) )
            {
            // InternalMyDsl.g:176:2: ( () otherlv_1= 'spec' ( (lv_part_2_0= rulePart ) ) )
            // InternalMyDsl.g:177:3: () otherlv_1= 'spec' ( (lv_part_2_0= rulePart ) )
            {
            // InternalMyDsl.g:177:3: ()
            // InternalMyDsl.g:178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpecAccess().getSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecAccess().getSpecKeyword_1());
            		
            // InternalMyDsl.g:188:3: ( (lv_part_2_0= rulePart ) )
            // InternalMyDsl.g:189:4: (lv_part_2_0= rulePart )
            {
            // InternalMyDsl.g:189:4: (lv_part_2_0= rulePart )
            // InternalMyDsl.g:190:5: lv_part_2_0= rulePart
            {

            					newCompositeNode(grammarAccess.getSpecAccess().getPartPartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_part_2_0=rulePart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecRule());
            					}
            					set(
            						current,
            						"part",
            						lv_part_2_0,
            						"org.xtext.example.mydsl1.MyDsl.Part");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpec"


    // $ANTLR start "entryRulePart"
    // InternalMyDsl.g:211:1: entryRulePart returns [EObject current=null] : iv_rulePart= rulePart EOF ;
    public final EObject entryRulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePart = null;


        try {
            // InternalMyDsl.g:211:45: (iv_rulePart= rulePart EOF )
            // InternalMyDsl.g:212:2: iv_rulePart= rulePart EOF
            {
             newCompositeNode(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePart=rulePart();

            state._fsp--;

             current =iv_rulePart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePart"


    // $ANTLR start "rulePart"
    // InternalMyDsl.g:218:1: rulePart returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? ) ;
    public final EObject rulePart() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:224:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? ) )
            // InternalMyDsl.g:225:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? )
            {
            // InternalMyDsl.g:225:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )? )
            // InternalMyDsl.g:226:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )?
            {
            // InternalMyDsl.g:226:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:227:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:227:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:228:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPartAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:244:3: ( ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:245:4: ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    {
                    // InternalMyDsl.g:245:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMyDsl.g:246:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMyDsl.g:246:5: (otherlv_1= RULE_ID )
                    // InternalMyDsl.g:247:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPartRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_1, grammarAccess.getPartAccess().getInterfacesInterfaceCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:258:4: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==13) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:259:5: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )
                    	    {
                    	    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getPartAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:263:5: ( (otherlv_3= RULE_ID ) )
                    	    // InternalMyDsl.g:264:6: (otherlv_3= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:264:6: (otherlv_3= RULE_ID )
                    	    // InternalMyDsl.g:265:7: otherlv_3= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPartRule());
                    	    							}
                    	    						
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

                    	    							newLeafNode(otherlv_3, grammarAccess.getPartAccess().getInterfacesInterfaceCrossReference_1_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePart"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});

}
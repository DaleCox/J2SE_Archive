package JavaSearch;

/**
 *
 * @author dale cox
 */
import javax.swing.text.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextPane;
import java.util.HashSet;
import java.util.logging.Level;


public class MultiSyntaxDocument extends DefaultStyledDocument{
    
    /** Creates a new instance of MultiSyntaxDocument */
    public MultiSyntaxDocument() {
                
    }
    
    public static final String DEFAULT_FONT_FAMILY = "Courier New";
    public static final int    DEFAULT_FONT_SIZE   = 12;
    
    public static final SimpleAttributeSet DEFAULT; 
    public static final SimpleAttributeSet DEFAULT_SEARCH;
    public static final SimpleAttributeSet REM_DEFAULT_SEARCH;
    public static final SimpleAttributeSet SELECTED_SEARCH;
    public static final Color SELECT_COLOR = new Color(160, 32, 240);//Purple
    
    static {
        DEFAULT = new SimpleAttributeSet();
            StyleConstants.setForeground(DEFAULT, Color.BLACK);
            StyleConstants.setBackground(DEFAULT, Color.WHITE);
            StyleConstants.setFontFamily(DEFAULT, DEFAULT_FONT_FAMILY);
            StyleConstants.setFontSize(DEFAULT, DEFAULT_FONT_SIZE);
            
        DEFAULT_SEARCH= new SimpleAttributeSet();
            StyleConstants.setForeground(DEFAULT_SEARCH, Color.WHITE);
            StyleConstants.setBackground(DEFAULT_SEARCH, Color.BLUE);
            
        REM_DEFAULT_SEARCH= new SimpleAttributeSet();
            StyleConstants.setForeground(REM_DEFAULT_SEARCH, Color.BLACK);
            StyleConstants.setBackground(REM_DEFAULT_SEARCH, Color.WHITE); 
            
        SELECTED_SEARCH= new SimpleAttributeSet();
            StyleConstants.setForeground(SELECTED_SEARCH, Color.WHITE);
            StyleConstants.setBackground(SELECTED_SEARCH, SELECT_COLOR);
    }
 
  
   /* public DefaultStyledDocument clearFormatting(DefaultStyledDocument doc) throws BadLocationException {
        DefaultStyledDocument document = doc;
        Element rootElem = doc.getDefaultRootElement();
        for(int i = 0; i < rootElem.getElementCount(); ++i){
            Element childElem = rootElem.getElement(i);
	    
	    // Found cases where childElem returned is null.  Take
	    // care not to go there...
	    
	    if(childElem == null) {
                LPA_GUI_4.logger.logger.log(Level.INFO, "WARNING: MultiSyntaxDocument::clearFormatting(): childElem == null, ignoring");
		//System.out.println("WARNING: MultiSyntaxDocument::clearFormatting(): childElem == null, ignoring"); //debug
	    } else {
		int startOffset = childElem.getStartOffset();
		int endOffset = childElem.getEndOffset();

		document.setCharacterAttributes(startOffset, endOffset-startOffset, DEFAULT, true);
	    }
        }
        return document;        
    }*/
    
    public int[][] findMatch (String target, boolean matchCase, boolean matchWord, DefaultStyledDocument doc)throws BadLocationException{
        
         //create collenction for storing offsets
        ArrayList offStart = new ArrayList();
        ArrayList offEnd = new ArrayList();
        
        //create string buffer
        String selectedSourceContents= doc.getText(0, doc.getEndPosition().getOffset());
        StringBuffer sourceBuffer = new StringBuffer(selectedSourceContents);
        
        //set 
        String litteralTarget = Pattern.quote(target);
        Pattern pCPName;
        if(matchCase && matchWord){
            System.out.println("True and True");
            pCPName= Pattern.compile("\\\\[^ ]+[ ]|[a-zA-Z_][a-zA-Z0-9_.]*");}//use this pattern if both match case and match word are true
        else if(matchWord){
            System.out.println("Case false");
            litteralTarget = "\\b" + litteralTarget + "\\b";
            pCPName= Pattern.compile(litteralTarget, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE  | Pattern.COMMENTS);}
        else if(matchCase){
            System.out.println("Word false");
            pCPName= Pattern.compile(litteralTarget, Pattern.COMMENTS);}
        else{
            System.out.println("Match False");
            pCPName= Pattern.compile(litteralTarget, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE | Pattern.COMMENTS);}
	
        Matcher cpMatcher = pCPName.matcher(sourceBuffer);
        
        while(cpMatcher.find()) {
            if(matchCase && matchWord){
                String match = cpMatcher.group();
                if(target.equals(match)) {
                    offStart.add(cpMatcher.start());
                    offEnd.add(cpMatcher.end());
                }//end if
            }//end if
            else{
		offStart.add(cpMatcher.start());
		offEnd.add(cpMatcher.end());
	    }//end else
	}//end while
        int[][] offsets;
        if(offStart.size()>0)
            offsets = new int[offStart.size()][2];
        else{
            offsets = new int[1][2];
            offsets[0][1] = 0;
        }
        for(int i =0; i<offStart.size(); ++i){
            offsets[i][0] = (Integer) offStart.get(i);
            offsets[i][1] = (Integer) offEnd.get(i);
        }
        System.out.println("MatchesFound "+ offStart.size());//debug
        
        
        
        return offsets;
    }//end findMatch
    
     public DefaultStyledDocument setSearchHighlighting(DefaultStyledDocument doc, int startOffset, int endOffset) throws BadLocationException {
         doc.setCharacterAttributes(startOffset, (endOffset-startOffset), DEFAULT_SEARCH, false);
         
         return doc;
     }//end setSearchHighlighting
     
      public DefaultStyledDocument setSelectedSearchHighlighting(DefaultStyledDocument doc, int startOffset, int endOffset) throws BadLocationException {
         doc.setCharacterAttributes(startOffset, (endOffset-startOffset), SELECTED_SEARCH, false);

         return doc;
     }//end setSearchHighlighting
     
     public DefaultStyledDocument removeSearchHighlighting(DefaultStyledDocument doc, int startOffset, int endOffset) throws BadLocationException {
         doc.setCharacterAttributes(startOffset, (endOffset-startOffset), REM_DEFAULT_SEARCH, false);
         
         return doc;
     }//end setSearchHighlighting
}

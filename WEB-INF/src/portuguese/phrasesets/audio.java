package portuguese.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 4 DE ABRIL DE 2022 16H44MIN2S BRT
 */
public class audio extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(28);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: msg001
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg001", "msg001.wav", ""); 

		// phrase: msg002
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg002", "msg002.wav", ""); 

		// phrase: msg003
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg003", "msg003.wav", ""); 

		// phrase: msg004
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg004", "msg004.wav", ""); 

		// phrase: msg005
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg005", "msg005.wav", ""); 

		// phrase: msg006
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg006", "msg006.wav", ""); 

		// phrase: msg007
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg007", "msg007.wav", ""); 

		// phrase: msg008
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg008", "msg008.wav", ""); 

		// phrase: msg009
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg009", "msg009.wav", ""); 

		// phrase: msg010
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg010", "msg010.wav", ""); 

		// phrase: msg011
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg011", "msg011.wav", ""); 

		// phrase: msg012
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg012", "msg012.wav", ""); 

		// phrase: msg013
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg013", "msg013.wav", ""); 

		// phrase: msg014
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "msg014", "msg014.wav", ""); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 8 DE ABRIL DE 2022 11H39MIN29S BRT
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(audio.PHRASE_MAP, phraseName));
	}
}

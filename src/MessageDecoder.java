
public interface MessageDecoder {
	/**
	 * 
	 * @param plainText - Takes the text to decode. 
	 * @return The decoded text.
	 */
	public String decode( String plainText );
}
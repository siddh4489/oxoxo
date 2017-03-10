package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class SearchSnippet implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public SearchSnippet() {
  }
    
  
  /**
   * element  : text of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo text__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","text","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean text__is_set = false;

  private java.lang.String text;

  public java.lang.String getText() {
    return text;
  }

  

  public void setText(java.lang.String text) {
    this.text = text;
    text__is_set = true;
  }
  
  /**
   * element  : wholeFields of type {urn:enterprise.soap.sforce.com}NameValuePair
   * java type: com.sforce.soap.enterprise.NameValuePair[]
   */
  private static final com.sforce.ws.bind.TypeInfo wholeFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","wholeFields","urn:enterprise.soap.sforce.com","NameValuePair",0,-1,true);

  private boolean wholeFields__is_set = false;

  private com.sforce.soap.enterprise.NameValuePair[] wholeFields = new com.sforce.soap.enterprise.NameValuePair[0];

  public com.sforce.soap.enterprise.NameValuePair[] getWholeFields() {
    return wholeFields;
  }

  

  public void setWholeFields(com.sforce.soap.enterprise.NameValuePair[] wholeFields) {
    this.wholeFields = wholeFields;
    wholeFields__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeString(__out, text__typeInfo, text, text__is_set);
    __typeMapper.writeObject(__out, wholeFields__typeInfo, wholeFields, wholeFields__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.isElement(__in, text__typeInfo)) {
      setText((java.lang.String)__typeMapper.readString(__in, text__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, wholeFields__typeInfo)) {
      setWholeFields((com.sforce.soap.enterprise.NameValuePair[])__typeMapper.readObject(__in, wholeFields__typeInfo, com.sforce.soap.enterprise.NameValuePair[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchSnippet ");
    
    sb.append(" text=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(text)+"'\n");
    sb.append(" wholeFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(wholeFields)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeNouns_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeNouns_element() {
  }
    
  
  /**
   * element  : nouns of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo nouns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","nouns","http://www.w3.org/2001/XMLSchema","string",0,100,true);

  private boolean nouns__is_set = false;

  private java.lang.String[] nouns = new java.lang.String[0];

  public java.lang.String[] getNouns() {
    return nouns;
  }

  

  public void setNouns(java.lang.String[] nouns) {
    this.nouns = nouns;
    nouns__is_set = true;
  }
  
  /**
   * element  : onlyRenamed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo onlyRenamed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","onlyRenamed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean onlyRenamed__is_set = false;

  private boolean onlyRenamed;

  public boolean getOnlyRenamed() {
    return onlyRenamed;
  }

  

  public boolean isOnlyRenamed() {
    return onlyRenamed;
  }

  

  public void setOnlyRenamed(boolean onlyRenamed) {
    this.onlyRenamed = onlyRenamed;
    onlyRenamed__is_set = true;
  }
  
  /**
   * element  : includeFields of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo includeFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","includeFields","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean includeFields__is_set = false;

  private boolean includeFields;

  public boolean getIncludeFields() {
    return includeFields;
  }

  

  public boolean isIncludeFields() {
    return includeFields;
  }

  

  public void setIncludeFields(boolean includeFields) {
    this.includeFields = includeFields;
    includeFields__is_set = true;
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
   
    __typeMapper.writeObject(__out, nouns__typeInfo, nouns, nouns__is_set);
    __typeMapper.writeBoolean(__out, onlyRenamed__typeInfo, onlyRenamed, onlyRenamed__is_set);
    __typeMapper.writeBoolean(__out, includeFields__typeInfo, includeFields, includeFields__is_set);
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
    if (__typeMapper.isElement(__in, nouns__typeInfo)) {
      setNouns((java.lang.String[])__typeMapper.readObject(__in, nouns__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, onlyRenamed__typeInfo)) {
      setOnlyRenamed((boolean)__typeMapper.readBoolean(__in, onlyRenamed__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, includeFields__typeInfo)) {
      setIncludeFields((boolean)__typeMapper.readBoolean(__in, includeFields__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeNouns_element ");
    
    sb.append(" nouns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(nouns)+"'\n");
    sb.append(" onlyRenamed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(onlyRenamed)+"'\n");
    sb.append(" includeFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(includeFields)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeFlexiPages_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeFlexiPages_element() {
  }
    
  
  /**
   * element  : flexiPages of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo flexiPages__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","flexiPages","http://www.w3.org/2001/XMLSchema","string",1,-1,true);

  private boolean flexiPages__is_set = false;

  private java.lang.String[] flexiPages = new java.lang.String[0];

  public java.lang.String[] getFlexiPages() {
    return flexiPages;
  }

  

  public void setFlexiPages(java.lang.String[] flexiPages) {
    this.flexiPages = flexiPages;
    flexiPages__is_set = true;
  }
  
  /**
   * element  : contexts of type {urn:enterprise.soap.sforce.com}FlexipageContext
   * java type: com.sforce.soap.enterprise.FlexipageContext[]
   */
  private static final com.sforce.ws.bind.TypeInfo contexts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contexts","urn:enterprise.soap.sforce.com","FlexipageContext",0,-1,true);

  private boolean contexts__is_set = false;

  private com.sforce.soap.enterprise.FlexipageContext[] contexts = new com.sforce.soap.enterprise.FlexipageContext[0];

  public com.sforce.soap.enterprise.FlexipageContext[] getContexts() {
    return contexts;
  }

  

  public void setContexts(com.sforce.soap.enterprise.FlexipageContext[] contexts) {
    this.contexts = contexts;
    contexts__is_set = true;
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
   
    __typeMapper.writeObject(__out, flexiPages__typeInfo, flexiPages, flexiPages__is_set);
    __typeMapper.writeObject(__out, contexts__typeInfo, contexts, contexts__is_set);
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
    if (__typeMapper.verifyElement(__in, flexiPages__typeInfo)) {
      setFlexiPages((java.lang.String[])__typeMapper.readObject(__in, flexiPages__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, contexts__typeInfo)) {
      setContexts((com.sforce.soap.enterprise.FlexipageContext[])__typeMapper.readObject(__in, contexts__typeInfo, com.sforce.soap.enterprise.FlexipageContext[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeFlexiPages_element ");
    
    sb.append(" flexiPages=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(flexiPages)+"'\n");
    sb.append(" contexts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contexts)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
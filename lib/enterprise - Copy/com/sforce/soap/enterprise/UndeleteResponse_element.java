package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class UndeleteResponse_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public UndeleteResponse_element() {
  }
    
  
  /**
   * element  : result of type {urn:enterprise.soap.sforce.com}UndeleteResult
   * java type: com.sforce.soap.enterprise.UndeleteResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo result__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","result","urn:enterprise.soap.sforce.com","UndeleteResult",1,-1,true);

  private boolean result__is_set = false;

  private com.sforce.soap.enterprise.UndeleteResult[] result = new com.sforce.soap.enterprise.UndeleteResult[0];

  public com.sforce.soap.enterprise.UndeleteResult[] getResult() {
    return result;
  }

  

  public void setResult(com.sforce.soap.enterprise.UndeleteResult[] result) {
    this.result = result;
    result__is_set = true;
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
   
    __typeMapper.writeObject(__out, result__typeInfo, result, result__is_set);
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
    if (__typeMapper.verifyElement(__in, result__typeInfo)) {
      setResult((com.sforce.soap.enterprise.UndeleteResult[])__typeMapper.readObject(__in, result__typeInfo, com.sforce.soap.enterprise.UndeleteResult[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[UndeleteResponse_element ");
    
    sb.append(" result=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(result)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
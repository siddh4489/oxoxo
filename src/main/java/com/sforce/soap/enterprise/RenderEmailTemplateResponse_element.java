package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class RenderEmailTemplateResponse_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public RenderEmailTemplateResponse_element() {
  }
    
  
  /**
   * element  : result of type {urn:enterprise.soap.sforce.com}RenderEmailTemplateResult
   * java type: com.sforce.soap.enterprise.RenderEmailTemplateResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo result__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","result","urn:enterprise.soap.sforce.com","RenderEmailTemplateResult",0,10,true);

  private boolean result__is_set = false;

  private com.sforce.soap.enterprise.RenderEmailTemplateResult[] result = new com.sforce.soap.enterprise.RenderEmailTemplateResult[0];

  public com.sforce.soap.enterprise.RenderEmailTemplateResult[] getResult() {
    return result;
  }

  

  public void setResult(com.sforce.soap.enterprise.RenderEmailTemplateResult[] result) {
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
    if (__typeMapper.isElement(__in, result__typeInfo)) {
      setResult((com.sforce.soap.enterprise.RenderEmailTemplateResult[])__typeMapper.readObject(__in, result__typeInfo, com.sforce.soap.enterprise.RenderEmailTemplateResult[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RenderEmailTemplateResponse_element ");
    
    sb.append(" result=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(result)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
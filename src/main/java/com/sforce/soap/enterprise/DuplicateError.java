package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DuplicateError extends com.sforce.soap.enterprise.Error {
  /**
   * Constructor
   */
  public DuplicateError() {
  }
    
  
  /**
   * element  : duplicateResult of type {urn:enterprise.soap.sforce.com}DuplicateResult
   * java type: com.sforce.soap.enterprise.DuplicateResult
   */
  private static final com.sforce.ws.bind.TypeInfo duplicateResult__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","duplicateResult","urn:enterprise.soap.sforce.com","DuplicateResult",1,1,true);

  private boolean duplicateResult__is_set = false;

  private com.sforce.soap.enterprise.DuplicateResult duplicateResult;

  public com.sforce.soap.enterprise.DuplicateResult getDuplicateResult() {
    return duplicateResult;
  }

  

  public void setDuplicateResult(com.sforce.soap.enterprise.DuplicateResult duplicateResult) {
    this.duplicateResult = duplicateResult;
    duplicateResult__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "DuplicateError");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, duplicateResult__typeInfo, duplicateResult, duplicateResult__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, duplicateResult__typeInfo)) {
      setDuplicateResult((com.sforce.soap.enterprise.DuplicateResult)__typeMapper.readObject(__in, duplicateResult__typeInfo, com.sforce.soap.enterprise.DuplicateResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DuplicateError ");
    sb.append(super.toString());
    sb.append(" duplicateResult=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(duplicateResult)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
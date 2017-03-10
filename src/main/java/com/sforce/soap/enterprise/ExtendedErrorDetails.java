package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ExtendedErrorDetails implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ExtendedErrorDetails() {
  }
    
  
  /**
   * element  : extendedErrorCode of type {urn:enterprise.soap.sforce.com}ExtendedErrorCode
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo extendedErrorCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","extendedErrorCode","urn:enterprise.soap.sforce.com","ExtendedErrorCode",1,1,true);

  private boolean extendedErrorCode__is_set = false;

  private java.lang.String extendedErrorCode;

  public java.lang.String getExtendedErrorCode() {
    return extendedErrorCode;
  }

  

  public void setExtendedErrorCode(java.lang.String extendedErrorCode) {
    this.extendedErrorCode = extendedErrorCode;
    extendedErrorCode__is_set = true;
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
   
    __typeMapper.writeString(__out, extendedErrorCode__typeInfo, extendedErrorCode, extendedErrorCode__is_set);
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
    if (__typeMapper.verifyElement(__in, extendedErrorCode__typeInfo)) {
      setExtendedErrorCode((java.lang.String)__typeMapper.readString(__in, extendedErrorCode__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ExtendedErrorDetails ");
    
    sb.append(" extendedErrorCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(extendedErrorCode)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
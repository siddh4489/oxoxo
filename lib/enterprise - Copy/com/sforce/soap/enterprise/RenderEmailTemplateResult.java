package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class RenderEmailTemplateResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public RenderEmailTemplateResult() {
  }
    
  
  /**
   * element  : bodyResults of type {urn:enterprise.soap.sforce.com}RenderEmailTemplateBodyResult
   * java type: com.sforce.soap.enterprise.RenderEmailTemplateBodyResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo bodyResults__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","bodyResults","urn:enterprise.soap.sforce.com","RenderEmailTemplateBodyResult",0,10,true);

  private boolean bodyResults__is_set = false;

  private com.sforce.soap.enterprise.RenderEmailTemplateBodyResult[] bodyResults = new com.sforce.soap.enterprise.RenderEmailTemplateBodyResult[0];

  public com.sforce.soap.enterprise.RenderEmailTemplateBodyResult[] getBodyResults() {
    return bodyResults;
  }

  

  public void setBodyResults(com.sforce.soap.enterprise.RenderEmailTemplateBodyResult[] bodyResults) {
    this.bodyResults = bodyResults;
    bodyResults__is_set = true;
  }
  
  /**
   * element  : errors of type {urn:enterprise.soap.sforce.com}Error
   * java type: com.sforce.soap.enterprise.Error[]
   */
  private static final com.sforce.ws.bind.TypeInfo errors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","errors","urn:enterprise.soap.sforce.com","Error",0,-1,true);

  private boolean errors__is_set = false;

  private com.sforce.soap.enterprise.Error[] errors = new com.sforce.soap.enterprise.Error[0];

  public com.sforce.soap.enterprise.Error[] getErrors() {
    return errors;
  }

  

  public void setErrors(com.sforce.soap.enterprise.Error[] errors) {
    this.errors = errors;
    errors__is_set = true;
  }
  
  /**
   * element  : success of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo success__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","success","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean success__is_set = false;

  private boolean success;

  public boolean getSuccess() {
    return success;
  }

  

  public boolean isSuccess() {
    return success;
  }

  

  public void setSuccess(boolean success) {
    this.success = success;
    success__is_set = true;
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
   
    __typeMapper.writeObject(__out, bodyResults__typeInfo, bodyResults, bodyResults__is_set);
    __typeMapper.writeObject(__out, errors__typeInfo, errors, errors__is_set);
    __typeMapper.writeBoolean(__out, success__typeInfo, success, success__is_set);
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
    if (__typeMapper.isElement(__in, bodyResults__typeInfo)) {
      setBodyResults((com.sforce.soap.enterprise.RenderEmailTemplateBodyResult[])__typeMapper.readObject(__in, bodyResults__typeInfo, com.sforce.soap.enterprise.RenderEmailTemplateBodyResult[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, errors__typeInfo)) {
      setErrors((com.sforce.soap.enterprise.Error[])__typeMapper.readObject(__in, errors__typeInfo, com.sforce.soap.enterprise.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, success__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RenderEmailTemplateResult ");
    
    sb.append(" bodyResults=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(bodyResults)+"'\n");
    sb.append(" errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errors)+"'\n");
    sb.append(" success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(success)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
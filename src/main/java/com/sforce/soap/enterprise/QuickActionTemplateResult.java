package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class QuickActionTemplateResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public QuickActionTemplateResult() {
  }
    
  
  /**
   * element  : defaultValueFormulas of type {urn:sobject.enterprise.soap.sforce.com}sObject
   * java type: com.sforce.soap.enterprise.sobject.SObject
   */
  private static final com.sforce.ws.bind.TypeInfo defaultValueFormulas__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","defaultValueFormulas","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true);

  private boolean defaultValueFormulas__is_set = false;

  private com.sforce.soap.enterprise.sobject.SObject defaultValueFormulas;

  public com.sforce.soap.enterprise.sobject.SObject getDefaultValueFormulas() {
    return defaultValueFormulas;
  }

  

  public void setDefaultValueFormulas(com.sforce.soap.enterprise.sobject.SObject defaultValueFormulas) {
    this.defaultValueFormulas = defaultValueFormulas;
    defaultValueFormulas__is_set = true;
  }
  
  /**
   * element  : defaultValues of type {urn:sobject.enterprise.soap.sforce.com}sObject
   * java type: com.sforce.soap.enterprise.sobject.SObject
   */
  private static final com.sforce.ws.bind.TypeInfo defaultValues__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","defaultValues","urn:sobject.enterprise.soap.sforce.com","sObject",1,1,true);

  private boolean defaultValues__is_set = false;

  private com.sforce.soap.enterprise.sobject.SObject defaultValues;

  public com.sforce.soap.enterprise.sobject.SObject getDefaultValues() {
    return defaultValues;
  }

  

  public void setDefaultValues(com.sforce.soap.enterprise.sobject.SObject defaultValues) {
    this.defaultValues = defaultValues;
    defaultValues__is_set = true;
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
   
    __typeMapper.writeObject(__out, defaultValueFormulas__typeInfo, defaultValueFormulas, defaultValueFormulas__is_set);
    __typeMapper.writeObject(__out, defaultValues__typeInfo, defaultValues, defaultValues__is_set);
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
    if (__typeMapper.verifyElement(__in, defaultValueFormulas__typeInfo)) {
      setDefaultValueFormulas((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, defaultValueFormulas__typeInfo, com.sforce.soap.enterprise.sobject.SObject.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, defaultValues__typeInfo)) {
      setDefaultValues((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, defaultValues__typeInfo, com.sforce.soap.enterprise.sobject.SObject.class));
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
    sb.append("[QuickActionTemplateResult ");
    
    sb.append(" defaultValueFormulas=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultValueFormulas)+"'\n");
    sb.append(" defaultValues=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(defaultValues)+"'\n");
    sb.append(" errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errors)+"'\n");
    sb.append(" success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(success)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
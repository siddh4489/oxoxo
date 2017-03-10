package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribePathAssistantField implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribePathAssistantField() {
  }
    
  
  /**
   * element  : apiName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo apiName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","apiName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean apiName__is_set = false;

  private java.lang.String apiName;

  public java.lang.String getApiName() {
    return apiName;
  }

  

  public void setApiName(java.lang.String apiName) {
    this.apiName = apiName;
    apiName__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : readOnly of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo readOnly__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","readOnly","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean readOnly__is_set = false;

  private boolean readOnly;

  public boolean getReadOnly() {
    return readOnly;
  }

  

  public boolean isReadOnly() {
    return readOnly;
  }

  

  public void setReadOnly(boolean readOnly) {
    this.readOnly = readOnly;
    readOnly__is_set = true;
  }
  
  /**
   * element  : required of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo required__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","required","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean required__is_set = false;

  private boolean required;

  public boolean getRequired() {
    return required;
  }

  

  public boolean isRequired() {
    return required;
  }

  

  public void setRequired(boolean required) {
    this.required = required;
    required__is_set = true;
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
   
    __typeMapper.writeString(__out, apiName__typeInfo, apiName, apiName__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeBoolean(__out, readOnly__typeInfo, readOnly, readOnly__is_set);
    __typeMapper.writeBoolean(__out, required__typeInfo, required, required__is_set);
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
    if (__typeMapper.verifyElement(__in, apiName__typeInfo)) {
      setApiName((java.lang.String)__typeMapper.readString(__in, apiName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, readOnly__typeInfo)) {
      setReadOnly((boolean)__typeMapper.readBoolean(__in, readOnly__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, required__typeInfo)) {
      setRequired((boolean)__typeMapper.readBoolean(__in, required__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribePathAssistantField ");
    
    sb.append(" apiName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(apiName)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" readOnly=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(readOnly)+"'\n");
    sb.append(" required=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(required)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
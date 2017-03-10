package com.sforce.soap.enterprise.sobject;

/**
 * Generated class, please do not edit.
 */
public class DataType extends com.sforce.soap.enterprise.sobject.SObject {
  /**
   * Constructor
   */
  public DataType() {
  }
    
  
  /**
   * element  : ContextServiceDataTypeId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContextServiceDataTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContextServiceDataTypeId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ContextServiceDataTypeId__is_set = false;

  private java.lang.String ContextServiceDataTypeId;

  public java.lang.String getContextServiceDataTypeId() {
    return ContextServiceDataTypeId;
  }

  

  public void setContextServiceDataTypeId(java.lang.String ContextServiceDataTypeId) {
    this.ContextServiceDataTypeId = ContextServiceDataTypeId;
    ContextServiceDataTypeId__is_set = true;
  }
  
  /**
   * element  : ContextWsdlDataTypeId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ContextWsdlDataTypeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ContextWsdlDataTypeId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ContextWsdlDataTypeId__is_set = false;

  private java.lang.String ContextWsdlDataTypeId;

  public java.lang.String getContextWsdlDataTypeId() {
    return ContextWsdlDataTypeId;
  }

  

  public void setContextWsdlDataTypeId(java.lang.String ContextWsdlDataTypeId) {
    this.ContextWsdlDataTypeId = ContextWsdlDataTypeId;
    ContextWsdlDataTypeId__is_set = true;
  }
  
  /**
   * element  : DeveloperName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DeveloperName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DeveloperName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DeveloperName__is_set = false;

  private java.lang.String DeveloperName;

  public java.lang.String getDeveloperName() {
    return DeveloperName;
  }

  

  public void setDeveloperName(java.lang.String DeveloperName) {
    this.DeveloperName = DeveloperName;
    DeveloperName__is_set = true;
  }
  
  /**
   * element  : DurableId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DurableId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DurableId__is_set = false;

  private java.lang.String DurableId;

  public java.lang.String getDurableId() {
    return DurableId;
  }

  

  public void setDurableId(java.lang.String DurableId) {
    this.DurableId = DurableId;
    DurableId__is_set = true;
  }
  
  /**
   * element  : IsComplex of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsComplex__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsComplex","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsComplex__is_set = false;

  private java.lang.Boolean IsComplex;

  public java.lang.Boolean getIsComplex() {
    return IsComplex;
  }

  

  public void setIsComplex(java.lang.Boolean IsComplex) {
    this.IsComplex = IsComplex;
    IsComplex__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "DataType");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, ContextServiceDataTypeId__typeInfo, ContextServiceDataTypeId, ContextServiceDataTypeId__is_set);
    __typeMapper.writeString(__out, ContextWsdlDataTypeId__typeInfo, ContextWsdlDataTypeId, ContextWsdlDataTypeId__is_set);
    __typeMapper.writeString(__out, DeveloperName__typeInfo, DeveloperName, DeveloperName__is_set);
    __typeMapper.writeString(__out, DurableId__typeInfo, DurableId, DurableId__is_set);
    __typeMapper.writeObject(__out, IsComplex__typeInfo, IsComplex, IsComplex__is_set);
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
    if (__typeMapper.isElement(__in, ContextServiceDataTypeId__typeInfo)) {
      setContextServiceDataTypeId((java.lang.String)__typeMapper.readString(__in, ContextServiceDataTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContextWsdlDataTypeId__typeInfo)) {
      setContextWsdlDataTypeId((java.lang.String)__typeMapper.readString(__in, ContextWsdlDataTypeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeveloperName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, DeveloperName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DurableId__typeInfo)) {
      setDurableId((java.lang.String)__typeMapper.readString(__in, DurableId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsComplex__typeInfo)) {
      setIsComplex((java.lang.Boolean)__typeMapper.readObject(__in, IsComplex__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DataType ");
    sb.append(super.toString());
    sb.append(" ContextServiceDataTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContextServiceDataTypeId)+"'\n");
    sb.append(" ContextWsdlDataTypeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContextWsdlDataTypeId)+"'\n");
    sb.append(" DeveloperName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeveloperName)+"'\n");
    sb.append(" DurableId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DurableId)+"'\n");
    sb.append(" IsComplex=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsComplex)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
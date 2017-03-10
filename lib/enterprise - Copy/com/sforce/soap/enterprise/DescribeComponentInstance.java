package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeComponentInstance implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeComponentInstance() {
  }
    
  
  /**
   * element  : properties of type {urn:enterprise.soap.sforce.com}DescribeComponentInstanceProperty
   * java type: com.sforce.soap.enterprise.DescribeComponentInstanceProperty[]
   */
  private static final com.sforce.ws.bind.TypeInfo properties__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","properties","urn:enterprise.soap.sforce.com","DescribeComponentInstanceProperty",0,-1,true);

  private boolean properties__is_set = false;

  private com.sforce.soap.enterprise.DescribeComponentInstanceProperty[] properties = new com.sforce.soap.enterprise.DescribeComponentInstanceProperty[0];

  public com.sforce.soap.enterprise.DescribeComponentInstanceProperty[] getProperties() {
    return properties;
  }

  

  public void setProperties(com.sforce.soap.enterprise.DescribeComponentInstanceProperty[] properties) {
    this.properties = properties;
    properties__is_set = true;
  }
  
  /**
   * element  : typeName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo typeName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","typeName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean typeName__is_set = false;

  private java.lang.String typeName;

  public java.lang.String getTypeName() {
    return typeName;
  }

  

  public void setTypeName(java.lang.String typeName) {
    this.typeName = typeName;
    typeName__is_set = true;
  }
  
  /**
   * element  : typeNamespace of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo typeNamespace__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","typeNamespace","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean typeNamespace__is_set = false;

  private java.lang.String typeNamespace;

  public java.lang.String getTypeNamespace() {
    return typeNamespace;
  }

  

  public void setTypeNamespace(java.lang.String typeNamespace) {
    this.typeNamespace = typeNamespace;
    typeNamespace__is_set = true;
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
   
    __typeMapper.writeObject(__out, properties__typeInfo, properties, properties__is_set);
    __typeMapper.writeString(__out, typeName__typeInfo, typeName, typeName__is_set);
    __typeMapper.writeString(__out, typeNamespace__typeInfo, typeNamespace, typeNamespace__is_set);
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
    if (__typeMapper.isElement(__in, properties__typeInfo)) {
      setProperties((com.sforce.soap.enterprise.DescribeComponentInstanceProperty[])__typeMapper.readObject(__in, properties__typeInfo, com.sforce.soap.enterprise.DescribeComponentInstanceProperty[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, typeName__typeInfo)) {
      setTypeName((java.lang.String)__typeMapper.readString(__in, typeName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, typeNamespace__typeInfo)) {
      setTypeNamespace((java.lang.String)__typeMapper.readString(__in, typeNamespace__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeComponentInstance ");
    
    sb.append(" properties=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(properties)+"'\n");
    sb.append(" typeName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(typeName)+"'\n");
    sb.append(" typeNamespace=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(typeNamespace)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
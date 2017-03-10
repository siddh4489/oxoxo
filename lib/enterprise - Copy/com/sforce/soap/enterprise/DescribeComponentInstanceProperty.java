package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeComponentInstanceProperty implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeComponentInstanceProperty() {
  }
    
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : region of type {urn:enterprise.soap.sforce.com}DescribeFlexiPageRegion
   * java type: com.sforce.soap.enterprise.DescribeFlexiPageRegion
   */
  private static final com.sforce.ws.bind.TypeInfo region__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","region","urn:enterprise.soap.sforce.com","DescribeFlexiPageRegion",0,1,true);

  private boolean region__is_set = false;

  private com.sforce.soap.enterprise.DescribeFlexiPageRegion region;

  public com.sforce.soap.enterprise.DescribeFlexiPageRegion getRegion() {
    return region;
  }

  

  public void setRegion(com.sforce.soap.enterprise.DescribeFlexiPageRegion region) {
    this.region = region;
    region__is_set = true;
  }
  
  /**
   * element  : type of type {urn:enterprise.soap.sforce.com}ComponentInstancePropertyTypeEnum
   * java type: com.sforce.soap.enterprise.ComponentInstancePropertyTypeEnum
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","type","urn:enterprise.soap.sforce.com","ComponentInstancePropertyTypeEnum",1,1,true);

  private boolean type__is_set = false;

  private com.sforce.soap.enterprise.ComponentInstancePropertyTypeEnum type;

  public com.sforce.soap.enterprise.ComponentInstancePropertyTypeEnum getType() {
    return type;
  }

  

  public void setType(com.sforce.soap.enterprise.ComponentInstancePropertyTypeEnum type) {
    this.type = type;
    type__is_set = true;
  }
  
  /**
   * element  : value of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo value__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean value__is_set = false;

  private java.lang.String value;

  public java.lang.String getValue() {
    return value;
  }

  

  public void setValue(java.lang.String value) {
    this.value = value;
    value__is_set = true;
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
   
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeObject(__out, region__typeInfo, region, region__is_set);
    __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);
    __typeMapper.writeString(__out, value__typeInfo, value, value__is_set);
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
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, region__typeInfo)) {
      setRegion((com.sforce.soap.enterprise.DescribeFlexiPageRegion)__typeMapper.readObject(__in, region__typeInfo, com.sforce.soap.enterprise.DescribeFlexiPageRegion.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((com.sforce.soap.enterprise.ComponentInstancePropertyTypeEnum)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.enterprise.ComponentInstancePropertyTypeEnum.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, value__typeInfo)) {
      setValue((java.lang.String)__typeMapper.readString(__in, value__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeComponentInstanceProperty ");
    
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" region=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(region)+"'\n");
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append(" value=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(value)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
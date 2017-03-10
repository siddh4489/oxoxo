package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class FieldLayoutComponent extends com.sforce.soap.enterprise.DescribeLayoutComponent {
  /**
   * Constructor
   */
  public FieldLayoutComponent() {
  }
    
  
  /**
   * element  : components of type {urn:enterprise.soap.sforce.com}DescribeLayoutComponent
   * java type: com.sforce.soap.enterprise.DescribeLayoutComponent[]
   */
  private static final com.sforce.ws.bind.TypeInfo components__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","components","urn:enterprise.soap.sforce.com","DescribeLayoutComponent",0,-1,true);

  private boolean components__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutComponent[] components = new com.sforce.soap.enterprise.DescribeLayoutComponent[0];

  public com.sforce.soap.enterprise.DescribeLayoutComponent[] getComponents() {
    return components;
  }

  

  public void setComponents(com.sforce.soap.enterprise.DescribeLayoutComponent[] components) {
    this.components = components;
    components__is_set = true;
  }
  
  /**
   * element  : fieldType of type {urn:enterprise.soap.sforce.com}fieldType
   * java type: com.sforce.soap.enterprise.FieldType
   */
  private static final com.sforce.ws.bind.TypeInfo fieldType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","fieldType","urn:enterprise.soap.sforce.com","fieldType",1,1,true);

  private boolean fieldType__is_set = false;

  private com.sforce.soap.enterprise.FieldType fieldType;

  public com.sforce.soap.enterprise.FieldType getFieldType() {
    return fieldType;
  }

  

  public void setFieldType(com.sforce.soap.enterprise.FieldType fieldType) {
    this.fieldType = fieldType;
    fieldType__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "FieldLayoutComponent");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, components__typeInfo, components, components__is_set);
    __typeMapper.writeObject(__out, fieldType__typeInfo, fieldType, fieldType__is_set);
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
    if (__typeMapper.isElement(__in, components__typeInfo)) {
      setComponents((com.sforce.soap.enterprise.DescribeLayoutComponent[])__typeMapper.readObject(__in, components__typeInfo, com.sforce.soap.enterprise.DescribeLayoutComponent[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, fieldType__typeInfo)) {
      setFieldType((com.sforce.soap.enterprise.FieldType)__typeMapper.readObject(__in, fieldType__typeInfo, com.sforce.soap.enterprise.FieldType.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FieldLayoutComponent ");
    sb.append(super.toString());
    sb.append(" components=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(components)+"'\n");
    sb.append(" fieldType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldType)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
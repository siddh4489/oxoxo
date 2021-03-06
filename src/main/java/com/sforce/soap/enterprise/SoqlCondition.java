package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class SoqlCondition extends com.sforce.soap.enterprise.SoqlWhereCondition {
  /**
   * Constructor
   */
  public SoqlCondition() {
  }
    
  
  /**
   * element  : field of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean field__is_set = false;

  private java.lang.String field;

  public java.lang.String getField() {
    return field;
  }

  

  public void setField(java.lang.String field) {
    this.field = field;
    field__is_set = true;
  }
  
  /**
   * element  : operator of type {urn:enterprise.soap.sforce.com}soqlOperator
   * java type: com.sforce.soap.enterprise.SoqlOperator
   */
  private static final com.sforce.ws.bind.TypeInfo operator__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","operator","urn:enterprise.soap.sforce.com","soqlOperator",1,1,true);

  private boolean operator__is_set = false;

  private com.sforce.soap.enterprise.SoqlOperator operator;

  public com.sforce.soap.enterprise.SoqlOperator getOperator() {
    return operator;
  }

  

  public void setOperator(com.sforce.soap.enterprise.SoqlOperator operator) {
    this.operator = operator;
    operator__is_set = true;
  }
  
  /**
   * element  : values of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo values__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","values","http://www.w3.org/2001/XMLSchema","string",1,-1,true);

  private boolean values__is_set = false;

  private java.lang.String[] values = new java.lang.String[0];

  public java.lang.String[] getValues() {
    return values;
  }

  

  public void setValues(java.lang.String[] values) {
    this.values = values;
    values__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "SoqlCondition");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, field__typeInfo, field, field__is_set);
    __typeMapper.writeObject(__out, operator__typeInfo, operator, operator__is_set);
    __typeMapper.writeObject(__out, values__typeInfo, values, values__is_set);
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
    if (__typeMapper.verifyElement(__in, field__typeInfo)) {
      setField((java.lang.String)__typeMapper.readString(__in, field__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, operator__typeInfo)) {
      setOperator((com.sforce.soap.enterprise.SoqlOperator)__typeMapper.readObject(__in, operator__typeInfo, com.sforce.soap.enterprise.SoqlOperator.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, values__typeInfo)) {
      setValues((java.lang.String[])__typeMapper.readObject(__in, values__typeInfo, java.lang.String[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SoqlCondition ");
    sb.append(super.toString());
    sb.append(" field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");
    sb.append(" operator=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(operator)+"'\n");
    sb.append(" values=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(values)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
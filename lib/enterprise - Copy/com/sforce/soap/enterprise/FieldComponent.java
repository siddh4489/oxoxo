package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class FieldComponent extends com.sforce.soap.enterprise.DescribeLayoutComponent {
  /**
   * Constructor
   */
  public FieldComponent() {
  }
    
  
  /**
   * element  : field of type {urn:enterprise.soap.sforce.com}Field
   * java type: com.sforce.soap.enterprise.Field
   */
  private static final com.sforce.ws.bind.TypeInfo field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","field","urn:enterprise.soap.sforce.com","Field",1,1,true);

  private boolean field__is_set = false;

  private com.sforce.soap.enterprise.Field field;

  public com.sforce.soap.enterprise.Field getField() {
    return field;
  }

  

  public void setField(com.sforce.soap.enterprise.Field field) {
    this.field = field;
    field__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "urn:enterprise.soap.sforce.com", "FieldComponent");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, field__typeInfo, field, field__is_set);
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
      setField((com.sforce.soap.enterprise.Field)__typeMapper.readObject(__in, field__typeInfo, com.sforce.soap.enterprise.Field.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FieldComponent ");
    sb.append(super.toString());
    sb.append(" field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(field)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
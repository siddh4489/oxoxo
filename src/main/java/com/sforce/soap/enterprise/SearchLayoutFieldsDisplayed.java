package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class SearchLayoutFieldsDisplayed implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public SearchLayoutFieldsDisplayed() {
  }
    
  
  /**
   * element  : applicable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo applicable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","applicable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean applicable__is_set = false;

  private boolean applicable;

  public boolean getApplicable() {
    return applicable;
  }

  

  public boolean isApplicable() {
    return applicable;
  }

  

  public void setApplicable(boolean applicable) {
    this.applicable = applicable;
    applicable__is_set = true;
  }
  
  /**
   * element  : fields of type {urn:enterprise.soap.sforce.com}SearchLayoutField
   * java type: com.sforce.soap.enterprise.SearchLayoutField[]
   */
  private static final com.sforce.ws.bind.TypeInfo fields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","fields","urn:enterprise.soap.sforce.com","SearchLayoutField",0,-1,true);

  private boolean fields__is_set = false;

  private com.sforce.soap.enterprise.SearchLayoutField[] fields = new com.sforce.soap.enterprise.SearchLayoutField[0];

  public com.sforce.soap.enterprise.SearchLayoutField[] getFields() {
    return fields;
  }

  

  public void setFields(com.sforce.soap.enterprise.SearchLayoutField[] fields) {
    this.fields = fields;
    fields__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, applicable__typeInfo, applicable, applicable__is_set);
    __typeMapper.writeObject(__out, fields__typeInfo, fields, fields__is_set);
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
    if (__typeMapper.verifyElement(__in, applicable__typeInfo)) {
      setApplicable((boolean)__typeMapper.readBoolean(__in, applicable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, fields__typeInfo)) {
      setFields((com.sforce.soap.enterprise.SearchLayoutField[])__typeMapper.readObject(__in, fields__typeInfo, com.sforce.soap.enterprise.SearchLayoutField[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchLayoutFieldsDisplayed ");
    
    sb.append(" applicable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(applicable)+"'\n");
    sb.append(" fields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fields)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
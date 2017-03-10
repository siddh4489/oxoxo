package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeRelatedContentItem implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeRelatedContentItem() {
  }
    
  
  /**
   * element  : describeLayoutItem of type {urn:enterprise.soap.sforce.com}DescribeLayoutItem
   * java type: com.sforce.soap.enterprise.DescribeLayoutItem
   */
  private static final com.sforce.ws.bind.TypeInfo describeLayoutItem__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","describeLayoutItem","urn:enterprise.soap.sforce.com","DescribeLayoutItem",1,1,true);

  private boolean describeLayoutItem__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutItem describeLayoutItem;

  public com.sforce.soap.enterprise.DescribeLayoutItem getDescribeLayoutItem() {
    return describeLayoutItem;
  }

  

  public void setDescribeLayoutItem(com.sforce.soap.enterprise.DescribeLayoutItem describeLayoutItem) {
    this.describeLayoutItem = describeLayoutItem;
    describeLayoutItem__is_set = true;
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
   
    __typeMapper.writeObject(__out, describeLayoutItem__typeInfo, describeLayoutItem, describeLayoutItem__is_set);
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
    if (__typeMapper.verifyElement(__in, describeLayoutItem__typeInfo)) {
      setDescribeLayoutItem((com.sforce.soap.enterprise.DescribeLayoutItem)__typeMapper.readObject(__in, describeLayoutItem__typeInfo, com.sforce.soap.enterprise.DescribeLayoutItem.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeRelatedContentItem ");
    
    sb.append(" describeLayoutItem=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(describeLayoutItem)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
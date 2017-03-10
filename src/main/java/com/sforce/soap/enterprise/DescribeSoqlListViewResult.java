package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeSoqlListViewResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeSoqlListViewResult() {
  }
    
  
  /**
   * element  : describeSoqlListViews of type {urn:enterprise.soap.sforce.com}DescribeSoqlListView
   * java type: com.sforce.soap.enterprise.DescribeSoqlListView[]
   */
  private static final com.sforce.ws.bind.TypeInfo describeSoqlListViews__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","describeSoqlListViews","urn:enterprise.soap.sforce.com","DescribeSoqlListView",1,-1,true);

  private boolean describeSoqlListViews__is_set = false;

  private com.sforce.soap.enterprise.DescribeSoqlListView[] describeSoqlListViews = new com.sforce.soap.enterprise.DescribeSoqlListView[0];

  public com.sforce.soap.enterprise.DescribeSoqlListView[] getDescribeSoqlListViews() {
    return describeSoqlListViews;
  }

  

  public void setDescribeSoqlListViews(com.sforce.soap.enterprise.DescribeSoqlListView[] describeSoqlListViews) {
    this.describeSoqlListViews = describeSoqlListViews;
    describeSoqlListViews__is_set = true;
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
   
    __typeMapper.writeObject(__out, describeSoqlListViews__typeInfo, describeSoqlListViews, describeSoqlListViews__is_set);
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
    if (__typeMapper.verifyElement(__in, describeSoqlListViews__typeInfo)) {
      setDescribeSoqlListViews((com.sforce.soap.enterprise.DescribeSoqlListView[])__typeMapper.readObject(__in, describeSoqlListViews__typeInfo, com.sforce.soap.enterprise.DescribeSoqlListView[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSoqlListViewResult ");
    
    sb.append(" describeSoqlListViews=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(describeSoqlListViews)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
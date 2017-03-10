package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeSoqlListViewsRequest implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeSoqlListViewsRequest() {
  }
    
  
  /**
   * element  : listViewParams of type {urn:enterprise.soap.sforce.com}DescribeSoqlListViewParams
   * java type: com.sforce.soap.enterprise.DescribeSoqlListViewParams[]
   */
  private static final com.sforce.ws.bind.TypeInfo listViewParams__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","listViewParams","urn:enterprise.soap.sforce.com","DescribeSoqlListViewParams",1,-1,true);

  private boolean listViewParams__is_set = false;

  private com.sforce.soap.enterprise.DescribeSoqlListViewParams[] listViewParams = new com.sforce.soap.enterprise.DescribeSoqlListViewParams[0];

  public com.sforce.soap.enterprise.DescribeSoqlListViewParams[] getListViewParams() {
    return listViewParams;
  }

  

  public void setListViewParams(com.sforce.soap.enterprise.DescribeSoqlListViewParams[] listViewParams) {
    this.listViewParams = listViewParams;
    listViewParams__is_set = true;
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
   
    __typeMapper.writeObject(__out, listViewParams__typeInfo, listViewParams, listViewParams__is_set);
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
    if (__typeMapper.verifyElement(__in, listViewParams__typeInfo)) {
      setListViewParams((com.sforce.soap.enterprise.DescribeSoqlListViewParams[])__typeMapper.readObject(__in, listViewParams__typeInfo, com.sforce.soap.enterprise.DescribeSoqlListViewParams[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSoqlListViewsRequest ");
    
    sb.append(" listViewParams=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(listViewParams)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
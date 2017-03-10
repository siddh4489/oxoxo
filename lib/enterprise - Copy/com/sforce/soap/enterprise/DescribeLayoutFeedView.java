package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutFeedView implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeLayoutFeedView() {
  }
    
  
  /**
   * element  : feedFilters of type {urn:enterprise.soap.sforce.com}DescribeLayoutFeedFilter
   * java type: com.sforce.soap.enterprise.DescribeLayoutFeedFilter[]
   */
  private static final com.sforce.ws.bind.TypeInfo feedFilters__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","feedFilters","urn:enterprise.soap.sforce.com","DescribeLayoutFeedFilter",0,-1,true);

  private boolean feedFilters__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutFeedFilter[] feedFilters = new com.sforce.soap.enterprise.DescribeLayoutFeedFilter[0];

  public com.sforce.soap.enterprise.DescribeLayoutFeedFilter[] getFeedFilters() {
    return feedFilters;
  }

  

  public void setFeedFilters(com.sforce.soap.enterprise.DescribeLayoutFeedFilter[] feedFilters) {
    this.feedFilters = feedFilters;
    feedFilters__is_set = true;
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
   
    __typeMapper.writeObject(__out, feedFilters__typeInfo, feedFilters, feedFilters__is_set);
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
    if (__typeMapper.isElement(__in, feedFilters__typeInfo)) {
      setFeedFilters((com.sforce.soap.enterprise.DescribeLayoutFeedFilter[])__typeMapper.readObject(__in, feedFilters__typeInfo, com.sforce.soap.enterprise.DescribeLayoutFeedFilter[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutFeedView ");
    
    sb.append(" feedFilters=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(feedFilters)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
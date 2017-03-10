package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutRow implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeLayoutRow() {
  }
    
  
  /**
   * element  : layoutItems of type {urn:enterprise.soap.sforce.com}DescribeLayoutItem
   * java type: com.sforce.soap.enterprise.DescribeLayoutItem[]
   */
  private static final com.sforce.ws.bind.TypeInfo layoutItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","layoutItems","urn:enterprise.soap.sforce.com","DescribeLayoutItem",1,-1,true);

  private boolean layoutItems__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutItem[] layoutItems = new com.sforce.soap.enterprise.DescribeLayoutItem[0];

  public com.sforce.soap.enterprise.DescribeLayoutItem[] getLayoutItems() {
    return layoutItems;
  }

  

  public void setLayoutItems(com.sforce.soap.enterprise.DescribeLayoutItem[] layoutItems) {
    this.layoutItems = layoutItems;
    layoutItems__is_set = true;
  }
  
  /**
   * element  : numItems of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo numItems__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","numItems","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean numItems__is_set = false;

  private int numItems;

  public int getNumItems() {
    return numItems;
  }

  

  public void setNumItems(int numItems) {
    this.numItems = numItems;
    numItems__is_set = true;
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
   
    __typeMapper.writeObject(__out, layoutItems__typeInfo, layoutItems, layoutItems__is_set);
    __typeMapper.writeInt(__out, numItems__typeInfo, numItems, numItems__is_set);
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
    if (__typeMapper.verifyElement(__in, layoutItems__typeInfo)) {
      setLayoutItems((com.sforce.soap.enterprise.DescribeLayoutItem[])__typeMapper.readObject(__in, layoutItems__typeInfo, com.sforce.soap.enterprise.DescribeLayoutItem[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, numItems__typeInfo)) {
      setNumItems((int)__typeMapper.readInt(__in, numItems__typeInfo, int.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutRow ");
    
    sb.append(" layoutItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layoutItems)+"'\n");
    sb.append(" numItems=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(numItems)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
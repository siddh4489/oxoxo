package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeSearchableEntities_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeSearchableEntities_element() {
  }
    
  
  /**
   * element  : includeOnlyEntitiesWithTabs of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo includeOnlyEntitiesWithTabs__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","includeOnlyEntitiesWithTabs","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean includeOnlyEntitiesWithTabs__is_set = false;

  private boolean includeOnlyEntitiesWithTabs;

  public boolean getIncludeOnlyEntitiesWithTabs() {
    return includeOnlyEntitiesWithTabs;
  }

  

  public boolean isIncludeOnlyEntitiesWithTabs() {
    return includeOnlyEntitiesWithTabs;
  }

  

  public void setIncludeOnlyEntitiesWithTabs(boolean includeOnlyEntitiesWithTabs) {
    this.includeOnlyEntitiesWithTabs = includeOnlyEntitiesWithTabs;
    includeOnlyEntitiesWithTabs__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, includeOnlyEntitiesWithTabs__typeInfo, includeOnlyEntitiesWithTabs, includeOnlyEntitiesWithTabs__is_set);
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
    if (__typeMapper.verifyElement(__in, includeOnlyEntitiesWithTabs__typeInfo)) {
      setIncludeOnlyEntitiesWithTabs((boolean)__typeMapper.readBoolean(__in, includeOnlyEntitiesWithTabs__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSearchableEntities_element ");
    
    sb.append(" includeOnlyEntitiesWithTabs=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(includeOnlyEntitiesWithTabs)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
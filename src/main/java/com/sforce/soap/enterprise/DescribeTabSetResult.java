package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeTabSetResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeTabSetResult() {
  }
    
  
  /**
   * element  : description of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo description__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean description__is_set = false;

  private java.lang.String description;

  public java.lang.String getDescription() {
    return description;
  }

  

  public void setDescription(java.lang.String description) {
    this.description = description;
    description__is_set = true;
  }
  
  /**
   * element  : label of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo label__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean label__is_set = false;

  private java.lang.String label;

  public java.lang.String getLabel() {
    return label;
  }

  

  public void setLabel(java.lang.String label) {
    this.label = label;
    label__is_set = true;
  }
  
  /**
   * element  : logoUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo logoUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","logoUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean logoUrl__is_set = false;

  private java.lang.String logoUrl;

  public java.lang.String getLogoUrl() {
    return logoUrl;
  }

  

  public void setLogoUrl(java.lang.String logoUrl) {
    this.logoUrl = logoUrl;
    logoUrl__is_set = true;
  }
  
  /**
   * element  : namespace of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo namespace__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","namespace","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean namespace__is_set = false;

  private java.lang.String namespace;

  public java.lang.String getNamespace() {
    return namespace;
  }

  

  public void setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    namespace__is_set = true;
  }
  
  /**
   * element  : selected of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo selected__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","selected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean selected__is_set = false;

  private boolean selected;

  public boolean getSelected() {
    return selected;
  }

  

  public boolean isSelected() {
    return selected;
  }

  

  public void setSelected(boolean selected) {
    this.selected = selected;
    selected__is_set = true;
  }
  
  /**
   * element  : tabSetId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo tabSetId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","tabSetId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean tabSetId__is_set = false;

  private java.lang.String tabSetId;

  public java.lang.String getTabSetId() {
    return tabSetId;
  }

  

  public void setTabSetId(java.lang.String tabSetId) {
    this.tabSetId = tabSetId;
    tabSetId__is_set = true;
  }
  
  /**
   * element  : tabs of type {urn:enterprise.soap.sforce.com}DescribeTab
   * java type: com.sforce.soap.enterprise.DescribeTab[]
   */
  private static final com.sforce.ws.bind.TypeInfo tabs__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","tabs","urn:enterprise.soap.sforce.com","DescribeTab",0,-1,true);

  private boolean tabs__is_set = false;

  private com.sforce.soap.enterprise.DescribeTab[] tabs = new com.sforce.soap.enterprise.DescribeTab[0];

  public com.sforce.soap.enterprise.DescribeTab[] getTabs() {
    return tabs;
  }

  

  public void setTabs(com.sforce.soap.enterprise.DescribeTab[] tabs) {
    this.tabs = tabs;
    tabs__is_set = true;
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
   
    __typeMapper.writeString(__out, description__typeInfo, description, description__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, logoUrl__typeInfo, logoUrl, logoUrl__is_set);
    __typeMapper.writeString(__out, namespace__typeInfo, namespace, namespace__is_set);
    __typeMapper.writeBoolean(__out, selected__typeInfo, selected, selected__is_set);
    __typeMapper.writeString(__out, tabSetId__typeInfo, tabSetId, tabSetId__is_set);
    __typeMapper.writeObject(__out, tabs__typeInfo, tabs, tabs__is_set);
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
    if (__typeMapper.verifyElement(__in, description__typeInfo)) {
      setDescription((java.lang.String)__typeMapper.readString(__in, description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, logoUrl__typeInfo)) {
      setLogoUrl((java.lang.String)__typeMapper.readString(__in, logoUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, namespace__typeInfo)) {
      setNamespace((java.lang.String)__typeMapper.readString(__in, namespace__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, selected__typeInfo)) {
      setSelected((boolean)__typeMapper.readBoolean(__in, selected__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, tabSetId__typeInfo)) {
      setTabSetId((java.lang.String)__typeMapper.readString(__in, tabSetId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, tabs__typeInfo)) {
      setTabs((com.sforce.soap.enterprise.DescribeTab[])__typeMapper.readObject(__in, tabs__typeInfo, com.sforce.soap.enterprise.DescribeTab[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeTabSetResult ");
    
    sb.append(" description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(description)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" logoUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(logoUrl)+"'\n");
    sb.append(" namespace=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(namespace)+"'\n");
    sb.append(" selected=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(selected)+"'\n");
    sb.append(" tabSetId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(tabSetId)+"'\n");
    sb.append(" tabs=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(tabs)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
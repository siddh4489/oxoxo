package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeLayoutSection implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeLayoutSection() {
  }
    
  
  /**
   * element  : collapsed of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo collapsed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","collapsed","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean collapsed__is_set = false;

  private boolean collapsed;

  public boolean getCollapsed() {
    return collapsed;
  }

  

  public boolean isCollapsed() {
    return collapsed;
  }

  

  public void setCollapsed(boolean collapsed) {
    this.collapsed = collapsed;
    collapsed__is_set = true;
  }
  
  /**
   * element  : columns of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo columns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","columns","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean columns__is_set = false;

  private int columns;

  public int getColumns() {
    return columns;
  }

  

  public void setColumns(int columns) {
    this.columns = columns;
    columns__is_set = true;
  }
  
  /**
   * element  : heading of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo heading__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","heading","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean heading__is_set = false;

  private java.lang.String heading;

  public java.lang.String getHeading() {
    return heading;
  }

  

  public void setHeading(java.lang.String heading) {
    this.heading = heading;
    heading__is_set = true;
  }
  
  /**
   * element  : layoutRows of type {urn:enterprise.soap.sforce.com}DescribeLayoutRow
   * java type: com.sforce.soap.enterprise.DescribeLayoutRow[]
   */
  private static final com.sforce.ws.bind.TypeInfo layoutRows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","layoutRows","urn:enterprise.soap.sforce.com","DescribeLayoutRow",1,-1,true);

  private boolean layoutRows__is_set = false;

  private com.sforce.soap.enterprise.DescribeLayoutRow[] layoutRows = new com.sforce.soap.enterprise.DescribeLayoutRow[0];

  public com.sforce.soap.enterprise.DescribeLayoutRow[] getLayoutRows() {
    return layoutRows;
  }

  

  public void setLayoutRows(com.sforce.soap.enterprise.DescribeLayoutRow[] layoutRows) {
    this.layoutRows = layoutRows;
    layoutRows__is_set = true;
  }
  
  /**
   * element  : layoutSectionId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo layoutSectionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","layoutSectionId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean layoutSectionId__is_set = false;

  private java.lang.String layoutSectionId;

  public java.lang.String getLayoutSectionId() {
    return layoutSectionId;
  }

  

  public void setLayoutSectionId(java.lang.String layoutSectionId) {
    this.layoutSectionId = layoutSectionId;
    layoutSectionId__is_set = true;
  }
  
  /**
   * element  : parentLayoutId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo parentLayoutId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","parentLayoutId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean parentLayoutId__is_set = false;

  private java.lang.String parentLayoutId;

  public java.lang.String getParentLayoutId() {
    return parentLayoutId;
  }

  

  public void setParentLayoutId(java.lang.String parentLayoutId) {
    this.parentLayoutId = parentLayoutId;
    parentLayoutId__is_set = true;
  }
  
  /**
   * element  : rows of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo rows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","rows","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean rows__is_set = false;

  private int rows;

  public int getRows() {
    return rows;
  }

  

  public void setRows(int rows) {
    this.rows = rows;
    rows__is_set = true;
  }
  
  /**
   * element  : tabOrder of type {urn:enterprise.soap.sforce.com}TabOrderType
   * java type: com.sforce.soap.enterprise.TabOrderType
   */
  private static final com.sforce.ws.bind.TypeInfo tabOrder__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","tabOrder","urn:enterprise.soap.sforce.com","TabOrderType",1,1,true);

  private boolean tabOrder__is_set = false;

  private com.sforce.soap.enterprise.TabOrderType tabOrder;

  public com.sforce.soap.enterprise.TabOrderType getTabOrder() {
    return tabOrder;
  }

  

  public void setTabOrder(com.sforce.soap.enterprise.TabOrderType tabOrder) {
    this.tabOrder = tabOrder;
    tabOrder__is_set = true;
  }
  
  /**
   * element  : useCollapsibleSection of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo useCollapsibleSection__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","useCollapsibleSection","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean useCollapsibleSection__is_set = false;

  private boolean useCollapsibleSection;

  public boolean getUseCollapsibleSection() {
    return useCollapsibleSection;
  }

  

  public boolean isUseCollapsibleSection() {
    return useCollapsibleSection;
  }

  

  public void setUseCollapsibleSection(boolean useCollapsibleSection) {
    this.useCollapsibleSection = useCollapsibleSection;
    useCollapsibleSection__is_set = true;
  }
  
  /**
   * element  : useHeading of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo useHeading__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","useHeading","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean useHeading__is_set = false;

  private boolean useHeading;

  public boolean getUseHeading() {
    return useHeading;
  }

  

  public boolean isUseHeading() {
    return useHeading;
  }

  

  public void setUseHeading(boolean useHeading) {
    this.useHeading = useHeading;
    useHeading__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, collapsed__typeInfo, collapsed, collapsed__is_set);
    __typeMapper.writeInt(__out, columns__typeInfo, columns, columns__is_set);
    __typeMapper.writeString(__out, heading__typeInfo, heading, heading__is_set);
    __typeMapper.writeObject(__out, layoutRows__typeInfo, layoutRows, layoutRows__is_set);
    __typeMapper.writeString(__out, layoutSectionId__typeInfo, layoutSectionId, layoutSectionId__is_set);
    __typeMapper.writeString(__out, parentLayoutId__typeInfo, parentLayoutId, parentLayoutId__is_set);
    __typeMapper.writeInt(__out, rows__typeInfo, rows, rows__is_set);
    __typeMapper.writeObject(__out, tabOrder__typeInfo, tabOrder, tabOrder__is_set);
    __typeMapper.writeBoolean(__out, useCollapsibleSection__typeInfo, useCollapsibleSection, useCollapsibleSection__is_set);
    __typeMapper.writeBoolean(__out, useHeading__typeInfo, useHeading, useHeading__is_set);
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
    if (__typeMapper.verifyElement(__in, collapsed__typeInfo)) {
      setCollapsed((boolean)__typeMapper.readBoolean(__in, collapsed__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, columns__typeInfo)) {
      setColumns((int)__typeMapper.readInt(__in, columns__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, heading__typeInfo)) {
      setHeading((java.lang.String)__typeMapper.readString(__in, heading__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, layoutRows__typeInfo)) {
      setLayoutRows((com.sforce.soap.enterprise.DescribeLayoutRow[])__typeMapper.readObject(__in, layoutRows__typeInfo, com.sforce.soap.enterprise.DescribeLayoutRow[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, layoutSectionId__typeInfo)) {
      setLayoutSectionId((java.lang.String)__typeMapper.readString(__in, layoutSectionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, parentLayoutId__typeInfo)) {
      setParentLayoutId((java.lang.String)__typeMapper.readString(__in, parentLayoutId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, rows__typeInfo)) {
      setRows((int)__typeMapper.readInt(__in, rows__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, tabOrder__typeInfo)) {
      setTabOrder((com.sforce.soap.enterprise.TabOrderType)__typeMapper.readObject(__in, tabOrder__typeInfo, com.sforce.soap.enterprise.TabOrderType.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, useCollapsibleSection__typeInfo)) {
      setUseCollapsibleSection((boolean)__typeMapper.readBoolean(__in, useCollapsibleSection__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, useHeading__typeInfo)) {
      setUseHeading((boolean)__typeMapper.readBoolean(__in, useHeading__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeLayoutSection ");
    
    sb.append(" collapsed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(collapsed)+"'\n");
    sb.append(" columns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(columns)+"'\n");
    sb.append(" heading=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(heading)+"'\n");
    sb.append(" layoutRows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layoutRows)+"'\n");
    sb.append(" layoutSectionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(layoutSectionId)+"'\n");
    sb.append(" parentLayoutId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(parentLayoutId)+"'\n");
    sb.append(" rows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(rows)+"'\n");
    sb.append(" tabOrder=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(tabOrder)+"'\n");
    sb.append(" useCollapsibleSection=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(useCollapsibleSection)+"'\n");
    sb.append(" useHeading=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(useHeading)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
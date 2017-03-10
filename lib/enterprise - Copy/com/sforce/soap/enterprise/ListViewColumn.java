package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ListViewColumn implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ListViewColumn() {
  }
    
  
  /**
   * element  : ascendingLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ascendingLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","ascendingLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean ascendingLabel__is_set = false;

  private java.lang.String ascendingLabel;

  public java.lang.String getAscendingLabel() {
    return ascendingLabel;
  }

  

  public void setAscendingLabel(java.lang.String ascendingLabel) {
    this.ascendingLabel = ascendingLabel;
    ascendingLabel__is_set = true;
  }
  
  /**
   * element  : descendingLabel of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo descendingLabel__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","descendingLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean descendingLabel__is_set = false;

  private java.lang.String descendingLabel;

  public java.lang.String getDescendingLabel() {
    return descendingLabel;
  }

  

  public void setDescendingLabel(java.lang.String descendingLabel) {
    this.descendingLabel = descendingLabel;
    descendingLabel__is_set = true;
  }
  
  /**
   * element  : fieldNameOrPath of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo fieldNameOrPath__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","fieldNameOrPath","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean fieldNameOrPath__is_set = false;

  private java.lang.String fieldNameOrPath;

  public java.lang.String getFieldNameOrPath() {
    return fieldNameOrPath;
  }

  

  public void setFieldNameOrPath(java.lang.String fieldNameOrPath) {
    this.fieldNameOrPath = fieldNameOrPath;
    fieldNameOrPath__is_set = true;
  }
  
  /**
   * element  : hidden of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo hidden__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","hidden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean hidden__is_set = false;

  private boolean hidden;

  public boolean getHidden() {
    return hidden;
  }

  

  public boolean isHidden() {
    return hidden;
  }

  

  public void setHidden(boolean hidden) {
    this.hidden = hidden;
    hidden__is_set = true;
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
   * element  : selectListItem of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo selectListItem__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","selectListItem","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean selectListItem__is_set = false;

  private java.lang.String selectListItem;

  public java.lang.String getSelectListItem() {
    return selectListItem;
  }

  

  public void setSelectListItem(java.lang.String selectListItem) {
    this.selectListItem = selectListItem;
    selectListItem__is_set = true;
  }
  
  /**
   * element  : sortDirection of type {urn:enterprise.soap.sforce.com}orderByDirection
   * java type: com.sforce.soap.enterprise.OrderByDirection
   */
  private static final com.sforce.ws.bind.TypeInfo sortDirection__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sortDirection","urn:enterprise.soap.sforce.com","orderByDirection",1,1,true);

  private boolean sortDirection__is_set = false;

  private com.sforce.soap.enterprise.OrderByDirection sortDirection;

  public com.sforce.soap.enterprise.OrderByDirection getSortDirection() {
    return sortDirection;
  }

  

  public void setSortDirection(com.sforce.soap.enterprise.OrderByDirection sortDirection) {
    this.sortDirection = sortDirection;
    sortDirection__is_set = true;
  }
  
  /**
   * element  : sortIndex of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo sortIndex__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sortIndex","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean sortIndex__is_set = false;

  private java.lang.Integer sortIndex;

  public java.lang.Integer getSortIndex() {
    return sortIndex;
  }

  

  public void setSortIndex(java.lang.Integer sortIndex) {
    this.sortIndex = sortIndex;
    sortIndex__is_set = true;
  }
  
  /**
   * element  : sortable of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo sortable__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sortable","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean sortable__is_set = false;

  private boolean sortable;

  public boolean getSortable() {
    return sortable;
  }

  

  public boolean isSortable() {
    return sortable;
  }

  

  public void setSortable(boolean sortable) {
    this.sortable = sortable;
    sortable__is_set = true;
  }
  
  /**
   * element  : type of type {urn:enterprise.soap.sforce.com}fieldType
   * java type: com.sforce.soap.enterprise.FieldType
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","type","urn:enterprise.soap.sforce.com","fieldType",1,1,true);

  private boolean type__is_set = false;

  private com.sforce.soap.enterprise.FieldType type;

  public com.sforce.soap.enterprise.FieldType getType() {
    return type;
  }

  

  public void setType(com.sforce.soap.enterprise.FieldType type) {
    this.type = type;
    type__is_set = true;
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
   
    __typeMapper.writeString(__out, ascendingLabel__typeInfo, ascendingLabel, ascendingLabel__is_set);
    __typeMapper.writeString(__out, descendingLabel__typeInfo, descendingLabel, descendingLabel__is_set);
    __typeMapper.writeString(__out, fieldNameOrPath__typeInfo, fieldNameOrPath, fieldNameOrPath__is_set);
    __typeMapper.writeBoolean(__out, hidden__typeInfo, hidden, hidden__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeString(__out, selectListItem__typeInfo, selectListItem, selectListItem__is_set);
    __typeMapper.writeObject(__out, sortDirection__typeInfo, sortDirection, sortDirection__is_set);
    __typeMapper.writeObject(__out, sortIndex__typeInfo, sortIndex, sortIndex__is_set);
    __typeMapper.writeBoolean(__out, sortable__typeInfo, sortable, sortable__is_set);
    __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);
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
    if (__typeMapper.verifyElement(__in, ascendingLabel__typeInfo)) {
      setAscendingLabel((java.lang.String)__typeMapper.readString(__in, ascendingLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, descendingLabel__typeInfo)) {
      setDescendingLabel((java.lang.String)__typeMapper.readString(__in, descendingLabel__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, fieldNameOrPath__typeInfo)) {
      setFieldNameOrPath((java.lang.String)__typeMapper.readString(__in, fieldNameOrPath__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, hidden__typeInfo)) {
      setHidden((boolean)__typeMapper.readBoolean(__in, hidden__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, selectListItem__typeInfo)) {
      setSelectListItem((java.lang.String)__typeMapper.readString(__in, selectListItem__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sortDirection__typeInfo)) {
      setSortDirection((com.sforce.soap.enterprise.OrderByDirection)__typeMapper.readObject(__in, sortDirection__typeInfo, com.sforce.soap.enterprise.OrderByDirection.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sortIndex__typeInfo)) {
      setSortIndex((java.lang.Integer)__typeMapper.readObject(__in, sortIndex__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sortable__typeInfo)) {
      setSortable((boolean)__typeMapper.readBoolean(__in, sortable__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((com.sforce.soap.enterprise.FieldType)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.enterprise.FieldType.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ListViewColumn ");
    
    sb.append(" ascendingLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ascendingLabel)+"'\n");
    sb.append(" descendingLabel=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(descendingLabel)+"'\n");
    sb.append(" fieldNameOrPath=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldNameOrPath)+"'\n");
    sb.append(" hidden=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(hidden)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" selectListItem=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(selectListItem)+"'\n");
    sb.append(" sortDirection=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortDirection)+"'\n");
    sb.append(" sortIndex=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortIndex)+"'\n");
    sb.append(" sortable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortable)+"'\n");
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ListViewOrderBy implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ListViewOrderBy() {
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
   * element  : nullsPosition of type {urn:enterprise.soap.sforce.com}orderByNullsPosition
   * java type: com.sforce.soap.enterprise.OrderByNullsPosition
   */
  private static final com.sforce.ws.bind.TypeInfo nullsPosition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","nullsPosition","urn:enterprise.soap.sforce.com","orderByNullsPosition",1,1,true);

  private boolean nullsPosition__is_set = false;

  private com.sforce.soap.enterprise.OrderByNullsPosition nullsPosition;

  public com.sforce.soap.enterprise.OrderByNullsPosition getNullsPosition() {
    return nullsPosition;
  }

  

  public void setNullsPosition(com.sforce.soap.enterprise.OrderByNullsPosition nullsPosition) {
    this.nullsPosition = nullsPosition;
    nullsPosition__is_set = true;
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
   
    __typeMapper.writeString(__out, fieldNameOrPath__typeInfo, fieldNameOrPath, fieldNameOrPath__is_set);
    __typeMapper.writeObject(__out, nullsPosition__typeInfo, nullsPosition, nullsPosition__is_set);
    __typeMapper.writeObject(__out, sortDirection__typeInfo, sortDirection, sortDirection__is_set);
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
    if (__typeMapper.verifyElement(__in, fieldNameOrPath__typeInfo)) {
      setFieldNameOrPath((java.lang.String)__typeMapper.readString(__in, fieldNameOrPath__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, nullsPosition__typeInfo)) {
      setNullsPosition((com.sforce.soap.enterprise.OrderByNullsPosition)__typeMapper.readObject(__in, nullsPosition__typeInfo, com.sforce.soap.enterprise.OrderByNullsPosition.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sortDirection__typeInfo)) {
      setSortDirection((com.sforce.soap.enterprise.OrderByDirection)__typeMapper.readObject(__in, sortDirection__typeInfo, com.sforce.soap.enterprise.OrderByDirection.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ListViewOrderBy ");
    
    sb.append(" fieldNameOrPath=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(fieldNameOrPath)+"'\n");
    sb.append(" nullsPosition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(nullsPosition)+"'\n");
    sb.append(" sortDirection=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortDirection)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
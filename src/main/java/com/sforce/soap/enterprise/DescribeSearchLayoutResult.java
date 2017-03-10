package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeSearchLayoutResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeSearchLayoutResult() {
  }
    
  
  /**
   * element  : errorMsg of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo errorMsg__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","errorMsg","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean errorMsg__is_set = false;

  private java.lang.String errorMsg;

  public java.lang.String getErrorMsg() {
    return errorMsg;
  }

  

  public void setErrorMsg(java.lang.String errorMsg) {
    this.errorMsg = errorMsg;
    errorMsg__is_set = true;
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
   * element  : limitRows of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo limitRows__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","limitRows","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean limitRows__is_set = false;

  private java.lang.Integer limitRows;

  public java.lang.Integer getLimitRows() {
    return limitRows;
  }

  

  public void setLimitRows(java.lang.Integer limitRows) {
    this.limitRows = limitRows;
    limitRows__is_set = true;
  }
  
  /**
   * element  : objectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo objectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","objectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean objectType__is_set = false;

  private java.lang.String objectType;

  public java.lang.String getObjectType() {
    return objectType;
  }

  

  public void setObjectType(java.lang.String objectType) {
    this.objectType = objectType;
    objectType__is_set = true;
  }
  
  /**
   * element  : searchColumns of type {urn:enterprise.soap.sforce.com}DescribeColumn
   * java type: com.sforce.soap.enterprise.DescribeColumn[]
   */
  private static final com.sforce.ws.bind.TypeInfo searchColumns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","searchColumns","urn:enterprise.soap.sforce.com","DescribeColumn",0,-1,true);

  private boolean searchColumns__is_set = false;

  private com.sforce.soap.enterprise.DescribeColumn[] searchColumns = new com.sforce.soap.enterprise.DescribeColumn[0];

  public com.sforce.soap.enterprise.DescribeColumn[] getSearchColumns() {
    return searchColumns;
  }

  

  public void setSearchColumns(com.sforce.soap.enterprise.DescribeColumn[] searchColumns) {
    this.searchColumns = searchColumns;
    searchColumns__is_set = true;
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
   
    __typeMapper.writeString(__out, errorMsg__typeInfo, errorMsg, errorMsg__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeObject(__out, limitRows__typeInfo, limitRows, limitRows__is_set);
    __typeMapper.writeString(__out, objectType__typeInfo, objectType, objectType__is_set);
    __typeMapper.writeObject(__out, searchColumns__typeInfo, searchColumns, searchColumns__is_set);
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
    if (__typeMapper.verifyElement(__in, errorMsg__typeInfo)) {
      setErrorMsg((java.lang.String)__typeMapper.readString(__in, errorMsg__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, limitRows__typeInfo)) {
      setLimitRows((java.lang.Integer)__typeMapper.readObject(__in, limitRows__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, objectType__typeInfo)) {
      setObjectType((java.lang.String)__typeMapper.readString(__in, objectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, searchColumns__typeInfo)) {
      setSearchColumns((com.sforce.soap.enterprise.DescribeColumn[])__typeMapper.readObject(__in, searchColumns__typeInfo, com.sforce.soap.enterprise.DescribeColumn[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSearchLayoutResult ");
    
    sb.append(" errorMsg=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(errorMsg)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" limitRows=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(limitRows)+"'\n");
    sb.append(" objectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(objectType)+"'\n");
    sb.append(" searchColumns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(searchColumns)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
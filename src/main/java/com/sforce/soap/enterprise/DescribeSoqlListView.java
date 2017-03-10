package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeSoqlListView implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeSoqlListView() {
  }
    
  
  /**
   * element  : columns of type {urn:enterprise.soap.sforce.com}ListViewColumn
   * java type: com.sforce.soap.enterprise.ListViewColumn[]
   */
  private static final com.sforce.ws.bind.TypeInfo columns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","columns","urn:enterprise.soap.sforce.com","ListViewColumn",1,-1,true);

  private boolean columns__is_set = false;

  private com.sforce.soap.enterprise.ListViewColumn[] columns = new com.sforce.soap.enterprise.ListViewColumn[0];

  public com.sforce.soap.enterprise.ListViewColumn[] getColumns() {
    return columns;
  }

  

  public void setColumns(com.sforce.soap.enterprise.ListViewColumn[] columns) {
    this.columns = columns;
    columns__is_set = true;
  }
  
  /**
   * element  : id of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","id","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean id__is_set = false;

  private java.lang.String id;

  public java.lang.String getId() {
    return id;
  }

  

  public void setId(java.lang.String id) {
    this.id = id;
    id__is_set = true;
  }
  
  /**
   * element  : orderBy of type {urn:enterprise.soap.sforce.com}ListViewOrderBy
   * java type: com.sforce.soap.enterprise.ListViewOrderBy[]
   */
  private static final com.sforce.ws.bind.TypeInfo orderBy__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","orderBy","urn:enterprise.soap.sforce.com","ListViewOrderBy",1,-1,true);

  private boolean orderBy__is_set = false;

  private com.sforce.soap.enterprise.ListViewOrderBy[] orderBy = new com.sforce.soap.enterprise.ListViewOrderBy[0];

  public com.sforce.soap.enterprise.ListViewOrderBy[] getOrderBy() {
    return orderBy;
  }

  

  public void setOrderBy(com.sforce.soap.enterprise.ListViewOrderBy[] orderBy) {
    this.orderBy = orderBy;
    orderBy__is_set = true;
  }
  
  /**
   * element  : query of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo query__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","query","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean query__is_set = false;

  private java.lang.String query;

  public java.lang.String getQuery() {
    return query;
  }

  

  public void setQuery(java.lang.String query) {
    this.query = query;
    query__is_set = true;
  }
  
  /**
   * element  : scope of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo scope__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","scope","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean scope__is_set = false;

  private java.lang.String scope;

  public java.lang.String getScope() {
    return scope;
  }

  

  public void setScope(java.lang.String scope) {
    this.scope = scope;
    scope__is_set = true;
  }
  
  /**
   * element  : sobjectType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo sobjectType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean sobjectType__is_set = false;

  private java.lang.String sobjectType;

  public java.lang.String getSobjectType() {
    return sobjectType;
  }

  

  public void setSobjectType(java.lang.String sobjectType) {
    this.sobjectType = sobjectType;
    sobjectType__is_set = true;
  }
  
  /**
   * element  : whereCondition of type {urn:enterprise.soap.sforce.com}SoqlWhereCondition
   * java type: com.sforce.soap.enterprise.SoqlWhereCondition
   */
  private static final com.sforce.ws.bind.TypeInfo whereCondition__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","whereCondition","urn:enterprise.soap.sforce.com","SoqlWhereCondition",0,1,true);

  private boolean whereCondition__is_set = false;

  private com.sforce.soap.enterprise.SoqlWhereCondition whereCondition;

  public com.sforce.soap.enterprise.SoqlWhereCondition getWhereCondition() {
    return whereCondition;
  }

  

  public void setWhereCondition(com.sforce.soap.enterprise.SoqlWhereCondition whereCondition) {
    this.whereCondition = whereCondition;
    whereCondition__is_set = true;
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
   
    __typeMapper.writeObject(__out, columns__typeInfo, columns, columns__is_set);
    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
    __typeMapper.writeObject(__out, orderBy__typeInfo, orderBy, orderBy__is_set);
    __typeMapper.writeString(__out, query__typeInfo, query, query__is_set);
    __typeMapper.writeString(__out, scope__typeInfo, scope, scope__is_set);
    __typeMapper.writeString(__out, sobjectType__typeInfo, sobjectType, sobjectType__is_set);
    __typeMapper.writeObject(__out, whereCondition__typeInfo, whereCondition, whereCondition__is_set);
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
    if (__typeMapper.verifyElement(__in, columns__typeInfo)) {
      setColumns((com.sforce.soap.enterprise.ListViewColumn[])__typeMapper.readObject(__in, columns__typeInfo, com.sforce.soap.enterprise.ListViewColumn[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, orderBy__typeInfo)) {
      setOrderBy((com.sforce.soap.enterprise.ListViewOrderBy[])__typeMapper.readObject(__in, orderBy__typeInfo, com.sforce.soap.enterprise.ListViewOrderBy[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, query__typeInfo)) {
      setQuery((java.lang.String)__typeMapper.readString(__in, query__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, scope__typeInfo)) {
      setScope((java.lang.String)__typeMapper.readString(__in, scope__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sobjectType__typeInfo)) {
      setSobjectType((java.lang.String)__typeMapper.readString(__in, sobjectType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, whereCondition__typeInfo)) {
      setWhereCondition((com.sforce.soap.enterprise.SoqlWhereCondition)__typeMapper.readObject(__in, whereCondition__typeInfo, com.sforce.soap.enterprise.SoqlWhereCondition.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeSoqlListView ");
    
    sb.append(" columns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(columns)+"'\n");
    sb.append(" id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");
    sb.append(" orderBy=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(orderBy)+"'\n");
    sb.append(" query=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(query)+"'\n");
    sb.append(" scope=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(scope)+"'\n");
    sb.append(" sobjectType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sobjectType)+"'\n");
    sb.append(" whereCondition=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(whereCondition)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
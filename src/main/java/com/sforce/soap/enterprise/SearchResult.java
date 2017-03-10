package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class SearchResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public SearchResult() {
  }
    
  
  /**
   * element  : queryId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo queryId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","queryId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean queryId__is_set = false;

  private java.lang.String queryId;

  public java.lang.String getQueryId() {
    return queryId;
  }

  

  public void setQueryId(java.lang.String queryId) {
    this.queryId = queryId;
    queryId__is_set = true;
  }
  
  /**
   * element  : searchRecords of type {urn:enterprise.soap.sforce.com}SearchRecord
   * java type: com.sforce.soap.enterprise.SearchRecord[]
   */
  private static final com.sforce.ws.bind.TypeInfo searchRecords__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","searchRecords","urn:enterprise.soap.sforce.com","SearchRecord",0,-1,true);

  private boolean searchRecords__is_set = false;

  private com.sforce.soap.enterprise.SearchRecord[] searchRecords = new com.sforce.soap.enterprise.SearchRecord[0];

  public com.sforce.soap.enterprise.SearchRecord[] getSearchRecords() {
    return searchRecords;
  }

  

  public void setSearchRecords(com.sforce.soap.enterprise.SearchRecord[] searchRecords) {
    this.searchRecords = searchRecords;
    searchRecords__is_set = true;
  }
  
  /**
   * element  : searchResultsMetadata of type {urn:enterprise.soap.sforce.com}SearchResultsMetadata
   * java type: com.sforce.soap.enterprise.SearchResultsMetadata
   */
  private static final com.sforce.ws.bind.TypeInfo searchResultsMetadata__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","searchResultsMetadata","urn:enterprise.soap.sforce.com","SearchResultsMetadata",0,1,true);

  private boolean searchResultsMetadata__is_set = false;

  private com.sforce.soap.enterprise.SearchResultsMetadata searchResultsMetadata;

  public com.sforce.soap.enterprise.SearchResultsMetadata getSearchResultsMetadata() {
    return searchResultsMetadata;
  }

  

  public void setSearchResultsMetadata(com.sforce.soap.enterprise.SearchResultsMetadata searchResultsMetadata) {
    this.searchResultsMetadata = searchResultsMetadata;
    searchResultsMetadata__is_set = true;
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
   
    __typeMapper.writeString(__out, queryId__typeInfo, queryId, queryId__is_set);
    __typeMapper.writeObject(__out, searchRecords__typeInfo, searchRecords, searchRecords__is_set);
    __typeMapper.writeObject(__out, searchResultsMetadata__typeInfo, searchResultsMetadata, searchResultsMetadata__is_set);
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
    if (__typeMapper.verifyElement(__in, queryId__typeInfo)) {
      setQueryId((java.lang.String)__typeMapper.readString(__in, queryId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, searchRecords__typeInfo)) {
      setSearchRecords((com.sforce.soap.enterprise.SearchRecord[])__typeMapper.readObject(__in, searchRecords__typeInfo, com.sforce.soap.enterprise.SearchRecord[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, searchResultsMetadata__typeInfo)) {
      setSearchResultsMetadata((com.sforce.soap.enterprise.SearchResultsMetadata)__typeMapper.readObject(__in, searchResultsMetadata__typeInfo, com.sforce.soap.enterprise.SearchResultsMetadata.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchResult ");
    
    sb.append(" queryId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(queryId)+"'\n");
    sb.append(" searchRecords=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(searchRecords)+"'\n");
    sb.append(" searchResultsMetadata=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(searchResultsMetadata)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
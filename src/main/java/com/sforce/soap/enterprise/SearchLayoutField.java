package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class SearchLayoutField implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public SearchLayoutField() {
  }
    
  
  /**
   * element  : apiName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo apiName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","apiName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean apiName__is_set = false;

  private java.lang.String apiName;

  public java.lang.String getApiName() {
    return apiName;
  }

  

  public void setApiName(java.lang.String apiName) {
    this.apiName = apiName;
    apiName__is_set = true;
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
   
    __typeMapper.writeString(__out, apiName__typeInfo, apiName, apiName__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeBoolean(__out, sortable__typeInfo, sortable, sortable__is_set);
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
    if (__typeMapper.verifyElement(__in, apiName__typeInfo)) {
      setApiName((java.lang.String)__typeMapper.readString(__in, apiName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, sortable__typeInfo)) {
      setSortable((boolean)__typeMapper.readBoolean(__in, sortable__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SearchLayoutField ");
    
    sb.append(" apiName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(apiName)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" sortable=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(sortable)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
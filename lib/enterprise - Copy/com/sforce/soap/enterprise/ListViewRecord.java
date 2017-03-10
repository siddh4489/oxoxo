package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ListViewRecord implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ListViewRecord() {
  }
    
  
  /**
   * element  : columns of type {urn:enterprise.soap.sforce.com}ListViewRecordColumn
   * java type: com.sforce.soap.enterprise.ListViewRecordColumn[]
   */
  private static final com.sforce.ws.bind.TypeInfo columns__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","columns","urn:enterprise.soap.sforce.com","ListViewRecordColumn",1,-1,true);

  private boolean columns__is_set = false;

  private com.sforce.soap.enterprise.ListViewRecordColumn[] columns = new com.sforce.soap.enterprise.ListViewRecordColumn[0];

  public com.sforce.soap.enterprise.ListViewRecordColumn[] getColumns() {
    return columns;
  }

  

  public void setColumns(com.sforce.soap.enterprise.ListViewRecordColumn[] columns) {
    this.columns = columns;
    columns__is_set = true;
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
      setColumns((com.sforce.soap.enterprise.ListViewRecordColumn[])__typeMapper.readObject(__in, columns__typeInfo, com.sforce.soap.enterprise.ListViewRecordColumn[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ListViewRecord ");
    
    sb.append(" columns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(columns)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
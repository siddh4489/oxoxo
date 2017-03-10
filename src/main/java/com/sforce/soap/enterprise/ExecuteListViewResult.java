package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ExecuteListViewResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ExecuteListViewResult() {
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
   * element  : developerName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo developerName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","developerName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean developerName__is_set = false;

  private java.lang.String developerName;

  public java.lang.String getDeveloperName() {
    return developerName;
  }

  

  public void setDeveloperName(java.lang.String developerName) {
    this.developerName = developerName;
    developerName__is_set = true;
  }
  
  /**
   * element  : done of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo done__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","done","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean done__is_set = false;

  private boolean done;

  public boolean getDone() {
    return done;
  }

  

  public boolean isDone() {
    return done;
  }

  

  public void setDone(boolean done) {
    this.done = done;
    done__is_set = true;
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
   * element  : records of type {urn:enterprise.soap.sforce.com}ListViewRecord
   * java type: com.sforce.soap.enterprise.ListViewRecord[]
   */
  private static final com.sforce.ws.bind.TypeInfo records__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","records","urn:enterprise.soap.sforce.com","ListViewRecord",1,-1,true);

  private boolean records__is_set = false;

  private com.sforce.soap.enterprise.ListViewRecord[] records = new com.sforce.soap.enterprise.ListViewRecord[0];

  public com.sforce.soap.enterprise.ListViewRecord[] getRecords() {
    return records;
  }

  

  public void setRecords(com.sforce.soap.enterprise.ListViewRecord[] records) {
    this.records = records;
    records__is_set = true;
  }
  
  /**
   * element  : size of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo size__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","size","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean size__is_set = false;

  private int size;

  public int getSize() {
    return size;
  }

  

  public void setSize(int size) {
    this.size = size;
    size__is_set = true;
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
    __typeMapper.writeString(__out, developerName__typeInfo, developerName, developerName__is_set);
    __typeMapper.writeBoolean(__out, done__typeInfo, done, done__is_set);
    __typeMapper.writeString(__out, id__typeInfo, id, id__is_set);
    __typeMapper.writeString(__out, label__typeInfo, label, label__is_set);
    __typeMapper.writeObject(__out, records__typeInfo, records, records__is_set);
    __typeMapper.writeInt(__out, size__typeInfo, size, size__is_set);
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
    if (__typeMapper.verifyElement(__in, developerName__typeInfo)) {
      setDeveloperName((java.lang.String)__typeMapper.readString(__in, developerName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, done__typeInfo)) {
      setDone((boolean)__typeMapper.readBoolean(__in, done__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, label__typeInfo)) {
      setLabel((java.lang.String)__typeMapper.readString(__in, label__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, records__typeInfo)) {
      setRecords((com.sforce.soap.enterprise.ListViewRecord[])__typeMapper.readObject(__in, records__typeInfo, com.sforce.soap.enterprise.ListViewRecord[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, size__typeInfo)) {
      setSize((int)__typeMapper.readInt(__in, size__typeInfo, int.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ExecuteListViewResult ");
    
    sb.append(" columns=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(columns)+"'\n");
    sb.append(" developerName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(developerName)+"'\n");
    sb.append(" done=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(done)+"'\n");
    sb.append(" id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(id)+"'\n");
    sb.append(" label=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(label)+"'\n");
    sb.append(" records=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(records)+"'\n");
    sb.append(" size=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(size)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
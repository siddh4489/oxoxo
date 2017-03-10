package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class LimitInfo implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public LimitInfo() {
  }
    
  
  /**
   * element  : current of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo current__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","current","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean current__is_set = false;

  private int current;

  public int getCurrent() {
    return current;
  }

  

  public void setCurrent(int current) {
    this.current = current;
    current__is_set = true;
  }
  
  /**
   * element  : limit of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo limit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","limit","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean limit__is_set = false;

  private int limit;

  public int getLimit() {
    return limit;
  }

  

  public void setLimit(int limit) {
    this.limit = limit;
    limit__is_set = true;
  }
  
  /**
   * element  : type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","type","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean type__is_set = false;

  private java.lang.String type;

  public java.lang.String getType() {
    return type;
  }

  

  public void setType(java.lang.String type) {
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
   
    __typeMapper.writeInt(__out, current__typeInfo, current, current__is_set);
    __typeMapper.writeInt(__out, limit__typeInfo, limit, limit__is_set);
    __typeMapper.writeString(__out, type__typeInfo, type, type__is_set);
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
    if (__typeMapper.verifyElement(__in, current__typeInfo)) {
      setCurrent((int)__typeMapper.readInt(__in, current__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, limit__typeInfo)) {
      setLimit((int)__typeMapper.readInt(__in, limit__typeInfo, int.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((java.lang.String)__typeMapper.readString(__in, type__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LimitInfo ");
    
    sb.append(" current=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(current)+"'\n");
    sb.append(" limit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(limit)+"'\n");
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
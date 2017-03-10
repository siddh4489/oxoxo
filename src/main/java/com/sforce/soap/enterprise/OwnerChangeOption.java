package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class OwnerChangeOption implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public OwnerChangeOption() {
  }
    
  
  /**
   * element  : type of type {urn:enterprise.soap.sforce.com}OwnerChangeOptionType
   * java type: com.sforce.soap.enterprise.OwnerChangeOptionType
   */
  private static final com.sforce.ws.bind.TypeInfo type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","type","urn:enterprise.soap.sforce.com","OwnerChangeOptionType",1,1,true);

  private boolean type__is_set = false;

  private com.sforce.soap.enterprise.OwnerChangeOptionType type;

  public com.sforce.soap.enterprise.OwnerChangeOptionType getType() {
    return type;
  }

  

  public void setType(com.sforce.soap.enterprise.OwnerChangeOptionType type) {
    this.type = type;
    type__is_set = true;
  }
  
  /**
   * element  : execute of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo execute__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","execute","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean execute__is_set = false;

  private boolean execute;

  public boolean getExecute() {
    return execute;
  }

  

  public boolean isExecute() {
    return execute;
  }

  

  public void setExecute(boolean execute) {
    this.execute = execute;
    execute__is_set = true;
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
   
    __typeMapper.writeObject(__out, type__typeInfo, type, type__is_set);
    __typeMapper.writeBoolean(__out, execute__typeInfo, execute, execute__is_set);
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
    if (__typeMapper.verifyElement(__in, type__typeInfo)) {
      setType((com.sforce.soap.enterprise.OwnerChangeOptionType)__typeMapper.readObject(__in, type__typeInfo, com.sforce.soap.enterprise.OwnerChangeOptionType.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, execute__typeInfo)) {
      setExecute((boolean)__typeMapper.readBoolean(__in, execute__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[OwnerChangeOption ");
    
    sb.append(" type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(type)+"'\n");
    sb.append(" execute=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(execute)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
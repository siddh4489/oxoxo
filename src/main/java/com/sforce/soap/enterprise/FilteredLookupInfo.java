package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class FilteredLookupInfo implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public FilteredLookupInfo() {
  }
    
  
  /**
   * element  : controllingFields of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo controllingFields__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","controllingFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true);

  private boolean controllingFields__is_set = false;

  private java.lang.String[] controllingFields = new java.lang.String[0];

  public java.lang.String[] getControllingFields() {
    return controllingFields;
  }

  

  public void setControllingFields(java.lang.String[] controllingFields) {
    this.controllingFields = controllingFields;
    controllingFields__is_set = true;
  }
  
  /**
   * element  : dependent of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo dependent__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","dependent","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean dependent__is_set = false;

  private boolean dependent;

  public boolean getDependent() {
    return dependent;
  }

  

  public boolean isDependent() {
    return dependent;
  }

  

  public void setDependent(boolean dependent) {
    this.dependent = dependent;
    dependent__is_set = true;
  }
  
  /**
   * element  : optionalFilter of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo optionalFilter__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","optionalFilter","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean optionalFilter__is_set = false;

  private boolean optionalFilter;

  public boolean getOptionalFilter() {
    return optionalFilter;
  }

  

  public boolean isOptionalFilter() {
    return optionalFilter;
  }

  

  public void setOptionalFilter(boolean optionalFilter) {
    this.optionalFilter = optionalFilter;
    optionalFilter__is_set = true;
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
   
    __typeMapper.writeObject(__out, controllingFields__typeInfo, controllingFields, controllingFields__is_set);
    __typeMapper.writeBoolean(__out, dependent__typeInfo, dependent, dependent__is_set);
    __typeMapper.writeBoolean(__out, optionalFilter__typeInfo, optionalFilter, optionalFilter__is_set);
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
    if (__typeMapper.isElement(__in, controllingFields__typeInfo)) {
      setControllingFields((java.lang.String[])__typeMapper.readObject(__in, controllingFields__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, dependent__typeInfo)) {
      setDependent((boolean)__typeMapper.readBoolean(__in, dependent__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, optionalFilter__typeInfo)) {
      setOptionalFilter((boolean)__typeMapper.readBoolean(__in, optionalFilter__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[FilteredLookupInfo ");
    
    sb.append(" controllingFields=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(controllingFields)+"'\n");
    sb.append(" dependent=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dependent)+"'\n");
    sb.append(" optionalFilter=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(optionalFilter)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
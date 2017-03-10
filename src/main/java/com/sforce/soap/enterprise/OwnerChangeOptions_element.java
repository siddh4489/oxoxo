package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class OwnerChangeOptions_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public OwnerChangeOptions_element() {
  }
    
  
  /**
   * element  : options of type {urn:enterprise.soap.sforce.com}OwnerChangeOption
   * java type: com.sforce.soap.enterprise.OwnerChangeOption[]
   */
  private static final com.sforce.ws.bind.TypeInfo options__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","options","urn:enterprise.soap.sforce.com","OwnerChangeOption",0,-1,true);

  private boolean options__is_set = false;

  private com.sforce.soap.enterprise.OwnerChangeOption[] options = new com.sforce.soap.enterprise.OwnerChangeOption[0];

  public com.sforce.soap.enterprise.OwnerChangeOption[] getOptions() {
    return options;
  }

  

  public void setOptions(com.sforce.soap.enterprise.OwnerChangeOption[] options) {
    this.options = options;
    options__is_set = true;
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
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, options__typeInfo, options, options__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, options__typeInfo)) {
      setOptions((com.sforce.soap.enterprise.OwnerChangeOption[])__typeMapper.readObject(__in, options__typeInfo, com.sforce.soap.enterprise.OwnerChangeOption[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[OwnerChangeOptions_element ");
    sb.append(super.toString());
    sb.append(" options=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(options)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
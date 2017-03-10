package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DuplicateRuleHeader_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DuplicateRuleHeader_element() {
  }
    
  
  /**
   * element  : allowSave of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo allowSave__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","allowSave","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean allowSave__is_set = false;

  private boolean allowSave;

  public boolean getAllowSave() {
    return allowSave;
  }

  

  public boolean isAllowSave() {
    return allowSave;
  }

  

  public void setAllowSave(boolean allowSave) {
    this.allowSave = allowSave;
    allowSave__is_set = true;
  }
  
  /**
   * element  : includeRecordDetails of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo includeRecordDetails__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","includeRecordDetails","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean includeRecordDetails__is_set = false;

  private boolean includeRecordDetails;

  public boolean getIncludeRecordDetails() {
    return includeRecordDetails;
  }

  

  public boolean isIncludeRecordDetails() {
    return includeRecordDetails;
  }

  

  public void setIncludeRecordDetails(boolean includeRecordDetails) {
    this.includeRecordDetails = includeRecordDetails;
    includeRecordDetails__is_set = true;
  }
  
  /**
   * element  : runAsCurrentUser of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo runAsCurrentUser__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","runAsCurrentUser","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean runAsCurrentUser__is_set = false;

  private boolean runAsCurrentUser;

  public boolean getRunAsCurrentUser() {
    return runAsCurrentUser;
  }

  

  public boolean isRunAsCurrentUser() {
    return runAsCurrentUser;
  }

  

  public void setRunAsCurrentUser(boolean runAsCurrentUser) {
    this.runAsCurrentUser = runAsCurrentUser;
    runAsCurrentUser__is_set = true;
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
    __typeMapper.writeBoolean(__out, allowSave__typeInfo, allowSave, allowSave__is_set);
    __typeMapper.writeBoolean(__out, includeRecordDetails__typeInfo, includeRecordDetails, includeRecordDetails__is_set);
    __typeMapper.writeBoolean(__out, runAsCurrentUser__typeInfo, runAsCurrentUser, runAsCurrentUser__is_set);
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
    if (__typeMapper.verifyElement(__in, allowSave__typeInfo)) {
      setAllowSave((boolean)__typeMapper.readBoolean(__in, allowSave__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, includeRecordDetails__typeInfo)) {
      setIncludeRecordDetails((boolean)__typeMapper.readBoolean(__in, includeRecordDetails__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, runAsCurrentUser__typeInfo)) {
      setRunAsCurrentUser((boolean)__typeMapper.readBoolean(__in, runAsCurrentUser__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DuplicateRuleHeader_element ");
    sb.append(super.toString());
    sb.append(" allowSave=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(allowSave)+"'\n");
    sb.append(" includeRecordDetails=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(includeRecordDetails)+"'\n");
    sb.append(" runAsCurrentUser=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(runAsCurrentUser)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
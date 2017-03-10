package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ConvertLead_element implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ConvertLead_element() {
  }
    
  
  /**
   * element  : leadConverts of type {urn:enterprise.soap.sforce.com}LeadConvert
   * java type: com.sforce.soap.enterprise.LeadConvert[]
   */
  private static final com.sforce.ws.bind.TypeInfo leadConverts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","leadConverts","urn:enterprise.soap.sforce.com","LeadConvert",0,-1,true);

  private boolean leadConverts__is_set = false;

  private com.sforce.soap.enterprise.LeadConvert[] leadConverts = new com.sforce.soap.enterprise.LeadConvert[0];

  public com.sforce.soap.enterprise.LeadConvert[] getLeadConverts() {
    return leadConverts;
  }

  

  public void setLeadConverts(com.sforce.soap.enterprise.LeadConvert[] leadConverts) {
    this.leadConverts = leadConverts;
    leadConverts__is_set = true;
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
   
    __typeMapper.writeObject(__out, leadConverts__typeInfo, leadConverts, leadConverts__is_set);
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
    if (__typeMapper.isElement(__in, leadConverts__typeInfo)) {
      setLeadConverts((com.sforce.soap.enterprise.LeadConvert[])__typeMapper.readObject(__in, leadConverts__typeInfo, com.sforce.soap.enterprise.LeadConvert[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ConvertLead_element ");
    
    sb.append(" leadConverts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(leadConverts)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
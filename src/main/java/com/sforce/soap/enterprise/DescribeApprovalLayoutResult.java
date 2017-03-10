package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeApprovalLayoutResult implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeApprovalLayoutResult() {
  }
    
  
  /**
   * element  : approvalLayouts of type {urn:enterprise.soap.sforce.com}DescribeApprovalLayout
   * java type: com.sforce.soap.enterprise.DescribeApprovalLayout[]
   */
  private static final com.sforce.ws.bind.TypeInfo approvalLayouts__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","approvalLayouts","urn:enterprise.soap.sforce.com","DescribeApprovalLayout",0,-1,true);

  private boolean approvalLayouts__is_set = false;

  private com.sforce.soap.enterprise.DescribeApprovalLayout[] approvalLayouts = new com.sforce.soap.enterprise.DescribeApprovalLayout[0];

  public com.sforce.soap.enterprise.DescribeApprovalLayout[] getApprovalLayouts() {
    return approvalLayouts;
  }

  

  public void setApprovalLayouts(com.sforce.soap.enterprise.DescribeApprovalLayout[] approvalLayouts) {
    this.approvalLayouts = approvalLayouts;
    approvalLayouts__is_set = true;
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
   
    __typeMapper.writeObject(__out, approvalLayouts__typeInfo, approvalLayouts, approvalLayouts__is_set);
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
    if (__typeMapper.isElement(__in, approvalLayouts__typeInfo)) {
      setApprovalLayouts((com.sforce.soap.enterprise.DescribeApprovalLayout[])__typeMapper.readObject(__in, approvalLayouts__typeInfo, com.sforce.soap.enterprise.DescribeApprovalLayout[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeApprovalLayoutResult ");
    
    sb.append(" approvalLayouts=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(approvalLayouts)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
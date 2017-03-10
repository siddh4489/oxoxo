package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class RenderEmailTemplateRequest implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public RenderEmailTemplateRequest() {
  }
    
  
  /**
   * element  : templateBodies of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo templateBodies__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","templateBodies","http://www.w3.org/2001/XMLSchema","string",1,10,true);

  private boolean templateBodies__is_set = false;

  private java.lang.String[] templateBodies = new java.lang.String[0];

  public java.lang.String[] getTemplateBodies() {
    return templateBodies;
  }

  

  public void setTemplateBodies(java.lang.String[] templateBodies) {
    this.templateBodies = templateBodies;
    templateBodies__is_set = true;
  }
  
  /**
   * element  : whatId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo whatId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","whatId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean whatId__is_set = false;

  private java.lang.String whatId;

  public java.lang.String getWhatId() {
    return whatId;
  }

  

  public void setWhatId(java.lang.String whatId) {
    this.whatId = whatId;
    whatId__is_set = true;
  }
  
  /**
   * element  : whoId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo whoId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","whoId","urn:enterprise.soap.sforce.com","ID",0,1,true);

  private boolean whoId__is_set = false;

  private java.lang.String whoId;

  public java.lang.String getWhoId() {
    return whoId;
  }

  

  public void setWhoId(java.lang.String whoId) {
    this.whoId = whoId;
    whoId__is_set = true;
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
   
    __typeMapper.writeObject(__out, templateBodies__typeInfo, templateBodies, templateBodies__is_set);
    __typeMapper.writeString(__out, whatId__typeInfo, whatId, whatId__is_set);
    __typeMapper.writeString(__out, whoId__typeInfo, whoId, whoId__is_set);
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
    if (__typeMapper.verifyElement(__in, templateBodies__typeInfo)) {
      setTemplateBodies((java.lang.String[])__typeMapper.readObject(__in, templateBodies__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, whatId__typeInfo)) {
      setWhatId((java.lang.String)__typeMapper.readString(__in, whatId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, whoId__typeInfo)) {
      setWhoId((java.lang.String)__typeMapper.readString(__in, whoId__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RenderEmailTemplateRequest ");
    
    sb.append(" templateBodies=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(templateBodies)+"'\n");
    sb.append(" whatId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(whatId)+"'\n");
    sb.append(" whoId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(whoId)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
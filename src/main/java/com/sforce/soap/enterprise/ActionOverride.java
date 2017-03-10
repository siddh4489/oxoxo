package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class ActionOverride implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public ActionOverride() {
  }
    
  
  /**
   * element  : formFactor of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo formFactor__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","formFactor","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean formFactor__is_set = false;

  private java.lang.String formFactor;

  public java.lang.String getFormFactor() {
    return formFactor;
  }

  

  public void setFormFactor(java.lang.String formFactor) {
    this.formFactor = formFactor;
    formFactor__is_set = true;
  }
  
  /**
   * element  : isAvailableInTouch of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo isAvailableInTouch__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","isAvailableInTouch","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean isAvailableInTouch__is_set = false;

  private boolean isAvailableInTouch;

  public boolean getIsAvailableInTouch() {
    return isAvailableInTouch;
  }

  

  public boolean isIsAvailableInTouch() {
    return isAvailableInTouch;
  }

  

  public void setIsAvailableInTouch(boolean isAvailableInTouch) {
    this.isAvailableInTouch = isAvailableInTouch;
    isAvailableInTouch__is_set = true;
  }
  
  /**
   * element  : name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean name__is_set = false;

  private java.lang.String name;

  public java.lang.String getName() {
    return name;
  }

  

  public void setName(java.lang.String name) {
    this.name = name;
    name__is_set = true;
  }
  
  /**
   * element  : pageId of type {urn:enterprise.soap.sforce.com}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo pageId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","pageId","urn:enterprise.soap.sforce.com","ID",1,1,true);

  private boolean pageId__is_set = false;

  private java.lang.String pageId;

  public java.lang.String getPageId() {
    return pageId;
  }

  

  public void setPageId(java.lang.String pageId) {
    this.pageId = pageId;
    pageId__is_set = true;
  }
  
  /**
   * element  : url of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo url__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","url","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean url__is_set = false;

  private java.lang.String url;

  public java.lang.String getUrl() {
    return url;
  }

  

  public void setUrl(java.lang.String url) {
    this.url = url;
    url__is_set = true;
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
   
    __typeMapper.writeString(__out, formFactor__typeInfo, formFactor, formFactor__is_set);
    __typeMapper.writeBoolean(__out, isAvailableInTouch__typeInfo, isAvailableInTouch, isAvailableInTouch__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
    __typeMapper.writeString(__out, pageId__typeInfo, pageId, pageId__is_set);
    __typeMapper.writeString(__out, url__typeInfo, url, url__is_set);
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
    if (__typeMapper.verifyElement(__in, formFactor__typeInfo)) {
      setFormFactor((java.lang.String)__typeMapper.readString(__in, formFactor__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, isAvailableInTouch__typeInfo)) {
      setIsAvailableInTouch((boolean)__typeMapper.readBoolean(__in, isAvailableInTouch__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, pageId__typeInfo)) {
      setPageId((java.lang.String)__typeMapper.readString(__in, pageId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, url__typeInfo)) {
      setUrl((java.lang.String)__typeMapper.readString(__in, url__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ActionOverride ");
    
    sb.append(" formFactor=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(formFactor)+"'\n");
    sb.append(" isAvailableInTouch=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(isAvailableInTouch)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append(" pageId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(pageId)+"'\n");
    sb.append(" url=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(url)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
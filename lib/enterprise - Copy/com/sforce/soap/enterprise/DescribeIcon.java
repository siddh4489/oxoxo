package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeIcon implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeIcon() {
  }
    
  
  /**
   * element  : contentType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo contentType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","contentType","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean contentType__is_set = false;

  private java.lang.String contentType;

  public java.lang.String getContentType() {
    return contentType;
  }

  

  public void setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    contentType__is_set = true;
  }
  
  /**
   * element  : height of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo height__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","height","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean height__is_set = false;

  private java.lang.Integer height;

  public java.lang.Integer getHeight() {
    return height;
  }

  

  public void setHeight(java.lang.Integer height) {
    this.height = height;
    height__is_set = true;
  }
  
  /**
   * element  : theme of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo theme__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","theme","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean theme__is_set = false;

  private java.lang.String theme;

  public java.lang.String getTheme() {
    return theme;
  }

  

  public void setTheme(java.lang.String theme) {
    this.theme = theme;
    theme__is_set = true;
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
   * element  : width of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo width__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","width","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean width__is_set = false;

  private java.lang.Integer width;

  public java.lang.Integer getWidth() {
    return width;
  }

  

  public void setWidth(java.lang.Integer width) {
    this.width = width;
    width__is_set = true;
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
   
    __typeMapper.writeString(__out, contentType__typeInfo, contentType, contentType__is_set);
    __typeMapper.writeObject(__out, height__typeInfo, height, height__is_set);
    __typeMapper.writeString(__out, theme__typeInfo, theme, theme__is_set);
    __typeMapper.writeString(__out, url__typeInfo, url, url__is_set);
    __typeMapper.writeObject(__out, width__typeInfo, width, width__is_set);
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
    if (__typeMapper.verifyElement(__in, contentType__typeInfo)) {
      setContentType((java.lang.String)__typeMapper.readString(__in, contentType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, height__typeInfo)) {
      setHeight((java.lang.Integer)__typeMapper.readObject(__in, height__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, theme__typeInfo)) {
      setTheme((java.lang.String)__typeMapper.readString(__in, theme__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, url__typeInfo)) {
      setUrl((java.lang.String)__typeMapper.readString(__in, url__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, width__typeInfo)) {
      setWidth((java.lang.Integer)__typeMapper.readObject(__in, width__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeIcon ");
    
    sb.append(" contentType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(contentType)+"'\n");
    sb.append(" height=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(height)+"'\n");
    sb.append(" theme=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(theme)+"'\n");
    sb.append(" url=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(url)+"'\n");
    sb.append(" width=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(width)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
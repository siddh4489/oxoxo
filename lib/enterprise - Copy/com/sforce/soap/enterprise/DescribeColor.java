package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeColor implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeColor() {
  }
    
  
  /**
   * element  : color of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo color__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","color","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean color__is_set = false;

  private java.lang.String color;

  public java.lang.String getColor() {
    return color;
  }

  

  public void setColor(java.lang.String color) {
    this.color = color;
    color__is_set = true;
  }
  
  /**
   * element  : context of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo context__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","context","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean context__is_set = false;

  private java.lang.String context;

  public java.lang.String getContext() {
    return context;
  }

  

  public void setContext(java.lang.String context) {
    this.context = context;
    context__is_set = true;
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
   
    __typeMapper.writeString(__out, color__typeInfo, color, color__is_set);
    __typeMapper.writeString(__out, context__typeInfo, context, context__is_set);
    __typeMapper.writeString(__out, theme__typeInfo, theme, theme__is_set);
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
    if (__typeMapper.verifyElement(__in, color__typeInfo)) {
      setColor((java.lang.String)__typeMapper.readString(__in, color__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, context__typeInfo)) {
      setContext((java.lang.String)__typeMapper.readString(__in, context__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, theme__typeInfo)) {
      setTheme((java.lang.String)__typeMapper.readString(__in, theme__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeColor ");
    
    sb.append(" color=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(color)+"'\n");
    sb.append(" context=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(context)+"'\n");
    sb.append(" theme=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(theme)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
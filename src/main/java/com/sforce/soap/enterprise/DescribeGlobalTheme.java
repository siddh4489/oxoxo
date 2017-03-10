package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeGlobalTheme implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeGlobalTheme() {
  }
    
  
  /**
   * element  : global of type {urn:enterprise.soap.sforce.com}DescribeGlobalResult
   * java type: com.sforce.soap.enterprise.DescribeGlobalResult
   */
  private static final com.sforce.ws.bind.TypeInfo global__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","global","urn:enterprise.soap.sforce.com","DescribeGlobalResult",1,1,true);

  private boolean global__is_set = false;

  private com.sforce.soap.enterprise.DescribeGlobalResult global;

  public com.sforce.soap.enterprise.DescribeGlobalResult getGlobal() {
    return global;
  }

  

  public void setGlobal(com.sforce.soap.enterprise.DescribeGlobalResult global) {
    this.global = global;
    global__is_set = true;
  }
  
  /**
   * element  : theme of type {urn:enterprise.soap.sforce.com}DescribeThemeResult
   * java type: com.sforce.soap.enterprise.DescribeThemeResult
   */
  private static final com.sforce.ws.bind.TypeInfo theme__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","theme","urn:enterprise.soap.sforce.com","DescribeThemeResult",1,1,true);

  private boolean theme__is_set = false;

  private com.sforce.soap.enterprise.DescribeThemeResult theme;

  public com.sforce.soap.enterprise.DescribeThemeResult getTheme() {
    return theme;
  }

  

  public void setTheme(com.sforce.soap.enterprise.DescribeThemeResult theme) {
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
   
    __typeMapper.writeObject(__out, global__typeInfo, global, global__is_set);
    __typeMapper.writeObject(__out, theme__typeInfo, theme, theme__is_set);
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
    if (__typeMapper.verifyElement(__in, global__typeInfo)) {
      setGlobal((com.sforce.soap.enterprise.DescribeGlobalResult)__typeMapper.readObject(__in, global__typeInfo, com.sforce.soap.enterprise.DescribeGlobalResult.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, theme__typeInfo)) {
      setTheme((com.sforce.soap.enterprise.DescribeThemeResult)__typeMapper.readObject(__in, theme__typeInfo, com.sforce.soap.enterprise.DescribeThemeResult.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeGlobalTheme ");
    
    sb.append(" global=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(global)+"'\n");
    sb.append(" theme=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(theme)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
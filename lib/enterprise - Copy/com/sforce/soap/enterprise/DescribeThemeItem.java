package com.sforce.soap.enterprise;

/**
 * Generated class, please do not edit.
 */
public class DescribeThemeItem implements com.sforce.ws.bind.XMLizable {
  /**
   * Constructor
   */
  public DescribeThemeItem() {
  }
    
  
  /**
   * element  : colors of type {urn:enterprise.soap.sforce.com}DescribeColor
   * java type: com.sforce.soap.enterprise.DescribeColor[]
   */
  private static final com.sforce.ws.bind.TypeInfo colors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","colors","urn:enterprise.soap.sforce.com","DescribeColor",0,-1,true);

  private boolean colors__is_set = false;

  private com.sforce.soap.enterprise.DescribeColor[] colors = new com.sforce.soap.enterprise.DescribeColor[0];

  public com.sforce.soap.enterprise.DescribeColor[] getColors() {
    return colors;
  }

  

  public void setColors(com.sforce.soap.enterprise.DescribeColor[] colors) {
    this.colors = colors;
    colors__is_set = true;
  }
  
  /**
   * element  : icons of type {urn:enterprise.soap.sforce.com}DescribeIcon
   * java type: com.sforce.soap.enterprise.DescribeIcon[]
   */
  private static final com.sforce.ws.bind.TypeInfo icons__typeInfo =
    new com.sforce.ws.bind.TypeInfo("urn:enterprise.soap.sforce.com","icons","urn:enterprise.soap.sforce.com","DescribeIcon",0,-1,true);

  private boolean icons__is_set = false;

  private com.sforce.soap.enterprise.DescribeIcon[] icons = new com.sforce.soap.enterprise.DescribeIcon[0];

  public com.sforce.soap.enterprise.DescribeIcon[] getIcons() {
    return icons;
  }

  

  public void setIcons(com.sforce.soap.enterprise.DescribeIcon[] icons) {
    this.icons = icons;
    icons__is_set = true;
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
   
    __typeMapper.writeObject(__out, colors__typeInfo, colors, colors__is_set);
    __typeMapper.writeObject(__out, icons__typeInfo, icons, icons__is_set);
    __typeMapper.writeString(__out, name__typeInfo, name, name__is_set);
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
    if (__typeMapper.isElement(__in, colors__typeInfo)) {
      setColors((com.sforce.soap.enterprise.DescribeColor[])__typeMapper.readObject(__in, colors__typeInfo, com.sforce.soap.enterprise.DescribeColor[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, icons__typeInfo)) {
      setIcons((com.sforce.soap.enterprise.DescribeIcon[])__typeMapper.readObject(__in, icons__typeInfo, com.sforce.soap.enterprise.DescribeIcon[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, name__typeInfo)) {
      setName((java.lang.String)__typeMapper.readString(__in, name__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[DescribeThemeItem ");
    
    sb.append(" colors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(colors)+"'\n");
    sb.append(" icons=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(icons)+"'\n");
    sb.append(" name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(name)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}
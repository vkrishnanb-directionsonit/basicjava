<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html"/>

  <xsl:template match="/">
    <html>
    <head>
      <title><xsl:value-of select="BOOKLIST/BOOKS/ITEM/TITLE"/></title>
    </head>
    <style>
        body { font-family: Arial; font-size: 18; color:white; }
        li { list-style: square outside; }
    </style>
    <body bgcolor="black">
        <xsl:apply-templates/>
    </body>
    </html>
  </xsl:template>

  <xsl:template match="TITLE">
    <h1><font color="red"><xsl:value-of select="."/></font></h1>
  </xsl:template>

  <xsl:template match="AUTHOR">
    <h3><font color="yellow"><xsl:value-of select="."/>
    </font></h3>
  </xsl:template>

  <xsl:template match="QUANTITY">
<br/>    <font size="10">QUANTITY: <xsl:value-of select="."/></font><br/>
  </xsl:template>

  <xsl:template match="PUBLISHER">
<p/>    <font size="3">Publisher: <xsl:value-of select="."/></font><br/>
  </xsl:template>
</xsl:stylesheet>

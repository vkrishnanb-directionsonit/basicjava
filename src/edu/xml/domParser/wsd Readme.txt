Consider the following ComplexType AuthorType used by author element

<xsd:complexType name="AuthorType">
  <!-- compositor goes here -->
  <xsd:sequence>
     <xsd:element name="name" type="xsd:string"/>
     <xsd:element name="phone" type="tns:Phone"/>
  </xsd:sequence>
  <xsd:attribute name="id" type="tns:AuthorId"/>
</xsd:complexType>
<xsd:element name="author" type="tns:AuthorType"/>
If elementFormDefault="unqualified"

then following XML Instance is valid

<x:author xmlns:x="http://example.org/publishing">
   <name>Aaron Skonnard</name>
   <phone>(801)390-4552</phone>
</x:author>
the authors's name attribute is allowed without specifying the namespace(unqualified). Any elements which are a part of <xsd:complexType> are considered as local to complexType.

if elementFormDefault="qualified"

then the instance should have the local elements qualified

<x:author xmlns:x="http://example.org/publishing">
   <x:name>Aaron Skonnard</name>
   <x:phone>(801)390-4552</phone>
</x:author>

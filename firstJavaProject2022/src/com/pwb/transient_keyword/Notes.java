package com.pwb.transient_keyword;

public class Notes {
	
	/*
	
	tranisent keyword comes in java serialization - deserialization process.
	Suppose we have a employee POJO class. and in that emp password is present , we dont want to seriliaze that.
	in that case we can make that instance variable as trasient.
	
	actually in a class we can have Logger class, ResourseBundle, Properties class that we dot want to be a part of serialazation.
	that field we can make as trasient.
	
	
	Employee class ke serialize kora hole, byte code er class emp.ser generate holo.. ebr deseralize r somoy jvm oi same serialversionuid 
	r serialized file ta ke tule de-serialize korbe.
	
	tai eta diye jvm chk kore kon file ta ke dezerialize korbo.. , serialversionuid same na hole exception diye dbe
	
	
	
	Exception in thread "main" java.io.InvalidClassException: com.baeldung.deserialization.AppleProduct; 
	local class incompatible: stream classdesc serialVersionUID = 1234567, local class serialVersionUID = 7654321
	at java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:616)
	at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:1630)
	at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1521)
	at java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:1781)
	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1353)
	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:373)
	at com.baeldung.deserialization.DeserializationUtility.deSerializeObjectFromString(DeserializationUtility.java:24)
	at com.baeldung.deserialization.DeserializationUtility.main(DeserializationUtility.java:15)
	
	*/

}

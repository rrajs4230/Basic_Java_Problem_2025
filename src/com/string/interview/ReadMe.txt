str.chars(): This method converts the string str into a stream of int values, where each int represents the Unicode code point of a character in the string. For example, if str is "hello", str.chars() will produce a stream of integers corresponding to the characters: 104, 101, 108, 108, 111.

distinct(): This is a terminal operation that filters the stream to remove duplicate values. In the case of our example, it will take the stream of integers and produce a new stream that contains only unique integers. So, from the previous example, the distinct stream would be 104, 101, 108, 111 (the duplicate 108 for 'l' is removed).

forEach(c -> sbuilder.append((char)c)): This is a terminal operation that iterates over each unique integer in the stream. The lambda expression c -> sbuilder.append((char)c) takes each unique integer c, converts it back to a character using (char)c, and appends it to the StringBuilder instance sbuilder.

System.out.println(sbuilder): Finally, this line prints the contents of the StringBuilder, which now contains the unique characters from the original string in the order they first appeared.
class ArrayListDemo
{
public static void main(String args[])
{
ArrayList l = new ArrayList();
l.add("A");
l.add("B");
l.add("AIML");
l.add("CSE");
System.out.print(l);
l.remove("B");
l.add(4,"hyd");
System.out.print(l);
System.out.print("size =" +l.size());

System.out.print(l.isEmpty());
System.out.print(l.isclear());
}
}

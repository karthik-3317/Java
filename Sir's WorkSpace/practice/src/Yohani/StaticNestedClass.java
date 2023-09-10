package Yohani;

    class StaticNestedClass 
    {
    	static class Inner
	{
		void innermethod()
		{
			System.out.println("this is the inner class method");
		}
	}
	 String name;
	void outermethod()
	{
		System.out.println("this is the outer class method");
	}
	
	public static void main(String [] args)
	{
		StaticNestedClass snc=new StaticNestedClass();
		StaticNestedClass.Inner st=new StaticNestedClass.Inner();
		st.innermethod();
		snc.outermethod();
	}
}

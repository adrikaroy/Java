// volume of cone,cube,sphere using method overloading

class Vol{
	void volume(int r,int h)
	{

		System.out.println("volume of cone"+((3.14*r*r*h)/3));
	}
	void volume(double l)
	{

		System.out.println("volume of cube"+(l*l*l));
	}
	void volume(int r)
	{

		System.out.println("volume of sphere"+(3.14*r*r*r*4)/3);
	}
}
class Main{
	public static void main(String[] args) {
	Vol v=new Vol();
	v.volume(3,4);
	v.volume(4.7);
	v.volume(5);	
	}
}
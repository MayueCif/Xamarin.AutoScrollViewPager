package md57c3616e3d7e479a7a55fb2c9703f4ba7;


public class CustomDurationScroller
	extends android.widget.Scroller
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_startScroll:(IIIII)V:GetStartScroll_IIIIIHandler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.AutoScrollViewPager.CustomDurationScroller, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", CustomDurationScroller.class, __md_methods);
	}


	public CustomDurationScroller (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == CustomDurationScroller.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.CustomDurationScroller, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public CustomDurationScroller (android.content.Context p0, android.view.animation.Interpolator p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == CustomDurationScroller.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.CustomDurationScroller, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Views.Animations.IInterpolator, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public CustomDurationScroller (android.content.Context p0, android.view.animation.Interpolator p1, boolean p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == CustomDurationScroller.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.CustomDurationScroller, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Views.Animations.IInterpolator, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void startScroll (int p0, int p1, int p2, int p3, int p4)
	{
		n_startScroll (p0, p1, p2, p3, p4);
	}

	private native void n_startScroll (int p0, int p1, int p2, int p3, int p4);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

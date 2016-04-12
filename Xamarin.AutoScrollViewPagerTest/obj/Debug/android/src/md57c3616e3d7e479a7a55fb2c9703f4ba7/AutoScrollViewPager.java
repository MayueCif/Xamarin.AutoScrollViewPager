package md57c3616e3d7e479a7a55fb2c9703f4ba7;


public class AutoScrollViewPager
	extends android.support.v4.view.ViewPager
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_dispatchTouchEvent:(Landroid/view/MotionEvent;)Z:GetDispatchTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.AutoScrollViewPager.AutoScrollViewPager, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AutoScrollViewPager.class, __md_methods);
	}


	public AutoScrollViewPager (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == AutoScrollViewPager.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.AutoScrollViewPager, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public AutoScrollViewPager (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == AutoScrollViewPager.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.AutoScrollViewPager, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean dispatchTouchEvent (android.view.MotionEvent p0)
	{
		return n_dispatchTouchEvent (p0);
	}

	private native boolean n_dispatchTouchEvent (android.view.MotionEvent p0);

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

package md57c3616e3d7e479a7a55fb2c9703f4ba7;


public class AutoScrollViewPager_MyHandler
	extends android.os.Handler
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_handleMessage:(Landroid/os/Message;)V:GetHandleMessage_Landroid_os_Message_Handler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.AutoScrollViewPager.AutoScrollViewPager+MyHandler, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AutoScrollViewPager_MyHandler.class, __md_methods);
	}


	public AutoScrollViewPager_MyHandler () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AutoScrollViewPager_MyHandler.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.AutoScrollViewPager+MyHandler, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public AutoScrollViewPager_MyHandler (android.os.Handler.Callback p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == AutoScrollViewPager_MyHandler.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.AutoScrollViewPager+MyHandler, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Handler+ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public AutoScrollViewPager_MyHandler (android.os.Looper p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == AutoScrollViewPager_MyHandler.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.AutoScrollViewPager+MyHandler, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public AutoScrollViewPager_MyHandler (android.os.Looper p0, android.os.Handler.Callback p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == AutoScrollViewPager_MyHandler.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.AutoScrollViewPager+MyHandler, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.OS.Handler+ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}

	public AutoScrollViewPager_MyHandler (md57c3616e3d7e479a7a55fb2c9703f4ba7.AutoScrollViewPager p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == AutoScrollViewPager_MyHandler.class)
			mono.android.TypeManager.Activate ("Xamarin.AutoScrollViewPager.AutoScrollViewPager+MyHandler, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Xamarin.AutoScrollViewPager.AutoScrollViewPager, Xamarin.AutoScrollViewPager, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void handleMessage (android.os.Message p0)
	{
		n_handleMessage (p0);
	}

	private native void n_handleMessage (android.os.Message p0);

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

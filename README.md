# Xamarin.AutoScrollViewPager

Xamarin.Android 自动滑动ViewPager

改写:https://github.com/Trinea/android-auto-scroll-view-pager

使用：

xml中定义元素：

<Xamarin.AutoScrollViewPager.AutoScrollViewPager
        android:id="@+id/container"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />

Activity中

var viewPager = FindViewById<Xamarin.AutoScrollViewPager.AutoScrollViewPager> (Resource.Id.container);
			viewPager.Adapter = sectionsPagerAdapter;
			viewPager.StartAutoScroll ();

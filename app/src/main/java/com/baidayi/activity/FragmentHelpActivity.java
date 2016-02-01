/*
 * @Title:  FragmentHelpActivity.java
 * @Copyright:Ltd. Copyright sundroid,  All rights reserved
 * @Description:  TODO
 * @author:  sundroid
 * @data:  2014-3-23 下午7:57:16
 * @version:  V1.0
 */
package com.baidayi.activity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;

import com.baidayi.swipback.SwipeBackActivity;
import com.baidayi.utils.WebViewUtil;
import com.baidayi.widget.LoadingDialog;

/**
 * 帮助 栏Fragment
 *
 * @author: wll
 */
public class FragmentHelpActivity extends SwipeBackActivity {

	private LoadingDialog dialog;
	private WebView webView;
	private WebViewUtil webViewUtil;

	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		dialog = new LoadingDialog(this);
		dialog.show();
		setContentView(R.layout.fragment_user_help);
		webView = (WebView) findViewById(R.id.fragment_user_help_webview);

		WebSettings webSettings = webView.getSettings();
		webSettings.setJavaScriptEnabled(true);
		// webSettings.setBuiltInZoomControls(true);
		webSettings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
		webViewUtil = new WebViewUtil();
		new HelpAsyncTask().execute("");
		setEdgeFromLeft();
	}

	private class HelpAsyncTask extends AsyncTask<String, Integer, String> {

		@Override
		protected String doInBackground(String... params) {
			webViewUtil.GetItemWebView(
					"http://www.bdysc.com/help/index-200022.html", 2);
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			super.onPostExecute(result);
			webView.loadDataWithBaseURL(null, webViewUtil.getItemData(),
					"text/html", "utf-8", null);
			dialog.dismiss();
			webView.setVisibility(View.VISIBLE);
		}
	}

}

package com.baidayi.utils;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * ���ι�������࣬�õ����ι���
 */
class MytmArray implements X509TrustManager {
	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return new X509Certificate[] {};
	}

	@Override
	public void checkClientTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {

	}

	@Override
	public void checkServerTrusted(X509Certificate[] chain, String authType)
			throws CertificateException {
	}
};

package com.baidayi.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.baidayi.domain.Product;
import com.baidayi.utils.ListUtil;

/**
 * ��ȡ��Ʒ������������
 * 
 * @author: wll
 */
public class GetProductService {

	public List<Product> getProduct(int page, int menu, String search) {
		List<Product> products = new ArrayList<Product>();
		Document document = null;
		try {
			switch (menu) {
			case 0:// ��ˮ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430160/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 1:// Ӫ������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430168/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 2:// ��������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430152/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 3:// ������໤��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430174/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 4:// ��ͥ��໤��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430181/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 5:// һ������Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430197/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 6:// �̷�
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430269/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 7:// ͯ��ͯ��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430303/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 8:// �沿����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430328/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 9:// �������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430395/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 10:// �����ֵ�����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430395/b50107-p"
										+ page + ".html").timeout(3000).get();
				break;
			// ����
			case 11:
				document = Jsoup
						.connect(
								"http://www.bdysc.com/product_list.jsp?keyword="
										+ search + "&cid=c_10000&page=" + page)
						.timeout(3000).get();
				break;
			case 12:// ʳƷ���Ͼ�ˮ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-600021/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 13:// �����ز�
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-590007/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 14:// ������ʳ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430085/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 15:// ���ɸ��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430096/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 16://
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-590007/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 17:// ��Ʒ����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430120/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 18:// ��������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430131/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 19:// ������ʳ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430139/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 20:// ����/�ɻ�
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430144/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 21:// ��������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430152/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 22:// ��ˮ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430160/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 23:// ��Ҷ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430164/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 24:// Ӫ������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430168/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 25:// ������ࡢֽ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430174/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 26:// ��ͥ��໤��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430181/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 27:// ֽ��Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430189/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 28:// һ������Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430197/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 29:// ����þ�
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430207/p" + page
										+ ".html").timeout(3000).get();
				break;
			// ���üҾӡ����߲;�
			case 30:// �ҷ�����Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430221/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 31:// ����ϴɹ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430226/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 32:// ��������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430233/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 33:// ������Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430240/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 34:// ���߹���
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430242/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 35:// �;�ˮ��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430256/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 36:// ��������
				document = Jsoup
						.connect("http://www.bdysc.com/list-430265/p" + page

						+ ".html").timeout(3000).get();
				break;
			// ĸӤ��Ʒ�����
			case 37:// �̷�
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430269/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 38:// ���ʪ��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430276/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 39:// Ӥ����ʳ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430284/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 40:// ������Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430288/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 41:// ϴ�����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430296/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 42:// ͯ��ͯ��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430303/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 43:// ������Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430314/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 44:// ���
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430318/p" + page
										+ ".html").timeout(3000).get();
				break;
			// ���ݻ�ױ�����˻���
			case 45:// �沿����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430328/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 46:// �ͷײ�ױ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430340/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 47:// ��ʿ����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430350/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 48:// ϴ������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430355/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 49:// ϴԡ��Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430361/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 50:// ��ǻ����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430367/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 51:// Ů�Ի���
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430371/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 52:// ���廤��
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430374/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 53:// ���ݹ���
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430377/p" + page
										+ ".html").timeout(3000).get();
				break;

			case 54:// ��ˮSPA
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430381/p" + page
										+ ".html").timeout(3000).get();
				break;

			// ����������칫����
			case 55:// ��������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430386/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 56:// �������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430395/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 57:// ���˽���
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430401/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 58:// �칫����
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430405/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 59:// ��������
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430413/p" + page
										+ ".html").timeout(3000).get();
				break;

			// ���������Ʒר��
			case 60:// �Ͱ���
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430434/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 61:// ��Ůʿ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430437/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 62:// ����ʿ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430440/p" + page
										+ ".html").timeout(3000).get();
				break;
			case 63:// ������Ʒ
				document = Jsoup
						.connect(
								"http://www.bdysc.com/list-430443/p" + page
										+ ".html").timeout(3000).get();
				break;
			}

			String elementkey = document.getElementsByClass(
					"result_key_notfound").text();
			ListUtil.elementkey = elementkey;

			if (document != null && elementkey.equals("")) {
				Elements elements = document.getElementById("prodcutListUl")
						.children();
				for (Element element : elements) {
					Product product = new Product();
					product.setUrl("http://www.bdysc.com"
							+ element.child(0).select("a").attr("href"));
					product.setImageUrl(element.select("img").first()
							.absUrl("src"));
					product.setProductName(element.select("img").first()
							.attr("alt"));
					product.setProductDescribe("���̳���Ӫ��");
					product.setProductPrice(element.child(2).text()
							.replace(element.child(2).child(0).text(), "")
							.trim());
					products.add(product);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return products;
	}
}

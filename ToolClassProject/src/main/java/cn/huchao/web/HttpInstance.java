package cn.huchao.web;

import cn.huchao.util.HttpUtil;

/**
 * @author huchao
 *	@2017年7月3日
 *	@description
 *	
 */
public class HttpInstance {
	public static void main(String[] args) {
		//模板四
		/*String requestBody = "transdata=%7B%22cporderid%22%3A%2220170517174744764052014%22%2C%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-05-17+17%3A51%3A22%22%2C%22appuserid%22%3A%2218239639432%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.01%2C%22waresid%22%3A1%2C%22appid%22%3A%225000001448%22%2C%22feetype%22%3A0%2C%22transid%22%3A%2232201705171748026590368%22%2C%22currency%22%3A%22RMB%22%7D&sign=wEMhfy80XgTxiMpA3wyjPnViBPitZlCuRRIcJuXrdevhR0qmF6UQFAfqIzGN6ed88fc7Dpa7Rj8OGRqEQMN3nSHyER7LzPwWyMvY%2B84Ry5chgJWi2Q%2BNWSE4uaekBQj7SoT1ldNORIV8CJH0B3r8BjxbQ3aFJz%2FadTMEgvV9%2FlQ%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder2?uid=order_0008";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		//模板三
		/*String requestBody = "transdata=%7B%22cporderid%22%3A%2220170606165657219128240%22%2C%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-06+16%3A57%3A02%22%2C%22appuserid%22%3A%2218239639432%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.02%2C%22waresid%22%3A1%2C%22appid%22%3A%225000001448%22%2C%22feetype%22%3A0%2C%22transid%22%3A%2232201706061656572343736%22%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%221111%5C%22%7D%22%2C%22currency%22%3A%22RMB%22%7D&sign=Cs%2BLdFGIcWU1DWpsEr6tADh7PzabCiDmWPPl3dBSxoB2WsdfrgUsEqQVhys0DoyUw%2Bpyw4pDEkbtmfPoMXnaIK%2FImGb3UOxaBQ2JHjOPfnAcmDLhDUXAa0dI%2FIqA4yNG%2B%2BCTC7Son%2FEBFh%2F7e11%2BSySz7p0ZTvy6MEjgqVScH%2BA%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder?uid=order_0002";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		//退款回调接口  /front/sh/refundOrder!callRefundOrder
		/*String requestBody = "transdata=%7B%22succdata%22%3A%2220170621151520971380128%5E0.01%22%2C%22faildata%22%3A%22%22%2C%22appid%22%3A%225000001448%22%2C%22notifytime%22%3A%222017-06-21+15%3A17%3A01%22%2C%22refundno%22%3A%2220170621151649143213%22%7D&sign=JBuet0Ez%2FyNlbrHWLY3jMHsd7k7MaBOtcBc7wrimaHR1rJve1qU%2FYGQCF1jOK21L6iydmNwKzWKcEA0ni%2FxFvl8BF0ZLTBFtfHtC5UC%2BvMNVI5zszIxmrpj2MhslVYvSZJXMt2z3CpTP9xz%2F%2F%2BnVSO5X2CXt6%2FZjoNoAjubzAVY%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/refundOrder!callRefundOrder?uid=refund_0006";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		/*String requestBody = "transdata=%7B%22cporderid%22%3A%2220170605182356546444668%22%2C%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-05+18%3A24%3A03%22%2C%22appuserid%22%3A%2218239639432%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.03%2C%22waresid%22%3A1%2C%22appid%22%3A%225000001448%22%2C%22feetype%22%3A0%2C%22transid%22%3A%2232201706051823565056130%22%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%222222%5C%22%7D%22%2C%22currency%22%3A%22RMB%22%7D&sign=WMS%2FySKwp7SH98VUHxvxDGLifazVGgCyM%2BeKr5FAFcore3WeA2swM3yTfXOo6QVrydkOsKQbSdOcZEj25IQCqBd8roVfeUrYbrXaJIu7NFQSxzA3Z%2Bm5SyGJ%2BFwE6tXj65l9d%2BAbz1Wgtt8%2FnnZuPepU70%2FxSG2PSB8pFvRuiKo%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder?uid=order_0002";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
	/*	User user =new User();
		user.setId(1000);*/
		//营销活动下单异步回调
	/*	String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-29+21%3A24%3A07%22%2C%22appuserid%22%3A%2213618901464%22%2C%22appid%22%3A%225000001452%22%2C%22payorderid%22%3A%224008892001201706298030203171%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170629212323033007372%22%2C%22paytype%22%3A1002%2C%22money%22%3A0.07%2C%22waresid%22%3A1%2C%22requestid%22%3A%22WX20170629212358913809093%22%2C%22transid%22%3A%2232201706292123244371219%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%2213618901464%5C%22%2C%5C%22redirecturl%5C%22%3A%5C%22http%3A%2F%2F211.138.20.171%3A20120%2FtopImg%2F201706292024373257%2Fresults.html%5C%22%7D%22%7D&sign=dGpmhoFFoO574J%2BREW5A6W49f9zjdCMkRZJSvvNu7RfGyjoGncZsj8dq10s8lpNhJjQ0vZqQyWbbbf5BlSG%2B3eb1fZBZrQIsF7fHEuaWuxvksVGkiM0PzMuQrF2eHvnwO5snMrAEdSFsPkcBkVmv9I%2BgPwJSQIxUjR7LTi%2FgV1Q%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/marketOrder!callBackMarketOrder?uid=marketOrder_0003";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		//访问测试环境
		/*String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-29+16%3A10%3A29%22%2C%22appuserid%22%3A%2213618901464%22%2C%22appid%22%3A%225000001452%22%2C%22payorderid%22%3A%224008892001201706297982504519%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170629160611423772870%22%2C%22paytype%22%3A1002%2C%22money%22%3A0.06%2C%22waresid%22%3A1%2C%22requestid%22%3A%22WX20170629160848365046306%22%2C%22transid%22%3A%2232201706291606530939778%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%2213618901464%5C%22%2C%5C%22redirecturl%5C%22%3A%5C%22http%253A%252F%252F192.168.100.51%253A20120%252Ftop%252Fcheck.html%5C%22%7D%22%7D&sign=eLa7PnvfYG3%2BTv6s7dVoeV54Aa9aeGyJGX5eb6H8zbOCoK4rrSS07Wewg%2F28%2FEKKPaNdzXrLgdhzHzMzWhGDKqtH1NhLfkiOjf0XnuYszr9QbA8MPMf022rneuPsEwsoZuZaGpW0QTZIsMx1rs6sUFXpff%2Fdo65bDWAqx7%2BurSc%3D&signtype=RSA";
		String url = "http://192.168.100.51:20120/top/front/sh/marketOrder!callBackMarketOrder?uid=marketOrder_0003";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		String url ="http://192.168.91.116:28090/top/front/sh/marketOrder!checkOrderPayStatus?uid=marketOrder_0002";
		String param = "";
		String result = HttpUtil.sendPost(url, param);
		System.out.println(result);
	}
}


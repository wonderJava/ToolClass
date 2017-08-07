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
		/*String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-07-17+10%3A14%3A32%22%2C%22appuserid%22%3A%2218240069896%22%2C%22appid%22%3A%225000001448%22%2C%22payorderid%22%3A%222017071721001004140238086348%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170717101422530355562%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.04%2C%22waresid%22%3A1%2C%22requestid%22%3A%22ZFB20170717101422259023033%22%2C%22transid%22%3A%2232201707171014222370177%22%2C%22feetype%22%3A0%7D&sign=Uda%2BcMgmFcO%2F%2B3JzOUJv1qEBtWVBH0vlASAKR9jpaM9omcXwLFXBVMC7qrvLjPaI52Tqy1YWAFMlEH14f5QawZzz%2FoxzBSu1weXljHt4RCwJKTJO0%2BRptWpAhD8WmdBTbrPowelV4ASjC2%2Fguv2%2FV21kTpw%2BO7ndB01MrMXYMr0%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder2?uid=order_0008";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//模板三
	/*	String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-07-17+10%3A05%3A39%22%2C%22appuserid%22%3A%2218239639432%22%2C%22appid%22%3A%225000001448%22%2C%22payorderid%22%3A%222017071721001004140238073494%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170717100525931401440%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.03%2C%22waresid%22%3A1%2C%22requestid%22%3A%22ZFB20170717100525313668409%22%2C%22transid%22%3A%2232201707171005252698329%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%221234567%5C%22%7D%22%7D&sign=I0vbz5KQSbs5N4VXWby85FccQ5SK%2FCB1OHsIqqLB0PJn3eQVADz7Q57h2YnjDvgwxadv9oHckOt1imutsuvziCfZwasDqU7x2jvEM2bjYUxVi7Bw1IslTs76AfDL0b0808s8qDDkvlTeLLLxbnkafE596418JVnpU3%2FFk%2BVToU8%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder?uid=order_0002";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//退款回调接口  /front/sh/refundOrder!callRefundOrder
		/*String requestBody = "transdata=%7B%22succdata%22%3A%2220170621151520971380128%5E0.01%22%2C%22faildata%22%3A%22%22%2C%22appid%22%3A%225000001448%22%2C%22notifytime%22%3A%222017-06-21+15%3A17%3A01%22%2C%22refundno%22%3A%2220170621151649143213%22%7D&sign=JBuet0Ez%2FyNlbrHWLY3jMHsd7k7MaBOtcBc7wrimaHR1rJve1qU%2FYGQCF1jOK21L6iydmNwKzWKcEA0ni%2FxFvl8BF0ZLTBFtfHtC5UC%2BvMNVI5zszIxmrpj2MhslVYvSZJXMt2z3CpTP9xz%2F%2F%2BnVSO5X2CXt6%2FZjoNoAjubzAVY%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/refundOrder!callRefundOrder?uid=refund_0006";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//退款回调接口  /front/sh/refundOrder!callRefundOrder 测试接口
		/*String requestBody = "transdata=%7B%22succdata%22%3A%2220170710130455052605608%5E300.0%22%2C%22faildata%22%3A%22%22%2C%22appid%22%3A%225000001452%22%2C%22notifytime%22%3A%222017-07-21+18%3A00%3A01%22%2C%22refundno%22%3A%2220170721173631224637%22%7D&sign=JuftsgqSTEoXmkoBh96aO1GTSOkWaCTU8pkd6W%2Fi8mlWmMtWlARlWvbae9Llq%2BK86M%2BykjJp8LGgVCJ0sa%2FIvyrK8w20SaeKKj4xVmD58Th9xMaCBNH29Hu%2F%2BI7oyY3EzFousQ3qIA70DnBQtGvDOqGZ1dJnYmScevjkgSQfw5w%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/refundOrder!callRefundOrder?uid=refund_0006";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//退款测试
		/*String requestBody = "transdata=%7B%22succdata%22%3A%2220170725142334837060449%5E0.01%22%2C%22faildata%22%3A%22%22%2C%22appid%22%3A%225000001452%22%2C%22notifytime%22%3A%222017-07-25+14%3A25%3A08%22%2C%22refundno%22%3A%2220170725142454897592%22%7D&sign=tTx%2BChOezrfpppU1%2FQuc%2Fpa9GVc%2FLV4rjA9n3KAe7aVs0m1kNFtKbthG0L7orj4Xns2vEUNEz7ngxcSsaRBxgYrIhWurMN4LUNRGQvRMacTcTdaw86RM4ISQLMz1HQGcP%2BRryDk8txTEbhJ7VuF0XBJckYrEwJj31PAGrEh4pNo%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/refundOrder!callRefundOrder?uid=refund_0006";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		/*String requestBody = "transdata=%7B%22cporderid%22%3A%2220170605182356546444668%22%2C%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-05+18%3A24%3A03%22%2C%22appuserid%22%3A%2218239639432%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.03%2C%22waresid%22%3A1%2C%22appid%22%3A%225000001448%22%2C%22feetype%22%3A0%2C%22transid%22%3A%2232201706051823565056130%22%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%222222%5C%22%7D%22%2C%22currency%22%3A%22RMB%22%7D&sign=WMS%2FySKwp7SH98VUHxvxDGLifazVGgCyM%2BeKr5FAFcore3WeA2swM3yTfXOo6QVrydkOsKQbSdOcZEj25IQCqBd8roVfeUrYbrXaJIu7NFQSxzA3Z%2Bm5SyGJ%2BFwE6tXj65l9d%2BAbz1Wgtt8%2FnnZuPepU70%2FxSG2PSB8pFvRuiKo%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/order!callOrder?uid=order_0002";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
	/*	User user =new User();
		user.setId(1000);*/
		//营销活动下单异步回调
		/*String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-07-17+18%3A02%3A09%22%2C%22appuserid%22%3A%2218239639432%22%2C%22appid%22%3A%225000001452%22%2C%22payorderid%22%3A%222017071721001004140238925248%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170717180028056635762%22%2C%22paytype%22%3A1001%2C%22money%22%3A0.06%2C%22waresid%22%3A1%2C%22requestid%22%3A%22ZFB20170717180135088807193%22%2C%22transid%22%3A%2232201707171800288277432%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%2218239639432%5C%22%2C%5C%22redirecturl%5C%22%3A%5C%22http%253A%252F%252F192.168.100.51%253A20120%252FtopImg%252F201707171624505255%252Fresults.html%5C%22%7D%22%7D&sign=hRoORhthrDPdxQEgJlafp8HsTeoD%2F4krvgjGT9A1D%2FFB8oRZD41b1mKpPNXGisYD2rkHPevenUxAn7UncbMiMjI7PxLhTB%2FxYi6o22MpEJI5AVZaeGC%2BH5QkbECtdVV5wTDe%2BKFI3OryGBIIoRJFmu6IYBjwVByyH7GV3L6WP4M%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/marketOrder!callBackMarketOrder?uid=marketOrder_0003";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//宁夏营销活动
		/*String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-07-25+14%3A24%3A52%22%2C%22appuserid%22%3A%2215009502900%22%2C%22appid%22%3A%225000001452%22%2C%22payorderid%22%3A%224008892001201707252578835238%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170725142334837060449%22%2C%22paytype%22%3A1002%2C%22money%22%3A0.01%2C%22waresid%22%3A1%2C%22requestid%22%3A%22WX20170725142441363276883%22%2C%22transid%22%3A%2232201707251423350269996%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%2215009502900%5C%22%2C%5C%22redirecturl%5C%22%3A%5C%22http%253A%252F%252F192.168.100.51%253A20120%252FtopImg%252F201707251024341378%252Fresults.html%5C%22%7D%22%7D&sign=Yx3R7W5n4%2BUXqbwZpYQtV8cKpPcqaJ7JkHNJYdjG57Kq8hRVbFNYynDbV9D2DEbuhJsAri2OaC8fxtG8GgZPKWP6DFL1XgDDAC%2FWsUmwW43c%2BL%2BXfUm8lhz%2Fu%2F7FNfZ3MUdpKqiwE5nmnVx%2FGRo0R%2BSkP1%2Bbnts%2F4LA0O%2BUCY5U%3D&signtype=RSA";
		String url = "http://192.168.91.116:28090/top/front/sh/marketOrder!callBackMarketOrder?uid=marketOrder_0003";
		String doPost = HttpUtil.sendPost(url, requestBody);
		System.out.println(doPost);*/
		//访问测试环境
		/*String requestBody = "transdata=%7B%22transtype%22%3A0%2C%22result%22%3A2%2C%22transtime%22%3A%222017-06-29+16%3A10%3A29%22%2C%22appuserid%22%3A%2213618901464%22%2C%22appid%22%3A%225000001452%22%2C%22payorderid%22%3A%224008892001201706297982504519%22%2C%22currency%22%3A%22RMB%22%2C%22cporderid%22%3A%2220170629160611423772870%22%2C%22paytype%22%3A1002%2C%22money%22%3A0.06%2C%22waresid%22%3A1%2C%22requestid%22%3A%22WX20170629160848365046306%22%2C%22transid%22%3A%2232201706291606530939778%22%2C%22feetype%22%3A0%2C%22cpprivate%22%3A%22%7B%5C%22phone%5C%22%3A%5C%2213618901464%5C%22%2C%5C%22redirecturl%5C%22%3A%5C%22http%253A%252F%252F192.168.100.51%253A20120%252Ftop%252Fcheck.html%5C%22%7D%22%7D&sign=eLa7PnvfYG3%2BTv6s7dVoeV54Aa9aeGyJGX5eb6H8zbOCoK4rrSS07Wewg%2F28%2FEKKPaNdzXrLgdhzHzMzWhGDKqtH1NhLfkiOjf0XnuYszr9QbA8MPMf022rneuPsEwsoZuZaGpW0QTZIsMx1rs6sUFXpff%2Fdo65bDWAqx7%2BurSc%3D&signtype=RSA";
		String url = "http://192.168.100.51:20120/top/front/sh/marketOrder!callBackMarketOrder?uid=marketOrder_0003";
		String doPost = doPost(url, requestBody);
		System.out.println(doPost);*/
		/*String url ="http://192.168.91.116:28090/top/front/sh/marketOrder!checkOrderPayStatus?uid=marketOrder_0002";
		String param = "";
		String result = HttpUtil.sendPost(url, param);
		System.out.println(result);*/
	}
}


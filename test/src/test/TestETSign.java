package test;

import java.security.cert.X509Certificate;

import cn.com.etonepay.etonepaySign;
import cn.com.sdca.security.util.JdkX509CertTookit;

public class TestETSign {
	public static String sign(String txnString){
		//配置私钥的配置文件(默认寻找privateKey.xml)和私钥配置中定义的APPName
		etonepaySign es = new etonepaySign("privateKey","privateKey1.xml");

		String signStr = es.sign(txnString);
        System.out.println("txnString==="+txnString);
        System.out.println("signStr==="+signStr);
//        try {
//
//        X509Certificate cert = JdkX509CertTookit.loadX509CertificateFromFile("encypt.cer");//
//        System.out.println((new StringBuilder()).append("证书编号为：==========").append(JdkX509CertTookit.toHex(cert.getSerialNumber().toByteArray())).toString());
//        //74c0175b98878a1cc94752f2ca360c0c
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
		return signStr;

	}

    public static void main(String args[]){
        try {
           // String txnString = "988000000004591|20160613102308|20160613102308|00000084|扫铺代付|1|2|110891|0000000088|1|0E9E8BD9ABFED5DE29BA8550BE275BE8A1B3BEB3230A64B8A24E0E13AA994D145F197FA8679ACFCF8AA56BC9099D1C31CD37F7452335B0DE62DFA0F8D5E9EAB9C4E1EB0BF359A766B7F2CB7CF2ED7508E1E1AD137A24EB23A58B944113792DBD7FBEE89E3143E850D8DE8A80B5CE86DCD9F905898FF57150D1E567E4D612ABF8066988B3660B006EEDC41349E369F3A2FED354288E3EB49030F609B9B16E31DCEDE71CE3EC7DC59729D46C65EB5DE86892F38ADF6AFBB2869075C47742DFC55BA018F18969B26905630D98EEB04F9FBA78758380163EBE92EBB68EF71672CA69A1A2776F5DE7646AF0BCDFE6997CACC57E091D6287AE2085062B0B1CD95B3BFF|2897A8ABB47C5B491D921510E6F46B391C9941054D444793901EF4120865C0338386FAF0066690D1D9C247D99D132D58FA9CCFB6AD29F5E82220EDCA093CE41832A586A7BA1B66B91044A9C7738635114A2E12A8E9FFFC3C688C26AA2A13B3A11095977CE0174852D10BAAF39EC26E98F68684632974F3DF5BB8281924E6D57A0E8803EF1AAFF3F65B50E140159FD06F5EA3E94FCF1237DFCB8A6B1893E504478CAE7A03C95F9AD5A123279F54210EA5E41EC0045F957F345716CF32629036C7FD6569D48AD6579DFE7687FB46D99555CC9BEB43AF2289D54B5EA6F195FE713001FA46E9A37AECE9E0CD3A54C2CCCD6B5C1242EFD3A6E4FCA3FAC6658A0872A8|中信银行中信银行济南历下支行|11035|0000000089|1|113D71F209BA57F3FFA354FD847CF07089FCFC68BD3450324E098D4C0309BED0F043B98F32127CE89235C79F7BC17B21197DAA17E53B947B634E6FC837068664945339AB374E0663F224BF3E10FDE0A25DE71A75D40049BB0ED76127F1477DD5C502D4452A7092F1E2A54AD327CDF7FF551C893FDE71AC4DE69CF61644EDFC73C8159A62E033AAAEE32388CD61A6DDAB006B76E78079E59DBC5C417C7060EBCAA9206BF0F8CD75ABFA56BF64546442B9F983959C876717F2A958C2FD0BF8245C988E04EF56CA2D5C9B520B36E5432C7304AB18C722B2F84B7B99A2A5A25D8D8ECA41DE73DFE5EEB0FE64CE4AE4B26CA6F6597C8742541090488E1B2E1A05A96E|40A88C55D7E6584B3E396D1BCDFBE70CC676FDBDA19FD3B8C27E05038246543434B8EDDA93172A327BBF60278F09CF94789EFE8E9D373837DE23D71BBA98101F40845712C93D4B39B4EE434D8F45B860C704E212C81D0736749B1E73F48298E19CA9D03B8C9845B42481CF5546ED84D9A58EC463BA20AB6A84F49FEAB377BAA58B27A28162FE9EB8F18CE987DFB68D2DC2DD83051BD80A8E0747EDC971D1FBBE56C7E314E29111DFA0225AC97A6813E054B6351B9EF4C41E341E166100E15268067CA3611FAB516A42C812B705578EA1C08556C8BA174C34D74179FDE8EB9E5CB5C55EB2C75E42AA7F8B81410A3E05AE90FF67DCEB5B6DD0A2A3DE8563A6A25D|农村信用合作社山东济南润丰农村合作银行天桥支行|99856";
            String txnString ="988088888888888|20171213092533|etonDaifu|12211231|0000000380|1|1|100|1221123492|1|81535A676014549E724BC2F8D8CEDAA803286A651F9576A0A96C1E07C399B05AE75C316A31510A3EC9E5791CAAB68281DB06697D5FC7B53FEDB8878EB246D3A94141621BF9437863C8B32C2104B4903400ACD38D5EEFE61A3FFD4932257E624E18F36722318FB23F4DF682EC3A57A672C5C9085E7CA758BBF6ABACB7A8114C76512DE16BC71F6EFB9A95E9FB816CA04F3BB608F2291DD000AEBEA94F6D8A41746DBAEEA9E932A748B2084B147982C9746613F3BEF201D5227F00845991B652139CEEB14671F2AD60B7ECB6E85F1A80CE9ECEAC7F19E4E68885A4B0C4041287C85674D6FE0B101022E0BD982D9AF0DA79711FD75E6F8651ED422D3D5E17ABA772|8EC82AC0A557D98BD5610AB149D447B2862743812231E831F1EBA5E7683841FA62BBD8313AFA7EF5309EB4A05D9F9A350B20CAD8FA6D6CDC455CD54493A2EE39F4F2BE5F5E0F1F77A67F646B7F80E1FA03E4BCF4195AF7AC8BD6965B4387AC76093F37260BEE44750ABB95E2294B1E84F44345A7711CDC8A86791B80D48300922C82B470E3634D7965917B994843B7AC1938DF08C7B0F47D0B3FA4BD78F0C4563351D183562A7F84123EF1212664649430799DF0FD9B7CCA0704C6848CF646328AA43C0BF174D7A519A5E85413FA1BCBB8B083E995A356BBB9AA1FCAFBBBC9ADCF7CF94B1AD76F57C324FA1A2E7737A40BCBAAA03582222DB1AD92178774770C|CBC|100";
            String signStr = sign(txnString);
            System.out.println("签名结果为==============="+signStr);
            
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

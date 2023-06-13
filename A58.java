//How to get own IP Address in java Program
//InetAddress is a class name //.getLocalHost() is method name
package codingpract;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class A58 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress a=InetAddress.getLocalHost();
		System.out.println(a);

	}

}

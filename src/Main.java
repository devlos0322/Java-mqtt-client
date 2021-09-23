import org.eclipse.paho.client.mqttv3.*;

import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/*
public class Main implements MqttCallback {
	public static void main(String[] args){
		String MqttServer       = "tcp://192.168.210.118:1883";
		String client_id = "1234";
		String username = "kdCooler";
		String passwd = "kdCooler2109";
		String topic = "aqps/test";

		MqttMessage message = new MqttMessage();
		byte[] payload = ByteBuffer.allocate(26)//.order(ByteOrder.LITTLE_ENDIAN)
				.putLong(40002)
				.put((byte) 1)
				.put((byte) 3)
				.putChar('1')
				.putChar('2')
				.putChar('3')
				.putChar('4')
				.putChar('5')
				.putChar('6')
				.array();

		message.setPayload(payload);

		try {
			MqttClient client = new MqttClient(MqttServer,client_id);
			MqttConnectOptions connOpts = setUpConnectionOptions(username, passwd);
			client.setCallback(this);
			client.connect(connOpts);
			System.out.println("Published");
			client.publish(topic,message);

			sleep(1000);

			client.subscribe(topic, 0);

		} catch (MqttException e) {
			e.printStackTrace();
		}
		
	}
	private static MqttConnectOptions setUpConnectionOptions(String username, String password) {
		MqttConnectOptions connOpts = new MqttConnectOptions();
		connOpts.setCleanSession(true);
		connOpts.setUserName(username);
		connOpts.setPassword(password.toCharArray());
		return connOpts;
	}
	static void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void connectionLost(Throwable throwable) {

	}

	@Override
	public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
		System.out.println(new String(mqttMessage.getPayload()));
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {

	}
}

 */
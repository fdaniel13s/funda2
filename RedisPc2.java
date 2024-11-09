import redis.clients.jedis.Jedis;

public class RedisPc2 {
    public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost", 6379); 
		String valor = jedis.get("usuario:1000"); 
		System.out.println("Valor: " + valor); 
		jedis.close();
	}
}

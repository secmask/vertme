package vertme;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class Server2 {

	public static void main(String[] args) {
		final Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(MyHttpServer.class.getCanonicalName(), new DeploymentOptions().setInstances(8));	
	}

}

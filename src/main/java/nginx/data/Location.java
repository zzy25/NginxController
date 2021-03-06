package nginx.data;

public class Location {
	String scheme;
	String route;
	String proxyPath;

	public Location(String route, String scheme, String proxyPath) {
		setRoute(route);
		setScheme(scheme);
		setProxyPath(proxyPath);
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getProxyPath() {
		return proxyPath;
	}

	public void setProxyPath(String proxyPath) {
		this.proxyPath = proxyPath;
	}

}

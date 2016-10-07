package nginx.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RouteList {

	public RouteList() {

	}

	public RouteList(List<Route> routes) {
		setRoutes(routes);
	}

	List<Route> routes;

	public List<Route> getRoutes() {
		if (routes == null) {
			routes = new ArrayList<>();
		}
		return routes;
	}

	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}

}

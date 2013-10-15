package org.rebioma.client.services;

import java.util.List;
import java.util.Map;

import org.rebioma.client.bean.ShapeFileInfo;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MapGisServiceAsync {

	void findOccurrenceIdByGeom(String kml,
			AsyncCallback<List<Integer>> callback);

	void getShapeFileItems(ShapeFileInfo shapeFile,
			AsyncCallback<List<ShapeFileInfo>> callback);

	void findOccurrenceIdsByShapeFiles(Map<String, List<Integer>> tableGidsMap,
			AsyncCallback<List<Integer>> callback);


}

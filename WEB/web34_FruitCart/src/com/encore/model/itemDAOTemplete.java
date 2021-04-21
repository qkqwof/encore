package com.encore.model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface itemDAOTemplete {
	//
	ArrayList<Item> getAllItem() throws SQLException;
	Item getItem(int itemid) throws SQLException;
	boolean updateRecordCount(int itemid) throws SQLException;
	Item getItemNumber(int itemnumber) throws SQLException;

}

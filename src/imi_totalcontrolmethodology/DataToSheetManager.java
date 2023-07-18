package imi_totalcontrolmethodology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * 
 *IKS and STLA - Aview					STLA - SASSY3
 *Column    14   ... 25					 14   15   ... 25
 *Row 	->	(3), ... (3)				 (3), (3), ...
 * 		->	(4), ... (4)				 (4), (4), ...	 	
 * 		->	(5), ... (5)				 (5), (5), ...
 * 	
 *		->	(7), ... (7) 				 (7),  (NONE), ...
 *	 	->	(8), ... (8)				 (8),  (NONE), ...
 *	 	->	(9), ... (9)				 (9),  (NONE), ...
 * 		->	(10), ...(10)				 (10), (NONE), ...
 * 		->	(11), ...(11) 				 (11), (NONE), ...
 * 		->	(12), ...(12)				 (12), (NONE), ...
 * 		->	(13), ...(13)				 (13), (NONE), ...
 *		->	(14), ...(14)				 (14), (NONE), ...
 *		->	(15), ...(15)				 (15), (NONE), ...
 *	 	->	(16), ...(16)				 (16), (NONE), ...
 *	 	->	(17), ...(17)				 (17), (16),   ...
 *		->	(18), ...(18)  				 ...,  ...,    ...
 *		-> 	(19), ...(19) 
 * 		->	(20), ...(20)
 * 		->	(21), ...(21)
 *		->	(22), ...(22) 
 *		->	(23), ...(23) 
 */

public class DataToSheetManager {
	private List<HashMap<Integer, Integer>> arrCellMap = new ArrayList<HashMap<Integer,Integer>>();
	
	void init_CellMap(boolean templateType) {
		//The value templateType indicates the way initializing the arrCellMap HashMap
		
		for(int column = 0; column < 20; column++)
		{
			int col = (templateType && (column % 2 != 0)) ? -1 : (14+column);
			if(col == 16 && !templateType)
				continue;
//				System.out.println("CellMap:" + col);
			HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
			temp.put(3, 14+column);
			temp.put(4, 14+column);
			temp.put(5, 14+column);
			
			temp.put(7, col);
			temp.put(8, col);
			temp.put(9, col);
			temp.put(10, col);
			temp.put(11, col);
			temp.put(12, col);
			temp.put(13, col);
			temp.put(14, col);
			temp.put(15, col);
			temp.put(16, col);
			temp.put(17, col);

			temp.put(18, 14+column);
			temp.put(19, 14+column);
			
			temp.put(20, col);
			temp.put(21, col);
			temp.put(22, col);
			temp.put(23, col);
			
			arrCellMap.add(temp);
		}
		
		/*
			System.out.println(arrCellMap.size());
			for(HashMap<Integer, Integer> h: arrCellMap) {
				for(Integer in: h.keySet())
					System.out.print(in.intValue()+" ");
				System.out.println();
			}
		 */
	}
}

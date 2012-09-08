package TFC.WorldGen;

import net.minecraft.src.TFCBlocks;

public class DataLayer 
{
	public static DataLayer[] layers = new DataLayer[120];
	
	public static DataLayer Granite = new DataLayer(0,TFCBlocks.terraStoneIgIn.blockID, 0);
	public static DataLayer Diorite = new DataLayer(1,TFCBlocks.terraStoneIgIn.blockID, 1);
	public static DataLayer Gabbro = new DataLayer(2,TFCBlocks.terraStoneIgIn.blockID, 2);
	public static DataLayer Siltstone = new DataLayer(3,TFCBlocks.terraStoneSed.blockID, 0);
	public static DataLayer Mudstone = new DataLayer(4,TFCBlocks.terraStoneSed.blockID, 1);
	public static DataLayer Shale = new DataLayer(5,TFCBlocks.terraStoneSed.blockID, 2);
	public static DataLayer Claystone = new DataLayer(6,TFCBlocks.terraStoneSed.blockID, 3);
	public static DataLayer RockSalt = new DataLayer(7,TFCBlocks.terraStoneSed.blockID, 4);
	public static DataLayer Limestone = new DataLayer(8,TFCBlocks.terraStoneSed.blockID, 5);
	public static DataLayer Conglomerate = new DataLayer(9,TFCBlocks.terraStoneSed.blockID, 6);
	public static DataLayer Dolomite = new DataLayer(10,TFCBlocks.terraStoneSed.blockID, 7);
	public static DataLayer Chert = new DataLayer(11,TFCBlocks.terraStoneSed.blockID, 8);
	public static DataLayer Chalk = new DataLayer(12,TFCBlocks.terraStoneSed.blockID, 9);
	public static DataLayer Rhyolite = new DataLayer(13,TFCBlocks.terraStoneIgEx.blockID, 0);
	public static DataLayer Basalt = new DataLayer(14,TFCBlocks.terraStoneIgEx.blockID, 1);
	public static DataLayer Andesite = new DataLayer(15,TFCBlocks.terraStoneIgEx.blockID, 2);
	public static DataLayer Dacite = new DataLayer(16,TFCBlocks.terraStoneIgEx.blockID, 3);
	public static DataLayer Quartzite = new DataLayer(17,TFCBlocks.terraStoneMM.blockID, 0);
	public static DataLayer Slate = new DataLayer(18,TFCBlocks.terraStoneMM.blockID, 1);
	public static DataLayer Phyllite = new DataLayer(19,TFCBlocks.terraStoneMM.blockID, 2);
	public static DataLayer Schist = new DataLayer(20,TFCBlocks.terraStoneMM.blockID, 3);
	public static DataLayer Gneiss = new DataLayer(21,TFCBlocks.terraStoneMM.blockID, 4);
	public static DataLayer Marble = new DataLayer(22,TFCBlocks.terraStoneMM.blockID, 5);
	
	public static DataLayer NoTree = new DataLayer(29, -1);
	public static DataLayer Ash = new DataLayer(30, 7);
	public static DataLayer Aspen = new DataLayer(31, 1);
	public static DataLayer Birch = new DataLayer(32, 2);
	public static DataLayer Chestnut = new DataLayer(33, 3);
	public static DataLayer DouglasFir = new DataLayer(34, 4);
	public static DataLayer Hickory = new DataLayer(35, 5);
	public static DataLayer Maple = new DataLayer(36, 6);
	public static DataLayer Oak = new DataLayer(37, 0);
	public static DataLayer Pine = new DataLayer(38, 8);
	public static DataLayer Redwood = new DataLayer(39, 9);
	public static DataLayer Spruce = new DataLayer(40, 10);
	public static DataLayer Sycamore = new DataLayer(41, 11);
	public static DataLayer WhiteCedar = new DataLayer(42, 12);
	public static DataLayer WhiteElm = new DataLayer(43, 13);
	public static DataLayer Willow = new DataLayer(44, 14);
	
	public static DataLayer EVT_0_125 = new DataLayer(80,"0.125", 0.125f);
	public static DataLayer EVT_0_25 = new DataLayer(81,"0.25", 0.25f);
	public static DataLayer EVT_0_5 = new DataLayer(82,"0.5", 0.5f);
	public static DataLayer EVT_1 = new DataLayer(83,"1", 1);
	public static DataLayer EVT_2 = new DataLayer(84,"2", 2);
	public static DataLayer EVT_4 = new DataLayer(85,"4", 4);
	public static DataLayer EVT_8 = new DataLayer(86,"8", 8);
	public static DataLayer EVT_16 = new DataLayer(87,"16", 16);
	
	public static DataLayer Rain_62_5 = new DataLayer(100,"62.5", 62.5f);
	public static DataLayer Rain_125 = new DataLayer(101,"125", 125f);
	public static DataLayer Rain_250 = new DataLayer(102,"250", 250f);
	public static DataLayer Rain_500 = new DataLayer(103,"500", 500f);
	public static DataLayer Rain_1000 = new DataLayer(104,"1000", 1000f);
	public static DataLayer Rain_2000 = new DataLayer(105,"2000", 2000f);
	public static DataLayer Rain_4000 = new DataLayer(106,"4000", 4000f);
	public static DataLayer Rain_8000 = new DataLayer(107,"8000", 8000f);
	
	
	public int ID;
	public int data1;//used as block id in rocks
	public int data2;//used as metadata in rocks
	public float floatdata1;//used as metadata in rocks
	public String name;
	
	
	public DataLayer(int index, int id, int meta)
	{
		ID = index;
		data1 = id;
		data2 = meta;
		floatdata1 = 0;
		layers[index] = this;
	}
	
	public DataLayer(int index, int id)
	{
		ID = index;
		data1 = id;
		data2 = 0;
		floatdata1 = 0;
		layers[index] = this;
	}
	
	public DataLayer(int index, String n, int id)
	{
		ID = index;
		data1 = id;
		data2 = 0;
		floatdata1 = 0;
		name = n;
		layers[index] = this;
	}
	
	public DataLayer(int index, String n, float f)
	{
		ID = index;
		floatdata1 = f;
		data1 = 0;
		data2 = 0;
		name = n;
		layers[index] = this;
	}
}
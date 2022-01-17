package week02.yshwang.konkuk;

public class YShwangLab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202110547 황윤선");
		
		int rgb = 0xffffffff;
		String strRgb = Integer.toBinaryString(rgb);
		System.out.println("현재 색상: "+ strRgb);
		
		String blue = strRgb.substring(strRgb.length()-8);
		String shift = Integer.toBinaryString(rgb>>16);
		String alphaRed = strRgb.substring(shift.length()-16); 
		
		String strRgb1 = alphaRed + "00000000" + blue;
		System.out.println("변경 색상: "+ strRgb1);
		
//		int rgb = 0xffffffff;
//		String strRgb = Integer.toBinaryString(rgb);
//		System.out.println("현재 색상: "+ strRgb);
//		
//		int mask = 0xffff00ff;
//		int color = rgb & mask;
//		String strColor = Integer.toBinaryString(color);
//		System.out.println("변경 색상: "+ strColor);
		
	}

}

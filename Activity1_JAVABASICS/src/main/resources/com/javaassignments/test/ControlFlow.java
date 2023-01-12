package com.javaassignments.test;

public class ControlFlow {
	 public static void ifThen(String iValue1, String iValue2) {
	        if(iValue1 == iValue2) {
	            System.out.println(iValue1 +"==" + iValue2);
	        }else {
	            System.out.println(iValue1 + "!=" + iValue2);
	        }
	        
	    }
	    
	    public static String nestedIf(int iValue1, int iValue2) {
	        String returnValue = "";
	        if(iValue1 == iValue2) {
	            returnValue = "equals";
	        } else if (iValue1 > iValue2) {
	            returnValue = "greater than";
	        } else if (iValue1 < iValue2) {
	            returnValue = "less than";
	        } else {
	            returnValue = "not satisfied";
	        }
	        
	        return returnValue;
	        
	    }
	    
	    public static int switchCase(String shape) {
	        int sides;
	        
	        switch(shape.toLowerCase()) {
	        case "triangle": case "TRIANGLE":
	            sides = 3;
	            break;
	        case "pentagon": case "PENTAGON":
	            sides = 5;
	            break;
	        default:
	            sides = 0;
	            break;
	        
	        }
	        return sides;
	        
	    }
	    
	    public static String switchCase2(int sides) {
	        String shape;
	        
	        switch(sides) {
	        case 3:
	            shape = "triangle";
	            break;
	        case 5:
	            shape = "pentagon";
	            break;
	        default:
	            shape = "not satisfied";
	            break;
	        
	        }
	        return shape;
	        
	    }
	    
	    
	    public static void whileLoop (int initialValue) {
	        while (initialValue < 5) {
	            initialValue++;
	            System.out.println(initialValue);
	        }
	        System.out.println("end of while");
	        
	    }
	    
	    public static void doWhileLoop(int initialValue) {
	        do {
	            initialValue++;
	            System.out.println(initialValue);
	        } while (initialValue <= 5);
	        
	        
	    }
	    
	    public static void forLoop() {
	        
	        for (int i = 0; i <5; i++) {
	            if (i == 1) {
	                continue;
	            }
	            System.out.println(i);
	        }
	    }
	    
	    public static void whileLoopWithBreak (int initialValue) {
	        while (initialValue < 10) {
	            System.out.println("end of while");
	            initialValue++;
	            if(initialValue == 3) {
	                break;
	            }
//	            System.out.println(initialValue);
	        }
	        System.out.println("end of while");    
	    }
	    
	    public static boolean isEqual(String sInitial, String sCompare) {
//	        System.out.println(sInitial.substring(0, 2));
	        
	        boolean bIsEquals = true;
	        int iStringLength = sInitial.length();
	        int iInitialIndex1 = 0;
	        int iInitialIndex2 = 1;
	        
//	        System.out.println(sInitial.substring(iInitialIndex1, iInitialIndex2));
//	        System.out.println(sCompare.substring(iInitialIndex1, iInitialIndex2));
	        bIsEquals = sInitial.substring(iInitialIndex1, iInitialIndex2).equals(sCompare.substring(iInitialIndex1, iInitialIndex2));



//	        System.out.println(bIsEquals);
	        while(bIsEquals) {
	            System.out.println(sInitial.substring(iInitialIndex1, iInitialIndex2) + " is equal to " + sCompare.substring(iInitialIndex1, iInitialIndex2));
//	            System.out.println(sCompare.substring(iInitialIndex1, iInitialIndex2));
	            iInitialIndex1++;
	            iInitialIndex2++;
	            
	            if(iInitialIndex2 > iStringLength) {
	                break;
	            }
	            
	            if(sInitial.subSequence(iInitialIndex1, iInitialIndex2).equals("B")) {
	                continue;
	            }
	            
	            
	            
	            
	            bIsEquals = sInitial.substring(iInitialIndex1, iInitialIndex2).equals(sCompare.substring(iInitialIndex1, iInitialIndex2));
	            
	        }
	        
	        return bIsEquals;
	    }
	    
	    

		public static int sumOfEven(int iMax) {
		int sum = 0;
	
//			int initial =1;
//			while (initial <= iMax) {
//				if(initial % 2 ==0) {
//					sum += initial;
//				}
//				initial++;
//			}
			for(int i = 1; i<=iMax;) {
				if(i % 2 ==0) {
					
					sum += i;
		
			}
			return sum;
		}
			return sum;
		}
}
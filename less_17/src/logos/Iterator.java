package logos;

public interface Iterator {
	boolean hasNext();

	Object next();
}

class Collection {

	private static Object[] arr;

	Collection(Object[] arr) {
		Collection.arr = arr;
	}

	public class Forward implements Iterator {

		private int i = 0;

		@Override
		public boolean hasNext() {
			return i < arr.length;
		}

		@Override
		public Object next() {
			return arr[i++];
		}

	}

	public class Backward implements Iterator {
		int i = arr.length - 1;

		@Override
		public boolean hasNext() {
			return i >= 0;
		}

		@Override
		public Object next() {
			return arr[i--];
		}
	}

	public class ForwardWithoutNeg implements Iterator {

		private int i = 0;

		@Override
		public boolean hasNext() {
			return i < arr.length;
		}

		@Override
		public Object next() {

			if ((int) arr[i] % 2 == 0)
				return arr[i++];
			else {
				i++;
				return 0;
			}
		}
	}

	public class BackwardByTwo implements Iterator {
		private int i = arr.length-1;

		@Override
		public boolean hasNext() {
			return i-- >= 0;
		}

		@Override
		public Object next() {

			return arr[i--];
		}
	}
	
	
	public Iterator createBackAnon(){
		return new Iterator() {
			
			private int i = arr.length-1;
			
			
			@Override
			public boolean hasNext() {
				return i >= 0;
			}

			@Override
			public Object next() {
				
				if((int)arr[i]%2 == 1) {
					int j = i;
					i = i-2;
					return arr[j];
				}
				
				else {
					i=i-2;
					return "----";
				}
			}
			
		};	
	}
	
	
	public Iterator creatForwardByFive() {
		
		class ForwardByFive implements Iterator{
			private int i = 0;
			
			@Override
			public boolean hasNext() {
				return i < arr.length-1;
			}

			@Override
			public Object next() {
				
				if((int)arr[i]%2 == 0) {
					int j = i;
					i = i+4;
					return (int)arr[j]-100;
				}
				
				else {
					i=i+4;
					return "----";
				}
				
			}
			
		}
		
		return new ForwardByFive();
		
	}
	
	public static class ForwardByTwoNeg implements Iterator {
		
		private int i = 0;
		
		
		@Override
		public boolean hasNext() {
			return i < arr.length-1;
		}

		@Override
		public Object next() {
			

			if((int)arr[i]%2 == 0) {
				int j = i;
				i = i+2;
				return (int)arr[j]+1;
			}
			
			else {
				i=i+2;
				return "----";
			}
			
		}
		
		
		
	}
	
	

	public Forward createForward() {
		return new Forward();
	}

	public Backward createBackward() {
		return new Backward();
	}

	public ForwardWithoutNeg createForwardWithoutNeg() {
		return new ForwardWithoutNeg();
	}

	public BackwardByTwo createBackwardByTwo() {
		return new BackwardByTwo();
	}
	
	public ForwardByTwoNeg createForwardByTwoNeg() {
		return new ForwardByTwoNeg();
	}

}
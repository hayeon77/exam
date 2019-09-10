import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
I/O

1.stream (연결통로 , 입출력통로 , 중간매개체, 빨대)
2.stream (크기 (통로 1Byte)) >> 입출력의 기본단위 >> Byte >> Byte[] 

3. JAVA API 제공하는 클래스 
3.1 I/O 입출력관련 처리  할수 있어요  (만들어진 클래스 사용)
3.1 기본적인 처리 단위 : Byte

*추상클래스 
InputStream , OutputStream
두개의 추상클래스를 상속(재정의) 클래스 ...

대상에 따라서 구분
1.memory : ByteArray .. , ByteArray ..
2.File   : File .. , File ..

추가적은 보조 클래스 : File 관련
:컴퓨터에서 가장 느린 작업 : DISK read  , write
Buffer ( I/O 성능향상 )
BufferedInputStream(read) , BufferedOutputStream(write)

*/
public class Ex01_Stream {
	public static void main(String[] args) {

		// (-128 ~ 0 , 127)정수 (Byte)
		byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// System.out.println(inSrc[5]);
		byte[] outsrc = null; // oursrc 메모리를 가지고 있지 않다

		// 데이터를 read , write 대상 배열(메모리)
		ByteArrayInputStream input = null; // 메모리로 부터 데이터 read
		ByteArrayOutputStream output = null; // 메모리에 데이터 write

		input = new ByteArrayInputStream(inSrc);
		// 생성자를 통해서 insrc 배열의 주소 받아서 read 할 준비

		output = new ByteArrayOutputStream(); // write

		System.out.println("oursrc before : " + Arrays.toString(outsrc));

		// 공식같은 로직( 암기 )
		int data = 0;
		while ((data = input.read()) != -1) { // 더 이상 read() 없다면 return -1
			// System.out.println("data :" + data);
			// System.out.println("input.read()" + input.read());
			// 내부적으로 next() 기능을 가지고 있다

			output.write(data);
			// 자기자신에게 data변수에 값을 read 해서 write
			// write 대상 : ByteArrayOutputStream 녀석이 자신의 통로에 read 데이터를 가지고 있다
		}
		// write >> outsrc Array
		outsrc = output.toByteArray();
		// 자기가 가지고 있는 값을 배열로 만들어서
		// 배열의 주소값을 oursrc 변수에게 할당
		System.out.println("oursrc after : " + Arrays.toString(outsrc));

	}

}

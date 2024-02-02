package dcn_lab1;

//Java code to implement the approach
import java.util.Arrays;
class dcn_lab3 {

//Returns XOR of 'a' and 'b'
//(both of same length)
static String Xor(String a, String b)
{

	// Initialize result
	String result = "";
	int n = b.length();

	// Traverse all bits, if bits are
	// same, then XOR is 0, else 1
	for (int i = 1; i < n; i++) {
	if (a.charAt(i) == b.charAt(i))
		result += "0";
	else
		result += "1";
	}
	return result;
}

//Performs Modulo-2 division
static String Mod2Div(String dividend, String divisor)
{

	// Number of bits to be XORed at a time.
	int pick = divisor.length();

	// Slicing the dividend to appropriate
	// length for particular step
	String tmp = dividend.substring(0, pick);

	int n = dividend.length();

	while (pick < n) {
	if (tmp.charAt(0) == '1')

		// Replace the dividend by the result
		// of XOR and pull 1 bit down
		tmp = Xor(divisor, tmp)
		+ dividend.charAt(pick);
	else

		// If leftmost bit is '0'.
		// If the leftmost bit of the dividend (or
		// the part used in each step) is 0, the
		// step cannot use the regular divisor; we
		// need to use an all-0s divisor.
		tmp = Xor(new String(new char[pick])
				.replace("\0", "0"),
				tmp)
		+ dividend.charAt(pick);

	// Increment pick to move further
	pick += 1;
	}

	// For the last n bits, we have to carry it out
	// normally as increased value of pick will cause
	// Index Out of Bounds.
	if (tmp.charAt(0) == '1')
	tmp = Xor(divisor, tmp);
	else
	tmp = Xor(new String(new char[pick])
				.replace("\0", "0"),
				tmp);

	return tmp;
}

//Function used at the sender side to encode
//data by appending remainder of modular division
//at the end of data.
static void EncodeData(String data, String key)
{
	int l_key = key.length();

	// Appends n-1 zeroes at end of data
	String appended_data
	= (data
		+ new String(new char[l_key - 1])
		.replace("\0", "0"));

	String remainder = Mod2Div(appended_data, key);

	// Append remainder in the original data
	String codeword = data + remainder;
	System.out.println("Remainder : " + remainder
					+ "\n");
	System.out.println(
	"Encoded Data (Data + Remainder) :" + codeword
	+ "\n");
}

//checking if the message received by receiver is
//correct or not. If the remainder is all 0 then it is
//correct, else wrong.
static void Receiver(String data, String key)
{
	String currxor
	= Mod2Div(data.substring(0, key.length()), key);
	int curr = key.length();
	while (curr != data.length()) {
	if (currxor.length() != key.length()) {
		currxor += data.charAt(curr++);
	}
	else {
		currxor = Mod2Div(currxor, key);
	}
	}
	if (currxor.length() == key.length()) {
	currxor = Mod2Div(currxor, key);
	}
	if (currxor.contains("1")) {
	System.out.println(
		"there is some error in data");
	}
	else {
	System.out.println("correct message received");
	}
}

//Driver code
public static void main(String[] args)
{
	String data = "100100";
	String key = "1101";
	EncodeData(data, key);
	Receiver(data + Mod2Div(data, key), key);
}
}

//This code is contributed by phasing17


/*
This Module will handle hashing into SHA256 for file objects
Final Project
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 11 Oct 2016
NOTE: This is a modified version of a hashing library from codejava.net
*/

package hasher;

import java.io.*;
import java.security.*;

public class Hasher
{
    static String hashMethod = "SHA-256";

    public static String SHA256CheckSum(String text)
        throws MyException
    {
        return hashString(text);
    }

    private static String hashString(String text)
        throws MyException
    {
        try {
            MessageDigest digest = MessageDigest.getInstance(hashMethod);

            byte[] bytes = digest.digest(text.getBytes("UTF-8"));

            return convertToHex(bytes);
        } catch (NoSuchAlgorithmException | IOException e) {
            throw new MyException("Failed to hash source code");
        }
    }

    private static String convertToHex(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return stringBuffer.toString();
    }
}

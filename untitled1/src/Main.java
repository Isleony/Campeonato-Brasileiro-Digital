import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String base64String = "wYwD0xaapSwq/JEBA/44eT62SwSKjjHFYq9hImSMcOiU/rFRJJinZPi9mso0ouu8\n" +
                "IXaHjy+N3Fey97fLJ5WeQw+JKGjzbTFKxdX0ztF84WnMyd9og8DB8CmsUEvGTHn0\n" +
                "+IXdGUBqxajy/nlSYumPMOedJ7zHgURGM+UKbbs4DGbQ7WkblRF8NsArbysPndLG\n" +
                "LwHrnxWwtcb/ewucRuojoc/NUFwGthXvDGFR4Q7spAYqD93zKbLfb3aPq+Ud6iaj\n" +
                "/GU/JxrxqBaR+zvsApfXREaQqaaFQozklPZKzmoCmz/0NmK7ELgsJcjyhPYVkEz7\n" +
                "32P8Fm8qHs2zRkzLlW/s5Ds4ZsEx8qmEkk9LBvAwkUEEUFjESX6NsY8G7P7IxTg5\n" +
                "WwACbUgjVRECT6ZRBgsoBUZJt4OlZcx33BaB/xzc9nb4X7fUrRGnilxcpQtmNPrj\n" +
                "HV+W//e7yVfP25zuJRJNSWvsEng3kN7EMrWaLcJt/Jl8J553mDfBkWI+5z2qIhEb\n" +
                "e434eA17990vSJ6GL52dvCOJ4AagP0jvO4WLPXk14kz/00GMFy0RNuqsXuuZu3a+\n" +
                "nguW8V6ucqKKF1hALZRTHGXjFOB1L2t/TZvj24jgh9ybsuGFv/tvrJTzes0YAvSU\n" +
                "6hDQkBO7NYUUzboqS6KcnjYcqvyla/he3FfraZ9eia/BWC9m093AkCUrmepqAvWd\n" +
                "RVYYC+zH+D7xebnl96qEb47F8KxSfcP18P5ieAl9prEbm7CtnD7V5iU6bkXZX4eQ\n" +
                "NggfNH8M3ayVs/w/+CwTp2/LtSb9m4ITK/sqYQFG2b9Lweyd+riUqeJ8TEOT0/w3\n" +
                "OMd4CSCHrUc46MDwcEXzekPWyLnEBot2UqEkh0tZTkYiA+Jha6D0RBJ6Bnh94HO7\n" +
                "qeWxiDdx/hd6cX7FCIzbWgYMgtqMLpwfnxnaCZAYuYAUuI5RmdJynmXBDqpv4uMp\n" +
                "GamDDRz3X9wTBR4BSoPiQm2ypNc2nv021GjDsD7kjHluA9HCnzQ+SeaGJCt2a8km\n" +
                "QfNy2kiHjEw6lYlY3tlxtxj2xv9HhYM+kiJPaq90QOY1F+iEh1u0vejErjkrQ8zu\n" +
                "vEFOJQMKKPaWu/RY+fOvb6ju35nx0EQXh4kmvsLAmy5f391Z4ZvTXiFmgUPE4EJw\n" +
                "nBorw4ULSj6VjGXM2Vq3KnCpzXTWcT1sSDCNq2ZAFXNS1lswIhxxY/8XV/03gznI\n" +
                "h8xVBPVcuToilETCBQ9G7YQ8kjQZkpIby8mAYk3O+Ll6X5MgTUNs1qcV/Bz0QG0a\n" +
                "NAkLQGFD/pQvw8uRJzgW1K+Z8WJ6lQwTRFTcgSN9pydR7RRYb1YseCnBlVKpfBbO\n" +
                "QElZ0TL/PhAqQEZhOgWzXXNub34OLrP1PabtKzvNTVVpUgjt01rQQhpCYfFw8afo\n" +
                "W5IcDdwohMRiUtouuIMlmMV6KIBAcJqeun0r1BgQudYDlGnNcqT6S03Zv51VMB5L\n" +
                "SSNg7Zxbl3NfZO4j4AW7SBDaVUxdZApRwWAS7MD7BH68yponnUtcNwwFooeKsxiM\n" +
                "a5EImqnMMFWB1Ga0VLbX6IAtjdza0o4hBNEKI1U66lCAjo3dKiw6vInQ12dLO1xE\n" +
                "AjW7vWRMRcAYPH8T0CP2htF4MWLdbjvDMJw+bDXiXklbObgsBzOQX1aChODhPo4z\n" +
                "lAHofyG+OiHJjNp5stS+bfOuijQGgD22Xaiyo7T4JyeKa1lctZxvb6KmeGbgIgxI\n" +
                "KIRNNL0k+EEQJAxuT+1MspgPIqylS9oXpcKZg98C4sBcSnjv2FfqdLTsp6URd6ht\n" +
                "i6OeHwFaJ14b7kEmr0HHSRNczaikzU+VYsgzoasLndjOMrLhts0GLF36HZejKQH+\n" +
                "A3JXVMALPzvG0OekrNe05EumxbYelqxPAWWINyV4mlVFIWTAYUpRXmWa7M2XfDVN\n" +
                "JUMFxV2uxuVgC5WGi1AFcwsohURdRsbN0PXWFI2i6CLDkEKFOXx93QOZIb4yPJWA\n" +
                "2/qzl0fPprjU6lSAStFaNy4QvlH3RSWCygzvV+u1pXVH0MqYr51evrthCflCzRy1\n" +
                "vGiagjhDu+3c8ABog8+vvGJ4QHQ7yE0xcddvPBORfTOx2Mc2/Wq55UB7U7Vor05r\n" +
                "amjVfXGvughWoEUlMfvYqWaUMBgPKmIRqJQRO3nAibOvANF1yzTxN0fVQP3Tv5xi\n" +
                "Zon7q85r260rSDzI8FszB6ComCRHTVpm3zDIjMM8xvAkaQwerU69WJrGwZPdEQSk\n" +
                "2dA0Rojs4whMTUG9iwfSjBenyAIVHU2bXd89c7dGs7QAhMjX9rUlsurzQ4UDXGCd\n" +
                "TGXT2cH1BZBegdkOuBL/559yZbJrqhu9i/O43ulbgd0jjpQRZuAKx6KKlMjApXkI\n" +
                "5omrYgQKoQHRAzxeQQ5OWa4TzYGVSUwvOuAfIU4xXmTsBoNSw0ovs0Mo4Pfb5E6z\n" +
                "yOV4B+cElr/pbLEugsAkyHgyptZqAB7x9jl79IGcIdsP1VLCOibhbCMWZA7if25M\n" +
                "26MNQdlf5SPf2dj9ksV2nmgJIJpQYIHSkQviaiNqER8a74XBcAW92J5uuHYPCta/\n" +
                "=YTyZ";


        base64String = base64String.replace("\n", "").replace(" ", "");

        if (Base64Decoder.isBase64(base64String)) {
            String decodedResult = Base64Decoder.multiDecode(base64String);
            System.out.println("Resultado decodificado: " + decodedResult);
        } else {
            System.out.println("A string fornecida não parece ser Base64.");
        }
    }
}


class Base64Decoder {


    public static boolean isBase64(String string) {
        try {
            Base64.getDecoder().decode(string);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static String multiDecode(String base64String) {
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(base64String);
            String result = new String(decodedBytes);
            int attempts = 0;

            // Tenta decodificar várias vezes
            while (isBase64(result) && attempts < 10) {
                decodedBytes = Base64.getDecoder().decode(result);
                result = new String(decodedBytes);
                attempts++;
            }

            return result;
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}

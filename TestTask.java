package lessonsWithAndrey.lessonTestTask;

public class TestTask {

    public static class Response {

        private boolean isPositive = true;
        private boolean isEven = true;

        public Response() {
        }

        public Response(boolean isPositive, boolean isEven) {
            this.isPositive = isPositive;
            this.isEven = isEven;
        }
        public boolean isPositive() {
            return isPositive;
        }
        public boolean isEven() {
            return isEven;
        }
    }


    // method throw RuntimeException, when number == null
    public static Response getNumberCharacter(Integer number) {

        Response response = new Response();

        if(number == null){
            throw new RuntimeException("Number must be not null");
        }

        if (number % 2 == 0 && number > 0) {
            return new Response(response.isPositive,response.isEven);
        } else if (number % 2 != 0 && number > 0) {
            return new Response(!response.isPositive,response.isEven);
        } else if (number % 2 == 0 && number < 0) {
            return new Response(response.isPositive,!response.isEven);
        } else if (number % 2 != 0 && number < 0) {
            return new Response(!response.isPositive,!response.isEven);
        } else {
            throw new RuntimeException("Number is zero");
        }
    }

    public static void main(String[] args) {

        Response r = getNumberCharacter(7);

        System.out.println(r);

    }
}
